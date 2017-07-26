package com.project.m.controllers;

import java.net.URL;
import java.util.ResourceBundle;

import com.project.m.service.FrameClass;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;

public class MenuController implements Initializable {

	@FXML
	private MenuBar openMenuBar;
	@FXML
	private Menu openMenu, frameMenu;
	@FXML
	private MenuItem batchFrameMenuItem, jobEntriesFrameMenuItem, jobHistoriesFrameMenuItem;

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		activeActions();
	}

	private void activeActions() {
		batchFrameMenuItem.setOnAction(actionEvent -> {
			FrameClass frame = FrameClass.getFrame();
			frame.openFrame("BatchFrame");
		});

		jobEntriesFrameMenuItem.setOnAction(actionEvent -> {
			FrameClass frame = FrameClass.getFrame();
			frame.openFrame("JobEntriesFrame");
		});

		jobEntriesFrameMenuItem.setOnAction(actionEvent -> {
			FrameClass frame = FrameClass.getFrame();
			frame.openFrame("JobHistoriesFrame");
		});
	}

}
