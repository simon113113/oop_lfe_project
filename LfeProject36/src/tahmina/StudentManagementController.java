




package tahmina;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.stage.Stage;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;







/**
 * FXML Controller class
 *
 * @author Admin
 */
public class StudentManagementController implements Initializable {

    @FXML
    private TableView<Student> stuTV;
    @FXML
    private TableColumn<Student, String> stuidTC;
    @FXML
    private TableColumn<Student, String> stunameTC;
  
    @FXML
    private TableColumn<Student, String> emailTC;
    @FXML
    private TableColumn<Student, String> contactTC;
    @FXML
    private ComboBox<String> stuidCB;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // Initialize student table view with some sample data
        ObservableList<Student> students = FXCollections.observableArrayList();
        students.add(new Student("S001", "John", "john@example.com", "01912345678"));
        students.add(new Student("S002", "Alice", "alice@example.com", "01912345679"));
        students.add(new Student("S003", "Bob", "bob@example.com", "01912345670"));
        students.add(new Student("S004", "Emily", "emily@example.com", "01912345677"));
        students.add(new Student("S005", "Michael", "michael@example.com", "01912345676"));
        students.add(new Student("S006", "Emma", "emma@example.com", "01912345675"));
        students.add(new Student("S007", "James", "james@example.com", "01912345674"));
        students.add(new Student("S008", "Olivia", "olivia@example.com", "01912345673"));
        students.add(new Student("S009", "William", "william@example.com", "01912345672"));
        students.add(new Student("S010", "Sophia", "sophia@example.com", "01912345671"));
        students.add(new Student("S011", "Ria", "ria@example.com", "01912345678"));
        students.add(new Student("S012", "mila", "mila@example.com", "01922345678"));
        students.add(new Student("S013", "Bobby", "bobby@example.com", "01932345678"));
        students.add(new Student("S014", " Brown", "brown@example.com", "01942345678"));
        students.add(new Student("S015", " Wilson", "wilson@example.com", "01952345678"));
        students.add(new Student("S016", " Garcia", "gracia@example.com", "01962345678"));
        students.add(new Student("S017", "Martinez", "martinez@example.com", "01972345678"));
        students.add(new Student("S018", "Olivia Hernandez", "olivia@example.com", "01982345678"));
        students.add(new Student("S019", "William Young", "william@example.com", "01992345678"));
        students.add(new Student("S020", "Sophia King", "sophia@example.com", "01902345678"));
    
        // Set student data to table view
        stuTV.setItems(students);
        
        // Set cell value factories for table columns
        stuidTC.setCellValueFactory(new PropertyValueFactory<>("studentId"));
        stunameTC.setCellValueFactory(new PropertyValueFactory<>("studentName"));
        emailTC.setCellValueFactory(new PropertyValueFactory<>("email"));
        contactTC.setCellValueFactory(new PropertyValueFactory<>("contact"));
    }

    @FXML
    private void submitClickedButton(ActionEvent event) {
        Student selectedStudent = stuTV.getSelectionModel().getSelectedItem();
    if (selectedStudent != null) {
        // Print information about the selected student
        System.out.println("Selected Student:");
        System.out.println("ID: " + selectedStudent.getStudentId());
        System.out.println("Name: " + selectedStudent.getStudentName());
        System.out.println("Email: " + selectedStudent.getEmail());
        System.out.println("Contact: " + selectedStudent.getContact());
    } else {
        // If no student is selected, display a message
        System.out.println("No student selected.");
    }
        // Add submit button action logic here
    }

    @FXML    
    private void returntodashboardClickedButton(ActionEvent event) throws IOException {
        Parent parent = FXMLLoader.load(getClass().getResource("/tahmina/VenueIncharge.fxml"));
        Scene scene = new Scene(parent);
        Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
        window.setScene(scene);
        window.show();
    }
}
