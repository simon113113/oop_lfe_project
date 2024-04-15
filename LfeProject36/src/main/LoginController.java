/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package main;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Modality;
import javafx.stage.Stage;
import sunzida.MaintananceManager;

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
        String userType = logInPageUserTypeCombox.getValue();
        String username = loginPageUserName.getText();
        String password = loginPagePswdField.getText();

        // Check if a user type is selected
        if (userType == null) {
            Alert alert = new Alert(Alert.AlertType.ERROR, "Please select a user.");
            alert.show();
            return;
        }

        // Check if the user type is "Maintanance Manager"
        if ("Maintanance Manager".equals(userType)) {
            //Load the file
            File employeeFile = new File("MaintananceManagerList.bin");

            // Check if the file exists
            if (employeeFile.exists()) {
                try (FileInputStream fis = new FileInputStream(employeeFile); ObjectInputStream ois = new ObjectInputStream(fis)) {
                    boolean found = false;
                    while (true) {
                        MaintananceManager manager = (MaintananceManager) ois.readObject();
                        // Check if username and password match
                        if (manager.getUsername().equals(username) && manager.getPassword().equals(password)) {
                            //if match, load the MaintananceManager.fxml
                            Parent root = FXMLLoader.load(getClass().getResource("/sunzida/MaintananceManager.fxml"));
                            Scene scene = new Scene(root);
                            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
                            stage.setScene(scene);
                            stage.show();
                            return;
                        } //check if username matches
                        else if (manager.getUsername().equals(username)) {
                            found = true;
                            break;
                        }
                    }
                    if (!found) {
                        UserNameError.setText("Invalid username.");

                        return;
                    }
                } catch (EOFException e) {
                    //no match found
                    System.out.println("No matching user found.");
                } catch (Exception e) {
                    e.printStackTrace();
                }
            } else {
                //if the file does not exist
                System.out.println("Employee file does not exist.");
            }
            UserNameError.setText("Invalid");
            PassError.setText("Invalid");
        }
        //----------------------------
        //For User Financial Officer |
        //----------------------------
        if ("Financial Officer".equals(userType)) {
            //Load the file
            File employeeFile = new File("FinancialOfficerList.bin");

            // Check if the file exists
            if (employeeFile.exists()) {
                try (FileInputStream fis = new FileInputStream(employeeFile); ObjectInputStream ois = new ObjectInputStream(fis)) {
                    boolean found = false;
                    while (true) {
                        MaintananceManager manager = (MaintananceManager) ois.readObject();
                        // Check if username and password match
                        if (manager.getUsername().equals(username) && manager.getPassword().equals(password)) {
                            //if match, load the MaintananceManager.fxml
                            Parent root = FXMLLoader.load(getClass().getResource("/sunzida/MaintananceManager.fxml"));
                            Scene scene = new Scene(root);
                            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
                            stage.setScene(scene);
                            stage.show();
                            return;
                        } //check if username matches
                        else if (manager.getUsername().equals(username)) {
                            found = true;
                            break;
                        }
                    }
                    if (!found) {
                        UserNameError.setText("Invalid username.");

                        return;
                    }
                } catch (EOFException e) {
                    //no match found
                    System.out.println("No matching user found.");
                } catch (Exception e) {
                    e.printStackTrace();
                }
            } else {
                //if the file does not exist
                System.out.println("Employee file does not exist.");
            }
            UserNameError.setText("Invalid");
            PassError.setText("Invalid");
        }
           //----------------------------
        //For User Vanue Incharge |
        //----------------------------
        if ("Venue Incharge".equals(userType)) {
            //Load the file
            File employeeFile = new File("VenueIncharge.bin");

            // Check if the file exists
            if (employeeFile.exists()) {
                try (FileInputStream fis = new FileInputStream(employeeFile); ObjectInputStream ois = new ObjectInputStream(fis)) {
                    boolean found = false;
                    while (true) {
                        MaintananceManager manager = (MaintananceManager) ois.readObject();
                        // Check if username and password match
                        if (manager.getUsername().equals(username) && manager.getPassword().equals(password)) {
                            //if match, load the MaintananceManager.fxml
                            Parent root = FXMLLoader.load(getClass().getResource("/tahmina/VenueInchargeDashboardScene.fxml"));
                            Scene scene = new Scene(root);
                            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
                            stage.setScene(scene);
                            stage.show();
                            return;
                        } //check if username matches
                        else if (manager.getUsername().equals(username)) {
                            found = true;
                            break;
                        }
                    }
                    if (!found) {
                        UserNameError.setText("Invalid username.");

                        return;
                    }
                } catch (EOFException e) {
                    //no match found
                    System.out.println("No matching user found.");
                } catch (Exception e) {
                    e.printStackTrace();
                }
            } else {
                //if the file does not exist
                System.out.println("Employee file does not exist.");
            }
            UserNameError.setText("Invalid");
            PassError.setText("Invalid");
        }

    
    }
    

    @FXML
    private void forgotPassHyprLink(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/sunzida/forgetPassScene.fxml"));
        Parent root = loader.load();

        // Create a new stage for the new scene
        Stage newStage = new Stage();
        newStage.setScene(new Scene(root));
        newStage.initModality(Modality.APPLICATION_MODAL);
        newStage.showAndWait();
    }

    @FXML
    private void RegHyprLink(ActionEvent event) throws IOException {

    Stage currentStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
    
    // Load the new scene
    FXMLLoader loader = new FXMLLoader(getClass().getResource("/sunzida/signUpScene.fxml"));
    Parent root = loader.load();

    // Create a new stage for the new scene
    Stage newStage = new Stage();
    newStage.setScene(new Scene(root));
    newStage.initModality(Modality.APPLICATION_MODAL);
    
    // Close the previous stage (currentStage)
    currentStage.close();
    
    // Show the new stage
    newStage.showAndWait();
    }
   
}
