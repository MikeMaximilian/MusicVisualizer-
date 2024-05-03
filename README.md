# Project
## Idea
- *Music Visualiser*:
  Create a visualiser that generates dynamic visual representations of music tracks. Users can import their favourite songs and watch as the program generates mesmerising visuals synchronised with the music, such as particle effects, geometric patterns, and animated graphics.
- Should be possible to connect to Spotify account and play Mp3 files from there
## Steps
### Create the GUI:
       Design your user interface using JavaFX. For this project, you'll need components like buttons for uploading and playing music, and a visualizer area to display the   music visualization.
        You can design the GUI either programmatically or by using FXML, a XML-based language for designing JavaFX UIs.

### Implement Music Player:
        Use Java libraries like JavaFX's MediaPlayer or Java Sound API to handle audio playback.
        Implement functionalities like uploading MP3 files and playing them using the MediaPlayer.

### Implement Music Visualization:
        Create a visualization area where you'll display the music visualization.
        You can use JavaFX's built-in shapes (like rectangles) to represent the bars.
        Analyze the audio waveform or frequency spectrum of the music being played and update the visualization accordingly.
        For simple visualization, you can map the amplitude or frequency of the audio to the height or color of the bars.

### Integrate Music Player and Visualization:
        Connect the music player with the visualization so that the visualization updates in real-time as the music plays.
        You may need to use multithreading to ensure smooth playback while updating the visualization.

### Testing and Debugging:
        Test your application with different MP3 files to ensure that it plays and visualizes them correctly.
        Debug any issues that arise during testing.
### Final Touches:
        Add any additional features or improvements to your music visualizer.
        Optimize the code for performance if needed.
        Add comments and documentation to make your code more understandable.
