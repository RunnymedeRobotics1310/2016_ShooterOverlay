package com.chasehaddleton.ShooterOverlay;

import edu.wpi.first.wpilibj.networktables.NetworkTable;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class Main extends Application {
	private static final String TABLE_NAME = "TargetInfo";
	private static final String TEAM_NUMBER = "1310";
	public static Scene scene;
	NetworkTable overlayTable = null;

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
		primaryStage.setTitle("Hello World");
		primaryStage.initStyle(StageStyle.TRANSPARENT);

		scene = new Scene(root, 300, 300);
		scene.setFill(null);

		primaryStage.setScene(scene);
		primaryStage.show();
	}
}
