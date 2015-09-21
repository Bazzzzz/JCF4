/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package huffmancodering;

import java.net.URL;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.ResourceBundle;
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
    
    private static final String DEFAULT_TEXT = "Alle bananen zijn krom en qualitatief.";
    
    
    @FXML
    private Button btnCharacters;
    @FXML
    private Button btnSort;
    @FXML
    private TextArea txtInput;
    @FXML
    private TreeView tvHuffmanTree;
    
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
        sortCharacters(getCharacters(txtInput.getText()));
    }
    /**
     * Get all characters from a text.
     *
     * @param text
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
     */
    private void sortCharacters(TreeMap characterMap) {
        System.out.println(entriesSortedByValues(characterMap).toString());
    }

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
