package com.neka;

import java.io.StringBufferInputStream;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String str = "how you       doing";
        str = str.replaceAll("\\s", "");   // "\\s" - single space inbetween
        System.out.println( str.length()); // prints 11

            /*logic 1 - using +
        int len = str.length()-1;
        String rev = "";
        for(int i = len; i>=0; i--){
            rev =rev+ str.charAt(i);
        }
        System.out.println(rev);

        //using char array
char ch[] = str.toCharArray();
int len = str.length()-1;
String rev ="";
        for(int i = len ; i>=0 ;i--){
            rev = rev+ ch[i];
        }
        System.out.println(rev);
*/
        //using stringBuffer class
        StringBuffer input = new StringBuffer(str);
        System.out.println(input.reverse());

    }
}
