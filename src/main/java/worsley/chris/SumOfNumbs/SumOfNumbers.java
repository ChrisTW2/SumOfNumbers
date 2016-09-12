package worsley.chris.SumOfNumbs;

import com.sun.source.tree.ForLoopTree;

import java.util.Scanner;

/**
 * Created by christopherworsley on 9/9/16.
 */
public class SumOfNumbers {

    public int askForNumber(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a Number?");
        int num =scan.nextInt();
        int total = 0;
        for(int i = 1; i <= num; i++){
            total += i;

        }
        return total;


    }

    public static void main(String[] args) {
        SumOfNumbers a = new SumOfNumbers();

        System.out.println(a.askForNumber());
    }



}




