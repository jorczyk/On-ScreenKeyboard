import processing.core.PApplet;

import java.util.Map;

public class MySketch extends MyPApplet {

	private static final ButtonsGenerator buttonsGenerator = new ButtonsGenerator();
	private Map<Position, RoundButton> buttonsMap;
	private boolean firstTime = true;

	public void settings(){
		sceneSize(1200, (16f/9f));
	}

	public void draw(){
		textAlign(CENTER, CENTER);
		textFont(getFont());
		translate(GlobalParams.margin, GlobalParams.margin);
		if(firstTime) {
			buttonsMap = buttonsGenerator.generateAllButtons(GlobalParams.allButtonsNames(), 1200);
			buttonsMap.forEach((k, v) -> drawButton(v));
			firstTime = false;
		}
	}

	public void mousePressed(){
		buttonsMap.forEach((k, v) -> {
			if(k.isInRadius(new Position(mouseX, mouseY), GlobalParams.buttonsDiameter)) {
				System.out.print("In radius: " + v);
				v.focused = true;
				drawButton(v);
			}
		});
	}

	public void mouseReleased() {
		buttonsMap.forEach((k, v) -> v.focused = false);
		buttonsMap.forEach((k, v) -> drawButton(v));
	}

	void update() {

	}

	public static void main(String[] args){
		String[] processingArgs = {"MySketch"};
		MySketch mySketch = new MySketch();
		PApplet.runSketch(processingArgs, mySketch);
	}

	private void drawButton(RoundButton button) {
		if(button.focused) {
			fill(Color.RED);
		} else {
			fill(Color.GREY);
		}
		ellipse(button.position.getX(), button.position.getY(), button.diameter, button.diameter);
		fill(Color.GREEN);
		text(button.text, button.position.getX(), button.position.getY());
	}
}