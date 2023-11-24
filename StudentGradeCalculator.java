// GRADE CALCULATOR:

import java.util.Scanner;

public class StudentGradeCalculator {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        // Taking input of subjects:- 
        System.out.println("ENTER MARKS OBTAINED IN PHYSICS, CHEMISTRY, MATHS, ENGLISH, IT");
        
        System.out.print("Physics: ");
        double p = sc.nextDouble();

        System.out.print("Chemistry: ");
        double  c = sc.nextDouble();

        System.out.print("Maths: ");
        double  m = sc.nextDouble();

        System.out.print("English: ");
        double  e = sc.nextDouble();

        System.out.print("IT: ");
        double  i = sc.nextDouble();

        double total = p+c+m+e+i;
        double average = total/500;
        double AP = average*100;   // AP = AveragePercentage
        
        String grade = "Invalid Input";  // Initialising the String grade

        if (AP>=91 && AP<=100) {
            grade = "A1";
        } else if (AP>=81 && AP<=90) {
            grade = "A2";
        } else if (AP>=71 && AP<=80) {
            grade = "B1";
        } else if (AP>=61 && AP<=70) {
            grade = "B2";
        } else if (AP>=51 && AP<=60) {
            grade = "C1";
        } else if (AP>=41 && AP<=50) {
            grade = "C2";
        } else if (AP<=40 && AP>=0) {
            grade = "FAIL";
        } else if (AP>100 && AP<0) {
            grade = "Invalid Percentage";
        }

        System.out.println("Total marks obtained: " + total);
        System.out.println("Percentage: " + AP);
        System.out.println("Overall grade of student is: " + grade);
        System.out.println("Well Done! Better luck next time.");

    }
}
