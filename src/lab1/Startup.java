/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package lab1;

/**
 *
 * @author Mitch
 */
public class Startup {
    
    
    public static void main(String[] args) {
        ProgrammingCourse advJava1 = new AdvancedJavaCourse("Advanced Java", "3001");
        advJava1.setPrerequisites("Intro to Java");
        advJava1.setCredits(4.0);
        System.out.println("Course: " + advJava1.getCourseName() + "\nCourseNumber: " + advJava1.getCourseNumber() +
                "\nCredits: " + advJava1.getCredits() + "\nPrerequisites: " + advJava1.getPrerequisites());
        
        System.out.println("");
        ProgrammingCourse intJava1 = new IntroJavaCourse("Intro to Java", "2001");
        intJava1.setPrerequisites("Intro to Programming");
        intJava1.setCredits(5.0);
        System.out.println("Course: " + intJava1.getCourseName() + "\nCourseNumber: " + intJava1.getCourseNumber() +
                "\nCredits: " + intJava1.getCredits() + "\nPrerequisites: " + intJava1.getPrerequisites());
        
        System.out.println("");
        ProgrammingCourse intProg1 = new IntroToProgrammingCourse("Intro to Programming", "1001");
        intProg1.setCredits(4.0);
        System.out.println("Course: " + intProg1.getCourseName() + "\nCourseNumber: " + intProg1.getCourseNumber() +
                "\nCredits: " + intProg1.getCredits() + "\nPrerequisites: None");
    }
    
}
