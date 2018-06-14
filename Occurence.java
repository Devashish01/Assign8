import java.util.Scanner;
class E
{
	void fun()
	{
		System.out.println("Enter the string1");
		Scanner input=new Scanner(System.in);
		String a=input.nextLine();
		System.out.println("Enter the string2");
		String b=input.nextLine();
		if(a.contains(b)) 
		 {
			  System.out.println("Yes it exits");
		 }
		else
		{
		System.out.println("noops didnt occur");
		}
	}
}

public class Occurence {

	public static void main(String[] args) {
		E obj=new E();
		obj.fun();
		
		
	}

}
