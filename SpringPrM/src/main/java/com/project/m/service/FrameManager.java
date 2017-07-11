package com.project.m.service;

import java.io.IOException;

import com.project.m.exceptions.FrameException;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class FrameManager {

	private FrameManager() {

	}

	public static FrameManager getFrameManager() {
		return new FrameManager();
	}

	public void openFrame(String nameFrame, String title, Boolean resizableFrame, Boolean oneFrame, Boolean showAndWait) {
		Stage frame = new Stage();
		frame.setTitle(title);
		addIcon(frame);
		FXMLLoader loader = new FXMLLoader();
		loader.setLocation(getClass().getResource("/fxml/" + nameFrame + ".fxml"));
		Parent parent;
		try {
			parent = loader.load();
		} catch (IOException e) {
			throw new FrameException("Problem in LOADER JobHistoriesFrame.fxml", e);
		}
		Scene scene = new Scene(parent);
		frame.setScene(scene);
		frame.setResizable(resizableFrame);
		if (oneFrame) {
			frame.initModality(Modality.APPLICATION_MODAL);
		}
		if(showAndWait) {
			frame.showAndWait();
		} else {
			frame.show();
		}

		
	}

	private void addIcon(Stage frame) {
		frame.getIcons().add(new Image("/style/simply_migrate_-_icon-0.png"));
	}

}
