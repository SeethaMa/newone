package examples;

public class ForLoopArrPrime {
	public static void main(String[] args) {
		/*int [] num= {10,20,7,19,5,60,25};
		for (int i=0;i<num.length;i++) {
			if(num[i]%1==0 && num[i]%num[i]==0) {
				System.out.println(num[i]+" Not Prime Number");
			}
			else {
				System.out.println(num[i]+" Prime Number");
			}
		}*/
		for(int i=1;i<=10;i++) {
			if(i==5) {
				continue;
			}
			else if (i==9) {
				break;
			}
			System.out.println(i);
		}
		
	}

}
