import java.util.ArrayList;

public class FactorialContainer 
{
	
	public static ArrayList<Long> getContainer(int n)
	{
        if (n < 1) {
            throw new IllegalArgumentException("Введённое число должно быть больше 0");
        }
		ArrayList<Long> container = new ArrayList<Long>(n);
		long factorial = 1;
		for (int i = 1; i <= n; i++)
		{
			factorial *= i;
			container.add(i - 1, factorial);
		}
		return container;
	}
}
