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
import javafx.scene.control.Button;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Admin
 */
public class VenueInchargeController implements Initializable {

    @FXML
    private Button StudentManagement;
    @FXML
    private Button VenueInfo;
    @FXML
    private Button StaffSchedule;
    @FXML
    private Button AddressParticipantNeeds;
    @FXML
    private Button EventSetup;
    @FXML
    private Button EventPerformancr;
    @FXML
    private Button EventHistory;
    @FXML
    private Button PolicyandComplaince;
    @FXML
    private Button Home;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void stumanagementButtonClicked(ActionEvent event) throws IOException {
        Parent parent = FXMLLoader.load(getClass().getResource("/tahmina/StudentManagement.fxml"));
    Scene scene = new Scene(parent);
    Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
    window.setScene(scene);
    window.show();
    }

    @FXML
    private void venueinfoButtonClicked(ActionEvent event) throws IOException {
        Parent parent = FXMLLoader.load(getClass().getResource("/tahmina/VenueInfo.fxml"));
    Scene scene = new Scene(parent);
    Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
    window.setScene(scene);
    window.show();
    }

    @FXML
    private void staffscheduleButtonClicked(ActionEvent event) throws IOException {
         Parent parent = FXMLLoader.load(getClass().getResource("/tahmina/StaffSchedule.fxml"));
    Scene scene = new Scene(parent);
    Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
    window.setScene(scene);
    window.show();
    }

    @FXML
    private void participantneedsButtonClicked(ActionEvent event) throws IOException {
          Parent parent = FXMLLoader.load(getClass().getResource("/tahmina/AddressParticipantNeeds.fxml"));
    Scene scene = new Scene(parent);
    Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
    window.setScene(scene);
    window.show();
    }

    @FXML
    private void eventsetupButtonClicked(ActionEvent event) throws IOException {
          Parent parent = FXMLLoader.load(getClass().getResource("/tahmina/EventSetup.fxml"));
    Scene scene = new Scene(parent);
    Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
    window.setScene(scene);
    window.show();
    }

    @FXML
    private void eventperformanceButtonClicked(ActionEvent event) throws IOException {
          Parent parent = FXMLLoader.load(getClass().getResource("/tahmina/EventPerformance.fxml"));
    Scene scene = new Scene(parent);
    Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
    window.setScene(scene);
    window.show();
    }

    @FXML
    private void eventhistoryClickedButton(ActionEvent event) throws IOException {
           Parent parent = FXMLLoader.load(getClass().getResource("/tahmina/EventHistory.fxml"));
    Scene scene = new Scene(parent);
    Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
    window.setScene(scene);
    window.show();
    }

    @FXML
    private void policyClickedButton(ActionEvent event) throws IOException {
            Parent parent = FXMLLoader.load(getClass().getResource("/tahmina/PolicyCompliance.fxml"));
    Scene scene = new Scene(parent);
    Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
    window.setScene(scene);
    window.show();
    }

    @FXML
    private void homeButtonClicked(ActionEvent event) throws IOException {
            Parent parent = FXMLLoader.load(getClass().getResource("/main/Login.fxml"));
    Scene scene = new Scene(parent);
    Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
    window.setScene(scene);
    window.show();
    }
    
}
