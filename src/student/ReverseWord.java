/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package student;
import java.util.Scanner;

public class ReverseWord {

    public static void main(String[] args){

        /*
        char [] myArray = new char[7];
        myArray[0] = 's';
        myArray[1] = 't';
        myArray[2] = 'q';
        myArray[3] = 'w';
        myArray[4] = 'd';
        myArray[5] = 'f';
        myArray[6] = 'a';
        //test to check edit history

        for(int i = 0; i<myArray.length; i++){
            System.out.println(myArray[1]);
        }
        */
            Scanner input = new Scanner(System.in);
            System.out.println("Enter a word: ");
            String word = input.nextLine();

            char [] myLetters = new char[word.length()];
            for(int i = 0; i<myLetters.length; i++){
                myLetters[i] = word.charAt(i);
                System.out.println(myLetters[i]);
            }
            System.out.println();
            for(int i = myLetters.length-1; i>=0; i-- ){
                System.out.println(myLetters[i]);
            }
    }
}