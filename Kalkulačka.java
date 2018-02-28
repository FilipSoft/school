/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kalkulačka;
import java.util.Scanner;
/**
 *
 * @author FilipSoft
 */
public class Kalkulačka {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner sc = new Scanner(System.in, "windows-1250");
         
         System.out.println("vitajte v kalkulačke");
         System.out.println("zadajte prve číslo");
         float a = Float.parseFloat(sc.nextLine());
         System.out.println("zadajte druhe číslo");
         float b = Float.parseFloat(sc.nextLine());
         System.out.println("zvolte si operáciu");
         System.out.println("číslo 1 sčítanie");
         System.out.println("číslo 2 odčítanie");
         System.out.println("číslo 3 násobenie");      
         System.out.println("číslo 4 delenie");    
         int volba = Integer.parseInt(sc.nextLine());
         float vysledok = 0 ;
        vysledok = 0;
        switch (volba) {
            case 1:
                vysledok = a + b;
                break;
            case 2:
                vysledok = a - b;
                break;
            case 3:
                    
                vysledok = a * b;
                break;
            case 4:
                vysledok = a / b;
                break;
            default:
                break;
        }
                      
     
         if ((volba > 0) && (volba < 5))
             System.out.printf("vysledok: " + vysledok);
         else
         System.out.println("neplatna volba");
       
         System.out.println(" Dakujem za použitie");
    }
    
}
