package hello;

import java.util.Scanner;

public class Pascal_triangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter any Numbers");
		Scanner in=new Scanner(System.in);
		int a=in.nextInt();
		int s=a,b=1,num;
		for(int i=0;i<a;i++)
		{
			for(int j=s-1;j>0;j--)
			{
				System.out.print("*");
			}
			num=1;
			for(int k=0;k<=i;k++)
			{
				System.out.print(num+" ");
				num=num * (i-k)/(k+1);
			}
			System.out.println();
			s--;
		}

	}

}
