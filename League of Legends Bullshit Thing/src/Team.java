import java.util.*;
public class Team
	{
	private String top;
	private String jungle;
	private String mid;
	private String support;
	private String duoBot;
	static ArrayList teams = new ArrayList();
	static String champOrRole;
	static String [] reTeam = {" " , " " , " ", " " , " "};
	
	
	public Team(String t, String j, String m, String s, String d)
		{
		top = t;
		jungle = j;
		mid = m;
		support = s;
		duoBot = d;
		}

	public String getTop()
		{
		return top;
		}

	public void setTop(String top)
		{
		this.top = top;
		}

	public String getJungle()
		{
		return jungle;
		}

	public void setJungle(String jungle)
		{
		this.jungle = jungle;
		}

	public String getMid()
		{
		return mid;
		}

	public void setMid(String mid)
		{
		this.mid = mid;
		}

	public String getSupport()
		{
		return support;
		}

	public void setSupport(String support)
		{
		this.support = support;
		}

	public String getDuoBot()
		{
		return duoBot;
		}

	public void setDuoBot(String duoBot)
		{
		this.duoBot = duoBot;
		}
	
	
	public static ArrayList initiateTeam()
		{
		teams.add(new Team(" " , " " , " " , " " , " "));
		return teams;
		}
	
	public static ArrayList formTeamFromChampion()
		{
		System.out.print("Your champion's role is " + Champion.champs.get(Player.firstChamp).getType() + ". ");
		switch (Champion.champs.get(Player.firstChamp).getType())
			{
			case "Marksman":
				{
				((Team) teams.get(0)).setDuoBot(Champion.champs.get(Player.firstChamp).getName());
				System.out.println("So you would troll duo bot lane.");
				break;
				}
			case "Assassin":
				{
				((Team) teams.get(0)).setJungle(Champion.champs.get(Player.firstChamp).getName());
				System.out.println("So you would roam the jungle.");
				break;
				}
			case "Support":
				{
				((Team) teams.get(0)).setSupport(Champion.champs.get(Player.firstChamp).getName());
				System.out.println("So you would support the team.");
				break;
				}
			case "Fighter":
				{
				System.out.print("You could play anywhere, but you should play ");
				int fake = (int)(Math.random()*5)+1;
				switch (fake)
					{
					case 1:
						{
						((Team) teams.get(0)).setTop(Champion.champs.get(Player.firstChamp).getName());
						System.out.print("top lane.");
						break;
						}
					case 2:
						{
						((Team) teams.get(0)).setJungle(Champion.champs.get(Player.firstChamp).getName());
						System.out.print("the jungle.");
						break;
						}
					case 3:
						{
						((Team) teams.get(0)).setDuoBot(Champion.champs.get(Player.firstChamp).getName());
						System.out.print("adc.");
						break;
						}
					case 4:
						{
						((Team) teams.get(0)).setMid(Champion.champs.get(Player.firstChamp).getName());
						System.out.print("mid lane.");
						break;
						}
					case 5:
						{
						((Team) teams.get(0)).setSupport(Champion.champs.get(Player.firstChamp).getName());
						System.out.print("support.");
						break;
						}
					default:
						{
						((Team) teams.get(0)).setDuoBot(Champion.champs.get(Player.firstChamp).getName());
						System.out.println("adc.");
						break;
						}
					}
				break;
				}
			case "Tank":
				{
				((Team) teams.get(0)).setTop(Champion.champs.get(Player.firstChamp).getName());
				System.out.println("So you would rule the top lane.");
				break;
				}
			case "Mage":
				{
				((Team) teams.get(0)).setMid(Champion.champs.get(Player.firstChamp).getName());
				System.out.println("So you would push the mid lane.");
				break;
				}
			}
		return teams;
		}
	public static ArrayList finalBuild()
		{
		Collections.shuffle(Champion.champs);
		if (((Team) teams.get(0)).getTop().equals(" "))
			{
			for (int i = 0; i < Champion.champs.size(); i++)
				{
				if (Champion.champs.get(i).getType() == "Tank")
					{
					((Team) teams.get(0)).setTop(Champion.champs.get(i).getName());
					System.out.println("This is your top laner.");
					System.out.println("Champion name: " + ((Champion) Champion.champs.get(i)).getName() + ", " + ((Champion) Champion.champs.get(i)).getNickname());
		            System.out.println("Primary Role: " +((Champion) Champion.champs.get(i)).getType());
		            System.out.println("Secondary Role: " + ((Champion) Champion.champs.get(i)).getSecondType());
		            System.out.println("Health: " + ((Champion) Champion.champs.get(i)).getHp());
		            System.out.println("Mana: " + ((Champion) Champion.champs.get(i)).getMana());
		            System.out.println("Passive: " + ((Champion) Champion.champs.get(i)).getPassive());
		            System.out.println("'Q' Ability: " + ((Champion) Champion.champs.get(i)).getqAbil());
		            System.out.println("'W' Ability: " + ((Champion) Champion.champs.get(i)).getwAbil());
		            System.out.println("'E' Ability: " + ((Champion) Champion.champs.get(i)).geteAbil());
		            System.out.println("Ultimate: " + ((Champion) Champion.champs.get(i)).getUlt());
		            System.out.println("");
					}
				}
			}
		if (((Team) teams.get(0)).getJungle().equals(" "))
			{
			for (int i = 0; i < Champion.champs.size(); i++)
				{
				if (Champion.champs.get(i).getType() == "Assassin")
					{
					((Team) teams.get(0)).setJungle(Champion.champs.get(i).getName());
					System.out.println("This is your jungler.");
					System.out.println("Champion name: " + ((Champion) Champion.champs.get(i)).getName() + ", " + ((Champion) Champion.champs.get(i)).getNickname());
		            System.out.println("Primary Role: " +((Champion) Champion.champs.get(i)).getType());
		            System.out.println("Secondary Role: " + ((Champion) Champion.champs.get(i)).getSecondType());
		            System.out.println("Health: " + ((Champion) Champion.champs.get(i)).getHp());
		            System.out.println("Mana: " + ((Champion) Champion.champs.get(i)).getMana());
		            System.out.println("Passive: " + ((Champion) Champion.champs.get(i)).getPassive());
		            System.out.println("'Q' Ability: " + ((Champion) Champion.champs.get(i)).getqAbil());
		            System.out.println("'W' Ability: " + ((Champion) Champion.champs.get(i)).getwAbil());
		            System.out.println("'E' Ability: " + ((Champion) Champion.champs.get(i)).geteAbil());
		            System.out.println("Ultimate: " + ((Champion) Champion.champs.get(i)).getUlt());
		            System.out.println("");
					}
				}
			}
		if (((Team) teams.get(0)).getMid().equals(" "))
			{
			for (int i = 0; i < Champion.champs.size(); i++)
				{
				if (Champion.champs.get(i).getType() == "Mage")
					{
					((Team) teams.get(0)).setMid(Champion.champs.get(i).getName());
					System.out.println("This is your top laner.");
					System.out.println("Champion name: " + ((Champion) Champion.champs.get(i)).getName() + ", " + ((Champion) Champion.champs.get(i)).getNickname());
		            System.out.println("Primary Role: " +((Champion) Champion.champs.get(i)).getType());
		            System.out.println("Secondary Role: " + ((Champion) Champion.champs.get(i)).getSecondType());
		            System.out.println("Health: " + ((Champion) Champion.champs.get(i)).getHp());
		            System.out.println("Mana: " + ((Champion) Champion.champs.get(i)).getMana());
		            System.out.println("Passive: " + ((Champion) Champion.champs.get(i)).getPassive());
		            System.out.println("'Q' Ability: " + ((Champion) Champion.champs.get(i)).getqAbil());
		            System.out.println("'W' Ability: " + ((Champion) Champion.champs.get(i)).getwAbil());
		            System.out.println("'E' Ability: " + ((Champion) Champion.champs.get(i)).geteAbil());
		            System.out.println("Ultimate: " + ((Champion) Champion.champs.get(i)).getUlt());
		            System.out.println("");
					}
				}
			}
		if (((Team) teams.get(0)).getDuoBot().equals(" "))
			{
			for (int i = 0; i < Champion.champs.size(); i++)
				{
				if (Champion.champs.get(i).getType() == "Marksman")
					{
					((Team) teams.get(0)).setDuoBot(Champion.champs.get(i).getName());
					System.out.println("This is your adc.");
					System.out.println("Champion name: " + ((Champion) Champion.champs.get(i)).getName() + ", " + ((Champion) Champion.champs.get(i)).getNickname());
		            System.out.println("Primary Role: " +((Champion) Champion.champs.get(i)).getType());
		            System.out.println("Secondary Role: " + ((Champion) Champion.champs.get(i)).getSecondType());
		            System.out.println("Health: " + ((Champion) Champion.champs.get(i)).getHp());
		            System.out.println("Mana: " + ((Champion) Champion.champs.get(i)).getMana());
		            System.out.println("Passive: " + ((Champion) Champion.champs.get(i)).getPassive());
		            System.out.println("'Q' Ability: " + ((Champion) Champion.champs.get(i)).getqAbil());
		            System.out.println("'W' Ability: " + ((Champion) Champion.champs.get(i)).getwAbil());
		            System.out.println("'E' Ability: " + ((Champion) Champion.champs.get(i)).geteAbil());
		            System.out.println("Ultimate: " + ((Champion) Champion.champs.get(i)).getUlt());
		            System.out.println("");
					}
				}
			}
		if (((Team) teams.get(0)).getSupport().equals(" "))
			{
			for (int i = 0; i < Champion.champs.size(); i++)
				{
				if (Champion.champs.get(i).getType() == "Support")
					{
					((Team) teams.get(0)).setSupport(Champion.champs.get(i).getName());
					System.out.println("This is your support.");
					System.out.println("Champion name: " + ((Champion) Champion.champs.get(i)).getName() + ", " + ((Champion) Champion.champs.get(i)).getNickname());
		            System.out.println("Primary Role: " +((Champion) Champion.champs.get(i)).getType());
		            System.out.println("Secondary Role: " + ((Champion) Champion.champs.get(i)).getSecondType());
		            System.out.println("Health: " + ((Champion) Champion.champs.get(i)).getHp());
		            System.out.println("Mana: " + ((Champion) Champion.champs.get(i)).getMana());
		            System.out.println("Passive: " + ((Champion) Champion.champs.get(i)).getPassive());
		            System.out.println("'Q' Ability: " + ((Champion) Champion.champs.get(i)).getqAbil());
		            System.out.println("'W' Ability: " + ((Champion) Champion.champs.get(i)).getwAbil());
		            System.out.println("'E' Ability: " + ((Champion) Champion.champs.get(i)).geteAbil());
		            System.out.println("Ultimate: " + ((Champion) Champion.champs.get(i)).getUlt());
		            System.out.println("");
					}
				}
			}
		return teams;
		}

	public static String champOrRole()
		{
		Scanner userInput = new Scanner(System.in);
		System.out.println("Would you like to build a team based on a champion or a role?");
		champOrRole = userInput.nextLine();
		return champOrRole;
		}
	}
