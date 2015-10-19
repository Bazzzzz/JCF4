/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JCF.stamboomFX;

import java.net.URL;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.ResourceBundle;
import static javafx.application.Application.launch;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TreeItem;
import javafx.scene.control.TreeView;

/**
 * FXML Controller class
 *
 * @author sebas
 */
public class StamboomFXController implements Initializable {

    @FXML
    private TreeView<String> tvStamboom;
    @FXML
    private TreeView tvPersonen;
    
    private ArrayList<Persoon> personen;
    
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        personen = new ArrayList<Persoon>();
        Persoon persoon1 = new Persoon("Bas", "Koch", 28);
        Persoon persoon2 = new Persoon("qew2r", "wer", 23);
        Persoon persoon3 = new Persoon("ewfgw", "hrbe", 35);
        Persoon persoon4 = new Persoon("wfef", "trwrg", 65);
        persoon1.addOuder1(persoon4);
        persoon2.addOuder1(persoon1);
        persoon2.addOuder2(persoon3);
        
        personen.add(persoon1);
        personen.add(persoon2);
        personen.add(persoon3);
        personen.add(persoon4);
        
        buildPersonenTree();
    }    
    private void buildPersonenTree() {
        TreeItem<String> root = new TreeItem<String>("Personen Root");
        root.setExpanded(true);
        
        for (Persoon p: personen) {
            TreeItem<String> persoonLeaf = new TreeItem<>(p.getNaam());
            root.getChildren().add(persoonLeaf);

        }
        for(int i = 0; i < root.getChildren().size(); i++) {
            System.out.println("Persoon " + i+1 + ": " + root.getChildren().get(i).getValue().toString());
        }
        /*TreeItem<String> treeItemRoot = new TreeItem<String>("Personen Root");
        treeItemRoot.setExpanded(true);
        for (Persoon p : personen) {
            TreeItem<String> persoonLeaf = new TreeItem<String>(p.getNaam());
            boolean found = false;
            for (TreeItem<String> ouderNode : treeItemRoot.getChildren()) {
                ouderNode.getChildren().add(persoonLeaf);
                found = true;
                break;
            }
            treeItemRoot.getChildren().add(persoonLeaf);
            if(found == false) {
                TreeItem<String> ouderNode = new TreeItem<String>(p.getNaam());
                treeItemRoot.getChildren().add(ouderNode);
                ouderNode.getChildren().add(persoonLeaf);
            }
        }
        for (TreeItem<String> item : treeItemRoot.getChildren()) {
            System.out.println(item.getValue());
        }
        tvPersonen= new TreeView(treeItemRoot);*/
    }

    
}
