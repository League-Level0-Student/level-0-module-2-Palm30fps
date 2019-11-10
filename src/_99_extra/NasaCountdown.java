//    Copyright (c) The League of Amazing Programmers 2013-2019
//    Level 0

package _99_extra;

import javax.swing.JOptionPane;

/* NASA wants to shoot a rocket into orbit. 
  * Somebody has to do the countdown – or the rocket won’t launch.
 * 
 * The ground control chief will tell you where to start – then count down to 0. 
 * 
 * (example for ’11’: 11 10 9 8 7 6 5 4 3 2 1 0)
 * 
 **/

public class NasaCountdown {
	public static void main(String[] args) throws InterruptedException {
		// 2. Use a pop-up to ask the user where to start counting from
String startingpoint=JOptionPane.showInputDialog("Where would you like to start the countdown from?");
int i = Integer.parseInt(startingpoint);


// 3. Change the countdown to use the new starting point
		
		// 1. Print a countdown from 10 to 0 on the console
	
for (int j =i ; j>0;j--) {
	System.out.println(j);
speak(""+j);

}
speak("Blast OOoOooooOOoooOOff");
	
}
	
		
		// 5. when the counting is done, speak "blastoff!"

	
static void speak(String j) {
   	 try {
   		 Runtime.getRuntime().exec("say " + j).waitFor();
   	 } catch (Exception e) {
   		 e.printStackTrace();
   	 }
  }
}


