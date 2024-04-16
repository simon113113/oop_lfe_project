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
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Admin
 */
public class StudentManagementController implements Initializable {
    java.util.ArrayList<Management> mangList; // Fixed the type of mangList

    @FXML
    private TableView<Management> studentsTV;
    @FXML
    private TableColumn<Management, String> stuidTC;
    @FXML
    private TableColumn<Management, String> stunameTC;
    @FXML
    private TableColumn<Management, String> emailTC;
    @FXML
    private TableColumn<Management, String> contactTC;
    private ComboBox<String> stuidCB;
    private ComboBox<String> emailCB;
    private ComboBox<String> contactCB;
    private ComboBox<String> stunameCB; // Fixed the type of stunameCB
    @FXML
    private ComboBox<String> venueCB;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        stuidCB.getItems().addAll("12345", "13245", "12435");
        stunameCB.getItems().addAll("MIli Rahman", "Md Limon", "Fatema Hossain"); // Fixed the items for stunameCB
        emailCB.getItems().addAll("MIli@gmail.com", "Limon@gmail.com", "Fatema@gmail.com");
        contactCB.getItems().addAll("01912345678", "01812345678", "01712345678");
        mangList = new java.util.ArrayList<Management>();
        stuidTC.setCellValueFactory(new PropertyValueFactory<Management, String>("studentId"));
        stunameTC.setCellValueFactory(new PropertyValueFactory<Management, String>("stuName"));
        emailTC.setCellValueFactory(new PropertyValueFactory<Management, String>("email"));
        contactTC.setCellValueFactory(new PropertyValueFactory<Management, String>("contact"));
        // TODO
    }    

    private void addtotableClickedButton(ActionEvent event) {
       mangList.add(new Management(
                stuidCB.getValue(), stunameCB.getValue(),
                emailCB.getValue(),
                contactCB.getValue()));
    }

    
   
   


     private void showtotable3ClickedDashboard(ActionEvent event) {
        for(Management s: mangList) {
            studentsTV.getItems().add(s);
        }
    }

    @FXML
    private void returntodashboardClickedButton(ActionEvent event) throws IOException {
        Parent parent = FXMLLoader.load(getClass().getResource("/tahmina/VenueIncharge.fxml"));
        Scene scene = new Scene(parent);
        Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
        window.setScene(scene);
        window.show();
    }

    @FXML
    private void showtotableClickedButton(ActionEvent event) {
        for(Management s: mangList) {
            studentsTV.getItems().add(s);
    }

    
    
    
}}
