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
public class FacultyInfoController implements Initializable {

    @FXML
    private ComboBox<?> venueCB;
    @FXML
    private TableView<?> facultyTV;
    @FXML
    private TableColumn<?, ?> facnameTC;
    @FXML
    private TableColumn<?, ?> emailTC;
    @FXML
    private TableColumn<?, ?> contactTC;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void submitClickedButton(ActionEvent event) {
    }

    @FXML
    private void returntodashboardClickedButton(ActionEvent event) throws IOException {
           Parent parent = FXMLLoader.load(getClass().getResource("/tahmina/FacultyIncharge.fxml"));
    Scene scene = new Scene(parent);
    Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
    window.setScene(scene);
    window.show();
    }
    
}
