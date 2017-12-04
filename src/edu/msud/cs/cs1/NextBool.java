package edu.msud.cs.cs1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class NextBool {

    public static void main(String[] args) {
        String inputStr = "1 0 true false True False TRUE FALSE 234 t f T F trUE fALsE";
        Scanner input = new Scanner(inputStr);

        try {
            while (input.hasNext()) {
                if(input.hasNextBoolean())
                {
                    System.out.println(input.nextBoolean());
                }
                else{
                    System.out.println("Error: Null");
                    input.next();
                }
            }
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}
