import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String Nome = sc.nextLine();
		String[] NomeParte = Nome.split(" ");
	
	     System.out.println(NomeParte[1]);
	
	}
}