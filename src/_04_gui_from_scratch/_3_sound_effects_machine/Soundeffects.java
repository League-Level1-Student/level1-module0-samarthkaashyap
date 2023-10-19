package _04_gui_from_scratch._3_sound_effects_machine;

import javax.swing.JFrame;
import javax.swing.JPanel;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.JButton;

public class Soundeffects implements ActionListener{
	JButton button1;
	JButton button2;
	JButton button3;
	JButton button4;
	public void showButtons(){
		JFrame frame = new JFrame(); 
		frame.setVisible(true);
		JPanel panel = new JPanel();
		frame.add(panel);
		button1 = new JButton();
		button2 = new JButton();
		button3 = new JButton();
		button4 = new JButton();
		panel.add(button1);
		panel.add(button2);
		panel.add(button3);
		panel.add(button4);
		frame.pack();
		button1.addActionListener(this);
		button2.addActionListener(this);
		button3.addActionListener(this);
		button4.addActionListener(this);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Object button = e.getSource();
		if (button == button1) {
			playSound("sawing-wood-daniel_simon.wav");
		}
		if (button == button2) {
			playSound("airplane.wav.crdownload");
		}
		if (button == button3) {
			playSound("old-car.wav.crdownload");
		}
		if (button == button4) {
			playSound("ufo.wav.crdownload");
		}
	}
	private void playSound(String soundFile) {
		String path = "src/_04_gui_from_scratch/_3_sound_effects_machine/";
			File sound = new File(path+soundFile);
			if (sound.exists()) {
				new Thread(() -> {
				try {
					Clip clip = AudioSystem.getClip();
					clip.open(AudioSystem.getAudioInputStream(sound));
					clip.start();
					Thread.sleep(clip.getMicrosecondLength()/1000);
				}
				catch (Exception e) {
					System.out.println("Could not play this sound");
				}}).start();
	 		}
			else {
				System.out.println("File does not exist");
			}
		
	}
}
