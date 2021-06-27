package com.spectu.game;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

import javax.swing.*;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main extends Application {

    private Set<KeyCode> active = new HashSet<>();

    public static void main(String[] args)  {
        launch(args);
        Game game = new Game();
        game.start();

    }

    @Override
    public void start(Stage primaryStage) {
        final Image image = getImage("descarga.gif");
        final ImageView imageView = new ImageView(image);
        primaryStage.setTitle("Test");
        Button btn = new Button();
        btn.setText("Reset");
        btn.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
                imageView.setLayoutX(0.0);
                imageView.setLayoutY(0.0);
            }
        });

        AnchorPane root = new AnchorPane();
        imageView.setX(50);
        imageView.setY(50);
        imageView.setFitHeight(250);
        imageView.setFitWidth(300);
        root.getChildren().add(imageView);
        root.getChildren().add(btn);
        Scene scene = new Scene(root, 1366, 768);

        Thread hilo = new Thread(() -> {
            while(true) {
                Set<KeyCode> copy;
                synchronized (active) {
                    copy = new HashSet<>(active);
                    System.out.println(copy);
                }
                for(KeyCode code : copy) {
                    if(code == KeyCode.UP) {
                        //System.out.println("UP");
                        Platform.runLater(() -> imageView.setLayoutY(imageView.getLayoutY() - 3));
                    } else if(code == KeyCode.DOWN) {
                        Platform.runLater(() -> imageView.setLayoutY(imageView.getLayoutY() + 3));
                    } else if(code == KeyCode.LEFT) {
                        Platform.runLater(() -> imageView.setLayoutX(imageView.getLayoutX() - 3));
                    } else if(code == KeyCode.RIGHT) {
                        Platform.runLater(() ->imageView.setLayoutX(imageView.getLayoutX() + 3));
                    }
                }
                try {
                    Thread.sleep(10L);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        scene.setOnKeyPressed(event -> {
            synchronized (active) {
                active.add(event.getCode());
            }
        });

        scene.setOnKeyReleased(event -> {
            synchronized (active) {
                active.remove(event.getCode());
            }
        });

        hilo.start();
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    public InputStream getResource(String resourceName) {
        InputStream stream = getClass().getResourceAsStream(resourceName);
        System.out.println("Obteniendo: " + resourceName + "; Resultado: " + stream);
        return stream;
    }
    public static Image getImage(String name) {
        try {
            return new Image(new FileInputStream("./sprites/" + name));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }

}