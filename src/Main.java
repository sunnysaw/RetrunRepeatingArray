/*
In this section we will see how we can print a given array in which there is multiple same value exits, and we have
to print first repeating number :
____________________________________________________________________________________________________________________
Question : Given an array 'a' consisting of integer. Return first value that is repeating in array. if no repeated
           then return -1 :
_____________________________________________________________________________________________________________________
 */

import java.util.Scanner;
class repeating{
    static int ReturnRepeating(int arr[]){
        for (int i = 0; i < arr.length; i++){
            for (int j = i + 1; j < arr.length; j++){
                if (arr[i] == arr[j]){
                    return arr[i];
                }
            }
        }
        return -1;
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER THE LENGTH OF ARRAY : ");
        int a = sc.nextInt();
        int arr[] = new int[a];
        System.out.println("ENTER THE VALUE YOU WANT TO SAVE INSIDE ARRAY : ");
        for (int i =0; i < arr.length; i++){
            arr[i] = sc.nextInt();
            System.out.print(arr[i]);
        }
        System.out.println();
        System.out.println("NOW PRINTING THE FIRST REPEATING NUMBER : ");
        System.out.println(repeating.ReturnRepeating(arr));
    }
}