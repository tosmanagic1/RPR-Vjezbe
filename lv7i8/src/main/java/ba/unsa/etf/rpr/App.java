package ba.unsa.etf.rpr;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import static javafx.scene.control.PopupControl.USE_COMPUTED_SIZE;

/**
 * Hello world!
 *
 */
public class App extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {

        Parent root = FXMLLoader.load(getClass().getResource("/fxml/login.fxml"));
        primaryStage.setTitle("Korisnici");
        primaryStage.setScene(new Scene(root, 550, 230));
        primaryStage.setMinWidth(500);
        primaryStage.setMinHeight(230);
        //primaryStage.setResizable(false);
        primaryStage.show();

    }
    public static void main(String[] args) {

        launch(args);
    }
}
