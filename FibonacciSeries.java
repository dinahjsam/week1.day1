package assignmentByTF;

public class FibonacciSeries {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
	int first=0;
	int second=1;
	int sum;

	for (int i=1;i<=8;i++) {
		sum= first + second;
		System.out.println(sum);
		first=second;
		second=sum;
		 
	}
		
		

	}

}
