package hello;

public class nested_if {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[][]= {{1,2,3},{4,5,6}},age=18;
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
		
	for(int i=0;i<3;i++)
	{
		for(int j=0;j<3;j++)
		{
			System.out.print(arr[i][j]+" ");
		}
		System.out.println();
	}
/*catch(exception e)
		{
	System.out.println(e);
		}*/
	}
}
