package examples;

public class print2ndhalfReverse {
	public static void main(String[] args) {
		String[] a= {"CAT","BALL","APPLE","EAGLE"};
		String half="";
		for(int i=a.length-1;i>a.length/2-1;i--) {
			System.out.println(half+a[i]);
		}
	}

}
