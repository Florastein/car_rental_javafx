package com.cadmil.finale;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage1) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        Parent root = fxmlLoader.load();
        Scene scene = new Scene(root);
        stage1.setTitle("meaCulpa_2024");

        Image icon = new Image(HelloApplication.class.getResource("pngegg.png").toExternalForm());
        stage1.getIcons().add(icon);

        stage1.setResizable(false);
        stage1.setScene(scene);
        stage1.show();
    }

    public static void main(String[] args) {
        launch();
    }
}