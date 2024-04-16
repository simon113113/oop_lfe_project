/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package tahmina;

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
import javafx.scene.control.Label;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Admin
 */
public class PolicyComplianceController implements Initializable {

    @FXML
    private Label policyDetailsLabel;
    @FXML
    private ComboBox<String> policyCB;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
     policyCB.getItems().addAll(
                "Attendance Requirements",
                "Safety Protocols",
                "Professional Conduct",
                "Confidentiality Agreement",
                "Ethical Guidelines"
        );
        
        // TODO
    }    

    @FXML
    private void submitClickedButton(ActionEvent event) {
         String selectedPolicy = policyCB.getValue();
        
        // Set policy details based on the selected policy
        switch (selectedPolicy) {
            case "Attendance Requirements":
                policyDetailsLabel.setText("All participants engaging in Live Field Experience (LFE) activities"
                        + " are required to maintain regular attendance as outlined in the program schedule."
                        + "Absences must be communicated "
                        + "in advance to the program coordinator.");
                break;
            case "Safety Protocols":
                policyDetailsLabel.setText("Safety is our top priority during Live Field Experience activities. "
                        + "Participants must adhere to all safety protocols, including wearing appropriate"
                        + " safety gear, following instructions from supervisors, and reporting any safety "
                        + "concerns immediately.");
                break;
            case "Professional Conduct":
                policyDetailsLabel.setText("Participants are expected to maintain a high level of"
                        + " professionalism  at all times during Live Field Experience activities."
                        + " This includes respecting colleagues, clients, and the general public,"
                        + " as well as representing the organization in a positive manner.");
                break;
            case "Confidentiality Agreement":
                policyDetailsLabel.setText("Participants may be exposed to confidential"
                        + " information during Live Field Experience activities. It is "
                        + "essential to uphold confidentiality agreements and refrain "
                        + "from sharing sensitive information with unauthorized "
                        + "individuals.");
                break;
            case "Ethical Guidelines":
                policyDetailsLabel.setText("Participants must adhere to ethical guidelines"
                        + " and standards of conduct while participating in Live Field "
                        + "Experience activities. This includes avoiding conflicts of"
                        +"interest, maintaining integrity in research "
                         +"and reporting, and respecting the rights and"
                        + " dignity of all individuals involved.");
                break;
            default:
                policyDetailsLabel.setText("No policy selected.");
                break;
                
        }
         // Wrap text within the Label
        policyDetailsLabel.setWrapText(true);
    }

    @FXML
    private void returntodashboardClickedButton(ActionEvent event) throws IOException {
        Parent parent = FXMLLoader.load(getClass().getResource("/tahmina/VenueIncharge.fxml"));
        Scene scene = new Scene(parent);
        Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
        window.setScene(scene);
        window.show();
    }
    
}
