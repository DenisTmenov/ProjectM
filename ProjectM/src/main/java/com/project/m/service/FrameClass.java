package com.project.m.service;

import javafx.stage.Stage;

public abstract class FrameClass {

	public abstract void openFrame(String nameFrame);

	public abstract void openFrame(String nameFrame, String title);

	public abstract void openFrame(Stage primaryStage, String nameFrame, String title);

	public abstract void openFrame(String nameFrame, String title, String valueParameter);

	public abstract void openFrame(Stage primaryStage, String nameFrame, String title, String valueParameter);

	public static FrameClass getFrame() {
		return new FrameManager();
	}

}
