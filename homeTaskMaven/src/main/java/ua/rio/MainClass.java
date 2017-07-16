package ua.rio;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MainClass{
    public static void main(String[] args){

        WorkClass workClass = new WorkClass();
        workClass.checkString(workClass.enterString());
    }
}

class WorkClass{

    public String enterString (){

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the string:");
        String enterStr = null;
        try {
            enterStr = reader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return enterStr;
    }

    public void checkString (String enterStr){

        String total = "";
        char [] masChar = enterStr.toCharArray();
        for (int i = 0; i < masChar.length; i ++){
            if(masChar[i] >= 48 && masChar[i] <= 57){
                total = "The word contains a number";
            }
        }
        System.out.println(total);
    }
}