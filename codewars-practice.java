//Exercise 1
//Complete the solution so that it reverses the string passed into it.
//Example:
//'world'  =>  'dlrow'
//'word'   =>  'drow'
public class Kata {

  public static String solution(String str) {
    if (str.length() < 2){
      return str;
    } else {
      return str.charAt(str.length() - 1) + solution(str.substring(0, str.length() - 1));
    }
  }
}