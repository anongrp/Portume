package grp.anon.recruiter;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class MainRecuiter extends Application{
    @Override
    public void start(Stage primaryStage) throws Exception {
        BorderPane root = (BorderPane) FXMLLoader.load(getClass().getResource("Recruiter_Home.fxml"));
        Scene scene = new Scene(root);
        scene.getStylesheets().add(getClass().getResource("recruiter.css").toExternalForm());
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    public static void main(String[] args) {
        launch(args);
    }
}
