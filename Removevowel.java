import java.util.Scanner;
class B
{
	
	void fun()
	{
		 System.out.println("Enter a string pls");
			Scanner input=new Scanner(System.in);
			String s1=input.nextLine();
			for(int i=0;i<s1.length();i++)
	        {
	        	if(s1.charAt(i)=='a'||s1.charAt(i)=='e'||s1.charAt(i)=='i'||s1.charAt(i)=='o'||s1.charAt(i)=='u'||s1.charAt(i)=='A'||s1.charAt(i)=='E'||s1.charAt(i)=='I'||s1.charAt(i)=='O'||s1.charAt(i)=='U')
	        	{	
	        	}
	        	else
	        	{
	        		System.out.print(s1.charAt(i));
	        	}
	        }  
	    
	}
}
public class Removevowel {


 public static void main(String[] args) {

	 B obj=new B();
	 obj.fun();

    }

}
