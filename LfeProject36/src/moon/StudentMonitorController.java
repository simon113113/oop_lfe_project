/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package moon;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author Lenovo
 */
public class StudentMonitorController implements Initializable {

    @FXML
    private TextField serviceNameTF;
    @FXML
    private TextField serviceNameTF1;
    @FXML
    private DatePicker contractFrom;
    @FXML
    private TextField serviceNameTF11;
    @FXML
    private TextField serviceNameTF111;
    @FXML
    private TextField serviceNameTF1111;
    @FXML
    private TableView<?> tableView;
    @FXML
    private TableColumn<?, ?> serviceNameTC;
    @FXML
    private TableColumn<?, ?> contactNoTC;
    @FXML
    private TableColumn<?, ?> ContractExpireTC;
    @FXML
    private TableColumn<?, ?> ServiceTypeTC;
    @FXML
    private TableColumn<?, ?> contactNoTC1;
    @FXML
    private ComboBox<?> Catego;
    @FXML
    private DatePicker contractFrom1;
    @FXML
    private ComboBox<?> Catego1;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
