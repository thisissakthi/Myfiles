package hello;

public class Program {

	public static void main(String[] args) {
		
		int age=3;
		//try()
		//{
		if(age >0)
		{
			if(age>18)
			{
				System.out.println("Adult!..");
			}else
			{
				System.out.println("Too Young!..");
			}
		}
		else
		{
			System.out.println("Exception!...");
			}
		}
/*catch(exception e)
		{
	System.out.println(e);
		}*/
	}
