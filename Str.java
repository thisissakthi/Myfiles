package hello;

import java.util.Scanner;

public class Str {

	public static void main(String[] args) {
		Scanner myvar =new Scanner(System.in);
		sayHello("Sakthi");
		//char a[20]=myvar.nextChar();
		String str=new String(myvar.nextLine());
		System.out.println(str);
		//f=myvar.nextLine();
		//sayHello(f);

	}
	static void sayHello(String a)
	{
		System.out.println("Hello"+" "+a);
	}

}
