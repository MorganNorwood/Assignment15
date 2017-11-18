/*
Morgan Norwood
stop sign

 */


package sample;

import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.layout.StackPane;
import javafx.scene.shape.Polygon;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        StackPane stackPane = new StackPane();

        // shape for the sign
        Polygon polygon = new Polygon();
        stackPane.getChildren().add(polygon);
        polygon.setFill(Color.RED);
        polygon.setRotate(20);
        ObservableList<Double> list = polygon.getPoints();

        final double WIDTH = 400, HEIGHT = 400;
        double centerX = WIDTH / 2, centerY = HEIGHT / 2;
        double radius = Math.min(WIDTH, HEIGHT) * 0.4;

        // Add points
        for (int i = 0; i < 8; i++) {
            list.add(centerX + radius * Math.cos(2 * i * Math.PI / 8));
            list.add(centerY - radius * Math.sin(2 * i * Math.PI / 8));
        }

        // Create the "STOP" text
        Text text = new Text("STOP");
        text.setFont(Font.font("Times new Roman", FontWeight.BOLD, 40));
        text.setFill(Color.WHITE);
        stackPane.getChildren().add(text);

        // new scene in the window
        Scene scene = new Scene(stackPane, WIDTH, HEIGHT);
        primaryStage.setTitle("STOP"); // title
        primaryStage.setScene(scene); // Place the scene in the stage
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
