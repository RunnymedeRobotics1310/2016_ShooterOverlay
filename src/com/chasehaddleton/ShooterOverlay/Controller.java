package com.chasehaddleton.ShooterOverlay;

import javafx.fxml.FXML;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.shape.Circle;

public class Controller extends AnchorPane {
	@FXML
	private Circle circleTarget;

	public void mouseMove(MouseEvent me) {
		circleTarget.setLayoutX(me.getX());
		circleTarget.setLayoutY(me.getY());
		double dX = me.getX() - (Main.scene.getWidth() / 2);
		System.out.println("Center X: " + dX);
	}
}
