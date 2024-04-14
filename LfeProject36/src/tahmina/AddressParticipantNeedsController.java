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
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Admin
 */
public class AddressParticipantNeedsController implements Initializable {

    @FXML
    private TableView<?> tableTV;
    @FXML
    private TableColumn<?, ?> stuidTC;
    @FXML
    private TableColumn<?, ?> stunameTC;
    @FXML
    private TableColumn<?, ?> problemTC;
    @FXML
    private TableColumn<?, ?> makereportTC;
    @FXML
    private ComboBox<?> stuidCB;
    @FXML
    private TextField stunameTF;
    @FXML
    private TextField prbTF;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void showtotable1ClickedDashboard(ActionEvent event) {
    }

    @FXML
    private void showtotable2ClickedDashboard(ActionEvent event) {
    }

    @FXML
    private void showtotable3ClickedDashboard(ActionEvent event) {
    }

    @FXML
    private void retuendashboardClickedDashboard(ActionEvent event) throws IOException {
        Parent parent = FXMLLoader.load(getClass().getResource("/tahmina/VenueIncharge.fxml"));
    Scene scene = new Scene(parent);
    Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
    window.setScene(scene);
    window.show();
    }
    
}
