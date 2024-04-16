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
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author Admin
 */
public class EventSetupController implements Initializable {

    @FXML
    private ComboBox<?> venueCB;
    @FXML
    private ComboBox<?> locastionCB;
    @FXML
    private ComboBox<?> hotelnameCB;
    @FXML
    private TextField entrydateTF;

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
    private void returndashboardClickedButton(ActionEvent event) {
    }
    
}
