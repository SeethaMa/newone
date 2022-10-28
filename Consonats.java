package examples;

public class Consonats {
 public static void main (String[]args) {
    String word="seetha";
    for(int i=0;i<word.length();i++) {
      if(word.charAt(i)=='A'||word.charAt(i)=='e'||word.charAt(i)=='i'||word.charAt(i)=='o'||word.charAt(i)=='u') {
        
      }
      else {
        System.out.println(word.charAt(i));
      }
    }
  }
}
