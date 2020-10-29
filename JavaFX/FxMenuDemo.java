// Demonstrate Menus  
  
import javafx.application.*;  
import javafx.scene.*;  
import javafx.stage.*;  
import javafx.scene.layout.*;  
import javafx.scene.control.*;
import javafx.scene.input.*; 
import javafx.event.*;  
import javafx.geometry.*;  
  
public class FxMenuDemo extends Application {  
  
  Label response;  
 
  public static void main(String[] args) {  
  
    // Start the JavaFX application by calling launch().  
    launch(args);    
  }  
  
  // Override the start() method.  
  public void start(Stage myStage) {  
  
    // Give the stage a title.  
    myStage.setTitle("Demonstrate Menus");  
  
    // Use a BorderPane for the root node.  
    BorderPane rootNode = new BorderPane();  
  
     // Create a scene.  
    Scene myScene = new Scene(rootNode, 300, 300);  
  
    // Set the scene on the stage.  
    myStage.setScene(myScene);  
  
    // Create a label that will report the selection.  
    response = new Label("Menu Demo");  
  
    // Create the menu bar. MenuBar(fileMenu, OptionMenu)
    MenuBar mb = new MenuBar(); 
 
    // Create the File menu. 
    Menu fileMenu = new Menu("_File"); 
    MenuItem open = new MenuItem("Open"); 
    MenuItem close = new MenuItem("Close"); 
    MenuItem save = new MenuItem("Save"); 
    MenuItem exit = new MenuItem("Exit"); 
    fileMenu.getItems().addAll(open, close, save, 
                               new SeparatorMenuItem(), exit); 
 
    // Add File menu to the menu bar. 
    mb.getMenus().add(fileMenu); 
 
    // Create the Options menu. 
    Menu optionsMenu = new Menu("Options"); 
 
    // Create the Colors submenu. 
    Menu colorsMenu = new Menu("Colors"); 
    MenuItem red = new MenuItem("Red"); 
    MenuItem green = new MenuItem("Green"); 
    MenuItem blue = new MenuItem("Blue"); 
    colorsMenu.getItems().addAll(red, green, blue); 
    optionsMenu.getItems().add(colorsMenu); 
 
    // Create the Priority submenu. 
    Menu priorityMenu = new Menu("Priority"); 
    MenuItem high = new MenuItem("High"); 
    MenuItem low = new MenuItem("Low"); 
    priorityMenu.getItems().addAll(high, low); 
    optionsMenu.getItems().add(priorityMenu); 
 
    // Add a separator. 
    optionsMenu.getItems().add(new SeparatorMenuItem()); 
 
    // Create the Reset menu item. 
    MenuItem reset = new MenuItem("Reset"); 
    optionsMenu.getItems().add(reset); 
 
    // Add Options menu to the menu bar. 
    mb.getMenus().add(optionsMenu); 
 
    // Create the Help menu. 
    Menu helpMenu = new Menu("Help"); 
    MenuItem about = new MenuItem("About"); 
    helpMenu.getItems().add(about); 
 
    // Add Help menu to the menu bar. 
    mb.getMenus().add(helpMenu); 
   
    // Create one event handler that will handle menu action events. 
    EventHandler<ActionEvent> MEHandler = 
                                new EventHandler<ActionEvent>() { 
      public void handle(ActionEvent ae) {  
        String name = ((MenuItem)ae.getTarget()).getText(); 
 
        // If Exit is chosen, the program is terminated. 
        if(name.equals("Exit")) Platform.exit(); 
 
        response.setText( name + " selected"); 
      }  
    };
  
    // Set action event handlers for the menu items. 
    open.setOnAction(MEHandler); 
    open.setAccelerator(KeyCombination.keyCombination("shortcut+O"));
    close.setOnAction(MEHandler); 
    save.setOnAction(MEHandler); 
    exit.setOnAction(MEHandler); 
    red.setOnAction(MEHandler); 
    green.setOnAction(MEHandler); 
    blue.setOnAction(MEHandler); 
    high.setOnAction(MEHandler); 
    low.setOnAction(MEHandler); 
    reset.setOnAction(MEHandler); 
    about.setOnAction(MEHandler); 
 
    // Add the menu bar to the top of the border pane and 
    // the response label to the center position. 
    rootNode.setTop(mb); 
    rootNode.setCenter(response); 

    MenuItem cut = new MenuItem("Cut");
    MenuItem copy = new MenuItem("Copy");
    MenuItem paste = new MenuItem("Paste");
    cut.setOnAction(MEHandler);
    copy.setOnAction(MEHandler);
    paste.setOnAction(MEHandler);

    ContextMenu editMenu = new ContextMenu(cut, copy, paste);

    // Add the context menu to the entire scene graph. 
    rootNode.setOnContextMenuRequested( 
                new EventHandler<ContextMenuEvent>() {   
      public void handle(ContextMenuEvent ae) {  
        // Popup menu at the location of the right click. 
        editMenu.show(rootNode, ae.getScreenX(), ae.getScreenY()); 
      }  
    });

  
    // Show the stage and its scene.  
    myStage.show();  
  }  
}