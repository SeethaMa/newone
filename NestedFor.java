package examples;

public class NestedFor {
	public static void main(String[] args) {
		String [] word = {"apple","apple","apple"};
		int count=0;
		for (int i=0;i<word.length;i++) {
			for (int j=0;j<word[i].length();j++) {
			if (word[i].charAt(j)=='a'||word[i].charAt(j)=='e'||word[i].charAt(j)=='i'||word[i].charAt(j)=='o'||word[i].charAt(j)=='u') {
				count++;
			}
			}
		}
		System.out.println(count);
	}

}
