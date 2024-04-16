/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package tahmina;

import java.io.IOException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;
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
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Admin
 */
public class StaffScheduleController implements Initializable {

    @FXML
    private ComboBox<String> venueCB;
    @FXML
    private Label staffDetailsLabel;
    

    // Map to store staff details based on venue
    private Map<String, String> staffDetailsMap;


    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        initializeStaffDetailsMap();

        // Add venue options to the ComboBox
        venueCB.getItems().addAll(
                "Proshika HRDC, Koitta, Manikganj",
                "Brac Learning Center, Barisal",
                "Rural Development Academy, Bogra"
        );
    }

    // Method to initialize staff details based on venue
    private void initializeStaffDetailsMap() {
        staffDetailsMap = new HashMap<>();

        // Staff details for Proshika HRDC, Koitta, Manikganj
        staffDetailsMap.put("Proshika HRDC, Koitta, Manikganj", "Staff 1: Hasan Ali - Responsible for coordinating training sessions\n"
                + "Staff 2: Fatima Rahman - Responsible for logistical arrangements\n"
                + "Staff 3: Kamal Hossain - Responsible for participant management");

        // Staff details for Brac Learning Center, Barisal
        staffDetailsMap.put("Brac Learning Center, Barisal", "Staff 1: Anika Islam - Responsible for curriculum development\n"
                + "Staff 2: Nasir Uddin - Responsible for classroom management\n"
                + "Staff 3: Farhana Akter - Responsible for assessment and evaluation");

        // Staff details for Rural Development Academy, Bogra
        staffDetailsMap.put("Rural Development Academy, Bogra", "Staff 1: Rakib Ahmed - Responsible for fieldwork supervision\n"
                + "Staff 2: Nusrat Jahan - Responsible for research coordination\n"
                + "Staff 3: Sumon Khan - Responsible for data collection and analysis");
        // TODO
    }    


    @FXML
    private void returntodashboardClickedButton(ActionEvent event) throws IOException {
        Parent parent = FXMLLoader.load(getClass().getResource("/tahmina/VenueIncharge.fxml"));
        Scene scene = new Scene(parent);
        Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
        window.setScene(scene);
        window.show();
    }

    @FXML
    private void ShowDetailsClickedButton(ActionEvent event) {
         String selectedVenue = venueCB.getValue();

        // Get staff details based on the selected venue
        String details = staffDetailsMap.get(selectedVenue);

        // Set staff details in the Label
        staffDetailsLabel.setText(details);

        // Wrap text within the Label
        staffDetailsLabel.setWrapText(true);
    }
    
}
