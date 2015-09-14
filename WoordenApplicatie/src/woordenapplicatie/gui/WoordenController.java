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
        String[] woorden = taInput.getText().split("[\\s,]+");
        int lengte = woorden.length;
        String lengteMessage = "Hoeveelheid woorden: " + lengte;

        // Set gebruiken om geen dubbele woorden mee te nemen.
        Set woordenSet = new HashSet();
        for (int i = 0; i < woorden.length; i++) {
            woordenSet.add(woorden[i].toLowerCase());
        }

        String uniekMessage = "Unieke aantal woorden: " + woordenSet.size();
        taOutput.setText(lengteMessage + "\n " + uniekMessage);
    }

    @FXML
    private void sorteerAction(ActionEvent event) {
        String[] woorden = taInput.getText().split("[\\s,]+");

        Set woordenSet = new HashSet();
        for (int i = 0; i < woorden.length; i++) {
            woordenSet.add(woorden[i].toLowerCase());
        }
        List woordenList = new ArrayList<String>();
        woordenList.addAll(woordenSet);

        woordenList.sort(Comparator.reverseOrder());
        System.out.println(woordenList.toString());
        String sortedString = "";

        for (int i = 0; i < woordenList.size(); i++) {
            sortedString += woordenList.get(i) + "\n";
        }
        taOutput.setText(sortedString);

    }
    /*
     TreeMap gebruiken i.p.v. HashMap omdat een TreeMap gesorteerd kan worden.
     */

    @FXML
    private void frequentieAction(ActionEvent event) {
        String[] woorden = taInput.getText().split("[\\s,]+");
        List<String> woordenList = new ArrayList<String>();

        for (int i = 0; i < woorden.length; i++) {
            woordenList.add(woorden[i].toLowerCase());
        }
        Map woordenTreeMap = new TreeMap<String, Integer>();
        for (String woord : woordenList) {
            int counter = 0;

            if (!woordenTreeMap.containsKey(woord)) {
                for (int i = 0; i < woorden.length; i++) {
                    if (woord.equals(woorden[i].toLowerCase())) {
                        counter++;
                    }
                }
                woordenTreeMap.put(woord, counter);
            }
        }
        String sortedSet = entriesSortedByValues(woordenTreeMap).toString();
        System.out.println(sortedSet);
        sortedSet = sortedSet.replace('=', ':');
        System.out.println(sortedSet);
        String[] sortedArray = sortedSet.split(",");

        String sortedString = "";
        for (int i = 0; i < sortedArray.length; i++) {
            sortedString += sortedArray[i] + "\n";
        }
        String cleanedString = sortedString.replace(']', ' ');
        String cleanedString2 = cleanedString.replace('[', ' ');
        taOutput.setText(cleanedString2);
    }

    @FXML
    private void concordatieAction(ActionEvent event) {
        //find unique values
        //map
        //to string like opdr 3
        /*
        HashSet woordenSet = new HashSet();
        int line = 1;
        for (int i = 0; i < woorden.length; i++) {
            Map tempMap = new HashMap();
            if (!woordenSet.contains(woorden[i])) {
                tempMap.put(woorden[i].toLowerCase(), line);
                woordenSet.add(tempMap);
            }
        }
        */
        
        
         // TreeMap with Key = the word, Value = set of lines
        Map<String, HashSet<Integer>> concordMap = new HashMap<String, HashSet<Integer>>();
        int line = 1;
        String woorden = taInput.getText();
        woorden = woorden.replace("/n", " !! ");
        String[] wrdList = woorden.split("[\\s,]+");
        for (int i = 0; i < wrdList.length; i++) {
           if( wrdList[i].equals("!!")){
               line++;
           }
           else {
               if (concordMap.containsKey(wrdList[i])){
                   concordMap.put(wordList[i], )
               }
               else{
                   concordMap.put(wordList[i], new HashSet(line) )
               }
               
           }
          
        }
        System.out.println(concordMap.toString());
    }
        /*TreeSet woordenAantalSet = new TreeSet<Integer>();
           
            woordenAantalSet.add(line);
            concordMap.put(woorden[i].toLowerCase(), woordenAantalSet);*/
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
