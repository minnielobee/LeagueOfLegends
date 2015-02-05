import java.util.Comparator;
public class TypeSorter implements Comparator<Champion>
	{

	public int compare(Champion c1, Champion c2)
		{
		return c1.getType().compareTo(c2.getType());
		}
	}
