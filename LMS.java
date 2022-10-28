package examples;

public class LMS {

  public static void main (String []args) {
   
  
 String word="mobile";
    char[]a=word.toCharArray();
    for(int i=0;i<a.length;i++) {
      if(i==0||i%2==0){
        System.out.println(a[i]);
        System.out.println("Thank You");
      }
    }
  }
}

