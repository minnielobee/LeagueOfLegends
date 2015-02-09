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
        OptionsWithJPanel.champOrRole();
        if (OptionsWithJPanel.champOrRole == 0)
        	{
        	OptionsWithJPanel.pickChamp();
        	System.out.println();
        	Player.champBuilder();
        	System.out.println("");
        	Team.formTeamFromChampion();
        	System.out.println("");
        	Team.finalBuild();
        	}
        else if(OptionsWithJPanel.champOrRole == 1)
        	{
        	Player.askForPreferredRole();
        	System.out.println("");
        	Player.roleBuilder();
        	System.out.println("");
        	Team.finalBuild();
        	}
        }

}