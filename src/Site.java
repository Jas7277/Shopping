import javax.swing.*;

import java.awt.GridLayout;
import java.awt.event.*;
import java.util.ArrayList;

public class Site {
	static JFrame frame;
	static ArrayList<JButton> buttons = new ArrayList<>();
	static JButton button;
	static ArrayList<Item> shoppingList = new ArrayList<>();
	
	public static void main(String[] args) {
		frame = new JFrame("Shopping");
		frame.setVisible(true);
		frame.setSize(500, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		frame.setLayout(new GridLayout(1, 1));
		
		Item[] items = new Item[3];
		items[0] = new Chilled("Milk", 0, 1, 1);
		items[1] = new Chilled("Eggs", 0, 4, 21);
		items[2] = new Chilled("Creamer", 0, 6, 14);
		
		for (int i = 0; i < items.length; i++) {
			button = new JButton(items[i].name);
			button.setSize(50, 50);
			
			buttons.add(button);
			frame.add(button);
		}
		
		JButton done = new JButton("Done");
		done.setSize(50, 50);
		
		frame.add(done);
		
		checkButtonClick(items);
	}
	
	static void checkButtonClick(Item[] items) {
		for (JButton button: buttons) {
			button.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					for (Item item: items) {
						if (item.name == button.getText()) {
							shoppingList.add(item);
						}
					}
				}
			});
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