package com.project.m.controllers;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
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
		windows.setTitle("JobHistories");
		windows.getIcons().add(new Image("/style/simply_migrate_-_icon-0.png"));
		try {
			
			page = FXMLLoader.load(getClass().getResource("/fxml/JobHistoriesFrame.fxml"));
		} catch (IOException e) {
			throw new FrameException("Problem in LOADER JobHistoriesFrame.fxml", e);
		}
		sceneBatchTable = new Scene(page);
		windows.setScene(sceneBatchTable);
		windows.setResizable(true);
		windows.show();

	}

	public static void main(String[] args) {
		launch(args);
	}
}
