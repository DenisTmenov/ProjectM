package com.project.m.service;

import java.io.IOException;
import java.net.URL;

import com.project.m.controllers.ControllerInterface;
import com.project.m.exceptions.FrameException;
import com.project.m.utils.StringUtils;

import javafx.application.Platform;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.MenuBar;
import javafx.scene.image.Image;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class FrameManager extends FrameClass {
	private final String ICON = "/style/simply_migrate_-_icon-0.png";
	private final String MENU_BAR = "/fxml/Menu.fxml";

	private Stage frame;
	private String title = "";
	private Boolean oneFrame = false;
	private BorderPane borderPane = new BorderPane();

	public FrameManager() {
		super();
	}

	@Override
	public void openFrame(String nameFrame) {
		title = StringUtils.diviveCamelCase(nameFrame).replaceAll(" Frame", "");
		openFrame(nameFrame, title);
	}

	@Override
	public void openFrame(String nameFrame, String title) {
		this.title = StringUtils.diviveCamelCase(nameFrame).replaceAll(" Frame", "");
		openFrame(null, nameFrame, title, null);
	}

	@Override
	public void openFrame(Stage primaryStage, String nameFrame, String title) {
		openFrame(primaryStage, nameFrame, title, null);

	}

	@Override
	public void openFrame(String nameFrame, String title, String valueParameter) {
		openFrame(null, nameFrame, title, valueParameter);

	}

	@Override
	public void openFrame(Stage primaryStage, String nameFrame, String title, String valueParameter) {
		borderPaneActions(nameFrame, valueParameter);

		Scene scene = new Scene(borderPane);

		frameActions(primaryStage, title, scene);
	}

	private void borderPaneActions(String nameFrame, String valueParameter) {
		MenuBar menuBar = loadMenuBar();
		borderPane.setTop(menuBar);

		Pane itemPane = loadItemPane(nameFrame, valueParameter);
		borderPane.setCenter(itemPane);
	}

	private MenuBar loadMenuBar() {
		MenuBar menuBar;
		try {
			menuBar = FXMLLoader.load(getClass().getResource(MENU_BAR));
		} catch (IOException e) {
			throw new FrameException("Problem in LOADER ", e);
		}
		return menuBar;
	}

	private Pane loadItemPane(String nameFrame, String valueParameter) {
		FXMLLoader itemLoader = new FXMLLoader();
		URL itemUrl = getClass().getResource("/fxml/" + nameFrame + ".fxml");
		itemLoader.setLocation(itemUrl);

		Pane itemPane;
		try {
			itemPane = itemLoader.load();
		} catch (IOException e) {
			throw new FrameException("Problem in LOADER ", e);
		}

		ControllerInterface itemController = itemLoader.getController();
		if (valueParameter != null) {
			itemController.setParameter(valueParameter);
		}
		itemController.start();

		return itemPane;
	}

	private void frameActions(Stage primaryStage, String title, Scene scene) {
		if (primaryStage == null) {
			frame = new Stage();
		} else {
			frame = primaryStage;
			oneFrame = false;
			frame.setOnCloseRequest(e -> Platform.exit());
		}

		frame.setTitle(title);
		frame.setMaximized(true);
		addIcon(frame);
		frame.setScene(scene);
		frame.setResizable(true);
		if (oneFrame) {
			frame.initModality(Modality.APPLICATION_MODAL);
		}

		frame.show();
	}

	private void addIcon(Stage frame) {
		frame.getIcons().add(new Image(ICON));
	}

}
