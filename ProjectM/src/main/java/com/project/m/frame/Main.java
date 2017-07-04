package com.project.m.frame;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

import com.project.m.exceptions.FrameException;

public class Main extends Application {

	private Stage windows;
	private Parent page;
	private Scene sceneBatchTable;
	

	@Override
	public void start(Stage Stage) {
		windows = Stage;
		windows.setTitle("ProjectM");
		try {
			page = FXMLLoader.load(getClass().getResource("/fxml/BatchFrame.fxml"));
		} catch (IOException e) {
			throw new FrameException("Problem in LOADER BatchFrame.fxml", e);
		}
		sceneBatchTable = new Scene(page);
		windows.setScene(sceneBatchTable);
		windows.setResizable(false);
		windows.show();

	}

	public static void main(String[] args) {
		launch(args);
	}
}
