 
import javafx.application.Platform;
import javafx.embed.swing.JFXPanel;
import javafx.stage.Stage;
import javafx.scene.*;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;
import javafx.event.ActionEvent;
import javafx.stage.WindowEvent;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.control.ListView;
import java.util.ArrayList;
import javafx.event.EventHandler;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import java.util.Optional;
import javafx.scene.control.Label;

public class GUInterface 
{
    private static TextField txtFieldRanking;
    private static TextField txtFieldName;
    private static TextField txtFieldCountry;
    private static ListView<University> uniListView;
    private static ArrayList<University> uniArrList = new ArrayList<University>();
    
    public static void main(String args[])
    {
        launchFX();
    }
    
    public static void launchFX()
    {
      // Initialises JavaFX
      new JFXPanel();
      // Runs initialisation on the JavaFX thread
      Platform.runLater(() -> initialiseGUI());
    }
 
    public static void initialiseGUI()
    {
      Stage stage = new Stage();
      stage.setTitle("Top Universities");
      stage.setResizable(false);
      Pane rootPane = new Pane();
      stage.setScene(new Scene(rootPane));   
      stage.setWidth(1024);
      stage.setHeight(768);            
      stage.show();
      //stage.setOnCloseRequest(new EventHandler<WindowEvent>(){
      //      public void handle(WindowEvent we){
      //          System.out.println("Close button was clicked");
      //          System.exit(0);
     //       }
     // });
     
     stage.setOnCloseRequest((WindowEvent we) -> displayCloseDialog(we));
      
      uniListView = new ListView<University>();
      uniListView.setLayoutX(700);
      uniListView.setLayoutY(50);
      rootPane.getChildren().add(uniListView);
      
      Label label = new Label("Enter details of top University");
      label.setLayoutX(700);
      label.setLayoutY(50);
      rootPane.getChildren().add(label);
      
      txtFieldRanking = new TextField();
      txtFieldRanking.setLayoutX(50);
      txtFieldRanking.setLayoutY(100);
      txtFieldRanking.setPrefWidth(400);
      txtFieldRanking.setPromptText("Enter Ranking");
      rootPane.getChildren().add(txtFieldRanking);
       
      txtFieldName = new TextField();
      txtFieldName.setLayoutX(50);
      txtFieldName.setLayoutY(150);
      txtFieldName.setPrefWidth(400);
      txtFieldName.setPromptText("Enter Name");
      rootPane.getChildren().add(txtFieldName);
      
      txtFieldCountry = new TextField();
      txtFieldCountry.setLayoutX(50);
      txtFieldCountry.setLayoutY(200);
      txtFieldCountry.setPrefWidth(400);
      txtFieldCountry.setPromptText("Enter Country");
      rootPane.getChildren().add(txtFieldCountry);
      
      Button btn = new Button();
      btn.setText("Add");
      btn.setLayoutX(500);
      btn.setLayoutY(100);
      btn.setOnAction((ActionEvent ae) -> addNewItem());
      rootPane.getChildren().add(btn);      
      
      Button btn1 = new Button();
      btn1.setText("Add");
      btn1.setLayoutX(500);
      btn1.setLayoutY(150);
      btn1.setOnAction((ActionEvent ae) -> addNewItem());
      rootPane.getChildren().add(btn1);    
      
      Button btn2 = new Button();
      btn2.setText("Add");
      btn2.setLayoutX(500);
      btn2.setLayoutY(200);
      btn2.setOnAction((ActionEvent ae) -> addNewItem());
      rootPane.getChildren().add(btn2);
      
      Label label1 = new Label("Hi");
      label1.setLayoutX(100);
      label1.setLayoutY(700);
      rootPane.getChildren().add(label1);
      
      // load the image
      Image image = new Image("lion.png");
      ImageView iv1 = new ImageView();
      iv1.setImage(image);
      iv1.setLayoutX(700);
      iv1.setLayoutY(500);
      iv1.setFitWidth(200);
      iv1.setPreserveRatio(true);
      rootPane.getChildren().add(iv1);

    }
    
    public static void displayCloseDialog(WindowEvent we) {
       Alert alert = new Alert(AlertType.CONFIRMATION);
        alert.setTitle("Confirmation");
        alert.setHeaderText("Look, a Confirmation Dialog");
        alert.setContentText("Are you sure you want to quit?");
        
        Optional<ButtonType> result = alert.showAndWait();
        if (result.get() == ButtonType.OK)
        {
            terminate();
        }
        else {
            we.consume();
        } 
    
    }
    
      private static void addNewItem() {
        int ranking = Integer.parseInt(txtFieldRanking.getText());
        String name = txtFieldName.getText();
        String country = txtFieldCountry.getText();
        uniArrList.add(new University(ranking,name,country));
        
        uniListView.getItems().clear();
        
        for (University uni : uniArrList) {
            uniListView.getItems().add(uni);
        }
    }
    
    private static void terminate()
    {
     System.out.println("bye bye!");
     System.exit(0);
    }
}
