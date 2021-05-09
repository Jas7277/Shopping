import javax.swing.*;
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
		
		Food[] food = new Food[2];
		food[0] = new Milk(0, 1, 1);
		food[1] = new Eggs(0, 1, 2);
		
		for (int i = 0; i < food.length; i++) {
			button = new JButton(food[i].name);
			button.setSize(100, 100);
			buttons.add(button);
			frame.add(button);
		}
	}

}

class Food {
	String name;
}

class Milk extends Food {
	
	// Location variables
	int aisle;
	int bin;
	int pos;
	
	String name = "Milk";
	
	Milk(int aisle, int bin, int pos) {
		super.name = name;
		this.aisle = aisle;
		this.bin = bin;
		this.pos = pos;
	}
}

class Eggs extends Food {
	int aisle;
	int bin;
	int pos;
	
	String name = "Eggs";
	
	Eggs(int aisle, int bin, int pos) {
		super.name = name;
		this.aisle = aisle;
		this.bin = bin;
		this.pos = pos;
	}
}