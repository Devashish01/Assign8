import java.util.Scanner;
class B
{
	
	void fun()
	{
		 System.out.println("Enter a string pls");
			Scanner input=new Scanner(System.in);
			String m=input.nextLine();
	        String n =m.replaceAll("[AEIOUaeiou]","");
	        System.out.println(n);
	}
}
public class Removevowel {


 public static void main(String[] args) {

	 B obj=new B();
	 obj.fun();

    }

}