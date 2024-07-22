/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task1;

import java.util.*;


public class Task1 {
    public static  void average(ArrayList<Integer> grades){
        double somme=0;
        for(int i=0;i<grades.size();i++){
            somme+=grades.get(i);
        
        }
        System.out.println("Average grade: "+somme/grades.size());

}
    public static void lowestGrade(ArrayList<Integer>grades){
          int min=grades.get(0);
        for(int i=0;i<grades.size();i++){
            if(grades.get(i)<min)
                min=grades.get(i);
        
        }
        System.out.println("Lowest grade is " + min);
    }
        public static void highestGrade(ArrayList<Integer>grades){
          int max=0;
        for(int i=0;i<grades.size();i++){
            if(grades.get(i)>max)
                max=grades.get(i);
        
        }
        System.out.println("Highest grade is " + max);
    }
    public static void main(String[] args) {
  ArrayList<Integer> grades=new ArrayList();
  Scanner x=new Scanner(System.in);
       int grade;
        System.out.println("enter -1 pour finish");
       do{
           System.out.println("Enter grades");
             grade=x.nextInt();
            if(grade>=0 && grade<=100)
              
           grades.add(grade);
           else if(grade !=-1)
                System.out.println("Invalid grade ,should be between 0 and 100");
       }while(grade!=-1);
       average(grades);
       
       lowestGrade(grades);
       highestGrade(grades);
    }
    
}
