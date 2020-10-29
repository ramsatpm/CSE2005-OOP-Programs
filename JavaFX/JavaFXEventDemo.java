// Demonstrate JavaFX events and buttons. 
 
import javafx.application.*; 
import javafx.scene.*; 
import javafx.stage.*; 
import javafx.scene.layout.*; 
import javafx.scene.control.*; 
import javafx.event.*; 
import javafx.geometry.*; 
 
public class JavaFXEventDemo extends Application { 
 
  Label response; 
 
  public static void main(String[] args) { 
 
    // Start the JavaFX application by calling launch(). 
    launch(args);   
  } 
 
  // Override the start() method. 
  public void start(Stage myStage) { 
 
    // Give the stage a title. 
    myStage.setTitle("Demonstrate JavaFX Buttons and Events."); 
 
    // Use a FlowPane for the root node. In this case, 
    // vertical and horizontal gaps of 10. 
    FlowPane rootNode = new FlowPane(10, 10); 
 
    // Center the controls in the scene. 
    rootNode.setAlignment(Pos.CENTER); 
 
    // Create a scene. 
    Scene myScene = new Scene(rootNode, 300, 100); 
 
    // Set the scene on the stage. 
    myStage.setScene(myScene); 
 
    // Create a label. 
    response = new Label("Push a Button"); 
 
    // Create two push buttons. 
    Button btnAlpha = new Button("Alpha"); 
    Button btnBeta = new Button("Beta"); 
 
    // Handle the action events for the Alpha button. 
    btnAlpha.setOnAction(new EventHandler<ActionEvent>() { 
      public void handle(ActionEvent ae) { 
        response.setText("Alpha was pressed."); 
      } 
    }); 
 
    // Handle the action events for the Beta button. 
    btnBeta.setOnAction(new EventHandler<ActionEvent>() { 
      public void handle(ActionEvent ae) { 
        response.setText("Beta was pressed."); 
      } 
    }); 
 
    // Add the label and buttons to the scene graph. 
    rootNode.getChildren().addAll(btnAlpha, btnBeta, response); 
 
    // Show the stage and its scene. 
    myStage.show(); 
  } 
}