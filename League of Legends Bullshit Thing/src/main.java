import java.util.*;
public class main 
{
    
    public static void main(String[] args)
        {
        Champion.makeChamps();
        Team.initiateTeam();
        Team.ugh();
        Player.greetUser();
        OptionsWithJPanel.askForUsernameAndGreet();
        System.out.println("");
        Team.champOrRole();
        if (Team.champOrRole.equalsIgnoreCase("champion"))
        	{
        	Player.pickChamp();
        	System.out.println();
        	Player.champBuilder();
        	System.out.println("");
        	Team.formTeamFromChampion();
        	System.out.println("");
        	Team.finalBuild();
        	}
        else if(Team.champOrRole.equalsIgnoreCase("role"))
        	{
        	Player.askForPreferredRole();
        	System.out.println("");
        	Player.roleBuilder();
        	System.out.println("");
        	Team.finalBuild();
        	}
        else
        	{
        	System.out.println("Don't know how to " + Team.champOrRole + ".");
        	Team.champOrRole();
        	}
        }

}