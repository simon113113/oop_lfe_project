/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package simoon;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;

/**
 * FXML Controller class
 *
 * @author simon
 */
public class CourseManagerController implements Initializable {

    @FXML
    private Button HomeButton;
    @FXML
    private Button LogOutButton;
    @FXML
    private Label AboutLFEExperience;
    @FXML
    private TextArea AboutLFETextArea;
    @FXML
    private TableView<?> AboutLFETableView;
    @FXML
    private TableColumn<?, ?> StudentIdTableColumn;
    @FXML
    private TableColumn<?, ?> LFEGroupTableColumn;
    @FXML
    private TableColumn<?, ?> CommentsTableColumn;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void RegisteredStudentsOnClick(ActionEvent event) {
    }

    @FXML
    private void ApplicationOnClick(ActionEvent event) {
    }

    @FXML
    private void VenueForStudentOnClick(ActionEvent event) {
    }

    @FXML
    private void VenueForFacultyOnClick(ActionEvent event) {
    }

    @FXML
    private void AboutTheLFEOnClick(ActionEvent event) {
    }

    @FXML
    private void HomeOnClick(ActionEvent event) {
    }

    @FXML
    private void LogOutOnClick(ActionEvent event) {
    }

    @FXML
    private void RulesAndPoliciesOnClick(ActionEvent event) {
    }

    @FXML
    private void GradingOnClick(ActionEvent event) {
    }
    
}
