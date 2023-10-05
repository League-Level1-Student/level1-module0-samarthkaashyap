package _04_gui_from_scratch._1_fortune_cookie;

import java.awt.Component;
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
		System.out.println("Button Clicked");

		JOptionPane.showMessageDialog(null, "WooHoo");
		int rand = new Random().nextInt(5);
		if (rand == 0) {
			JOptionPane.showMessageDialog(null, "You're boutu get 100");
		}
		if (rand == 1) {
			JOptionPane.showMessageDialog(null, "You might fall");
		}
		if (rand == 2) {
			JOptionPane.showMessageDialog(null, "You might win the lottery");
		}
		if (rand == 3) {
			JOptionPane.showMessageDialog(null, "You might eat some rlly good food");
		}
		if (rand == 4) {
			JOptionPane.showMessageDialog(null, "You might get lucky");
		}
		
	}
	
}
