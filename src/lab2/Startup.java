/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package lab2;

/**
 *
 * @author Mitch
 */
public class Startup {
    public static void main(String[] args) {
        lab1.ProgrammingCourse advJava1 = new lab1.AdvancedJavaCourse();
        advJava1.setCourseName("Advanced Java");
        advJava1.setCourseNumber("3001");
        advJava1.setPrerequisites("Intro to Java");
        advJava1.setCredits(4.0);
        System.out.println("Course: " + advJava1.getCourseName() + "\nCourseNumber: " + advJava1.getCourseNumber() +
                "\nCredits: " + advJava1.getCredits() + "\nPrerequisites: " + advJava1.getPrerequisites());
        
        System.out.println("");
        lab1.ProgrammingCourse intJava1 = new lab1.IntroJavaCourse();
        intJava1.setCourseName("Intro to Java");
        intJava1.setCourseNumber("2001");
        intJava1.setPrerequisites("Intro to Programming");
        intJava1.setCredits(5.0);
        System.out.println("Course: " + intJava1.getCourseName() + "\nCourseNumber: " + intJava1.getCourseNumber() +
                "\nCredits: " + intJava1.getCredits() + "\nPrerequisites: " + intJava1.getPrerequisites());
        
        System.out.println("");
        lab1.ProgrammingCourse intProg1 = new lab1.IntroToProgrammingCourse();
        intProg1.setCourseName("Intro to Java");
        intProg1.setCourseNumber("2001");
        intProg1.setCredits(4.0);
        System.out.println("Course: " + intProg1.getCourseName() + "\nCourseNumber: " + intProg1.getCourseNumber() +
                "\nCredits: " + intProg1.getCredits() + "\nPrerequisites: None");
    }
}
