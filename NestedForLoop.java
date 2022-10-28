package examples;

public class NestedForLoop {
	public static void main(String[] args) {
		int [] num= {2,10,20,25,7,19,5,60};
		for (int i=0;i<num.length;i++) {
			String statement=num[i]+" is Prime Number.";
			for (int j=2;j<num[i];j++) {
				if (num[i]%j==0) {
					statement=num[i]+" is not a Prime Number.";
				}
			}
			System.out.println(statement);
		}
		
	}

}
