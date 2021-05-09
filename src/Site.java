import javax.swing.*;

public class Site {
	static JFrame frame;
	
	public static void main(String[] args) {
		frame = new JFrame("Shopping");
		frame.setVisible(true);
		frame.setSize(500, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
	}

}
