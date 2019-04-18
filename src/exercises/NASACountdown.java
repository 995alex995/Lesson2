package exercises;

import javax.swing.JOptionPane;

/*
 * Count down a rocket launch!
 * 
 * Print the numbers from 10 to 1, then print â€œblastoffâ€�. 
 */

public class NASACountdown {
public static void main(String[] args) {
 for (int i = 10; i > 0; i--) {
		JOptionPane.showMessageDialog(null, i);
	}
 JOptionPane.showMessageDialog(null, "â€œblastoffâ€�");
}
}
