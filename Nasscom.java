package hello;

import java.util.Scanner;

public class Nasscom {
	public static void main(String args[])
	{
Scanner s=new Scanner(System.in);
int n=s.nextInt();
int[] a=new int[n];
for(int i=0;i<n;i++)
{
	a[i]=s.nextInt();
}
for(int j=0;j<n;j++)
{
	System.out.print(a[j]+" ");
}
a=swap(a,n);
for(int j=0;j<n;j++)
{
	System.out.print(a[j]+" ");
}
}
	public static int[] swap(int[] a,int n)
	{int count=0,t=1;
	for(int i=0;i<n;i++)
	{
		if(a[i]==0)
		{
			while(t!=0)
				{count++;
		for(int j=i;j<n-1;j++)
		{
			a[j]=a[j+1];
		}if(a[i]!=0)
			t=0;
				}t=1;
	}
	}
	for(int h=0;h<count;h++)
	{
	a[--n]=0;	
	//k--;
	}
	return a;
	}
	
}
