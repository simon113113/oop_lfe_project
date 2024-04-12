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
public class StudentManagementController implements Initializable {

    @FXML
    private TableView<?> stuTV;
    @FXML
    private TableColumn<?, ?> stuidTC;
    @FXML
    private TableColumn<?, ?> stunameTC;
    @FXML
    private TableColumn<?, ?> deptTC;
    @FXML
    private TableColumn<?, ?> semestertc;
    @FXML
    private TableColumn<?, ?> emailTC;
    @FXML
    private TableColumn<?, ?> contactTC;
    @FXML
    private ComboBox<?> stuidCB;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void submitClickedButton(ActionEvent event) {
    }

    @FXML
    private void returntodashboardClickedButton(ActionEvent event) {
    }
    
}
