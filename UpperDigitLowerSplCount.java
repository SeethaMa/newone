package examples;

public class UpperDigitLowerSplCount {
	public static void main(String[] args) {
		String word="sEETHAMAHA @123#$ ";
		int lcount=0;
		int ucount=0;
		int scount=0;
		int ncount=0;
		for(int i=0;i<word.length();i++) {
			if (word.charAt(i)>='A'&& word.charAt(i)<='Z') {
				ucount ++;
			}
			else if (word.charAt(i)>='a'&& word.charAt(i)<='z') {
				lcount ++;
			}
			else if (word.charAt(i)>='0'&& word.charAt(i)<='9') {
				ncount++;
			}
			else {
				scount ++;
			}
		}
		System.out.println(ucount);
		System.out.println(lcount);
		System.out.println(ncount);
		System.out.println(scount);
	}

}
