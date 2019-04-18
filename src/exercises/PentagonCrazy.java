package exercises;

import org.jointheleague.graphical.robot.Robot;

public class PentagonCrazy {

	private void makePrettyThings() {
	
        Robot Alex = new Robot();

         Alex.penDown();
	
         Alex.setSpeed(100);
		 Alex.setPenWidth(2);
   		 Alex.setRandomPenColor();
         		
         int angle = 360/5;
	
         for (int i = 0; i <1000; i++) {
				
	     Alex.move(i);
	       		
         Alex.turn(angle);
	
         Alex.turn(1);
            }
	}

	public static void main(String[] args) {
		new PentagonCrazy().makePrettyThings();
	}
}