package sampleapp;

import java.util.Scanner;

public class SampleApp {

    public static void main(String[] args) {
       Grades gr = new Grades();
       
       Scanner sc = new Scanner(System.in);
       // Print the table header
        System.out.printf("%-10s %-10s %-10s %-10s %-10s %-10s %-10s %-10s\n", 
                          "Student Id", "Name", "Prelim", "Midterm", "Prefinal", "Final", "Average", "Remarks");

       gr.addGrades(1001, "Mike", 1.0, 1.0, 1.0, 1.0);
       gr.viewGrades();
       
       Grades gr1 = new Grades();
       gr1.addGrades(1002, "John", 2.0, 1.0, 1.0, 1.0);
       gr1.viewGrades();
        
    }
    
}
