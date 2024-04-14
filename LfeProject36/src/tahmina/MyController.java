///*
// * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
// * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
// */
//package tahmina;
//
//import java.io.IOException;
//import javafx.event.ActionEvent;
//import javafx.fxml.FXML;
//import javafx.fxml.FXMLLoader;
//import javafx.scene.Parent;
//import javafx.scene.Scene;
//import javafx.stage.Stage;
//
///**
// *
// * @author Admin
// */
//public class Switcher {
//   
//    private final Stage stage;
//
//    public Switcher(Stage stage) {
//        this.stage = stage;
//    }
//
//    public void switchScene(String sceneName) throws IOException {
//        Parent root = FXMLLoader.load(getClass().getResource(sceneName));
//        Scene scene = new Scene(root);
//        stage.setScene(scene);
//        stage.show();
//    }
//} 
//
//import javafx.fxml.FXML;
//import javafx.scene.control.Button;
//
//public class MyController {
//
//    private SceneSwitcher sceneSwitcher;
//
//    public MyController(SceneSwitcher sceneSwitcher) {
//        this.sceneSwitcher = sceneSwitcher;
//    }
//
//    @FXML
//    private void sceneSwitch(ActionEvent event) {
//        Object homeBtn = null;
//        if (event.getSource() == homeBtn) {
//            sceneSwitcher.switchScene(homeBtn.getScene().getWindow(), "X.fxml");
//        } else if (event.getSource() == orderHistory_btn) {
//            sceneSwitcher.switchScene(orderHistory_btn.getScene().getWindow(), "Y.fxml");
//        } else if (event.getSource() == orderManagement_btn) {
//            sceneSwitcher.switchScene(orderManagement_btn.getScene().getWindow(), "Z.fxml");
//        } else if (event.getSource() == settings_btn) {
//            sceneSwitcher.switchScene(settings_btn.getScene().getWindow(), "W.fxml");
//        }
//        // Add more conditions for other buttons
//    }
//}