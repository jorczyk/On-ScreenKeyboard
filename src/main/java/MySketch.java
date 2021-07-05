import processing.core.PApplet;

import java.util.Map;

public class MySketch extends MyPApplet {

	private static final ButtonsGenerator buttonsGenerator = new ButtonsGenerator();
	private Map<Position, RoundButton> buttonsMap;
	private boolean firstTime = true;
	//TODO: add Robot to simulate keyboard input

	public void settings(){
		sceneSize(1200, (16f/9f));
	}

	public void draw(){
		textAlign(CENTER, CENTER);
		textFont(getFont());
		translate(GlobalParams.margin, GlobalParams.margin);
		if(firstTime) {
			buttonsMap = buttonsGenerator.generateAllButtons(GlobalParams.allKeys(), 1200);
			buttonsMap.forEach((k, v) -> drawButton(v));
			firstTime = false;
		}
	}

	public void mousePressed(){
		buttonsMap.forEach((k, v) -> {
			if(k.isInRadius(new Position(mouseX, mouseY), GlobalParams.buttonsDiameter)) {
				System.out.print(v.key.currentText);
				v.focused = !v.focused;
				drawButton(v);
			}
		});
	}

	public void mouseReleased() {
		buttonsMap.forEach((k, v) -> {
			if(!v.key.isLatch()) { v.focused = false; }
		});
		buttonsMap.forEach((k, v) -> drawButton(v));
	}

	public static void main(String[] args){
		String[] processingArgs = {"MySketch"};
		MySketch mySketch = new MySketch();
		PApplet.runSketch(processingArgs, mySketch);
	}

	private void drawButton(RoundButton button) {
		String text = resolveText(button);
		updateKeyText(button, text);
		fill(resolveButtonColor(button));
		ellipse(button.position.getX(), button.position.getY(), button.diameter, button.diameter);
		fill(Color.GREEN);
		text(text, button.position.getX(), button.position.getY());
	}

	private String resolveText(RoundButton button) {
		String text = button.key.getDisplayName();
		boolean shiftPressed = isKeyPressed("Sh");
		boolean altPressed = isKeyPressed("Al");
		if (shiftPressed) {
			text = button.key.getShiftName();
		}
		if(altPressed) {
			text = button.key.getAltName();
		}
		if(shiftPressed && altPressed) {
			text = button.key.getShiftAltName();
		}
		return text;
	}

	private Color resolveButtonColor(RoundButton button) {
		if(button.focused) {
			return button.key.getAltColor();
		} else {
			return button.key.getColor();
		}
	}

	private boolean isKeyPressed(String name) {
		for(RoundButton button : buttonsMap.values()) {
			if(button.key.getDisplayName().equals(name)) {
				return button.focused;
			}
		}
		return false;
	}

	private void updateKeyText(RoundButton button, String text) {
		if(!button.key.isLatch()) {
			button.key.currentText = text;
		} else {
			button.key.currentText = "";
		}
	}
}