package tahmina;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

public class EventHistoryController implements Initializable {
    ArrayList<Venue> venueList = new ArrayList<>();

    @FXML
    private ComboBox<String> yearCB;
    @FXML
    private ComboBox<String> semesterCB;
    @FXML
    private ComboBox<String> venueCB;
    @FXML
    private TableView<Venue> venueTV;
    @FXML
    private TableColumn<Venue,String> yearTC;
    @FXML
    private TableColumn<Venue,String> semesterTC;
    @FXML
    private TableColumn<Venue,String> venueTC;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        yearCB.getItems().addAll("Year 2023","Year 2022");
        semesterCB.getItems().addAll("Procedure 1", "Procedure 2");
        venueCB.getItems().addAll("Patient ID 1", "Patient ID 2", "Patient ID 3");
        yearTC.setCellValueFactory(new PropertyValueFactory<Venue, String>("year"));
        semesterTC.setCellValueFactory(new PropertyValueFactory<Venue, String>("semester"));
        venueTC.setCellValueFactory(new PropertyValueFactory<Venue, String>("venue"));
         venueList = new ArrayList<Venue>();
    }    

    @FXML
    private void showtotableClickedButton(ActionEvent event) {
        for(Venue s: venueList)
            venueTV.getItems().add(s);      
    }

    @FXML
   
private void addtotableClickedButton(ActionEvent event) {
    // Retrieve selected values from ComboBoxes
    
}


    @FXML
    private void returntodashboardClickedbutton(ActionEvent event) throws IOException {
         Parent parent = FXMLLoader.load(getClass().getResource("/tahmina/VenueIncharge.fxml"));
        Scene scene = new Scene(parent);
        Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
        window.setScene(scene);
        window.show();
    }
}