/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package sunzida;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

/**
 * FXML Controller class
 *
 * @author Asus
 */
public class FinancialOfficerController implements Initializable {

    @FXML
    private Button LogoutButton;
    @FXML
    private Button HomeButton;
    @FXML
    private Button ServiceButton;
    @FXML
    private Button UserDetailsButton;
    @FXML
    private Button EmployeeManageButton;
    @FXML
    private Button GenerateReportButton;
    @FXML
    private Button FeedBackAndComplaintButton;
    @FXML
    private Button TransportationButton;
    @FXML
    private Button CreateEventButton;
    @FXML
    private Button SendNoticeButton;
    @FXML
    private AnchorPane dashboard;
    @FXML
    private AnchorPane serviceScene;
    @FXML
    private TextField serviceNameTF;
    @FXML
    private TextField Contactno;
    @FXML
    private DatePicker contractFrom;
    @FXML
    private DatePicker contractTo;
    @FXML
    private TableView<?> tableView;
    @FXML
    private TableColumn<?, ?> serviceNameTC;
    @FXML
    private TableColumn<?, ?> contactNoTC;
    @FXML
    private TableColumn<?, ?> ContractExpireTC;
    @FXML
    private TableColumn<?, ?> ServiceTypeTC;
    @FXML
    private ComboBox<?> Catego;
    @FXML
    private AnchorPane UserDetailsScene;
    @FXML
    private TableView<?> UserdetailsTableView;
    @FXML
    private TableColumn<?, ?> idTC_G2;
    @FXML
    private TableColumn<?, ?> nameTC_G2;
    @FXML
    private TableColumn<?, ?> emailTC_G2;
    @FXML
    private TableColumn<?, ?> userTypeTC_G2;
    @FXML
    private TableColumn<?, ?> genderTC_G2;
    @FXML
    private TextField SearchLabel;
    @FXML
    private TextArea userDetailsTextArea;
    @FXML
    private AnchorPane eventManagementScene;
    @FXML
    private TextField nameEventTF;
    @FXML
    private ComboBox<?> menuTypeComboBoxTF;
    @FXML
    private DatePicker eventDate;
    @FXML
    private TextField nbOfParecipantsTF;
    @FXML
    private ComboBox<?> eventLocationComboBox;
    @FXML
    private TableView<?> eventTabbleView;
    @FXML
    private TableColumn<?, ?> eventNameTC;
    @FXML
    private TableColumn<?, ?> eventDateTC;
    @FXML
    private TableColumn<?, ?> eventGuestNoTC;
    @FXML
    private TableColumn<?, ?> eventLocationTC;
    @FXML
    private AnchorPane compaintAndFeedbackScene;
    @FXML
    private AnchorPane employeeManagementScene;
    @FXML
    private AnchorPane generateReport;
    @FXML
    private AnchorPane sendUserNotice;
    @FXML
    private AnchorPane transportationScene;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void logoutButton(ActionEvent event) {
    }

    @FXML
    private void SceneChange(ActionEvent event) {
    }

    @FXML
    private void addButton(ActionEvent event) {
    }

    @FXML
    private void DeleteServiceOnClick(ActionEvent event) {
    }

    @FXML
    private void LoadButtonG2(ActionEvent event) {
    }

    @FXML
    private void SearchButtonG2(ActionEvent event) {
    }

    @FXML
    private void viewDetailsButtonG2(ActionEvent event) {
    }

    @FXML
    private void createEventButtonOnClick(ActionEvent event) {
    }

    @FXML
    private void deleteButtonOnClick(ActionEvent event) {
    }
    
}
