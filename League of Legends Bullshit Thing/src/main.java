import java.util.*;
public class main 
{
    
    public static void main(String[] args)
        {
        Champion.makeChamps();
        Team.initiateTeam();
        Player.askForName();
        Player.greetUser();
        System.out.println("");
        Team.champOrRole();
        if (Team.champOrRole.equalsIgnoreCase("champion"))
        	{
        	Player.pickChamp();
        	System.out.println();
        	Player.champBuilder();
        	System.out.println("");
        	Team.formTeamFromChampion();
        	}
        else if(Team.champOrRole.equalsIgnoreCase("role"))
        	{
        	Player.askForPreferredRole();
        	System.out.println("");
        	Player.roleBuilder();
        	}
        else
        	{
        	System.out.println("Don't know how to " + Team.champOrRole + ".");
        	Team.champOrRole();
        	}
        }

}