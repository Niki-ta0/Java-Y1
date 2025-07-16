//lecturer is a sub class of teacher that inherits Teacher
public class Lecturer extends Teacher
{
    // additional attributes for Lecture class
    private String department;
    private int yearsOfExperience;
    private int gradedScore;
    private boolean hasGraded;
    //constructor with seven parameters is created
    public Lecturer( int teacherId,String teacherName,String address,String workingType,
    String employmentStatus,String department,int yearsOfExperience, int workingHours)
    {
        //a call is made to superclass constructor having five parameter
        super(teacherId,teacherName,address,workingType,employmentStatus,workingHours);
        this.department = department;
        this.yearsOfExperience = yearsOfExperience;
        this.gradedScore = gradedScore;
        this.hasGraded = false;
    }
    //accessor or getter method for lectures class attributes
    public String getDepartment()
    {
        return department;
    }
    public int getYearsOfExperience()
    {
        return yearsOfExperience;
    }
    public int getGradedScore()
    {
        return gradedScore;
    }
    public boolean getHasGraded()
    {
        return hasGraded;
    }
    //mutator or setter method for gradedScore attribute
    public void setGradedScore(int newGradedScore)
    {
        this.gradedScore = newGradedScore;
    }
    //method is created to grade assignment 
    public void gradeAssignment(int score,String Department,int YearsOfExperience)
    {
        if (!hasGraded && yearsOfExperience >= 5 && department.equals(Department))
        {
            setGradedScore(score);
            if (score >= 70) 
            {
                
                System.out.println("The grade is assigned to A");
            } 
            else if 
            (score >= 60) 
            {
                
                System.out.println("The grade is assigned to B");
            } 
            else if (score >= 50)
            {
                
                System.out.println("The grade is assigned to C");
            } 
            else if (score >= 40)
            {
                
                System.out.println("The garde is assigned to D");
            } 
            else 
            {
                
                System.out.println("The grade is assigned to E");
            }
            //mark the assignment has been graded
            hasGraded = true;
        }
        else
        {
            //print message if the lecturer can't grade assignment
            System.out.println("Assignment is not graded!");
        }
    }
    //method to display details of Lecturer
    public void display()
    {
        //calling display method from superclass Teacher
        super.display();
        System.out.println("Department="+this.department);
        System.out.println("Years of Experience="+this.yearsOfExperience);
        if (gradedScore != 0
        )
        {
            System.out.println("Graded Score="+ gradedScore);
        }
        else
        {
            System.out.println("Graded Score= Not graded yet");
        }
    }
}