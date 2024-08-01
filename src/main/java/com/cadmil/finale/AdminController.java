package com.cadmil.finale;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;



public class AdminController {

    @FXML
    private Text username;

    @FXML
    private Button dashboard;

    @FXML
    private Button manage_employees;

    @FXML
    private Button new_rental;

    @FXML
    private Button vehicle_return;

    @FXML
    private Button manage_vehicle;

    @FXML
    private Button log_out;

    @FXML
    private Button exit;

    @FXML
    private Button new_vehicle;

    @FXML
    private Button remove_vehicle;

    @FXML
    private Button all_vehicles;

    @FXML
    private Button all_employees;

    @FXML
    private Button new_employee;

    @FXML
    private Button remove_employee;

    public void initialize() {
        active_button(dashboard);


    }

    public void active_button(Button button){
        BorderStroke borderStroke = new BorderStroke(
                Color.WHITESMOKE,
                BorderStrokeStyle.SOLID,
                new CornerRadii(10),
                new BorderWidths(3));
        Border border = new Border(borderStroke);
        button.setBorder(border);
    }

   /* public String setUsername() throws SQLException {
        String username = HelloController.getUsername();
        String passwd = HelloController.getPasswd();
        String uname = null;

        try{
            String query = "SELECT * FROM staff WHERE Username = ? AND Password = ?";
            PreparedStatement ps = login.getConnection().prepareStatement(query);
            ps.setString(1, username);
            ps.setString(2, passwd);
            ResultSet rs = ps.executeQuery();

            if(rs.next()){
                uname = rs.getString("Name");
            }
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        return uname;
    }*/

    public void gotoDashboard(){
        /*FXMLLoader loader =new FXMLLoader(getClass().getResource("admin.fxml"));
        Parent root = loader.load();
        Stage stage = (Stage) dashboard.getScene().getWindow();
        Scene scene = new Scene(root);

        Image icon = new Image(HelloApplication.class.getResource("pngegg.png").toExternalForm());
        stage.getIcons().add(icon);

        stage.setX(30);
        stage.setY(30);

        stage.setScene(scene);*/
    }
    public void manage_employees(){
        /*FXMLLoader loader =new FXMLLoader(getClass().getResource("admin.fxml"));
        Parent root = loader.load();
        Stage stage = (Stage) dashboard.getScene().getWindow();
        Scene scene = new Scene(root);

        Image icon = new Image(HelloApplication.class.getResource("pngegg.png").toExternalForm());
        stage.getIcons().add(icon);

        stage.setX(30);
        stage.setY(30);

        stage.setScene(scene);*/
    }
    public void new_rental(){
        /*FXMLLoader loader =new FXMLLoader(getClass().getResource("admin.fxml"));
        Parent root = loader.load();
        Stage stage = (Stage) dashboard.getScene().getWindow();
        Scene scene = new Scene(root);

        Image icon = new Image(HelloApplication.class.getResource("pngegg.png").toExternalForm());
        stage.getIcons().add(icon);

        stage.setX(30);
        stage.setY(30);

        stage.setScene(scene);*/
    }
    public void vehicle_return(){
        /*FXMLLoader loader =new FXMLLoader(getClass().getResource("admin.fxml"));
        Parent root = loader.load();
        Stage stage = (Stage) dashboard.getScene().getWindow();
        Scene scene = new Scene(root);

        Image icon = new Image(HelloApplication.class.getResource("pngegg.png").toExternalForm());
        stage.getIcons().add(icon);

        stage.setX(30);
        stage.setY(30);

        stage.setScene(scene);*/
    }
    public void manage_vehicle(){
        /*FXMLLoader loader =new FXMLLoader(getClass().getResource("admin.fxml"));
        Parent root = loader.load();
        Stage stage = (Stage) dashboard.getScene().getWindow();
        Scene scene = new Scene(root);

        Image icon = new Image(HelloApplication.class.getResource("pngegg.png").toExternalForm());
        stage.getIcons().add(icon);

        stage.setX(30);
        stage.setY(30);

        stage.setScene(scene);*/
    }
    public void log_out(){
        /*FXMLLoader loader =new FXMLLoader(getClass().getResource("admin.fxml"));
        Parent root = loader.load();
        Stage stage = (Stage) dashboard.getScene().getWindow();
        Scene scene = new Scene(root);

        Image icon = new Image(HelloApplication.class.getResource("pngegg.png").toExternalForm());
        stage.getIcons().add(icon);

        stage.setX(30);
        stage.setY(30);

        stage.setScene(scene);*/
    }
    public void exit(){
        /*FXMLLoader loader =new FXMLLoader(getClass().getResource("admin.fxml"));
        Parent root = loader.load();
        Stage stage = (Stage) dashboard.getScene().getWindow();
        Scene scene = new Scene(root);

        Image icon = new Image(HelloApplication.class.getResource("pngegg.png").toExternalForm());
        stage.getIcons().add(icon);

        stage.setX(30);
        stage.setY(30);

        stage.setScene(scene);*/
    }
    public void new_vehicle(){}
    public void remove_vehicle(){}
    public void all_vehicles(){}
    public void all_employees(){}
    public void new_employee(){}
    public void remove_employee(){}



}
