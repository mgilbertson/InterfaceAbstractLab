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
public interface ProgrammingCourse {
    public abstract String getCourseName();
    public abstract void setCourseName();
    public abstract String getCourseNumber();
    public abstract void setCourseNumber();
    public abstract double getCredits();
    public abstract void setCredits();
    public abstract String getPrerequisites();
    public abstract void setPrerequisites();
}
