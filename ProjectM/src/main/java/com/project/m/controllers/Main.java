package com.project.m.controllers;

import com.project.m.service.FrameClass;

import javafx.application.Application;
import javafx.stage.Stage;

public class Main extends Application {

	@Override
	public void start(Stage primaryStage) {
		FrameClass frame = FrameClass.getFrame();
		frame.openFrame(primaryStage, "JobHistoriesFrame", "Job Histories");
	}

	public static void main(String[] args) {
		launch(args);
	}
}
