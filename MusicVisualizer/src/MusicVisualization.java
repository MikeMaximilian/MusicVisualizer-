// update the visualization based on the audio being played
import javafx.scene.layout.VBox;
import javafx.scene.shape.Rectangle;

public class MusicVisualization {
    
    private VBox visualizationArea;
    
    public MusicVisualization(VBox visualizationArea) {
        this.visualizationArea = visualizationArea;
    }
    
    public void updateVisualization(double[] amplitudes) {
        visualizationArea.getChildren().clear();
        for (double amplitude : amplitudes) {
            Rectangle bar = new Rectangle(10, amplitude * 100); // Adjust size and height accordingly
            visualizationArea.getChildren().add(bar);
        }
    }
}
