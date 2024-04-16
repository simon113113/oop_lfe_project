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
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

/**
 * FXML Controller class
 *
 * @author Admin
 */
public class EquipmentInventoryController implements Initializable {

    @FXML
    private TableView<?> showdetailsTV;
    @FXML
    private TableColumn<?, ?> itemTC;
    @FXML
    private TableColumn<?, ?> quantityTC;
    @FXML
    private TableColumn<?, ?> availableTC;
    @FXML
    private ComboBox<?> itemCB;

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
    private void returntodashboardClickedButton(ActionEvent event) {
    }
    
}
