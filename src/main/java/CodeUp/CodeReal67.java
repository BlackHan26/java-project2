package CodeUp;

import java.util.Scanner;
public class CodeReal67 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    int iVal = sc.nextInt();
    if (iVal >= 0 ){
        System.out.println("plus");
        if (iVal % 2 == 0){
            System.out.println("even");
        }else{
            System.out.println("odd");
        }
    }else {
        System.out.println("minus");
        if (iVal % 2 == 0){
            System.out.println("even");
        }else{
            System.out.println("odd");
        }
    }
    }
}