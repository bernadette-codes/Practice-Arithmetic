package arithmetic;

import java.util.Scanner;

public class Arithmetic {
    public static void main(String args[]){
        Scanner keyboard = new Scanner(System.in);
        int i, x, y, z, answer, a, counter=0;
        char sign;
        for(i=0;i<10;i++){
            x = (int)(Math.random() * 10);
            y = (int)(Math.random() * 10);
            a = (int)(Math.random() * 3);//random sign
            
            if(a==0){
                sign = '+';
                answer = x + y;
            } else if(a==1) {
                sign = '-';
                answer = x - y;
            } else {
                sign = '*';
                answer = x * y;
            }
            
            System.out.print(x+" "+sign+" "+y+" = ");
            z = keyboard.nextInt();          
                    
            if(z==answer){
                System.out.println("Correct");
                counter++;                
            } else {
                System.out.println("Wrong");       
            }
        }
        System.out.println("You answered "+counter+" questions correctly");
    }
}
