import java.util.Scanner;

public class atm {

    public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		//welcome
	    System.out.println("---------------------------");
	    System.out.println("  Welcome to the JAVA ATM");
	    System.out.println("---------------------------");
	    System.out.println();
		//storing variables for use in if and while statements
		int attempts = 2;
		int pin = 0;
		int choice = 0;
		double balance = 100;
		double deposit = 0;
		double withdraw = 0;
		//pin test
		while(pin != 2310 && attempts >= 0) {
			System.out.print("Enter Pin: ");
	        pin = sc.nextInt();
	  		if(pin == 2310) {
				while(choice !=4) {
					System.out.println();
					System.out.println("ATM Menu:");
					System.out.println("1: Check balance");
					System.out.println("2: Deposit Funds");
					System.out.println("3: Withdraw Funds");
					System.out.println("4: Exit");
					//choice
					System.out.print("Enter choice (1/2/3/4): ");
					choice = sc.nextInt();
					if(choice == 1) { //check balance
						System.out.println("Your balance is: $" + balance);
					}
					else if(choice == 2) { //deposit
						System.out.print("Enter deposit amount: ");
						deposit = sc.nextDouble();
						balance = balance + deposit;
						System.out.println("Successfully deposited $" + deposit);
					}
					else if(choice == 3) { //withdraw
						System.out.print("Enter withdraw amount: ");
						withdraw = sc.nextDouble();
						if(withdraw > balance) { //failed withdraw
							System.out.println("Insufficiant Funds.");
						}
						else if(withdraw < balance ) { // succesful withdraw
							balance = balance - withdraw;
							System.out.println("Successfully withdrew $" + withdraw);
						}
					else if(choice == 4) { //exit
					System.out.println("Thank you for using the ATM. Goodbye!");
					}
					else { //invalid option
						System.out.println("Invalid option, Please try againn");
						choice = 0;
					}
					}
				}
		    } //incorrect pin attempt not final
		    else if(attempts > 0) {
				System.out.println("Incorrect Pin. You have " + attempts + " remaining.");
				attempts--;
			}
			else { //final pin attempt
			System.out.println("Too many incorrect attempts. Please contact your bank for assistance.");
			return;
			}

		}

    }
}
