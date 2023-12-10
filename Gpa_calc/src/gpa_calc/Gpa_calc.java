/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package gpa_calc;
import java.util.Scanner;

/**
 *
 * @author timil
 */
public class Gpa_calc {
    
    public String getGrade(double score){
        String grade = "";
        if(score >= 70 && score <= 100){
            grade = "A";
        } else if (score >= 60 && score <= 69){
            grade = "B";
        }else if (score >= 50 && score <= 59){
            grade = "C";
        }else if (score >= 45 && score <= 49){
            grade = "D";
        }else if (score >= 40 && score <= 44){
            grade = "E";
        }else if (score >= 0 && score <= 39){
            grade = "F";
        }
        return grade;
    }
    
    public int getPoint(String grade){
        int point = 0;
        switch(grade){
            case "A":
                point = 5;
                break;
            case "B":
                point = 4;
                break;
            case "C":
                point = 3;
                break;
            case "D":
                point = 2;
                break;
            case "E":
                point = 1;
                break;
            case "F":
                point = 0;
                break;
        }
        return point;
    }

  
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("SIMPLE GRADING SYSTEM");
        
        Scanner i = new Scanner(System.in);
        
        //Course1
        System.out.print("Enter Course 1: ");
        String course1 = i.nextLine();
        
        System.out.print("Enter " + course1 +" unit: ");
        int courseUnit1 = i.nextInt();
        
        System.out.print("Enter " + course1 +" score: ");
        double score1 = i.nextDouble();
        
        i.nextLine();
        
        //Course2
        System.out.print("Enter Course 2: ");
        String course2 = i.nextLine();
        
        System.out.print("Enter " + course2 + " unit: ");
        int courseUnit2 = i.nextInt();
        
        System.out.print("Enter " + course2 +" score: ");
        double score2 = i.nextDouble();
        
        i.nextLine();
        
        //Course3
        System.out.print("Enter Course 3: ");
        String course3 = i.nextLine();
        
        System.out.print("Enter " + course3 + " unit: ");
        int courseUnit3 = i.nextInt();
        
        System.out.print("Enter " + course3 +" score: ");
        double score3 = i.nextDouble();
        
        i.nextLine();
        
        //Course4
        System.out.print("Enter Course 4: ");
        String course4 = i.nextLine();
        
        System.out.print("Enter " + course4 + " unit: ");
        int courseUnit4 = i.nextInt();
        
        System.out.print("Enter " + course4 +" score: ");
        double score4 = i.nextDouble();
        
        i.nextLine();
        
        //Course5
        System.out.print("Enter Course 5: ");
        String course5 = i.nextLine();
        
        System.out.print("Enter " + course5 + " unit: ");
        int courseUnit5 = i.nextInt();
        
        System.out.print("Enter " + course5 +" score: ");
        double score5 = i.nextDouble();
        
        Gpa_calc st = new Gpa_calc();
        
        String grade1 = st.getGrade(score1);
        String grade2 = st.getGrade(score2);
        String grade3 = st.getGrade(score3);
        String grade4 = st.getGrade(score4);
        String grade5 = st.getGrade(score5);
        
        int point1 = st.getPoint(grade1);
        int point2 = st.getPoint(grade2);
        int point3 = st.getPoint(grade3);
        int point4 = st.getPoint(grade4);
        int point5 = st.getPoint(grade5);
        
        int totPoint = point1 + point2 + point3 + point4 +point5;
   
        
        int qualityPoint1 = courseUnit1*point1;
        int qualityPoint2 = courseUnit2*point2;
        int qualityPoint3 = courseUnit3*point3;
        int qualityPoint4 = courseUnit4*point4;
        int qualityPoint5 = courseUnit5*point5;
        
        int sumQualityPoint = qualityPoint1 + qualityPoint2 + qualityPoint3 + qualityPoint4 + qualityPoint5;
        
        double gpaValue = sumQualityPoint / (float)totPoint;
        
                
        System.out.println("|-------------|-----------|-------|------------|");
        System.out.println("|COURSE & CODE|COURSE UNIT| GRADE | GRADE UNIT |");
        System.out.println("|-------------|-----------|-------|------------|");
     System.out.printf("|   %s   |     %d     |   %s   |      %d     |%n", course1, courseUnit1,grade1, point1 );
     System.out.printf("|   %s   |     %d     |   %s   |      %d     |%n", course2, courseUnit2,grade2, point2 );
     System.out.printf("|   %s   |     %d     |   %s   |      %d     |%n", course3, courseUnit3,grade3, point3 );
     System.out.printf("|   %s   |     %d     |   %s   |      %d     |%n", course4, courseUnit4,grade4, point4 );
     System.out.printf("|   %s   |     %d     |   %s   |      %d     |%n", course5, courseUnit5,grade5, point5 );
     System.out.println("|-----------------------------------------------|");
     

        System.out.printf("Your GPA is = %.2f to 2 decimal places\n", gpaValue);
        
    }
    
}
