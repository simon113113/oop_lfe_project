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
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Admin
 */
public class CollectActivitiesFeedbackController implements Initializable {

    @FXML
    private ComboBox<?> vanueCB;
    @FXML
    private ComboBox<?> semesterCB;
    @FXML
    private TableView<?> studentTV;
    @FXML
    private TableColumn<?, ?> studentidTC;
    @FXML
    private TableColumn<?, ?> nameTC;
    @FXML
    private TableColumn<?, ?> feedbackTC;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void showdetailsClickedButton(ActionEvent event) {
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
