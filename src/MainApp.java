
public class MainApp
{

	public static void main(String[] args)
	{
		System.out.println("Initial commit");
	
		System.out.println("Before calling method in NewClass");
		
		NewClass nc = new NewClass();
		
		nc.method();
		
		System.out.println("After calling method");
		
		System.out.println("Before getting out");
	}

}
