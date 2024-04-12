/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package sunzida;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.PasswordField;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author User
 */
public class SignUpSceneController implements Initializable {

    @FXML
    private TextField userNameTF;
    @FXML
    private TextField nameTF;
    @FXML
    private PasswordField passTF;
    @FXML
    private TextField emailTF;
    @FXML
    private TextField contactTF;
    @FXML
    private RadioButton maleRadbtn;
    @FXML
    private DatePicker dob;
    @FXML
    private RadioButton femaleRadbtn;
    @FXML
    private ComboBox<String> usertypeComboBox;
    

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        usertypeComboBox.getItems().addAll("Maintanance Manager","Financial Officer"
                                                     ,"Course Manager", "Head Monitor"
                                                     ,"Students","Medical Officer","Venue Incharge"
                                            ,"Faculty Incharge","Student monitor","Room attendant");
    }    

    @FXML
    private void RegButtonOnClick(ActionEvent event) {
    }
    
}
