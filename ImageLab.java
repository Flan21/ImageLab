import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.image.PixelReader;
import javafx.scene.image.PixelWriter;
import javafx.scene.paint.Color;
import javafx.scene.image.WritableImage;
 
public class ImageLab extends Application {
    
    @Override
    public void start(Stage primaryStage) {
     
        // Create Image and ImageView objects
        //TODO: Enter the name of the image you want to modify below, including the file extension (ex. .png .jpg)
       //Image image = new Image("youImageName"); 
       //ImageView imageView = new ImageView();
      //imageView.setImage(image);
       
        // Obtain PixelReader for loaded image
       // PixelReader pixelReader = image.getPixelReader();
       // System.out.println("Image Width: "+image.getWidth());
       // System.out.println("Image Height: "+image.getHeight());
      //  System.out.println("Pixel Format: "+pixelReader.getPixelFormat());
        
        // Create WritableImage
         WritableImage wImage = new WritableImage (  300, 400);
         PixelWriter pixelWriter = wImage.getPixelWriter();
       
        // TODO: add nested for loops below to traverse the pixels in the image.  
        // Use the pixelWriter object to set the color of each pixel.  
        // Optional: Use the pixelReader object to read the color of pixels from 
        // the image you loaded.
        
        
        // Display image on screen
        imageView.setImage(wImage);
        StackPane root = new StackPane();
        root.getChildren().add(imageView);
        Scene scene = new Scene(root, (int)wImage.getWidth(),
                 (int)wImage.getHeight());
        primaryStage.setTitle("Image Lab");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
 
    public static void main(String[] args) {
        launch(args);
    }
}
