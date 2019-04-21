package photo_quiz;
/*
 *    Copyright (c) The League of Amazing Programmers 2013-2019
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

	public void run() throws Exception {

		JFrame quizWindow = new JFrame();
		quizWindow.setVisible(true);
		// This will make sure the program exits when you close the window
		quizWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// 1. find an image on the internet, and put its URL in a String
		// variable (from your browser, right click on the image, and select
		// “Copy Image Address”)
		String URL = "https://coubsecure-s.akamaihd.net/get/b197/p/coub/simple/cw_timeline_pic/b70c1ec5756/d6ac0a0b5426c0288d3ba/big_1524314692_image.jpg";
		// 2. create a variable of type "Component" that will hold your image
		Component kermit;
		// 3. use the "createImage()" method below to initialize your Component
		kermit = createImage(URL);
		// 4. add the image to the quiz window
		quizWindow.add(kermit);
		// 5. call the pack() method on the quiz window
		quizWindow.pack();
		// 6. ask a question that relates to the image
		String question = JOptionPane.showInputDialog("what game is this model from");
		// 7. print "CORRECT" if the user gave the right answer
		if(question.equalsIgnoreCase("VRchat")) {
			JOptionPane.showMessageDialog(null, "CORRECT");
		}
		// 8. print "INCORRECT" if the answer is wrong
		else {
			JOptionPane.showMessageDialog(null, "INCORRECT, it's from VRchat");

		}
		// 9. remove the component from the quiz window (you may not see the
		// effect of this until step 12)
		quizWindow.remove(kermit);
		// 10. find another image and create it (might take more than one line
		// of code)
		String URL2 = "https://www.gannett-cdn.com/-mm-/05398f80e3bde0326c872a093f3784aeee1c8a90/c=880-323-1833-861/local/-/media/2018/05/14/USATODAY/usatsports/wp-USAT-allthemoms-front1-19975-winnie-the-pooh-day.jpg?width=3200&height=1680&fit=crop";
		kermit = createImage(URL2);
		// 11. add the second image to the quiz window
		quizWindow.add(kermit);
		// 12. pack the quiz window
		quizWindow.pack();
		// 13. ask another question
		String question2 = JOptionPane.showInputDialog("who is this?");
		// 14+ check answer, say if correct or incorrect, etc.
		if(question.equalsIgnoreCase("Shi Jinping")) {
			JOptionPane.showMessageDialog(null, "CORRECT");
		}
		
		else {
			JOptionPane.showMessageDialog(null, "INCORRECT, hes Shi Jinping");
		}
		

	}

	private Component createImage(String imageUrl) throws MalformedURLException {
		URL url = new URL(imageUrl);
		Icon icon = new ImageIcon(url);
		JLabel imageLabel = new JLabel(icon);
		return imageLabel;
	}

	/* OPTIONAL */
	// *14. add scoring to your quiz
	// *15. make something happen when mouse enters image
	// (imageComponent.addMouseMotionListener())
}
