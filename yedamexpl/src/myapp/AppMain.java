package myapp;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class AppMain extends Application {
	@Override
	public void start(Stage primaryStage) throws Exception {
		//컨트롤
		Label label = new Label();
		label.setText("Hello, JavaFx");
		label.setFont(new Font(50));
		
		Button button = new Button();
		button.setText("확인");
		
		VBox root = new VBox();
		root.setPrefWidth(350);
		root.setPrefHeight(150);
		root.setAlignment(Pos.CENTER);
		root.setSpacing(20);

		root.getChildren().add(label);
		root.getChildren().add(button);
		
		//컨테이너를 Scene의 매개값으로.
		Scene scene = new Scene(root);
		
		//Stage의 매개값으로 Scene 달아줌.
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	public static void main(String[] args) {
		Application.launch(args); //메인 메소드 매개
	}
}
