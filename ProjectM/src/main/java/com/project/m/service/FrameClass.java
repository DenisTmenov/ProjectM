package com.project.m.service;

public abstract class FrameClass {

	public abstract void openFrame(String nameFrame);

	public abstract void openFrame(String nameFrame, String valueParameter);

	public abstract void openFrame(String nameFrame, String title, Boolean resizableFrame, Boolean oneFrame, Boolean showAndWait);

	public abstract void openFrame(String nameFrame, String title, Boolean resizableFrame, Boolean oneFrame, Boolean showAndWait, String valueParameter);

	public static FrameClass getFrame() {
		return new FrameManager();
	}
}
