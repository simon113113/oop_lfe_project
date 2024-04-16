/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package sunzida;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
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
    private Button genarateFRButton;
    @FXML
    private Button reviewApplicationButton;
    @FXML
    private Button settleInvoiceDButton;
    @FXML
    private Button invoiceManagementButton;
    @FXML
    private Button bankReconciliiationButton;
    @FXML
    private Button generatePRButton;
    @FXML
    private Button paymentApprovalButton;
    @FXML
    private Button budgetaryControlButton;
    @FXML
    private AnchorPane reviewApp;
    @FXML
    private AnchorPane settleInvoiceDis;
    @FXML
    private AnchorPane invoiceManagement;
    @FXML
    private AnchorPane BankReconciliation;
    @FXML
    private AnchorPane genaratePayRe;
    @FXML
    private AnchorPane payApproval;
    @FXML
    private AnchorPane budgetaryControl;
    @FXML
    private TableView<Report> reportTableView;
    @FXML
    private TableColumn<Report, String> reportNameTC;
    @FXML
    private TableColumn<Report, String> contactRepoTC;
    @FXML
    private TableColumn<Report, String> conExpTC;
    @FXML
    private TableColumn<Report, String> reportTypeTC;
    @FXML
    private AnchorPane genarateFinancialReport;
    @FXML
    private ComboBox<String> repoCatTF;
    
    private ObservableList<Report> reportList;
    @FXML
    private DatePicker ConFrRepoTF;
    @FXML
    private DatePicker conToReportTF;
    @FXML
    private AnchorPane dashboard;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
//      reportList = FXCollections.observableArrayList();
//        repoCatTF.getItems().addAll("complicated", "urgent");
//        // TODO
//        reportNameTC.setCellValueFactory(new PropertyValueFactory<Service, String>("reportName"));
//        contactRepoTC.setCellValueFactory(new PropertyValueFactory<Service, String>("RepoContact"));
//        conExpTC.setCellValueFactory(new PropertyValueFactory<Service, String>("contractTo"));
//        reportTypeTC.setCellValueFactory(new PropertyValueFactory<Service, String>("repoCat"));
    }    

    @FXML
    private void logoutButton(ActionEvent event) {
    }

    @FXML
    private void SceneChange(ActionEvent event) {
    }

    
}
