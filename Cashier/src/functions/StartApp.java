package functions;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.geometry.Insets;
import javafx.scene.control.TextField;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.scene.control.Label;

public class StartApp extends Application{
	
	//for checking user and password validation
	String enterUser, enterPass;
	Stage stage;
	TextField username = new TextField("");
	TextField password = new TextField("");

	@Override
	public void start(Stage primaryStage) throws Exception{
		
		BorderPane bp = new BorderPane();
		bp.setPadding(new Insets(10,50,50,50));
		  //Adding HBox
		HBox hb = new HBox();
		hb.setPadding(new Insets(20,20,20,30));
		
		GridPane loginBox = new GridPane();
		Label lblusername = new Label("Your Email: ");
		Label lblpassword = new Label ("Password: ");

		Button loginButton = new Button("Login");
		Button createButton = new Button("Create an Account");
		
	//	loginButton.setMaxSize(48,200);
		lblusername.setFont(new Font(20));
		lblpassword.setFont(new Font(20));

		loginButton.setStyle("-fx-font-size: 20;");

		loginBox.add(lblusername, 0, 0);	
		loginBox.add(lblpassword, 0, 1);
		loginBox.add(username, 1, 0);
		loginBox.add(password, 1, 1);
		loginBox.add(loginButton, 3, 3);
	
		loginBox.setHgap(20);
		loginBox.setVgap(20);
		loginBox.setPadding(new Insets(50,50,50,50));

		 Text text = new Text("SpeedWay Employee Login:");
	     text.setFont(Font.font("Courier New", FontWeight.BOLD, 30));


	     	hb.getChildren().add(text);
	     	bp.setId("bp");
	       	loginBox.setId("root");
	        loginButton.setId("Login");
	        text.setId("text");
	        
	        bp.setTop(hb);
		    bp.setCenter(loginBox);
		    bp.setStyle("-fx-background-image: url('https://scontent-lga3-1.xx.fbcdn.net/v/t1.0-9/1377442_403105086484111_1222350959_n.jpg?_nc_cat=1&oh=745e64e49932391a5d9f89939099412b&oe=5C377948');-fx-background-size: 600, 400;-fx-background-repeat: no-repeat;");

		
	        stage = primaryStage;
		    Scene loginPage = new Scene(bp, 600, 400);
			//primaryStage.setTitle("Hobby Tracker");
			primaryStage.setScene(loginPage);
			primaryStage.show();
			
			System.out.println("Success");

	}
	

	public Stage getMainStage() {
		return stage;
	}
	
	public static void main(String[] args) {
		launch(args); //to start the app
	}

}
