/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package huffmancodering;

import java.net.URL;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.ResourceBundle;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeMap;
import java.util.TreeSet;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TreeView;

/**
 *
 * @author sebas
 */
public class HuffmanCoderingController implements Initializable {

    private static final String DEFAULT_TEXT = "bananen";

    @FXML
    private Button btnCharacters;
    @FXML
    private Button btnSort;
    @FXML
    private TextArea txtInput;
    @FXML
    private TreeView tvHuffmanTree;
    @FXML
    private Button btnBuild;
    

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        txtInput.setText(DEFAULT_TEXT);
    }

    @FXML
    private void characterAction(ActionEvent events) {
        getCharacters(txtInput.getText());
    }

    @FXML
    private void sortAction(ActionEvent events) {
        sortCharactersSet(getCharacters(txtInput.getText()));
        
    }

    @FXML
    private void treeAction(ActionEvent events) {
        buildTree(sortCharactersQueue(sortCharactersSet(getCharacters(txtInput.getText()))));
    }
    /**
     * Gets the treemap of characters
     *
     * @param text
     * @return TreeMap including characters and their frequence
     */
    private TreeMap getCharacters(String text) {

        List<Character> characterList = new ArrayList<Character>();
        // O(n)
        for (int i = 0; i < text.length(); i++) {
            // O(1)
            characterList.add(text.toLowerCase().charAt(i));
        }

        TreeMap characterTreeMap = new TreeMap<String, Integer>();
        // O(n)
        for (char character : characterList) {
            int counter = 0;

            if (!characterTreeMap.containsKey(character)) {
                // O(n)
                for (int i = 0; i < text.length(); i++) {
                    if (character == text.charAt(i)) {
                        counter++;
                    }
                }
                characterTreeMap.put(character, counter);
            }
        }
        System.out.println(characterTreeMap.toString());
        return characterTreeMap;
    }

    /**
     * Sorts character map on value (frequency)
     * @param characterMap
     * @return SortedSet
     */
    private SortedSet sortCharactersSet(TreeMap characterMap) {
        System.out.println(entriesSortedByValues(characterMap).toString());
        return entriesSortedByValues(characterMap);
    }
    
    private PriorityQueue sortCharactersQueue(SortedSet sortedCharacters) {
        return new PriorityQueue(sortedCharacters);
    }
    /*
    private String[] treeString(SortedSet set) {
        List list = new ArrayList(set);
        String[] strings = list.toArray(new String[list.size()]);
        System.out.println(strings);
        return set.toString().split(",");
    }
    */
    private void buildTree(PriorityQueue queue) {
        System.out.println("Tree Build");
        System.out.println("QUEUE: " + queue.toString());
        Iterator queueIt = queue.iterator();
        ArrayList<HuffmanTreeNode> nodeList = new ArrayList<HuffmanTreeNode>();
        // Find all nodes that have to be used.
        while (queueIt.hasNext()) {
            String s = queue.poll().toString();
            System.out.println(s);
            char c = s.charAt(0);
            int i = Character.getNumericValue(s.charAt(2));
            System.out.println("Character: " + c + " | Amount: " + i);
            HuffmanTreeNode node = new HuffmanTreeNode(c,i);
            
            nodeList.add(node);
        }
        System.out.println(nodeList.toString());
        // Root node for up to down.
        //HuffmanTreeNode rootNode = new HuffmanTreeNode('\0', getTotalFreq(nodeList));
        for (int i = 0; i < nodeList.size(); i++) {
            // Node without character value
            HuffmanTreeNode combinedNode = new HuffmanTreeNode('\0', nodeList.get(i).getFreq());
            
        }
        if(queue.size() == 1) {
            HuffmanTreeNode node = (HuffmanTreeNode) queueIt.next();
            if(node.getFreq() == 0) {
                queue.add(new HuffmanTreeNode('\0', 0));
            }
            else {
                queue.add(new HuffmanTreeNode('\1', 0));
            }
        }
        while (queue.size() > 1) {
            HuffmanTreeNode left = (HuffmanTreeNode)queue.poll();
            HuffmanTreeNode right = (HuffmanTreeNode)queue.poll();
            HuffmanTreeNode parent = new HuffmanTreeNode('\0', left.getFreq() + right.getFreq());
            parent.addNodeLeft(left);
            parent.addNodeRight(right);
            queue.add(parent);
        }
    }
    private void compress() {
        String text = txtInput.getText();
        getCharacters(text);
        buildTree(sortCharactersQueue(sortCharactersSet(getCharacters(txtInput.getText()))));
        
        
    }
    
    private int getTotalFreq(ArrayList<HuffmanTreeNode> nodes) {
        int number = 0;
        for (HuffmanTreeNode n : nodes) {
            number += n.getFreq();
        }
        
        return number;
    }
    /*
   private void buildTree(SortedSet set) {
        PriorityQueue treeQueue = new PriorityQueue<HuffmanTreeNode>();
        //String [] tempa = (String[]) library.keySet().toArray(new String[library.size()]);
        char[] tempKeys = (char[]) set.toArray();
        String[] tempValues = (String[])map.values().toArray();
        set.
        for (int i = 0; i < tempKeys.length; i++) {
            HuffmanTreeNode node = new HuffmanTreeNode((char)tempKeys[i], (int)tempValues[i]);
            
            
            treeQueue.offer();
            
            
        }
    }
    */
    
    static <K, V extends Comparable<? super V>>
            SortedSet<Map.Entry<K, V>> entriesSortedByValues(Map<K, V> map) {
        SortedSet<Map.Entry<K, V>> sortedEntries = new TreeSet<Map.Entry<K, V>>(
                new Comparator<Map.Entry<K, V>>() {
                    @Override
                    public int compare(Map.Entry<K, V> e1, Map.Entry<K, V> e2) {
                        int res = e1.getValue().compareTo(e2.getValue());
                        return res != 0 ? res : 1;
                    }
                }
        );
        sortedEntries.addAll(map.entrySet());
        return sortedEntries;
    }
}
