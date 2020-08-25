import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Orientation;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Pratical extends Application {
	private Button b1;
	private Button b2;
	private Text t1;
	private Text t2;

	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		b1 = new Button("Username Button");
		b2 = new Button("Password Button");
		t1 = new Text("Username");
		t2 = new Text("Password");
		StackPane p = new StackPane();
		VBox vpane1 = new VBox(20);
		vpane1.getChildren().addAll(t1,t2);
		vpane1.setPadding(new Insets(50,50,50,50));
		VBox vpane2 = new VBox(20);
		vpane2.getChildren().addAll(b1,b2);
		vpane2.setPadding(new Insets(50));
		FlowPane pane = new FlowPane(Orientation.HORIZONTAL ,10,10);
		pane.getChildren().addAll(vpane1,vpane2);
		Scene s = new Scene(pane,400,200);
		primaryStage.setTitle("17238020");
		primaryStage.setScene(s);
		primaryStage.show();
	}
	public static void main(String[] args) {
		launch(args);
	}
}


//
//import javafx.application.Application;
//import javafx.geometry.Orientation;
//import javafx.scene.Scene;
//import javafx.scene.control.Button;
//import javafx.scene.control.Label;
//import javafx.scene.control.TextField;
//import javafx.scene.layout.FlowPane;
//import javafx.stage.Stage;
//
//public class Pratical extends Application
//{
//	private Button button1;
//	private TextField txt;
//	private Label label;
//	
//	@Override
//	public void start(Stage primaryStage) throws Exception
//	{
//		
//		button1 = new Button();
//		button1.setText("first Button");
//		
//		Button b2 = new Button("second button");
//		txt = new TextField();
//		txt.setPromptText("Enter name");
//		label = new Label("Name ");
//		
//		
//		FlowPane pane = new FlowPane(Orientation.HORIZONTAL ,10,10);
//		pane.getChildren().add(button1);
//		pane.getChildren().add(b2);
//		pane.getChildren().add(label);
//		pane.getChildren().add(txt);
//		
//		Scene scene = new Scene(pane,500,200);
//		primaryStage.setScene(scene);
//
//		
//		//primaryStage.setFullScreen(true);
//		
//		//primaryStage.setResizable(false);
//		//primaryStage.setIconified(true);
//		
//		primaryStage.setMinWidth(500);
//		
//		primaryStage.setTitle("Our First Visual Program");
//		primaryStage.show();
//		
//		
//	}
//	
//	public static void main(String[] arg)
//	{
//		launch(arg);
//	}
//	
//
//}
