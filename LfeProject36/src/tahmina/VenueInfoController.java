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
public class VenueInfoController implements Initializable {

    @FXML
    private ComboBox<String> venueCB;
    @FXML
    private Label venueDetailsLabel;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        venueCB.getItems().addAll(
                "Proshika HRDC, Koitta, Manikganj",
                "Brac Learning Center, Barisal",
                "Rural Development Academy, Bogra"
        );
        // TODO
    }    

    @FXML
    private void showdetailsClickedButton(ActionEvent event) {
        String selectedVenue = venueCB.getValue();
        
        // Set venue details based on the selected venue
        switch (selectedVenue) {
            case "Proshika HRDC, Koitta, Manikganj":
                venueDetailsLabel.setText("Location: Koitta, Manikganj\nDescription: Proshika HRDC provides a conducive environment for hands-on learning experiences. With its modern facilities and serene surroundings, it offers an ideal setting for practical training sessions.\nBooking Info: Booked from May 15, 2024, to June 30, 2024");
                break;
            case "Brac Learning Center, Barisal":
                venueDetailsLabel.setText("Location: Barisal\nDescription: Brac Learning Center is equipped with state-of-the-art amenities and spacious classrooms, making it an excellent venue for immersive learning activities. Its central location and accessibility make it convenient for participants.\nBooking Info: Booked from June 1, 2024, to July 15, 2024");
                break;
            case "Rural Development Academy, Bogra":
                venueDetailsLabel.setText("Location: Bogra\nDescription: Rural Development Academy offers a unique blend of modern infrastructure and natural beauty, providing participants with an inspiring learning environment. Its tranquil surroundings foster creativity and engagement.\nBooking Info: Booked from July 10, 2024, to August 25, 2024");
                break;
            default:
                venueDetailsLabel.setText("No venue selected.");
                break;
        }
        
        // Wrap text within the Label
        venueDetailsLabel.setWrapText(true);
    }

    @FXML
    private void returntodashboardClickedButton(ActionEvent event) throws IOException {
          Parent parent = FXMLLoader.load(getClass().getResource("/tahmina/VenueIncharge.fxml"));
    Scene scene = new Scene(parent);
    Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
    window.setScene(scene);
    window.show();
    }
    
}
