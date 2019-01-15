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
        Platform.startup(() -> {});
        Platform.setImplicitExit(false);
        Platform.runLater( () -> {
            Label label = new Label ("Hello, standalone JavaFX");
            Button button = new Button ("Click me");
            button.setOnAction(e -> {label.setText("Clicked");});
            button.setTranslateY(50);
            StackPane box = new StackPane();
            box.getChildren().addAll(label, button);
            Scene s = new Scene(box, 200, 200);
            Stage stage = new Stage();
            stage.setTitle("StandAlone Hello");
            stage.setScene(s);
            stage.show();
        });
    }

    public static void main(String[] args) {
        showHello();
    }

}

