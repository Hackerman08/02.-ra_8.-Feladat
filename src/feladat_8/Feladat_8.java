
package feladat_8;

import java.util.Scanner;
import java.util.Random;

public class Feladat_8 {

    
    public static void main(String[] args) {
        int szam;
        Scanner input = new Scanner(System.in);
        
        
        System.out.println("Fej vagy írás(0,1)");
       
        szam= input.nextInt();
        

        Random rand = new Random() ;

        int  n = rand.nextInt(2) ;
        if(szam>=2){
            System.out.println("Hiba!!!");
        }
        else if(szam==n ){
            System.out.println("Nyertél!");
            
        }else if(szam!=n ){
            System.out.println("Vesztettél! Játsz újra!");
        }
        System.out.println(n);
    }
    
}
