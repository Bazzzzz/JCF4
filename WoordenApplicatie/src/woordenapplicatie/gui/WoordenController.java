package woordenapplicatie.gui;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.net.URL;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
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

/**
 * FXML Controller class
 *
 * @author frankcoenen
 */
public class WoordenController implements Initializable {

    private static final String DEFAULT_TEXT = "Een, twee, drie, vier\n"
            + "Hoedje van, hoedje van\n"
            + "Een, twee, drie, vier\n"
            + "Hoedje van papier\n"
            + "\n"
            + "Heb je dan geen hoedje meer\n"
            + "Maak er één van bordpapier\n"
            + "Eén, twee, drie, vier\n"
            + "Hoedje van papier\n"
            + "\n"
            + "Een, twee, drie, vier\n"
            + "Hoedje van, hoedje van\n"
            + "Een, twee, drie, vier\n"
            + "Hoedje van papier\n"
            + "\n"
            + "En als het hoedje dan niet past\n"
            + "Zetten we 't in de glazenkas\n"
            + "Een, twee, drie, vier\n"
            + "Hoedje van papier";

    @FXML
    private Button btAantal;
    @FXML
    private TextArea taInput;
    @FXML
    private Button btSorteer;
    @FXML
    private Button btFrequentie;
    @FXML
    private Button btConcordantie;
    @FXML
    private TextArea taOutput;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        taInput.setText(DEFAULT_TEXT);
    }

    @FXML
    private void aantalAction(ActionEvent event) {
        String[] woorden = taInput.getText().split("[\\s,]+"); //N
        int lengte = woorden.length;
        String lengteMessage = "Hoeveelheid woorden: " + lengte;

        // Set gebruiken om geen dubbele woorden mee te nemen.
        Set woordenSet = new HashSet(); 
        for (int i = 0; i < woorden.length; i++) { //N
            woordenSet.add(woorden[i].toLowerCase()); //1
        }

        String uniekMessage = "Unieke aantal woorden: " + woordenSet.size();
        taOutput.setText(lengteMessage + "\n " + uniekMessage);
    }

    @FXML
    private void sorteerAction(ActionEvent event) {
        String[] woorden = taInput.getText().split("[\\s,]+"); //N

        Set woordenSet = new HashSet();
        for (int i = 0; i < woorden.length; i++) { //N
            woordenSet.add(woorden[i].toLowerCase()); //1
        }
        List woordenList = new ArrayList<String>();
        woordenList.addAll(woordenSet); //1

        woordenList.sort(Comparator.reverseOrder()); // N*Log(N)
        System.out.println(woordenList.toString());
        String sortedString = "";

        for (int i = 0; i < woordenList.size(); i++) { //N
            sortedString += woordenList.get(i) + "\n"; //1
        }
        taOutput.setText(sortedString);

    }
    /*
     TreeMap gebruiken i.p.v. HashMap omdat een TreeMap gesorteerd kan worden.
     */

    @FXML
    private void frequentieAction(ActionEvent event) {
        String[] woorden = taInput.getText().split("[\\s,]+"); //N 
        List<String> woordenList = new ArrayList<String>();

        for (int i = 0; i < woorden.length; i++) { //N
            woordenList.add(woorden[i].toLowerCase()); //1
        }
        Map woordenTreeMap = new TreeMap<String, Integer>();
        for (String woord : woordenList) { //N
            int counter = 0;

            if (!woordenTreeMap.containsKey(woord)) { //Log N
                for (int i = 0; i < woorden.length; i++) {
                    if (woord.equals(woorden[i].toLowerCase())) { //1
                        counter++;
                    }
                }
                woordenTreeMap.put(woord, counter); //1
            }
        }
        String sortedSet = entriesSortedByValues(woordenTreeMap).toString(); //N*Log N
        System.out.println(sortedSet);
        sortedSet = sortedSet.replace('=', ':');
        System.out.println(sortedSet);
        String[] sortedArray = sortedSet.split(","); //N

        String sortedString = "";
        for (int i = 0; i < sortedArray.length; i++) { //N
            sortedString += sortedArray[i] + "\n";
        }
        String cleanedString = sortedString.replace(']', ' ');
        String cleanedString2 = cleanedString.replace('[', ' ');
        taOutput.setText(cleanedString2);
    }

    @FXML
    private void concordatieAction(ActionEvent event) {
      
        
         // TreeMap with Key = the word, Value = set of lines
        Map<String, HashSet<Integer>> concordMap = new HashMap<String, HashSet<Integer>>();
        int line = 1;
        String woorden = taInput.getText();
        woorden = woorden.toLowerCase();        //N
        woorden = woorden.replace("\n", " !! "); //N
        String[] wrdList = woorden.split("[\\s,]+"); //N
        for (int i = 0; i < wrdList.length; i++) { //N
           if( wrdList[i].equals("!!")){ //1
               line++;
           }
           else {
              
               if (concordMap.containsKey(wrdList[i])){ // 1
                   HashSet<Integer> wrdSet = concordMap.get(wrdList[i]); //1
                   wrdSet.add(line); //1
                 
               }
               else{ 
                   HashSet<Integer> wrdSet = new HashSet<Integer>();
                   wrdSet.add(line); //1
                   concordMap.put(wrdList[i], wrdSet); //1
               }
               
           }
          
        }
        String s = concordMap.toString();
        System.out.println(s);
        s = s.replaceAll("=", ": "); //N
        System.out.println(s);
        String[] sortedArray = s.split("],"); //N

        String sortedString = "";
        for (int i = 0; i < sortedArray.length; i++) { //N
            sortedString += sortedArray[i] +"] "+ "\n";
            
        }
        String cleanedString = sortedString.replace('{', ' ');
        String cleanedString2 = cleanedString.replace('}', ' ');
        cleanedString2 = cleanedString2.replaceAll("] ]", "]");
        taOutput.setText(cleanedString2);
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
