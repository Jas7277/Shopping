import javax.swing.*;

import java.awt.GridLayout;
import java.util.ArrayList;

public class Site {
	static JFrame frame;
	static ArrayList<JButton> buttons = new ArrayList<>();
	static JButton button;
	
	public static void main(String[] args) {
		frame = new JFrame("Shopping");
		frame.setVisible(true);
		frame.setSize(500, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		frame.setLayout(new GridLayout(1, 1));
		
		Item[] item = new Item[3];
		item[0] = new Chilled("Milk", 0, 1, 1);
		item[1] = new Chilled("Eggs", 0, 1, 2);
		item[2] = new Chilled("Creamer", 0, 1, 3);
		
		for (int i = 0; i < item.length; i++) {
			button = new JButton(item[i].name);
			button.setSize(100, 100);
			buttons.add(button);
			frame.add(button);
		}
	}

}

class Item {
	String name;
}

class Chilled extends Item {
	
	// Location variables
	int aisle;
	int bin;
	int pos;
	
	Chilled(String name, int aisle, int bin, int pos) {
		super.name = name;
		this.aisle = aisle;
		this.bin = bin;
		this.pos = pos;
	}
}