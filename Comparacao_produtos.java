import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	 
	
	 System.out.println("Escreva um codigo");
	 int Codigo = sc.nextInt();
	
	 
	 switch (Codigo) {
	     case 1 :
	      System.out.println("O Abacaxi está 8.5"); 
	      break;
	       case 2 :
	      System.out.println("O Abacaxi está 2.0"); 
	      break;
	       case 3 :
	      System.out.println("O Abacaxi está 1.3"); 
	      break;
	      default:
	      System.out.println("O codigo não esta na lista");
	      
	         
	 }
	 
	  
	  
	}
}
