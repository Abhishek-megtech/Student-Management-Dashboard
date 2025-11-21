import java.io.File;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        File fxmlFile = new File("src/dashboard.fxml");
        FXMLLoader loader = new FXMLLoader(fxmlFile.toURI().toURL());

        Parent root = loader.load();
        primaryStage.setTitle("Student Management Dashboard");
        primaryStage.setScene(new Scene(root, 600, 400));
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
