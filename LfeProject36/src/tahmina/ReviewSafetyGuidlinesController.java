/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package tahmina;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Admin
 */
public class ReviewSafetyGuidlinesController implements Initializable {

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
     Parent parent = null;
try {
    parent = FXMLLoader.load(getClass().getResource("/tahmina/VenueIncharge.fxml"));
} catch (IOException ex) {
    Logger.getLogger(RulesandGuidelinesController.class.getName()).log(Level.SEVERE, null, ex);
}
Scene scene = new Scene(parent);
Stage window = new Stage(); // Create a new stage
window.setScene(scene);
window.show();

    }    
    
}
