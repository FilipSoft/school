 
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package papagaj;

  import java.util.Scanner;
/**
 *
 * @author My
 */
public class Papagaj {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in, "windows-1250");
        System.out.println("ahoj, ja som virtuáni papagaj Lóra, rád opakujem");
        System.out.println("napíš niečo");
        String vstup;
        vstup = sc.nextLine();
        String vystup;
        vystup = vstup + "," + vstup + "!";
        System.out.println(vystup);
    }
    
}
