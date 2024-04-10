/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package main;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author User
 */
public class LoginController implements Initializable {

    @FXML
    private AnchorPane logInPageFrame;
    @FXML
    private TextField loginPageUserName;
    @FXML
    private PasswordField loginPagePswdField;
    @FXML
    private Label UserNameError;
    @FXML
    private Label PassError;
    @FXML
    private ComboBox<String> logInPageUserTypeCombox;
    @FXML
    private Hyperlink forgotPassHyprLink;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        logInPageUserTypeCombox.getItems().addAll("Maintanance Manager","Financial Officer"
                                                     ,"Course Manager", "Head Monitor"
                                                     ,"Students","Medical Officer","Venue Incharge"
                                            ,"Faculty Incharge","Student monitor","Room attendant");
    }    

    @FXML
    private void logInPageSignInBtn(ActionEvent event) throws IOException {
        if(logInPageUserTypeCombox.getValue()=="Maintanance Manager"){
            Parent root = FXMLLoader.load(getClass().getResource("/sunzida/MaintananceManager.fxml"));
            Scene scene = new Scene(root);
            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            stage.setScene(scene);
            stage.show();
        }
        
       
    }

    @FXML
    private void switchToOtherFrame(ActionEvent event) {
    }

    @FXML
    private void logInPageUserTypeComboxOnClick(ActionEvent event) {
    }
    
}
