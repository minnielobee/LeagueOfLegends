import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

import java.util.*;

public class OptionsWithJPanel extends JFrame
	{
	static JFrame frame = new JFrame();
	static String name;
	static int champOrRole;
	static int role;
	static String champion;
	
	public static void askForUsernameAndGreet()
		{
		int greeting = (int)(Math.random()*Player.greetings.size());
		name = JOptionPane.showInputDialog("Welcome to the League of Legends team builder! What is your username?");
		JOptionPane.showMessageDialog(frame, "Hi, " + name + ". " + Player.greetings.get(greeting));
		}
	public static int champOrRole()
		{
		Object [] options = {"Champion" , "Role"};
		champOrRole = JOptionPane.showOptionDialog(frame , "Would you like to build a team based on a champion or a role?" , "Champion or Role?" , JOptionPane.YES_NO_CANCEL_OPTION , JOptionPane.QUESTION_MESSAGE , null, options , options[1]);
		JOptionPane.showMessageDialog(frame , "Awesome!");
		return champOrRole;
		}
	public static void pickChamp()
		{
		ArrayList champions = new ArrayList();
		for (int i = 0; i < Champion.champs.size(); i++)
			{
			champions.add(Champion.champs.get(i).getName());
			}
		JComboBox chooseChampion = new JComboBox(champions.toArray());
		JPanel panel = new JPanel();
		JButton button = new JButton("This one!");
		JLabel label = new JLabel("Pick a Champion!");
		
		
		}
	
	}
