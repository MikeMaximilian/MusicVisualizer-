//  initialize the JavaFX application and load the GUI.
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class MusicVisualizerApp extends Application {

    @Override
    public void start(Stage primaryStage) {
        // Create the root layout (VBox)
        VBox root = new VBox();
        
        // Create an instance of MusicVisualizerController and pass the root layout
        MusicVisualizerController controller = new MusicVisualizerController(root);
        
        // Create the scene with the root layout
        Scene scene = new Scene(root, 400, 300); // Adjust width and height as needed
        
        // Set the scene on the stage and show it
        primaryStage.setScene(scene);
        primaryStage.setTitle("Music Visualizer");
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
