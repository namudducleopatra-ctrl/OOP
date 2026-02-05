/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package gsystem.gradingsystem;
import java.util.Scanner;

/**
 *
 * @author tumsi
 */

public class GradingSystem {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int score;
        int grade;

        // Counters for grades 1 to 9
        int g1 = 0, g2 = 0, g3 = 0, g4 = 0, g5 = 0;
        int g6 = 0, g7 = 0, g8 = 0, g9 = 0;

        int student = 1;

        while (student <= 5) {

            System.out.print("Enter score for student " + student + ": ");
            score = input.nextInt();

            if (score >= 80 && score <= 100) {
                grade = 1;
                System.out.println("Grade: 1  Remark: D1");
                g1++;
            } else if (score >= 75) {
                grade = 2;
                System.out.println("Grade: 2  Remark: D2");
                g2++;
            } else if (score >= 66) {
                grade = 3;
                System.out.println("Grade: 3  Remark: C3");
                g3++;
            } else if (score >= 60) {
                grade = 4;
                System.out.println("Grade: 4  Remark: C4");
                g4++;
            } else if (score >= 50) {
                grade = 5;
                System.out.println("Grade: 5  Remark: C5");
                g5++;
            } else if (score >= 45) {
                grade = 6;
                System.out.println("Grade: 6  Remark: C6");
                g6++;
            } else if (score >= 35) {
                grade = 7;
                System.out.println("Grade: 7  Remark: P7");
                g7++;
            } else if (score >= 30) {
                grade = 8;
                System.out.println("Grade: 8  Remark: P8");
                g8++;
            } else {
                grade = 9;
                System.out.println("Grade: 9  Remark: F");
                g9++;
            }

            System.out.println();
            student++;
        }

        
        System.out.println("----- GRADE SUMMARY -----");
        System.out.println("Grade 1: " + g1);
        System.out.println("Grade 2: " + g2);
        System.out.println("Grade 3: " + g3);
        System.out.println("Grade 4: " + g4);
        System.out.println("Grade 5: " + g5);
        System.out.println("Grade 6: " + g6);
        System.out.println("Grade 7: " + g7);
        System.out.println("Grade 8: " + g8);
        System.out.println("Grade 9: " + g9);
    }
}
