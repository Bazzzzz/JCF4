/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JCF.stamboomFX;

import java.io.IOException;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author sebas
 */
public class StamboomStarter extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        try {
            URL url = getClass().getResource("StamboomFX.fxml");
            System.out.println("Startup. " + url);
            Parent root = FXMLLoader.load(url);
            Scene scene = new Scene(root);
            primaryStage.setTitle("Stamboom");
            primaryStage.setScene(scene);
            primaryStage.show();
            primaryStage.resizableProperty().set(false);
        } catch (Exception ex) {
            ex.getStackTrace();
        }
    }
    public static void main(String [] args) {
        launch(args);
    }
}
