/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lubianyi.task1;

/**
 *
 * @author Артем
 */
public class UsekovaRychlost {
    
        public static void main(String[] args) {
        
        int maxSpeed = 60  ;
        int distance = 1000 ;
        int startHour = 2 ;
        int startMinute = 30;
        int startSecond = 12;
        int endHour = 6;
        int endMinute = 12 ;
        int endSecond = 10;
         
        int startTimeInSeconds = startHour * 3600 + startMinute * 60 + startSecond;
        int endTimeInSeconds = endHour * 3600 + endMinute * 60 + endSecond;
        int totalTimeInHours = (endTimeInSeconds - startTimeInSeconds) / 3600;
        
        int averageSpeed = distance / totalTimeInHours;
        int speedExcess = averageSpeed - maxSpeed;
        
        System.out.println("Průměrná rychlost na úseku :" + averageSpeed) ;
        System.out.println("Rychlostní limit byl překročen o :" + speedExcess);
               
                
        
    }
    
}
