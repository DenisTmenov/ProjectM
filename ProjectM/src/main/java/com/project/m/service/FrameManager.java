package com.project.m.service;

import java.io.IOException;

import com.project.m.controllers.ControllerInterface;
import com.project.m.exceptions.FrameException;
import com.project.m.utils.StringUtils;

import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.Pane;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class FrameManager {
	private String title = "";
	private Boolean resizableFrame = true;
	private Boolean oneFrame = true;
	private Boolean showAndWait = true;

	private FrameManager() {

	}

	public static FrameManager getFrameManager() {
		return new FrameManager();
	}

	public void openFrame(String nameFrame) {
		this.title = StringUtils.diviveCamelCase(nameFrame).replaceAll(" Frame", "");
		openFrame(nameFrame, this.title, this.resizableFrame, this.oneFrame, this.showAndWait, null);
	}

	public void openFrame(String nameFrame, String valueParameter) {
		this.title = StringUtils.diviveCamelCase(nameFrame).replaceAll(" Frame", "");
		openFrame(nameFrame, this.title, this.resizableFrame, this.oneFrame, this.showAndWait, valueParameter);
	}

	public void openFrame(String nameFrame, String title, Boolean resizableFrame, Boolean oneFrame, Boolean showAndWait) {
		openFrame(nameFrame, title, resizableFrame, oneFrame, showAndWait, null);
	}

	public void openFrame(String nameFrame, String title, Boolean resizableFrame, Boolean oneFrame, Boolean showAndWait, String valueParameter) {
		Stage frame = new Stage();
		frame.setTitle(title);
		frame.setMaximized(true);
		addIcon(frame);
		FXMLLoader loader = new FXMLLoader();
		loader.setLocation(getClass().getResource("/fxml/" + nameFrame + ".fxml"));

		Pane pane;
		try {
			pane = loader.load();
		} catch (IOException e) {
			throw new FrameException("Problem in LOADER ", e);
		}

		ControllerInterface controller = loader.getController();
		if (valueParameter != null) {
			controller.setParameter(valueParameter);
		}
		controller.start();

		Scene scene = new Scene(pane);
		frame.setScene(scene);
		frame.setResizable(resizableFrame);
		if (oneFrame) {
			frame.initModality(Modality.APPLICATION_MODAL);
		}
		if (showAndWait) {
			frame.showAndWait();
		} else {
			frame.show();
		}

	}

	private void addIcon(Stage frame) {
		frame.getIcons().add(new Image("/style/simply_migrate_-_icon-0.png"));
	}
}
