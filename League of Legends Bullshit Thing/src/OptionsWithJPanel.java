import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class OptionsWithJPanel extends JFrame
	{
	static JFrame frame = new JFrame();
	static String name;
	static int role;
	
	public static void askForUsernameAndGreet()
		{
		int greeting = (int)(Math.random()*Player.greetings.size());
		name = JOptionPane.showInputDialog("Welcome to the League of Legends team builder! What is your username?");
		JOptionPane.showMessageDialog(frame, "Hi, " + name + ". " + Player.greetings.get(greeting));
		}
	
	}
