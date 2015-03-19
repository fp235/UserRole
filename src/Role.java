import java.util.Scanner;
public class Role {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Enter a number from 1-5 to select role");
		System.out.println("1. Administrator,2. Faculty,3. Staff,4. Student,5. Guest ");
		Scanner keyboard = new Scanner(System.in);
		
		int role = keyboard.nextInt();
		switch(role){ 
		case 1:
			System.out.println(" Welcome Administrator");
			break;
		case 2:
			System.out.println("Welcome Faculty");
			break;
		case 3:
			System.out.println("Welcome Staff");
			break;
		case 4:
			System.out.println("Welcome Student");
			break;
		case 5:
			System.out.println("Welcome Guest");
			break;
		default:
			System.out.println("Not a valid role");
		}
			

}}
