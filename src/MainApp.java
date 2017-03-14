
public class MainApp
{

	public static void main(String[] args)
	{
		System.out.println("Initial commit");
		
		NewClass nc = new NewClass();
		
		nc.method();
		
		AnotherNewClass anc = new AnotherNewClass();
		
		anc.method();
		
		System.out.println("After calling method");
		
		System.out.println("Before getting out");
	}

}
