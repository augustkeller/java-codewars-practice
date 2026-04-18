// //Exercise 1
// //Complete the solution so that it reverses the string passed into it.
// //Example:
// //'world'  =>  'dlrow'
// //'word'   =>  'drow'
// public class Kata {

//   public static String solution(String str) {
//     if (str.length() < 2){
//       return str;
//     } else {
//       return str.charAt(str.length() - 1) + solution(str.substring(0, str.length() - 1));
//     }
//   }
// }

//Exercise 2
//You are given an integer "n", you have to convert it into a string.
//Please complete the partially completed code in the editor. If your code successfully converts "n" into a string  the code will print "Good job". Otherwise it will print "Wrong answer". 
// "n" can range between -100 to 100 inclusive.
import java.util.*;
import java.security.*;
public class Solution {
 public static void main(String[] args) {

  DoNotTerminate.forbidExit();

  try {
   Scanner in = new Scanner(System.in);
   int n = in .nextInt();
   in.close();
   //String s=???; Complete this line below

   String s = String.valueOf(n);

   
   if (n == Integer.parseInt(s)) {
    System.out.println("Good job");
   } else {
    System.out.println("Wrong answer.");
   }
  } catch (DoNotTerminate.ExitTrappedException e) {
   System.out.println("Unsuccessful Termination!!");
  }
 }
}

//The following class will prevent you from terminating the code using exit(0)!
class DoNotTerminate {

 public static class ExitTrappedException extends SecurityException {

  private static final long serialVersionUID = 1;
 }

 public static void forbidExit() {
  final SecurityManager securityManager = new SecurityManager() {
   @Override
   public void checkPermission(Permission permission) {
    if (permission.getName().contains("exitVM")) {
     throw new ExitTrappedException();
    }
   }
  };
  System.setSecurityManager(securityManager);
 }
}