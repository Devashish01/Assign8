import java.util.Scanner;
class F
{
	
	void fun()
	{
		System.out.println("Enter the string");
		 int i=0,x=1;
			Scanner input=new Scanner(System.in);
			String a=input.nextLine();
			int ad=a.length();
			while(i<ad)
			{
				if(a.charAt(i)==' ')
				{
					x++;
			  	}
					i++;
			}
				
				System.out.println("number of words "+x);
		
	}
	
}


public class Numberofwords {

	public static void main(String[] args) {
	
	   F obj=new F();
       obj.fun();
       
       
	}

}