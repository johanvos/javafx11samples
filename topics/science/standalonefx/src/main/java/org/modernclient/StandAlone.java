package org.modernclient;

import javafx.application.*;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;

public class StandAlone {

    public static void showHello() {
System.out.println("S1");
        Platform.startup(() -> {});
System.out.println("S2");
        Platform.setImplicitExit(false);
System.out.println("S3");
        Platform.runLater( () -> {
System.out.println("S4");
            Label label = new Label ("Hello, standalone JavaFX");
            Button button = new Button ("Click me");
            button.setOnAction(e -> {label.setText("Clicked");});
            VBox box = new VBox(10);
            box.getChildren().addAll(label, button);
            Scene s = new Scene(box, 400, 400);
            Stage stage = new Stage();
            stage.setTitle("StandAlone Hello");
            stage.setScene(s);
            stage.show();
System.out.println("S4B");
        });
System.out.println("S5");
    }

    public static void main(String[] args) {
System.out.println("T1");
System.setProperty("prism.verbose", "true");
        showHello();
System.out.println("T2");
    }

}

