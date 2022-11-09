
package pkg4.hafta.pkg5;

import java.util.Scanner;

public class Hafta5 {

    
    public static void main(String[] args) {
        
       Scanner input = new Scanner (System.in); 
        System.out.println("Enter here a number");
        int a = input.nextInt();
       
        
        for(int i=1; i<=a; i++){
            
            
            if(a % i ==0 ){
                System.out.println("value is= "+ i);
            }
        }
    }
    
}