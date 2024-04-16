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
import java.time.LocalDate;
import java.util.ResourceBundle;
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
import javafx.scene.control.Alert.AlertType;
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
    private ObservableList<Event> eventList;
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
    @FXML
    private TextArea userDetailsTextArea;
    @FXML
    private TextField nameEventTF;
    @FXML
    private ComboBox<String> menuTypeComboBoxTF;
    @FXML
    private DatePicker eventDate;
    @FXML
    private TextField nbOfParecipantsTF;
    @FXML
    private ComboBox<String> eventLocationComboBox;
    @FXML
    private TableView<Event> eventTabbleView;
    @FXML
    private TableColumn<Event, String> eventNameTC;
    @FXML
    private TableColumn<Event, LocalDate> eventDateTC;
    @FXML
    private TableColumn<Event, Integer> eventGuestNoTC;
    @FXML
    private TableColumn<Event, String> eventLocationTC;
    @FXML
    private Label complaintTF;
    @FXML
    private TableView<Complaint> compTableView;
    @FXML
    private TableColumn<Complaint, String> compIdTC;
    @FXML
    private TableColumn<Complaint, String> fromTC;
    @FXML
    private TableColumn<Complaint, String> dateIssueTC;
    @FXML
    private TextArea compDetails;
    @FXML
    private Button deleteCompTF;
    @FXML
    private Button viewDTF;
    @FXML
    private Button loadCompTF;
    
    

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        serviceList = FXCollections.observableArrayList();
        eventList = FXCollections.observableArrayList();
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
    genderTC_G2.setCellValueFactory(new PropertyValueFactory<AllUserData, String>("gender"));
     //creat event initialize
           eventNameTC.setCellValueFactory(new PropertyValueFactory<Event, String>("eventName"));
           eventDateTC.setCellValueFactory(new PropertyValueFactory<Event, LocalDate>("eventDate"));
           eventGuestNoTC.setCellValueFactory(new PropertyValueFactory<Event, Integer>("noOfPartecipants"));
           eventLocationTC.setCellValueFactory(new PropertyValueFactory<Event, String>("location"));
           menuTypeComboBoxTF.getItems().addAll("Briani","kacchi","vat");
           eventLocationComboBox.getItems().addAll("auditorium","field","class");
           loadeventData();
    }
    
    private void loadServiceData() {
        serviceList.clear(); 

    File file = new File("ServiceObjects.bin");
    if (!file.exists()) {
        try {
            
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
        
    } catch (IOException | ClassNotFoundException e) {
        e.printStackTrace();
    }
    tableView.setItems(serviceList);
    }
    
    private void loadeventData() {
        eventList.clear(); 

    File file = new File("eventObjects.bin");
    if (!file.exists()) {
        try {
            
            file.createNewFile();
        } catch (IOException ex) {
            ex.printStackTrace();
            return;
        }
    }

    try (ObjectInputStream ois1 = new ObjectInputStream(new FileInputStream(file))) {
        while (true) {
            Event s = (Event) ois1.readObject();
            eventList.add(s);
        }
    } catch (EOFException e) {
        
    } catch (IOException | ClassNotFoundException e) {
        e.printStackTrace();
    }
    eventTabbleView.setItems(eventList);
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
        

   
    Service newService = new Service(serviceNameTF.getText(),
            Contactno.getText(), Catego.getValue(), contractFrom.getValue(),
            contractTo.getValue());

   
    serviceList.add(newService);

    
    tableView.setItems(serviceList);

   
    writeServiceListToFile();
    
    
    serviceNameTF.clear();
    Catego.setValue(null);
    contractTo.setValue(null);
    contractFrom.setValue(null);
    Contactno.clear();
}

private void writeServiceListToFile() {
    File file = new File("ServiceObjects.bin");
    try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file))) {
        for (Service service : serviceList) {
            oos.writeObject(service);
        }
    } catch (IOException e) {
        e.printStackTrace();
        
    }
}
private void writeEventListToFile() {
    File file = new File("EventObjects.bin");
    try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file))) {
        for (Event event : eventList) {
            oos.writeObject(event);
        }
    } catch (IOException e) {
        e.printStackTrace();
        
    }
}
    

    
    //---------
    //Goal 2  |
    //---------

    @FXML
    private void LoadButtonG2(ActionEvent event) {
         try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("AllUserData.bin"))) {
        ObservableList<AllUserData> userDataList = FXCollections.observableArrayList();

        
        try {
            while (true) {
                AllUserData userData = (AllUserData) ois.readObject();
                userDataList.add(userData);
            }
        } catch (EOFException e) {
            
        }

        
        UserdetailsTableView.setItems(userDataList);
    } catch (IOException | ClassNotFoundException e) {
        e.printStackTrace();
        
    }

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

            Alert alert = new Alert(AlertType.INFORMATION);
            alert.setTitle("Logout Successful");
            alert.setHeaderText(null);
            alert.setContentText("You have been successfully logged out.");
            alert.showAndWait();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }


    @FXML
    private void viewDetailsButtonG2(ActionEvent event) {
        AllUserData selectedUser = UserdetailsTableView.getSelectionModel().getSelectedItem();
    
    
    if (selectedUser != null) {
        
        String userDetails = String.format("ID: %d\nName: %s\nPassword: %s\nContact: %s",
                selectedUser.getId(),
                selectedUser.getName(),
                selectedUser.getPassword(),
                selectedUser.getContNo());

        
        userDetailsTextArea.setText(userDetails);
    } else {
        
        userDetailsTextArea.setText("Please select a user to view details.");
    }
    }

    @FXML
    private void DeleteServiceOnClick(ActionEvent event) {
        Service selectedService = tableView.getSelectionModel().getSelectedItem();
    
    
    if (selectedService != null) {
        
        serviceList.remove(selectedService);
        
        
        tableView.setItems(serviceList);
        
       
        writeServiceListToFile();
    } else {
        
        Alert alert = new Alert(Alert.AlertType.WARNING);
        alert.setTitle("No Service Selected");
        alert.setHeaderText(null);
        alert.setContentText("Please select a service to delete.");
        alert.showAndWait();
    }
    }

    @FXML
    private void createEventButtonOnClick(ActionEvent event) {
        if (nameEventTF.getText().isEmpty() || nbOfParecipantsTF.getText().isEmpty()
            || eventDate.getValue() == null ||menuTypeComboBoxTF.getValue().isEmpty()
            || eventLocationComboBox.getValue().isEmpty()) {

        Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.setTitle("Incomplete Data");
        alert.setHeaderText(null);
        alert.setContentText("Please enter all required fields");
        alert.showAndWait();
        return;
    }
        

   
    Event newEvent = new Event(nameEventTF.getText(), menuTypeComboBoxTF.getValue(),eventLocationComboBox.getValue(),Integer.parseInt(nbOfParecipantsTF.getText()),eventDate.getValue());

   
    eventList.add(newEvent);

    // Update the table view
    eventTabbleView.setItems(eventList);

    // Write the updated service list to the file
    writeEventListToFile();
    
    // Clear input fields
    nameEventTF.clear();
    eventDate.setValue(null);
    eventLocationComboBox.setValue(null);
    menuTypeComboBoxTF.setValue(null);
    nbOfParecipantsTF.clear();

    }

    @FXML
    private void deleteButtonOnClick(ActionEvent event) {
        Event selectedEvent = eventTabbleView.getSelectionModel().getSelectedItem();
    
    
    if (selectedEvent != null) {
        
        eventList.remove(selectedEvent);
        
        
        eventTabbleView.setItems(eventList);
        
       
        writeEventListToFile();
    } else {
        
        Alert alert = new Alert(Alert.AlertType.WARNING);
        alert.setTitle("No event Selected");
        alert.setHeaderText(null);
        alert.setContentText("Please select a event to delete.");
        alert.showAndWait();
    }
    }

    @FXML
    private void deleteCompButtonOnClick(ActionEvent event) {
    }

    @FXML
    private void veiwDButtonOnClick(ActionEvent event) {
    }

    @FXML
    private void loadCompButtonOnClick(ActionEvent event) {
    }
}

