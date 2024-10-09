package org.example.myjavaapp;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;
import javafx.event.ActionEvent;
import javafx.stage.StageStyle;

import java.io.File;
import java.net.URL;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ResourceBundle;

public class LoginController implements Initializable {
    public Button loginButton;
    @FXML
    private Button cancelButton;
    @FXML
    private Label loginMassageLabel;
    @FXML
    private ImageView brandingImageView;
    @FXML
    private ImageView lockImageView;
    @FXML
    private TextField usernameTextField;
    @FXML
    private PasswordField enterPasswordTextField;
    @FXML
    public Button signupButton;


    @Override
    public void initialize(URL url, ResourceBundle rb) {
        URL brandingUrl = getClass().getResource("/images/uet2.jpg");

        Image brandingImage = new Image(brandingUrl.toString());
        brandingImageView.setImage(brandingImage);


        URL lockUrl = getClass().getResource("/images/uet.jpg");

        Image lockImage = new Image(lockUrl.toString());
        lockImageView.setImage(lockImage);



    }

    public void validateLogin() {
        DatabaseConnection connectNew = new DatabaseConnection();
        Connection connectDb = connectNew.getConnection();

        String verifyLogin = "SELECT count(1) FROM user_account WHERE username = '" + usernameTextField.getText() + "' AND password = '" + enterPasswordTextField.getText() + "'";

        try {

            Statement statement = connectDb.createStatement();
            ResultSet queryResult = statement.executeQuery(verifyLogin);

            while (queryResult.next()) {
                if (queryResult.getInt(1) == 1) {
                    //loginMassageLabel.setText("Congratulation!");
                    //createAccountForm();
                    gotoMenu();
                } else {
                    loginMassageLabel.setText("Invalid login. Please try again.");
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
            e.getCause();
        }
    }

    public void signupButtonOnAction(ActionEvent event) {
        createAccountForm();
    }

    public void loginButtonOnAction(ActionEvent event) {
        if (!usernameTextField.getText().isBlank() && !enterPasswordTextField.getText().isBlank()) {
            validateLogin();
        } else {
            loginMassageLabel.setText("Please enter username and password");
        }
    }

    public void cancelButtonAction(ActionEvent event) {
        Stage stage = (Stage) cancelButton.getScene().getWindow();
        stage.close();
    }

    public void gotoMenu() {
        try {

            Parent root = FXMLLoader.load(getClass().getResource("Menu.fxml"));

            Stage registerState = new Stage();
            registerState.initStyle(StageStyle.UNDECORATED);
            Scene scene = new Scene(root, 443, 667);
            registerState.setScene(scene);
            registerState.show();

        } catch(Exception e) {
            e.printStackTrace();
            e.getCause();
        }
    }

    public void createAccountForm() {
        try {

            Parent root = FXMLLoader.load(getClass().getResource("register.fxml"));

            Stage registerState = new Stage();
            registerState.initStyle(StageStyle.UNDECORATED);
            Scene scene = new Scene(root, 520, 593);
            registerState.setScene(scene);
            registerState.show();

        } catch(Exception e) {
            e.printStackTrace();
            e.getCause();
        }
    }

}