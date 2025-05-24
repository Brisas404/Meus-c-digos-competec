import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	 Scanner sc = new Scanner(System.in);	
	 
		String P;
		int x = 0;
		
	   System.out.println("Escreva uma Palavra");
	   P = sc.nextLine();
	   
	   while (x<5) {
	      System.out.println(P);
	      x++;
	   }
	   
	   
	}
}
