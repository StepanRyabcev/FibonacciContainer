import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.ArrayList;

public class Main {
	
	static int nFromKeyboard()
	{
		int n;
		while(true)
		{
			try 
			{
			@SuppressWarnings("resource")
			Scanner Input = new Scanner(System.in); 
		    System.out.println("Введите число n");
		    n = Input.nextInt();
		    return n;
			}
			catch (InputMismatchException e)
			{
				System.out.println("Неправильный ввод");
			}
			}
		}
	
	static void showContainer(ArrayList<Long> container)
	{
        for (Long number : container) {
            System.out.println(number);
        }
	}

	public static void main(String[] args) {
		while(true)
		try 
		{
		int n = nFromKeyboard();
	    ArrayList<Long> container = FactorialContainer.getContainer(n);
	    showContainer(container);
	    break;
		}
		catch(IllegalArgumentException e)
		{
			System.out.println(e.getMessage());
		}
		
	}

}
	