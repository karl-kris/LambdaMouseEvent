/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMain.java to edit this template
 */
package lambdamouseevent;

import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 *
 * @author usu2dam
 */
public class LambdaMouseEvent extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        Text movableText = new Text("Programming is fun!");
        
        Pane root = new Pane();
        root.getChildren().addAll(movableText);
        movableText.setOnMouseDragged(e -> {
            movableText.setX(e.getX());
            movableText.setY(e.getY());
        });
        
        Scene scene = new Scene(root, 300, 120);
        
        primaryStage.setTitle("MouseEventDemo");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
