import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import java.awt.event.*;


public class Main extends JFrame implements ActionListener
{
	public static void main(String[] args)
	{
		JFrame frame = new JFrame("Calculator");
		
		JButton zero = new JButton("0");
		JButton one = new JButton("1");
		JButton two = new JButton("2");
		JButton three = new JButton("3");
		JButton four = new JButton("4");
		JButton five = new JButton("5");
		JButton six = new JButton("6");
		JButton seven = new JButton("7");
		JButton eight = new JButton("8");
		JButton nine = new JButton("9");
		
		JButton add = new JButton("+");
		JButton subtract = new JButton("-");
		JButton divide = new JButton("/");
		JButton multiply = new JButton("*");
		JButton equals = new JButton("=");
		JButton dot = new JButton(".");
		
		JButton clear = new JButton("Clear");
		
		JLabel textField = new JLabel("something");
		
		JPanel panel = new JPanel();
		
		panel.add(seven);
		panel.add(eight);
		panel.add(nine);
		panel.add(add);
		panel.add(four);
		panel.add(five);
		panel.add(six);
		panel.add(subtract);
		panel.add(one);
		panel.add(two);
		panel.add(three);
		panel.add(multiply);
		panel.add(zero);
		panel.add(dot);
		panel.add(clear);
		panel.add(equals);
		
		frame.add(textField);
		frame.add(panel);
		frame.setSize(350,200);
		frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
		frame.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) 
	{
		// TODO Auto-generated method stub
		
	}
}
