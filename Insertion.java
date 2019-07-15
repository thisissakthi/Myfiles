package hello;

import java.util.Scanner;

public class Insertion {

	public static void main(String[] args) {
		Scanner b=new Scanner(System.in);
		System.out.println("Enter the n value");
         int n=b.nextInt();
		int s[]=new int[n];
		System.out.println("Enter the values");
		for(int i=0;i<n;i++)
		{
			s[i]=b.nextInt();
		}
		Sorting ob= new Sorting();
		//Sor1 ob1= new Sor1();
		System.out.println("Value Before Sorting");
         ob.display(s);
      //ob.insertion(s);
        ob.selection(s);
       System.out.println("Value after Sorting");
       ob.display(s);
}
}
class Sorting
{
public void insertion(int s[]){
//swap(int,int);
//Sor1 ob1= new Sor1();
for(int a=0;a<s.length-1;)
{
	if(s[a]>s[a+1])
	{
		//swap(s[a],s[a+1]);
		s[a]+=s[a+1];
		s[a+1]=s[a]-s[a+1];
		s[a]-=s[a+1];
		while(a!=0)
			{a--;} 
		display(s);
	}
	else
	a++;
}
}

public void display(int s[]) {
for(int j=0;j<s.length;j++)
{
	System.out.print(" "+s[j]);
}System.out.println();}

//class Sor1(){
public  void selection(int s[]){
	
	for(int i=0;i<s.length;i++)
	{
		int t=min(s,i);
		if(s[i]>t)
		{
			//swap(s[i],t);
			s[i]+=t;
			t=s[i]-t;
			s[i]-=t;
			display(s);
		}
		
	}
	}
public int min(int s[],int k)
{
	int su=s[k];
	for(int i=k+1;i<s.length;i++)
	{
		if(su>s[i])
		{
			//swap(su,s[i]);
			su+=s[i];
			s[i]=su-s[i];
			su-=s[i];
		}
	}
	return su;
}
public void swap(int a,int b)
{
	int c;
	c=a;
	a=b;
	b=c;
}
}

