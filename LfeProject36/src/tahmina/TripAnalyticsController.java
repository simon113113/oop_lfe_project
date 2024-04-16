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
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Admin
 */
public class TripAnalyticsController implements Initializable {

    @FXML
    private ComboBox<String> venueCB;
    @FXML
    private ComboBox<String> semesterCB;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // Add sample values to the venue ComboBox
        
        venueCB.getItems().addAll("venue 1", "venue 2","venue 3");
      
       //
        semesterCB.getItems().addAll("Spring 2022", "Fall 2022", "Spring 2023");
    }
    
    @FXML
    private void returntodashboardClickedButton(ActionEvent event) {
    }

    @FXML
    private void showdetailsClickedButton(ActionEvent event) throws IOException {
           Parent parent = FXMLLoader.load(getClass().getResource("/tahmina/FacultyIncharge.fxml"));
    Scene scene = new Scene(parent);
    Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
    window.setScene(scene);
    window.show();
    }
    
}
