# Myfiles
package hello;

import java.util.Scanner;

public class Testing {

	public static void main(String[] args) {
	 System.out.println("Eneter  the T");
		 Scanner s=new Scanner(System.in);
		//int n=s.nextInt();
		System.out.println("1st array value");
		int m1=s.nextInt();
		System.out.println("2nd array value");
		int m2=s.nextInt();
		int[] u=new int[m1+m2];
		int[] u2=new int[m2];
		class1 ob=new class1();
		class2 ob1=new class2();
		System.out.println("1array value");
		//for(int i=0;i<n;i++)
		{
		    for(int j=0;j<m1;j++)
		    {
		     u[j]=s.nextInt();
		    }
		    System.out.println("2 array value");
		    for(int k=0;k<m2;k++)
		    {
		        u2[k]=s.nextInt();
		    }
		    ob.merge(u,u2);
		    for(int l=0;l<u.length;l++)
	        {
	            System.out.print(" "+u[l]);
	        }
	        System.out.println();
		    ob1.sort(u);
		    for(int l=0;l<u.length;l++)
	        {
	            System.out.print(" "+u[l]);
	        }
		}
	}
}   
		//}
		class class1
		{ void  merge(int u[],int u2[])
		    {int j=u.length-u2.length;
		        for(int i=0;i<(u2.length);i++)
		        {
		        	//if(j<u2.length)
		        	{
		            u[j]=u2[i];
		            j++;
		        }
		        	/*else {
		        		break ;
		        	}*/
		    }
		    }
		}
		class class2
		{
		   void sort(int u[])
		    {
		        for(int i=0;i<u.length-1;)
		        {
		            if(u[i]<u[i+1])
		            {
		                u[i]=u[i]+u[i+1];
		                u[i+1]=u[i]-u[i+1];
		                u[i]=u[i]-u[i+1];
		                while(i!=0)
		                {
		                    i--;
		                }
		            }
		                else
		                {
		                    i++;
		                }
		            
		        }
		        
		    }
}
		
