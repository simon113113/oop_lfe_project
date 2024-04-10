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
import javafx.scene.layout.AnchorPane;

/**
 * FXML Controller class
 *
 * @author User
 */
public class MaintananceManagerController implements Initializable {

    @FXML
    private AnchorPane dashboard;
    @FXML
    private AnchorPane serviceScene;
    @FXML
    private AnchorPane UserDetailsScene;
    @FXML
    private AnchorPane eventManagementScene;
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
    @FXML
    private Button refreshTableOfService;
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
    private Button LogoutButton;
    @FXML
    private Button HomeButton;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void SceneChange(ActionEvent event) {
        if (event.getSource() == HomeButton) {
            dashboard.setVisible(true);
            serviceScene.setVisible(false);
            UserDetailsScene.setVisible(false);
            employeeManagementScene.setVisible(false);
            generateReport.setVisible(false);
            compaintAndFeedbackScene.setVisible(false);
            transportationScene.setVisible(false);
            eventManagementScene.setVisible(false);
            sendUserNotice.setVisible(false);
        } else if (event.getSource() == UserDetailsButton) {
            dashboard.setVisible(false);
            serviceScene.setVisible(false);
            UserDetailsScene.setVisible(true);
            employeeManagementScene.setVisible(false);
            generateReport.setVisible(false);
            compaintAndFeedbackScene.setVisible(false);
            transportationScene.setVisible(false);
            eventManagementScene.setVisible(false);
            sendUserNotice.setVisible(false);
            
        } else if (event.getSource() == EmployeeManageButton) {
            dashboard.setVisible(false);
            serviceScene.setVisible(false);
            UserDetailsScene.setVisible(false);
            employeeManagementScene.setVisible(true);
            generateReport.setVisible(false);
            compaintAndFeedbackScene.setVisible(false);
            transportationScene.setVisible(false);
            eventManagementScene.setVisible(false);
            sendUserNotice.setVisible(false);
            
        }else if (event.getSource() == GenerateReportButton) {
            dashboard.setVisible(false);
            serviceScene.setVisible(false);
            UserDetailsScene.setVisible(false);
            employeeManagementScene.setVisible(false);
            generateReport.setVisible(true);
            compaintAndFeedbackScene.setVisible(false);
            transportationScene.setVisible(false);
            eventManagementScene.setVisible(false);
            sendUserNotice.setVisible(false);
            
        }else if (event.getSource() == FeedBackAndComplaintButton) {
            dashboard.setVisible(false);
            serviceScene.setVisible(false);
            UserDetailsScene.setVisible(false);
            employeeManagementScene.setVisible(false);
            generateReport.setVisible(false);
            compaintAndFeedbackScene.setVisible(true);
            transportationScene.setVisible(false);
            eventManagementScene.setVisible(false);
            sendUserNotice.setVisible(false);
            
        }else if (event.getSource() == TransportationButton) {
            dashboard.setVisible(false);
            serviceScene.setVisible(false);
            UserDetailsScene.setVisible(false);
            employeeManagementScene.setVisible(false);
            generateReport.setVisible(false);
            compaintAndFeedbackScene.setVisible(false);
            transportationScene.setVisible(true);
            eventManagementScene.setVisible(false);
            sendUserNotice.setVisible(false);
            
        }else if (event.getSource() == CreateEventButton) {
            dashboard.setVisible(false);
            serviceScene.setVisible(false);
            UserDetailsScene.setVisible(false);
            employeeManagementScene.setVisible(false);
            generateReport.setVisible(false);
            compaintAndFeedbackScene.setVisible(false);
            transportationScene.setVisible(false);
            eventManagementScene.setVisible(true);
            sendUserNotice.setVisible(false);
            
        }else if (event.getSource() == ServiceButton) {
            dashboard.setVisible(false);
            serviceScene.setVisible(true);
            UserDetailsScene.setVisible(false);
            employeeManagementScene.setVisible(false);
            generateReport.setVisible(false);
            compaintAndFeedbackScene.setVisible(false);
            transportationScene.setVisible(false);
            eventManagementScene.setVisible(false);
            sendUserNotice.setVisible(false);
            
        }else if (event.getSource() == SendNoticeButton) {
            dashboard.setVisible(false);
            serviceScene.setVisible(false);
            UserDetailsScene.setVisible(false);
            employeeManagementScene.setVisible(false);
            generateReport.setVisible(false);
            compaintAndFeedbackScene.setVisible(false);
            transportationScene.setVisible(false);
            eventManagementScene.setVisible(false);
            sendUserNotice.setVisible(true);
        }

    } 
}
