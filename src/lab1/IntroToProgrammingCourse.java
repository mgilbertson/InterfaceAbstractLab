package lab1;



/**
 * Describe responsibilities here. NOTE: this class has NO PREREQUISITES!
 * Do not change this fact.
 *
 * @author      your name goes here
 * @version     1.00
 */
public class IntroToProgrammingCourse extends ProgrammingCourse {
    private String prerequisites = "none";

    public IntroToProgrammingCourse(String courseName, String courseNumber) {
        super(courseName, courseNumber);
    }
    
    public String getPrerequisites(){
        return prerequisites;
    }
    public void setPrerequisites(String prerequisites){
        this.prerequisites = prerequisites;
    }
}