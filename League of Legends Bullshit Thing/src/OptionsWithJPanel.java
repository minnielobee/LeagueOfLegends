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
	static int champion;
	
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
		frame.setPreferredSize(new Dimension(800 , 800));
		frame.setResizable(true);
		ArrayList champions = new ArrayList();
		for (int i = 0; i < Champion.champs.size(); i++)
			{
			champions.add(Champion.champs.get(i).getName());
			}
		Object [] champions2 = (Object[]) champions.toArray();
		champion = JOptionPane.showOptionDialog(frame , "Which champion is your favorite to play?" , "Pick a Champion!" , JOptionPane.YES_NO_CANCEL_OPTION , JOptionPane.QUESTION_MESSAGE , null , champions2 , champions2[0]);
		Player.firstChamp = champion;
		}
	public static void pickRole()
		{
		Object [] roles = {"Marksman" , "Assassin" , "Support" , "Fighter" , "Tank" , "Mage"};
		role = JOptionPane.showOptionDialog(frame , "Which role do you play best?" , "Pick a Role!" , JOptionPane.YES_NO_CANCEL_OPTION , JOptionPane.QUESTION_MESSAGE , null, roles , roles[0]);
		Player.firstRole = role + 1;
		}
	
	}
