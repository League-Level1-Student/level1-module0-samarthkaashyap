package _03_gui_with_help._2_photo_quiz;
/*
 *    Copyright (c) The League of Amazing Programmers 2013-2021
 *    Level 1
 */

import java.awt.Component;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class PhotoQuiz {

	public void run() {

		JFrame quizWindow = new JFrame();
		quizWindow.setVisible(true);
		// This will make sure the program exits when you close the window
		quizWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// 1. find an image on the internet, and put its URL in a String
		// variable (from your browser, right click on the image, and select
		// “Copy Image Address” )
		String adress = "https://i1.sndcdn.com/avatars-ylM4tanwBXJZhjWb-X76mWw-t500x500.jpg";
		// 2. create a variable of type "Component" that will hold your image
		Component monke;
		// 3. use the "createImage()" method below to initialize your Component
		monke = createImage(adress);
		// 4. add the image to the quiz window
		quizWindow.add(monke);
		// 5. call the pack() method on the quiz window
		quizWindow.pack();
		// 6. ask a question that relates to the image
		String input = JOptionPane.showInputDialog("Are monkeys your favorite animal?");
		// 7. print "CORRECT" if the user gave the right answer
		if (input.equals("yes")) {
			System.out.println("CORRECT");
		}
		else {
			System.out.println("INCORRECT");
		}
		// 8. print "INCORRECT" if the answer is wrong

		// 9. remove the component from the quiz window (you may not see the
		// effect of this until step 12)
		monke.remove(null);
		// 10. find another image and create it (might take more than one line
		// of code)
		String nextimage = "129.png";
		// 11. add the second image to the quiz window
		Component magikarp;
		magikarp = createImage(adress);
		quizWindow.add(magikarp);
		// 12. pack the quiz window
		quizWindow.pack();
		// 13. ask another question
		String input2 = JOptionPane.showInputDialog("Is magikarp the best pokemon?");
		// 14+ check answer, say if correct or incorrect, etc.
		if (input2.equals("yes")) {
			System.out.println("CORRECT I LOVE U");
		}
		else {
			System.out.println("LEAVE");
		}

	}

	private Component createImage(String imageUrl) {
		JLabel imageLabel = new JLabel();
		URL url;
		try {
			url = new URL(imageUrl);
			Icon icon = new ImageIcon(url);
			imageLabel.setIcon(icon);
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			JOptionPane.showMessageDialog(null, "I can't find your image!!");
		}
		
		return imageLabel;
	}

	/* OPTIONAL */
	// *14. add scoring to your quiz
	// *15. make something happen when mouse enters image
	// (imageComponent.addMouseMotionListener())
}
