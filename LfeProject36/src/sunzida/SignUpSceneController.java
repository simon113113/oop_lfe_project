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
import java.util.Random;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.PasswordField;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.stage.Stage;
import tahmina.FacultyIncharge;
import tahmina.VenueIncharge;

/**
 * FXML Controller class
 *
 * @author User
 */
public class SignUpSceneController implements Initializable {

    @FXML
    private TextField userNameTF;
    @FXML
    private TextField nameTF;
    @FXML
    private PasswordField passTF;
    @FXML
    private TextField emailTF;
    @FXML
    private TextField contactTF;
    @FXML
    private RadioButton maleRadbtn;
    @FXML
    private DatePicker dob;
    @FXML
    private RadioButton femaleRadbtn;
    @FXML
    private ComboBox<String> usertypeComboBox;
    private ToggleGroup genderToggleGroup;
    

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        genderToggleGroup = new ToggleGroup();
        maleRadbtn.setToggleGroup(genderToggleGroup);
        femaleRadbtn.setToggleGroup(genderToggleGroup);
        
        usertypeComboBox.getItems().addAll("Maintanance Manager","Financial Officer"
                                                     ,"Course Manager", "Head Monitor"
                                                     ,"Students","Medical Officer","Venue Incharge"
                                            ,"Faculty Incharge","Student monitor","Room attendant");
    }    
    private int generateUniqueId() {
        Random random = new Random();
        return random.nextInt(10000); 
    }
    private boolean isValidEmail(String email) {
        return email.contains("@") && email.endsWith(".com");
    }

    private void saveUserDataToFile(AllUserData userData) {
        File allUserDataFile = new File("AllUserData.bin");

        try (FileOutputStream fos = new FileOutputStream(allUserDataFile, true);
            ObjectOutputStream oos = new ObjectOutputStream(fos)) {
            oos.writeObject(userData);
            Alert alert = new Alert(Alert.AlertType.INFORMATION, "User data saved successfully");
            alert.showAndWait();
        } catch (IOException e) {
            e.printStackTrace();
            Alert alert = new Alert(Alert.AlertType.ERROR, "Failed to save user data");
            alert.showAndWait();
        }
    }
    
    @FXML
    private void RegButtonOnClick(ActionEvent event) {
        String userType = usertypeComboBox.getValue();
        File employeeFile;
        String gender = "";
        RadioButton selectedRadioButton = (RadioButton) genderToggleGroup.getSelectedToggle();
        if (selectedRadioButton != null) {
            gender = selectedRadioButton.getText(); // This will give you the text of the selected radio button
        }
        
         if (userNameTF.getText().isEmpty() || passTF.getText().isEmpty()
                || nameTF.getText().isEmpty() || contactTF.getText().isEmpty()
                || emailTF.getText().isEmpty() || dob.getValue() == null || usertypeComboBox.getValue()==null){
            System.out.println("Textfield is empty");
            Alert alert = new Alert(Alert.AlertType.ERROR, "Please fill in all of the fields");
            alert.show();
            return;
        }

        // Validating username
        if (userNameTF.getText().length() <= 4) {
            Alert alert = new Alert(Alert.AlertType.ERROR, "Username needs to be at least 4 characters long");
            alert.showAndWait();
            return;
        }

        //valid password
        String password = passTF.getText();
        if (password.length() < 8 || !password.matches("^(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])(?=\\S+$).{8,}$")) {
            Alert alert = new Alert(Alert.AlertType.ERROR, "Please enter a password that is at least 8 characters long and contains at least one uppercase letter, one lowercase letter, and one special character.");
            alert.showAndWait();
            return;
        }
        //Valid Email
        String email = emailTF.getText();
        if (!isValidEmail(email)) {
            Alert alert = new Alert(Alert.AlertType.ERROR, "Please enter a valid email address");
            alert.showAndWait();
            return;
        }

        //Valid Phone number
        String phoneS = contactTF.getText();
        if (phoneS.length() != 11 && !phoneS.substring(0, 2).equals("01")) {
            Alert alert = new Alert(Alert.AlertType.ERROR, "Please enter a valid phone number");
            alert.showAndWait();
            return;
        }

        // Checking if it's a number
        try {
            Long.parseLong(contactTF.getText());
        } catch (NumberFormatException e) {
            System.out.println("Phone num parsing to long failed");
            System.out.println(e);
            Alert alert = new Alert(Alert.AlertType.ERROR, "Please enter a valid phone number");
            alert.show();
            return;
        }

        // Validating DOB
        if (dob.getValue().isAfter(LocalDate.now().minusYears(18))) {
            Alert a = new Alert(Alert.AlertType.ERROR, "You must be at least 18 years old to register");
            a.show();
            return;
        }
        
        //---------------------Main SignUp
        if (userType.equals("Maintanance Manager")) {
            employeeFile = new File("MaintananceManagerList.bin");
        } else if (userType.equals("Financial Officer")) {
            employeeFile = new File("FinancialOfficerList.bin");
        } else if (userType.equals("Venue Incharge")) {
            employeeFile = new File("VenueIncharge.bin");
        } else if (userType.equals("Faculty Incharge")) {
            employeeFile = new File("FacultyIncharge.bin");
        } else if (userType.equals("Course Manager")) {
            employeeFile = new File("CourseManager.bin");
        } else if (userType.equals("Head Monitor")) {
            employeeFile = new File("HeadMonitor.bin");
        } else if (userType.equals("Students")) {
            employeeFile = new File("Students.bin");
        } else if (userType.equals("Medical Officer")) {
            employeeFile = new File("MedicalOfficer.bin");
        } else if (userType.equals("Student monitor")) {
            employeeFile = new File("Studentmonitor.bin");
        } else if (userType.equals("Room attendant")) {
            employeeFile = new File("Roomattendant.bin");
        
        } else {
            // Handle unrecognized user types or set a default file
            employeeFile = new File("DefaultList.bin");
        }
        //Checking for duplicate
        try(FileInputStream fis = new FileInputStream(employeeFile);
            ObjectInputStream oos = new ObjectInputStream(fis);){
            while(true){
                User employee = (User)oos.readObject();
                if (employee.getUsername().equals(userNameTF.getText())) {
                    Alert a = new Alert(Alert.AlertType.ERROR,"Username already exists");
                    a.show();
                    return;
                   }
                }
        }catch(EOFException e){
            System.out.println("Duplicate checking complete");
        }
        catch(Exception e){
            System.out.println(e.toString()+" from "+ employeeFile.getName());
        }
        //duplicate check end
        
        if (usertypeComboBox.getValue().equals("Maintanance Manager")){  
           try{
                FileOutputStream fos;
                ObjectOutputStream oos;
                if (employeeFile.exists()){
                        fos = new FileOutputStream(employeeFile,true);
                        oos = new ObjectOutputStream(fos);
                }
                else {
                        fos = new FileOutputStream(employeeFile);
                        oos = new ObjectOutputStream(fos);
                }
                    MaintananceManager newAccountant = new MaintananceManager(userNameTF.getText(),emailTF.getText(),
                nameTF.getText(), passTF.getText(),contactTF.getText(),gender,usertypeComboBox.getValue(),generateUniqueId(),
                    dob.getValue());
//                    newAccountant.setDob(dobDatePicker.getValue());
                    oos.writeObject(newAccountant);
                    
                }
                catch(Exception e){
                    e.printStackTrace(System.out);} 
                
            }
        //For financial officer
        else if(usertypeComboBox.getValue().equals("Financial Officer")) {
                try{
                FileOutputStream fos;
                ObjectOutputStream oos;
                if (employeeFile.exists()){
                        fos = new FileOutputStream(employeeFile,true);
                        oos = new ObjectOutputStream(fos);
                }
                else {
                        fos = new FileOutputStream(employeeFile);
                        oos = new ObjectOutputStream(fos);
                }
                    FinancialOfficer newAccountant = new FinancialOfficer(userNameTF.getText(),emailTF.getText(),
                nameTF.getText(), passTF.getText(),contactTF.getText(),gender,usertypeComboBox.getValue(),generateUniqueId(),
                    dob.getValue());
//                    newAccountant.setDob(dobDatePicker.getValue());
                    oos.writeObject(newAccountant);
                    
                }
                catch(Exception e){
                    e.printStackTrace(System.out);}
                       
        }
        
        //For venue Incharge
        else if (usertypeComboBox.getValue().equals("Venue Incharge")) {
            try {
                FileOutputStream fos;
                ObjectOutputStream oos;
                if (employeeFile.exists()) {
                    fos = new FileOutputStream(employeeFile, true);
                    oos = new ObjectOutputStream(fos);
                } else {
                    fos = new FileOutputStream(employeeFile);
                    oos = new ObjectOutputStream(fos);
                }
                VenueIncharge newAccountant = new VenueIncharge(userNameTF.getText(), emailTF.getText(),
                        nameTF.getText(), passTF.getText(), contactTF.getText(), gender, usertypeComboBox.getValue(), generateUniqueId(),
                        dob.getValue());
//                    newAccountant.setDob(dobDatePicker.getValue());
                oos.writeObject(newAccountant);

            } catch (Exception e) {
                e.printStackTrace(System.out);
            }

        }
        //For venue Incharge
        else if (usertypeComboBox.getValue().equals("Faculty Incharge")) {
            try {
                FileOutputStream fos;
                ObjectOutputStream oos;
                if (employeeFile.exists()) {
                    fos = new FileOutputStream(employeeFile, true);
                    oos = new ObjectOutputStream(fos);
                } else {
                    fos = new FileOutputStream(employeeFile);
                    oos = new ObjectOutputStream(fos);
                }
                FacultyIncharge newAccountant = new FacultyIncharge(userNameTF.getText(), emailTF.getText(),
                        nameTF.getText(), passTF.getText(), contactTF.getText(), gender, usertypeComboBox.getValue(), generateUniqueId(),
                        dob.getValue());
//                    newAccountant.setDob(dobDatePicker.getValue());
                oos.writeObject(newAccountant);

            } catch (Exception e) {
                e.printStackTrace(System.out);
            }

        }
        Alert successAlert = new Alert(Alert.AlertType.INFORMATION, "You have been registered successfully");
        successAlert.showAndWait();

        //load login scene
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
        //Creates an instance of AllUserData
        AllUserData userData = new AllUserData(
                userNameTF.getText(),
                emailTF.getText(),
                nameTF.getText(),
                passTF.getText(),
                contactTF.getText(),
                gender,
                userType,
                generateUniqueId(),
                dob.getValue()
        );

        // Save user data to file
        saveUserDataToFile(userData);

    }

    @FXML
    private void BackButton(ActionEvent event) {
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
