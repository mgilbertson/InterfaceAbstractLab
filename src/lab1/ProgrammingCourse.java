/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package lab1;

import javax.swing.JOptionPane;

/**
 *
 * @author Mitch
 */
public abstract class ProgrammingCourse {
    private String courseName;
    private String courseNumber;
    public double credits;
    public String prerequisites;

    
    public String getCapitalizedCourseName() {
        return this.getCourseName().toUpperCase();
    }

    public String getCourseName() {
        return courseName;
    }

    public String getCourseNumber() {
        return courseNumber;
    }

    public double getCredits() {
        return credits;
    }

    public String getPrerequisites() {
        return prerequisites;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public final void setCourseNumber(String courseNumber) {
        if(courseNumber == null || courseNumber.length() == 0) {
            JOptionPane.showMessageDialog(null,
                    "Error: courseNumber cannot be null of empty string");
            System.exit(0);
        }
    this.courseNumber = courseNumber;
    }

    public abstract void setCredits(double credits);

    public abstract void setPrerequisites(String prerequisites);
    
    
    

}