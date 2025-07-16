//teacher class is created
public class Teacher
{
    //attribute is created
    private int teacherId;
    private String teacherName;
    private String address;
    private String workingType;
    private String employmentStatus;
    private int workingHours;
    //Parameterized constructor is created
    public Teacher( int teacherId,String teacherName,String address,String workingType,String employmentStatus,int workingHours)
    {
        this.teacherId = teacherId;
        this.teacherName = teacherName;
        this.address = address;
        this.workingType = workingType;
        this.employmentStatus = employmentStatus;
        this.workingHours= workingHours;
    }
    //gettter or accessor method for attributes
    public int getTeacherId()
    {
        return teacherId;
    }
    public String getTeacherName()
    {
        return teacherName;
    }
    public String getAddress()
    {
        return address;
    }
    public String getWorkingType()
    {
        return workingType;
    }
    public String getEmploymentStatus()
    {
        return employmentStatus;
    }
    public int getWorkingHours()
    {
        return workingHours;
    }
    //mutator or setter method to set workinghours
    public void setWorkingHours(int newWorkingHours)
    {
        this.workingHours = newWorkingHours;
    }
    //method to display teachers details
    public void display()
    {
        System.out.println("Teacher Id="+this.teacherId);
        System.out.println("Teacher name="+this.teacherName);
        System.out.println("Address="+this.address);
        System.out.println("Working Type="+this.workingType);
        System.out.println("Employment Status="+this.employmentStatus);
        if(workingHours == 0)
        {
            System.out.println("Working Hours = WorkingHours is not assigned!");
        }
        else
        {
            System.out.println("Working Hours="+workingHours);
            
        }
    }
}