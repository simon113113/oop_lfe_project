/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package tahmina;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;

/**
 * FXML Controller class
 *
 * @author Admin
 */
public class VenueAvaibilityManagementController implements Initializable {

    @FXML
    private ComboBox<?> addvenueCB;
    @FXML
    private ComboBox<?> setavailabilityslotCB;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void showdetailsClickedButton(ActionEvent event) {
    }

    @FXML
    private void returnhomeClickedButton(ActionEvent event) {
    }
    
}
