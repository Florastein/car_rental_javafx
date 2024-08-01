package com.cadmil.finale;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.effect.DropShadow;
import javafx.scene.effect.Reflection;
import javafx.scene.image.Image;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class HelloController {
    @FXML
    private Label notify;

    @FXML
    public TextField username;

    @FXML
    public TextField passwd;

    @FXML
    private DBConnection  login= DBConnection.getInstance();


    @FXML
    private Button loginButton;

//    public  String getUsername(){
//        return username.getText();
//    }
//
//    public static String getPasswd(){
//        return passwd.getText();
//    }

    @FXML
    public void initialize() {
        loginButton.setEffect(new DropShadow(
                10,10,10, Color.ANTIQUEWHITE
        ));

        /*Reflection reflection = new Reflection();
        reflection.setTopOffset(0.3);
        reflection.setFraction(0.7); // size of the reflection
        reflection.setTopOpacity(0.05);
        reflection.setBottomOpacity(0.5);
        username.setEffect(reflection);
        passwd.setEffect(reflection);*/
    }

    @FXML
    protected void onHelloButtonClick() {

/*        if(username.getText().isEmpty() || passwd.getText().isEmpty()) {
            notify.setTextFill(Color.RED);
            notify.setText("Username and Password are Required");
            }
 */

        try{
            String query = "SELECT * FROM staff WHERE Username = ? AND Password = ?";
            PreparedStatement ps = login.getConnection().prepareStatement(query);
            ps.setString(1, username.getText());
            ps.setString(2, passwd.getText());
            ResultSet rs = ps.executeQuery();

            if(rs.next()){
                notify.setTextFill(Color.GREEN);
                notify.setText("Login Successful");

                FXMLLoader loader =new FXMLLoader(getClass().getResource("admin.fxml"));
                Parent root = loader.load();
                Stage stage = (Stage) notify.getScene().getWindow();
                Scene scene = new Scene(root);

                Image icon = new Image(HelloApplication.class.getResource("pngegg.png").toExternalForm());
                stage.getIcons().add(icon);

                stage.setX(30);
                stage.setY(30);

                stage.setScene(scene);

            }
            else{
                notify.setTextFill(Color.RED);
                notify.setText("Invalid Username or Password");
            }
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

        if(username.getText().isEmpty() || passwd.getText().isEmpty()) {
            notify.setTextFill(Color.RED);
            notify.setText("Username and Password are Required");
        }

    }
}