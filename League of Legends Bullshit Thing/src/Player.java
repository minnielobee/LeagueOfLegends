import java.util.*;
public class Player
	{
	public static String name;
	public static String role;
	public static String champ;
	static int firstChamp;
	static int firstRole;
	static ArrayList greetings = new ArrayList();
	 
	
	public static String askForName()
		{
		Scanner userInput = new Scanner(System.in);
		System.out.println("Welcome to the League of Legends team builder! What's your username?");
		name = userInput.nextLine();
		return name;
		}
	public static void greetUser()
		{
		greetings.add("You're cool man.");
		greetings.add("You should play promotionals.");
		greetings.add("Are you a diamond smurf?");
		greetings.add("You could play for TSM.");
		greetings.add("You could be a caster.");
		greetings.add("I love you.");
		}
	public static String askForPreferredRole()
		{
		switch (firstRole)
			{
			case 1:
				{
				System.out.println("Okay, so you're a Marksman kind of person.");
				role = "Marksman";
				break;
				}
			case 2:
				{
				System.out.println("Alright, you're more into the Assassin life.");
				role = "Assassin";
				break;
				}
			case 3:
				{
				System.out.println("Awesome, you're a Support guy.");
				role = "Support";
				break;
				}
			case 4:
				{
				System.out.println("Fighter, huh? Nice.");
				role = "Fighter";
				break;
				}
			case 5:
				{
				System.out.println("Nice, a Tank.");
				role = "Tank";
				break;
				}
			case 6:
				{
				System.out.println("A Mage? Rock it, bro.");
				role = "Mage";
				break;
				}
			default:
				{
				System.out.println("Stop cheating, cheater");
				askForPreferredRole();
				break;
				}
			}
		return role;
		}
	public static String pickChamp()
		{
		Scanner userInput = new Scanner(System.in);
		System.out.println("What is your favorite champion to play that you want a team for?");
		champ = userInput.nextLine();
		champ = champ.substring(0 , 1).toUpperCase() + champ.substring(1, champ.length()).toLowerCase();
		for (int i = 0; i < Champion.champs.size(); i++)
			{
			if (champ.equals(((Champion) Champion.champs.get(i)).getName()))
				{
				System.out.println("Great!");
				}
			if (i == Champion.champs.size())
				{
				System.out.println("I think not");
				pickChamp();
				}
			}
		return champ;
		}
	public static int champBuilder()
		{
		try
			{
			Thread.sleep(1500);
			} catch (InterruptedException e)
			{
			e.printStackTrace();
			}
		Collections.sort(Champion.champs , new ChampionSorter());
		System.out.println("Champion name: " + ((Champion) Champion.champs.get(firstChamp)).getName() + ", " + ((Champion) Champion.champs.get(firstChamp)).getNickname());
        System.out.println("Primary Role: " +((Champion) Champion.champs.get(firstChamp)).getType());
		System.out.println("Secondary Role: " + ((Champion) Champion.champs.get(firstChamp)).getSecondType());
		System.out.println("Health: " + ((Champion) Champion.champs.get(firstChamp)).getHp());
		System.out.println("Mana: " + ((Champion) Champion.champs.get(firstChamp)).getMana());
		System.out.println("Passive: " + ((Champion) Champion.champs.get(firstChamp)).getPassive());
		System.out.println("'Q' Ability: " + ((Champion) Champion.champs.get(firstChamp)).getqAbil());
		System.out.println("'W' Ability: " + ((Champion) Champion.champs.get(firstChamp)).getwAbil());
		System.out.println("'E' Ability: " + ((Champion) Champion.champs.get(firstChamp)).geteAbil());
		System.out.println("'R' Ability: " + ((Champion) Champion.champs.get(firstChamp)).getUlt());
		return firstChamp;
		}
	public static int roleBuilder()
		{
		System.out.println("Here's a champion based on your role choice.");
		Collections.shuffle(Champion.champs);
		switch (role)
			{
			case "Marksman":
				{
				for (int i = 0; i < Champion.champs.size(); i++)
					{
					if (role == Champion.champs.get(i).getType())
						{
						System.out.println("Champion name: " + ((Champion) Champion.champs.get(i)).getName() + ", " + ((Champion) Champion.champs.get(i)).getNickname());
				        System.out.println("Primary Role: " +((Champion) Champion.champs.get(i)).getType());
				        System.out.println("Secondary Role: " + ((Champion) Champion.champs.get(i)).getSecondType());
				        System.out.println("Health: " + ((Champion) Champion.champs.get(i)).getHp());
				        System.out.println("Mana: " + ((Champion) Champion.champs.get(i)).getMana());
				        System.out.println("Passive: " + ((Champion) Champion.champs.get(i)).getPassive());
				        System.out.println("'Q' Ability: " + ((Champion) Champion.champs.get(i)).getqAbil());
				        System.out.println("'W' Ability: " + ((Champion) Champion.champs.get(i)).getwAbil());
				        System.out.println("'E' Ability: " + ((Champion) Champion.champs.get(i)).geteAbil());
				        System.out.println("'R' Ability: " + ((Champion) Champion.champs.get(i)).getUlt());
				        System.out.println("");
				        System.out.println("So you would troll duo bot lane.");
				        ((Team) Team.teams.get(Team.teamNumber)).setDuoBot(Champion.champs.get(i).getName());
				        break;
						}
					}
				break;
				}
			case "Assassin":
				{
				for (int i = 0; i < Champion.champs.size(); i++)
					{
					if (role == Champion.champs.get(i).getType())
						{
						System.out.println("Champion name: " + ((Champion) Champion.champs.get(i)).getName() + ", " + ((Champion) Champion.champs.get(i)).getNickname());
				        System.out.println("Primary Role: " +((Champion) Champion.champs.get(i)).getType());
				        System.out.println("Secondary Role: " + ((Champion) Champion.champs.get(i)).getSecondType());
				        System.out.println("Health: " + ((Champion) Champion.champs.get(i)).getHp());
				        System.out.println("Mana: " + ((Champion) Champion.champs.get(i)).getMana());
				        System.out.println("Passive: " + ((Champion) Champion.champs.get(i)).getPassive());
				        System.out.println("'Q' Ability: " + ((Champion) Champion.champs.get(i)).getqAbil());
				        System.out.println("'W' Ability: " + ((Champion) Champion.champs.get(i)).getwAbil());
				        System.out.println("'E' Ability: " + ((Champion) Champion.champs.get(i)).geteAbil());
				        System.out.println("'R' Ability: " + ((Champion) Champion.champs.get(i)).getUlt());
				        System.out.println("");
				        System.out.println("So you would roam the jungle.");
				        ((Team) Team.teams.get(Team.teamNumber)).setJungle(Champion.champs.get(i).getName());
				        break;
						}
					}
				break;
				}
			case "Support":
				{
				for (int i = 0; i < Champion.champs.size(); i++)
					{
					if (role == Champion.champs.get(i).getType())
						{
						System.out.println("Champion name: " + ((Champion) Champion.champs.get(i)).getName() + ", " + ((Champion) Champion.champs.get(i)).getNickname());
				        System.out.println("Primary Role: " +((Champion) Champion.champs.get(i)).getType());
				        System.out.println("Secondary Role: " + ((Champion) Champion.champs.get(i)).getSecondType());
				        System.out.println("Health: " + ((Champion) Champion.champs.get(i)).getHp());
				        System.out.println("Mana: " + ((Champion) Champion.champs.get(i)).getMana());
				        System.out.println("Passive: " + ((Champion) Champion.champs.get(i)).getPassive());
				        System.out.println("'Q' Ability: " + ((Champion) Champion.champs.get(i)).getqAbil());
				        System.out.println("'W' Ability: " + ((Champion) Champion.champs.get(i)).getwAbil());
				        System.out.println("'E' Ability: " + ((Champion) Champion.champs.get(i)).geteAbil());
				        System.out.println("'R' Ability: " + ((Champion) Champion.champs.get(i)).getUlt());
				        System.out.println("");
				        System.out.println("So you would support the team.");
				        ((Team) Team.teams.get(Team.teamNumber)).setSupport(Champion.champs.get(i).getName());
				        break;
						}
					}
				break;
				}
			case "Fighter":
				{
				for (int i = 0; i < Champion.champs.size(); i++)
					{
					if (role == Champion.champs.get(i).getType())
						{
						System.out.println("Champion name: " + ((Champion) Champion.champs.get(i)).getName() + ", " + ((Champion) Champion.champs.get(i)).getNickname());
				        System.out.println("Primary Role: " +((Champion) Champion.champs.get(i)).getType());
				        System.out.println("Secondary Role: " + ((Champion) Champion.champs.get(i)).getSecondType());
				        System.out.println("Health: " + ((Champion) Champion.champs.get(i)).getHp());
				        System.out.println("Mana: " + ((Champion) Champion.champs.get(i)).getMana());
				        System.out.println("Passive: " + ((Champion) Champion.champs.get(i)).getPassive());
				        System.out.println("'Q' Ability: " + ((Champion) Champion.champs.get(i)).getqAbil());
				        System.out.println("'W' Ability: " + ((Champion) Champion.champs.get(i)).getwAbil());
				        System.out.println("'E' Ability: " + ((Champion) Champion.champs.get(i)).geteAbil());
				        System.out.println("'R' Ability: " + ((Champion) Champion.champs.get(i)).getUlt());
				        System.out.println("");
				        System.out.print("You could play anywhere, but you should play ");
						switch (Champion.champs.get(i).getSecondType())
							{
							case "Tank":
								{
								((Team) Team.teams.get(Team.teamNumber)).setTop(Champion.champs.get(i).getName());
								System.out.print("top lane.");
								break;
								}
							case "Jungle":
								{
								((Team) Team.teams.get(Team.teamNumber)).setJungle(Champion.champs.get(i).getName());
								System.out.print("the jungle.");
								break;
								}
							case "Marksman":
								{
								((Team) Team.teams.get(Team.teamNumber)).setDuoBot(Champion.champs.get(i).getName());
								System.out.print("adc.");
								break;
								}
							case "Mage":
								{
								((Team) Team.teams.get(Team.teamNumber)).setMid(Champion.champs.get(i).getName());
								System.out.print("mid lane.");
								break;
								}
							case "Support":
								{
								((Team) Team.teams.get(Team.teamNumber)).setSupport(Champion.champs.get(i).getName());
								System.out.print("support.");
								break;
								}
							default:
								{
								((Team) Team.teams.get(Team.teamNumber)).setJungle(Champion.champs.get(i).getName());
								System.out.print("the jungle.");
								break;
								}
							}

				        break;
						}
					}
				break;
				}
			case "Tank":
				{
				for (int i = 0; i < Champion.champs.size(); i++)
					{
					if (role == Champion.champs.get(i).getType())
						{
						System.out.println("Champion name: " + ((Champion) Champion.champs.get(i)).getName() + ", " + ((Champion) Champion.champs.get(i)).getNickname());
				        System.out.println("Primary Role: " +((Champion) Champion.champs.get(i)).getType());
				        System.out.println("Secondary Role: " + ((Champion) Champion.champs.get(i)).getSecondType());
				        System.out.println("Health: " + ((Champion) Champion.champs.get(i)).getHp());
				        System.out.println("Mana: " + ((Champion) Champion.champs.get(i)).getMana());
				        System.out.println("Passive: " + ((Champion) Champion.champs.get(i)).getPassive());
				        System.out.println("'Q' Ability: " + ((Champion) Champion.champs.get(i)).getqAbil());
				        System.out.println("'W' Ability: " + ((Champion) Champion.champs.get(i)).getwAbil());
				        System.out.println("'E' Ability: " + ((Champion) Champion.champs.get(i)).geteAbil());
				        System.out.println("'R' Ability: " + ((Champion) Champion.champs.get(i)).getUlt());
				        System.out.println("");
				        System.out.println("So you would rule the top lane.");
				        ((Team) Team.teams.get(Team.teamNumber)).setTop(Champion.champs.get(i).getName());
				        break;
						}
					}
				break;
				}
			case "Mage":
				{
				for (int i = 0; i < Champion.champs.size(); i++)
					{
					if (role == Champion.champs.get(i).getType())
						{
						System.out.println("Champion name: " + ((Champion) Champion.champs.get(i)).getName() + ", " + ((Champion) Champion.champs.get(i)).getNickname());
				        System.out.println("Primary Role: " +((Champion) Champion.champs.get(i)).getType());
				        System.out.println("Secondary Role: " + ((Champion) Champion.champs.get(i)).getSecondType());
				        System.out.println("Health: " + ((Champion) Champion.champs.get(i)).getHp());
				        System.out.println("Mana: " + ((Champion) Champion.champs.get(i)).getMana());
				        System.out.println("Passive: " + ((Champion) Champion.champs.get(i)).getPassive());
				        System.out.println("'Q' Ability: " + ((Champion) Champion.champs.get(i)).getqAbil());
				        System.out.println("'W' Ability: " + ((Champion) Champion.champs.get(i)).getwAbil());
				        System.out.println("'E' Ability: " + ((Champion) Champion.champs.get(i)).geteAbil());
				        System.out.println("'R' Ability: " + ((Champion) Champion.champs.get(i)).getUlt());
				        System.out.println("");
				        System.out.println("So you would push the mid lane.");
				        ((Team) Team.teams.get(Team.teamNumber)).setMid(Champion.champs.get(i).getName());
				        break;
						}
					}
				break;
				}
			}
		Collections.sort(Champion.champs, new ChampionSorter());
		return firstRole;
		}
	}
