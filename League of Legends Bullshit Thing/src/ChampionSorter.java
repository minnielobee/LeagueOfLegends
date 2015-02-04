import java.util.Comparator;
public class ChampionSorter implements Comparator<Champion>
	{

	public int compare(Champion c1, Champion c2)
		{
		return c1.getName().compareTo(c2.getName());
		}
	}
