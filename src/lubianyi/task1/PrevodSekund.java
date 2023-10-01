/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lubianyi.task1;

/**
 *
 * @author Артем
 */
public class PrevodSekund {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        int hours = 3 ;
        int min = 95 ;
        int seconds = 10673 ;
        int result = 0 ;
        int hh = 0 ;
        int mm = 0;
        int ss = 0 ;
        
        hours = hours * 60 ;
        hours = hours * 60 ;
        min = min * 60 ;
        result = hours + min + seconds ;
        System.out.println("Cas zavodnika:" + result );
        
        hours = hours * 0 ; //nastavit hodinu na nulu 
        min = hours * 0 ; // nastavit minuty na nulu 
        
        hours = seconds / 60 ;
        hh = hours / 60 ;
        min = hours - (hh * 60) ;
        mm = min ;
        ss = (seconds - (((hh*60)*60)+(mm*60))) ;
        
        System.out.println(hh + ":" + mm + ":" + ss) ;
    }
    
}
