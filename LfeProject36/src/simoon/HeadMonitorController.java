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
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;

/**
 * FXML Controller class
 *
 * @author simon
 */
public class HeadMonitorController implements Initializable {

    @FXML
    private Button GroupMonitorButton;
    @FXML
    private Button RergularActivitybutton;
    @FXML
    private Button DailyFeedbackButton;
    @FXML
    private Button FacultyDiscussionButton;
    @FXML
    private Button ImportantNotesButton;
    @FXML
    private Button HomeButton;
    @FXML
    private Button LogOutButton;
    @FXML
    private Label Gradiing;
    @FXML
    private ComboBox<?> GroupComboBox;
    @FXML
    private ComboBox<?> SerialComboBox;
    @FXML
    private ComboBox<?> GradeComboBox;
    @FXML
    private TextArea CommentDetails;
    @FXML
    private Button Comment;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void CommentButtonOnClick(ActionEvent event) {
    }
    
}
