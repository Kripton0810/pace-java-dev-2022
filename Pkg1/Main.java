package Pkg1;

import java.util.*; 
import java.io.*;

class Main {

  public static String StringChallenge(String str) {
    String s[] = str.split(" ");
    String sk="";
    for(String sm : s)
    {
      String s1 = sm.substring(0,1);
      String s2 = sm.substring(1);
      s1 = s1.toUpperCase();
      sm = s1+s2;
      System.out.print(sm); 
      sk = sm+" ";
    }
    return sk;
  }

  public static void main (String[] args) {  
    // keep this function call here     
    Scanner s = new Scanner(System.in);
    System.out.print(1/0); 
  }

}