import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	 Scanner sc = new Scanner(System.in);
	 
	 int num;
	 int soma;
	 
	 System.out.println("Escreva um numero");
	 num = sc.nextInt();
	 
	 
	 for (int i = 0; i <=10; i++){
	 soma = num * i;
	 System.out.println(num+" x " +i+ " = " +soma );
	 }


   
	   
	   
	}
}