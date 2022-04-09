package assignmentByTF;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int input = 4;
		 boolean flag= true;
		 
		 for (int i=2;i<=input/2;i++) {
			 if (input%i==0) {
				 System.out.println("Not a Prime Number");
				 flag= false;
				 break;
			 }
			 
		 }
		 
		 if (flag) {
			 System.out.println("Prime Number");
			
			 }
				 
		 }

	}


