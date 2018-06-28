package org.modernclients.javafx3d.mesh;

import javafx.application.Application;
import javafx.geometry.Point3D;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.shape.MeshView;
import javafx.scene.shape.TriangleMesh;
import javafx.stage.Stage;

public class MeshDemo extends Application {
    
    float length=200f;

    public static void main(String[] args) {
        System.out.println("[MESHDEMO]");
        launch();
    }

    @Override
    public void start(Stage stage) throws Exception {
        TriangleMesh mesh = new TriangleMesh();
        mesh.getPoints().addAll(
                0f,0f,0f,
                length,0f,0f,
                0f,length,0f,
                0f,0f,length);
        mesh.getTexCoords().addAll(
                0f,0f,
                0f,1f,
                1f,0f,
                1f,1f);
        mesh.getFaces().addAll(
                0,0,2,1,1,2,
                0,0,3,1,2,2,
                0,0,1,1,3,2,
                1,0,2,1,3,2);
        MeshView meshView = new MeshView(mesh);
        meshView.setRotationAxis(new Point3D(1,1,1));
        meshView.setRotate(30);
        meshView.setTranslateX(100);
        meshView.setTranslateY(100);
        Group group = new Group(meshView);
        Scene scene = new Scene(group);
        stage.setScene(scene);
        stage.show();
    }

}
