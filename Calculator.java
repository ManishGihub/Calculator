import java.util.*;

public class Calculator{
	
	static char choice;
	
	public static void main(String args[]){
		
	do{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("\n------------Welcome To Calculator-----------\n  ");
		System.out.print ("What Operation do you wan't to perform?\n\n  1.Addition\n  2.Subtraction\n  3.Multiplication\n  4.Division\nEnter your choice: ");
		
		int operation = sc.nextInt();
			
		System.out.print("\nEnter first number : ");
		int num1 = sc.nextInt();
		
		System.out.print("Enter second number : ");
		int num2 = sc.nextInt();
        
		switch(operation){
			
			case 1:
				System.out.println("Addition = "+(num1+num2));
				break;
			case 2:
				System.out.println("Subtraction = "+(num1-num2));
				break;
			case 3:
				System.out.println("Multiplication = "+(num1*num2));
				break;
			case 4:
			    if(num2>0){
					System.out.println("Division = "+(num1/num2));
				    break;
				}
				else{
					System.out.println("\nDivision not possible!!!");
				    System.out.println("Enter second number greater than zero");
				    break;
				}
			default:
			    System.out.println("Wrong input!!!");
				System.out.println("Enter proper number as choice to perform operation");
				break;
			}
			System.out.print("\nDo you want to perform operations?(y/n) \n");
			choice = sc.next().charAt(0);
		}
		while(choice == 'y' || choice== 'Y');
    }
}