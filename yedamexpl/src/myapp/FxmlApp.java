package myapp;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class FxmlApp extends Application{

	@Override
	public void start(Stage primaryStage) throws Exception {
		Parent root = FXMLLoader.load(getClass().getResource("viewPackage/Board.fxml")); //Label, Button
		//컨테이너를 Scene의 매개값으로.
				Scene scene = new Scene(root);
				
				//Stage의 매개값으로 Scene 달아줌.
				primaryStage.setScene(scene);
				primaryStage.show();
		
	}
	public static void main(String[] args) {
		Application.launch(args);
	}
}
//여기 주소 들어가서  하는법 보기!
//https://m.blog.naver.com/PostView.nhn?blogId=linuxni&logNo=221670596629&proxyReferer=https:%2F%2Fwww.google.com%2F