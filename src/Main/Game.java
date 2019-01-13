package Main;

import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JFrame;

public class Game {

	public static void main(String[] args) throws Exception {

		JFrame window = new JFrame("2D Platformer");
		window.setContentPane(new GamePanel());
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setResizable(false);
		window.pack();
		window.setVisible(true);

		Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
		window.setLocation(dim.width / 2 - window.getSize().width / 2, dim.height / 2 - window.getSize().height / 2);

		// Sound.main(args);
	}
}
