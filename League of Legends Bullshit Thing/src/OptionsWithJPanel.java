import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

import java.util.*;

public class OptionsWithJPanel extends JFrame implements ActionListener
	{
	static JFrame frame = new JFrame();
	static String name;
	static int champOrRole;
	static int role;
	static int champion;
	static final JComboBox pickChampion = new JComboBox();
	
	@Override
	public void actionPerformed(ActionEvent e)
		{
		champion = (int) pickChampion.getSelectedIndex();
		frame.dispose();
		}
	
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
	public static JComboBox pickChamp()
		{
		ArrayList champions = new ArrayList();
		for (int i = 0; i < Champion.champs.size(); i++)
			{
			champions.add(Champion.champs.get(i).getName());
			}
		Object [] champions2 = (Object[]) champions.toArray();
		final JComboBox pickChampion = new JComboBox(champions2);
		JPanel panel = new JPanel();
		JButton button = new JButton("This one!");
		JLabel label = new JLabel("Pick a champion!");
		panel.add(label);
		panel.add(pickChampion);
		panel.add(button);
		frame.add(panel);
		frame.setSize(200 , 200);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
		button.addActionListener(new ActionListener()
			{
				@Override
				public void actionPerformed(ActionEvent e)
					{
					champion = (int) pickChampion.getSelectedIndex();
					frame.dispose();
					}
			}
			);
		Player.firstChamp = champion;
		return pickChampion;
		}
	public static void pickRole()
		{
		Object [] roles = {"Marksman" , "Assassin" , "Support" , "Fighter" , "Tank" , "Mage"};
		role = JOptionPane.showOptionDialog(frame , "Which role do you play best?" , "Pick a Role!" , JOptionPane.YES_NO_CANCEL_OPTION , JOptionPane.QUESTION_MESSAGE , null, roles , roles[0]);
		Player.firstRole = role + 1;
		}
	
	}
