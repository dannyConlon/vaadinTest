package com.example.vaadintest;

import com.comp.TestVis;
import com.vaadin.Application;
import com.vaadin.ui.*;


public class VaadintestApplication extends Application {
	
	private TestVis v = new TestVis();
	
	@Override
	public void init() {
		Window mainWindow = new Window("Vaadintest Application");
		Label label = new Label("Hello Vaadin user");
		mainWindow.addComponent(v);
		setMainWindow(mainWindow);
	}

}
