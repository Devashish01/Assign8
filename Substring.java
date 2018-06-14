class Bp
{
	void fun()
	{		
		
		  String s1="xyz";
		  int i=0;
		  int ad=s1.length();
		  while(i<ad) 
		  {
			  System.out.println(s1.charAt(i));
			  i++;
		  }
		  
		  for(i=0;i<ad;i++)
			  for(int j=0;j<ad;j++) 
			  {
				  System.out.print(s1.charAt(i));
				  
				  System.out.println(s1.charAt(j));
			}
		  	System.out.print(s1);
		  
		
	}
	
}
public class Substring {

  
		public static void main(String[] args) {
			Bp obj=new Bp();
			obj.fun();
		}
}