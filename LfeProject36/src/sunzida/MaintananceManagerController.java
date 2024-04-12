/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package sunzida;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

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
    @FXML
    private TextField serviceNameTF;
    @FXML
    private TextField Contactno;
    @FXML
    private DatePicker contractFrom;
    @FXML
    private DatePicker contractTo;
    @FXML
    private TableView<Service> tableView;
    @FXML
    private TableColumn<Service, String> serviceNameTC;
    @FXML
    private TableColumn<Service, String> contactNoTC;
    @FXML
    private TableColumn<Service, String> ContractExpireTC;
    @FXML
    private TableColumn<Service, String> ServiceTypeTC;
    @FXML
    private ComboBox<String> Catego;
    private ObservableList<Service> serviceList;
    @FXML
    private TableView<AllUserData> UserdetailsTableView;
    @FXML
    private TableColumn<AllUserData, Integer> idTC_G2;
    @FXML
    private TableColumn<AllUserData, String> nameTC_G2;
    @FXML
    private TableColumn<AllUserData, String> emailTC_G2;
    @FXML
    private TableColumn<AllUserData, String> userTypeTC_G2;
    @FXML
    private TableColumn<AllUserData, String> contactNoTC_G2;
    @FXML
    private TableColumn<AllUserData, String> genderTC_G2;
    
    

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        serviceList = FXCollections.observableArrayList();
       Catego.getItems().addAll("Indoor", "Outdoor",
                "Special");
       
       //table data setting 
        serviceNameTC.setCellValueFactory(new PropertyValueFactory<Service, String>("serviceName"));
        contactNoTC.setCellValueFactory(new PropertyValueFactory<Service, String>("ContactNo"));
        ContractExpireTC.setCellValueFactory(new PropertyValueFactory<Service, String>("contractTo"));
        ServiceTypeTC.setCellValueFactory(new PropertyValueFactory<Service, String>("serviceCatago"));
        loadServiceData();
    
    //--------------------------------------------------------------------------------------------------------------------
    //Goal_2 initailize
    idTC_G2.setCellValueFactory(new PropertyValueFactory<AllUserData, Integer>("id"));
    nameTC_G2.setCellValueFactory(new PropertyValueFactory<AllUserData, String>("name"));
    emailTC_G2.setCellValueFactory(new PropertyValueFactory<AllUserData, String>("email"));
    userTypeTC_G2.setCellValueFactory(new PropertyValueFactory<AllUserData, String>("usertype"));
    contactNoTC_G2.setCellValueFactory(new PropertyValueFactory<AllUserData, String>("contNo"));
    genderTC_G2.setCellValueFactory(new PropertyValueFactory<AllUserData, String>("gender"));
    
    }

    private void loadServiceData() {
        File file = new File("ServiceObjects.bin");
        if (!file.exists()) {
            try {
                // Create an empty file if it doesn't exist
                file.createNewFile();
            } catch (IOException ex) {
                ex.printStackTrace();
                return;
            }
        }

        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file))) {
            while (true) {
                Service s = (Service) ois.readObject();
                serviceList.add(s);
            }
        } catch (EOFException e) {
            // End of file reached, do nothing
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        tableView.setItems(serviceList);
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

    @FXML
    private void addButton(ActionEvent event) {
        // Check if all data fields are entered or not
        if (serviceNameTF.getText().isEmpty() || Contactno.getText().isEmpty()
                || contractFrom.getValue() == null || contractTo.getValue() == null
                || Catego.getValue().isEmpty()) {

            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Incomplete Data");
            alert.setHeaderText(null);
            alert.setContentText("Please enter all required fields");
            alert.showAndWait();
            return;
        }

        ObservableList<Service> servicelist = FXCollections.observableArrayList();
        ObjectInputStream ois = null;
        {

            try {
                Service s;

                ois = new ObjectInputStream(new FileInputStream("ServiceObjects.bin"));

                while (true) {
                    s = (Service) ois.readObject();
                    servicelist.add(s);
                    tableView.setItems(servicelist);
                }

            } catch (RuntimeException e) {
                e.printStackTrace();

            } catch (Exception ex) {
                try {
                    if (ois != null) {
                        ois.close();
                    }
                } catch (IOException ex1) {
                }
            }

        }
        File f = null;
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;

        try {
            f = new File("ServiceObjects.bin");
            if (f.exists()) {
                fos = new FileOutputStream(f, true);
                oos = new AppendableObjectOutputStream(fos);
            } else {
                fos = new FileOutputStream(f);
                oos = new ObjectOutputStream(fos);
            }
            Service s = new Service(serviceNameTF.getText(), 
                    Contactno.getText(), Catego.getValue(),contractFrom.getValue(),
                    contractTo.getValue()
            );

            oos.writeObject(s);
            servicelist.add(s);
            tableView.setItems(servicelist);

            serviceNameTF.clear();
            Catego.setValue(null);
            contractTo.setValue(null);
            contractFrom.setValue(null);
            Contactno.clear();
        } catch (IOException ex) {

            Logger.getLogger(MaintananceManagerController.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                if (oos != null) {
                    oos.close();
                }
            } catch (IOException ex) {
                Logger.getLogger(MaintananceManagerController.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }

    @FXML
    private void refreshTableOfServiceOnClick(ActionEvent event) {
        tableView.refresh();
    }
    //---------
    //Goal 2  |
    //---------

    @FXML
    private void LoadButtonG2(ActionEvent event) {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("AllUserData.bin"))) {
            ObservableList<AllUserData> userDataList = FXCollections.observableArrayList();

            // Read the data from the file until the end of file (EOF) is reached
            try {
                while (true) {
                    AllUserData userData = (AllUserData) ois.readObject();
                    userDataList.add(userData);
                }
            } catch (EOFException e) {
                // End of file reached, do nothing
            }

            // Set the items of the TableView to the populated list
            UserdetailsTableView.setItems(userDataList);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
            // Handle exception (e.g., show error message)
        }

    }

    @FXML
    private void deleteButtonG2(ActionEvent event) {
    }

    @FXML
    private void logoutButton(ActionEvent event) {
        
        try {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/main/Login.fxml"));
        Parent root = loader.load();
        Scene scene = new Scene(root);
        
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.show();
    } catch (IOException ex) {
        ex.printStackTrace();
     
    }
    }
    
    
}

