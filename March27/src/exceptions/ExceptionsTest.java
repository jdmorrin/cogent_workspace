package exceptions;

import java.util.Scanner;
import java.util.Random;

public class ExceptionsTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		Random r = new Random();
		Number num = null;
		int choice;
		
		//Avg calc
//		try {
//			System.out.println("***Average Calculation***");
//			System.out.println("Enter an integer: ");
//			int n = s.nextInt();
//			
//			System.out.println(CalcAverage.avgFirstN(n));
//
//		}catch(IllegalArgumentException iarg) {
//			System.out.print(iarg.getMessage() + "\n");
//		}
		
		// NUmber calculations
//		do {
//			System.out.println("***Number Calcuclations***");
//			System.out.println("1. Add");
//			System.out.println("2. Sub");
//			System.out.println("3. Multiply");
//			System.out.println("4. Div");
//
//			choice = s.nextInt();
//			num = new Number(r.nextInt(10), r.nextInt(10));
//			
//			switch (choice) {
//			case 1:
//				num.add();
//				break;
//			case 2:
//				num.sub();
//				break;
//			case 3:
//				num.mul();
//				break;
//			case 4:
//				try {
//					num.div();
//				}catch(ArithmeticException ae) {
//					System.out.println(ae.getMessage());
//				}
//				break;
//			}
//			System.out.println(num.getResult());
//			
//		}while(choice != 5);
		
		// Bank menu
		System.out.println("Babnk");
//		BankAccount acc;
//		try {
//			acc = new BankAccount(1001, "Juandi", "Current", 2500f);
//		}catch(LowBalanceException lb) {
//			System.out.println(lb.getMessage());
//		}catch(NegativeAmount na) {
//			System.out.println(na.getMessage());
//		}
		BankAccount acc = new BankAccount(1001, "Juandi", "Current", 500f);
		do {
			System.out.println("***BANK MENU***");
			System.out.println("1. Deposit");
			System.out.println("2. Withdraw");
			System.out.println("3. Get Balance");
			System.out.println("4. Exit");
			choice = s.nextInt();
			
			switch(choice) {
			case 1:
				try {
					acc.deposit(s.nextFloat());
				}catch(NegativeAmount na) {
					System.out.println(na.getMessage());
				}
				break;
			case 2:
				try {
					acc.withdraw(s.nextFloat());
				}catch(InsufficientFunds inf) {
					System.out.println(inf.getMessage());
				}
				break;
			case 3:
				System.out.println(acc.getBalance());
				break;
			case 4:
				break;
			}
		}while(choice != 4);
		
		
		
		System.out.println("Reached end of program");
		
	}

}
