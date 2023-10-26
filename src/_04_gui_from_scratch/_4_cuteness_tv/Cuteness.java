package _04_gui_from_scratch._4_cuteness_tv;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URI;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Cuteness implements ActionListener{
	JButton button1;
	JButton button2;
	JButton button3;
	
	public void showButtons() {
		JFrame frame = new JFrame(); 
		frame.setVisible(true);
		JPanel panel = new JPanel();
		frame.add(panel);
		button1 = new JButton();
		button2 = new JButton();
		button3 = new JButton();
		panel.add(button1);
		panel.add(button2);
		panel.add(button3);
		frame.pack();
		button1.addActionListener(this);
		button2.addActionListener(this);
		button3.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Object button = e.getSource();
		if (button == button1) {
			showDucks();
		}
		if (button == button2) {
			showFrog();
		}
		if (button == button3) {
			showFluffyUnicorns();
		}
		
	}


void showDucks() {
    playVideo("https://www.youtube.com/watch?v=MtN1YnoL46Q");
}

void showFrog() {
    playVideo("https://www.youtube.com/watch?v=cBkWhkAZ9ds");
}

void showFluffyUnicorns() {
    playVideo("https://www.youtube.com/watch?v=a-xWhG4UU_Y");
}

void playVideo(String videoID) {
    
    // Workaround for Linux because "Desktop.getDesktop().browse()" doesn't
    //work on some Linux implementations
    try {
    if (System.getProperty("os.name").toLowerCase().contains("linux")) {
    if (Runtime.getRuntime().exec(new String[] {
     "which", "xdg- open" }).getInputStream().read() != -1) {
    Runtime.getRuntime().exec(new String[] { "xdg-open", videoID });
    }
    } else {
         URI uri = new URI(videoID);
         java.awt.Desktop.getDesktop().browse(uri);
    }      } catch (Exception e) {
         e.printStackTrace();
    }
}
}