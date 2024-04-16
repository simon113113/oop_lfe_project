/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package tahmina;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
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
public class AddressParticipantNeedsController implements Initializable {
    ArrayList<Student> studList;

    @FXML
    private TableView<Student> tableTV;
    @FXML
    private TableColumn<Student, String> stuidTC;
    @FXML
    private TableColumn<Student, String> stunameTC;
    @FXML
    private TableColumn<Student, String> problemTC;
    @FXML
    private ComboBox<String> stuidCB;
    @FXML
    private ComboBox<String> problemCB;
    @FXML
    private ComboBox<String> studentnameCB;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
       stuidCB.getItems().addAll("12345", "13245", "12435");
    problemCB.getItems().addAll("Technical", "Health Issues");
    studentnameCB.getItems().addAll("MIli Rahman", "Md Limon", "Fatema Hossain");
    studList = new ArrayList<Student>();
   stuidTC.setCellValueFactory(new PropertyValueFactory<Student,String>("studentId"));
     stunameTC.setCellValueFactory(new PropertyValueFactory<Student,String>("studentName"));
   problemTC.setCellValueFactory(new PropertyValueFactory<Student,String>("problem"));
   // timeTableColumn.setCellValueFactory(new PropertyValueFactory<Procedure,String>("time"));
    }   

    @FXML
    private void showtotable3ClickedDashboard(ActionEvent event) {
        for(Student s: studList)
            
            tableTV.getItems().add(s);
        
    }

    @FXML
    private void retuendashboardClickedButton(ActionEvent event) throws IOException {
        Parent parent = FXMLLoader.load(getClass().getResource("/tahmina/VenueIncharge.fxml"));
        Scene scene = new Scene(parent);
        Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
        window.setScene(scene);
        window.show();
    }

    @FXML
    private void addtotableClickedButton(ActionEvent event) {
        studList.add(new Student(
                stuidCB.getValue(),
                problemCB.getValue(),
                studentnameCB.getValue()));}
               

       
    
    
    }
