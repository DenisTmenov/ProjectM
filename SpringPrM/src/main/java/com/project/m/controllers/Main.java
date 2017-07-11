package com.project.m.controllers;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.project.m.service.FrameManager;

import javafx.application.Application;
import javafx.stage.Stage;

public class Main extends Application {

	@Override
	public void start(Stage Stage) {

		@SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");

		FrameManager frameManager = (FrameManager) context.getBean("frameManager");
		frameManager.openFrame("JobHistoriesFrame", "JobHistories", true, true, false);

	}

	public static void main(String[] args) {
		launch(args);
	}
}
