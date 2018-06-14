import java.util.Scanner;
class A
{
	
	void fun()
	{ 
		 System.out.println("Enter a string pls");
		Scanner input=new Scanner(System.in);
		String m=input.nextLine();
		
	  for (int i=m.length()-1;i>=0;i--)
	  {
	      System.out.print(m.charAt(i)); 
	   }
		
	}
	
}
public class Reverse {

	public static void main(String[] args) {
		
		A obj=new A();
		obj.fun();
		
	}

}
