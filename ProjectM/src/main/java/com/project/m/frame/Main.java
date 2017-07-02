package com.project.m.frame;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Main extends Application {

	@Override
	public void start(Stage Stage) {
		try {
			Stage mainStage = new Stage();
			mainStage.setTitle("ProjectM");
			Parent page = FXMLLoader.load(getClass().getResource("/fxml/StartFrame.fxml"));
			Scene scene = new Scene(page);
			mainStage.setScene(scene);
			mainStage.setResizable(false);
			mainStage.show();
		} catch (IOException e) {
			System.out.println("Problem in LOADER DB");
			e.printStackTrace();
		}

	}

	public static void main(String[] args) {
		launch(args);
	}
}
