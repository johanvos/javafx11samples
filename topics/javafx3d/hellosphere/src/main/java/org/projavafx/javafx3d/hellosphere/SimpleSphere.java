package org.projavafx.javafx3d.hellosphere;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.shape.Sphere;
import javafx.stage.Stage;

public class SimpleSphere extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        Sphere sphere = new Sphere(50);
        Group root = new Group(sphere);
        root.setTranslateX(320);
        root.setTranslateY(240);
        Scene scene = new Scene(root, 640, 480);
        stage.setTitle("JavaFX 3D Sphere");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
System.setProperty("javafx.verbose", "true");
        System.out.println("Hello, simpleshere");
        launch();
    }

}
