package fortune_cookie;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class FortuneCookie implements ActionListener {
	public void showButton() {
		
		JFrame frame = new JFrame();
		frame.setVisible(true);
		
		JButton button = new JButton();
		frame.add(button);
		frame.pack();
		button.addActionListener(this);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JOptionPane.showMessageDialog(null, "Woohoo");
		
		int rand = new Random().nextInt(5);

		if(rand == 0) {
			JOptionPane.showMessageDialog(null, "You will be mauled by a hippo");
		}
			
		if(rand == 1) {
			JOptionPane.showMessageDialog(null, "You will die from disease");
		}

		if(rand == 2) {
			JOptionPane.showMessageDialog(null, "You will fall sixteen stories and die");
		}

		if(rand == 3) {
			JOptionPane.showMessageDialog(null, "You will fall into a container at a food processing plant and be turned into lard");
		}
	
		if(rand == 4) {
			JOptionPane.showMessageDialog(null, "You will dive to deep into the ocean and be crushed to death");
		}
	
	
	}
}


