//tutor is subclass of lecturer
public class Tutor extends Teacher
{
    //Additional attribute is created
    private double salary;
    private String specialization;
    private String academicQualification;
    private int performanceIndex;
    private boolean isCertified;
    //parameterized constructor is created
    public Tutor(int teacherId,String teacherName,String address,String workingType,String employmentStatus
    ,int workingHours,double salary,String specialization,String academicQualification,int performanceIndex)
    {
        super(teacherId,teacherName,address,workingType,employmentStatus,workingHours);
        this.salary = salary;
        this.specialization = specialization;
        this.academicQualification = academicQualification;
        this.performanceIndex = performanceIndex;
        this.isCertified = false;
    }
    //accessor method
    public double getSalary()
    {
        return salary;
    }
    public String getSpecialization()
    {
        return specialization;
    }
    public String getAcademicQualification()
    {
        return academicQualification;
    }
    public int getPerformanceIndex()
    {
        return performanceIndex;
    }
    public boolean isCertified()
    {
        return isCertified;
    }
    //setter method to set new salary
    public void setSalaryAndCertification(double newsalary, int newPerformanceIndex)
    {
        
        if (newPerformanceIndex > 5 && getWorkingHours() > 20)
        {
            double appraisalPercentage;
            performanceIndex= newPerformanceIndex;
            if (newPerformanceIndex >= 5 && newPerformanceIndex <= 7) 
            {
                appraisalPercentage = 0.05;
            } 
            else if (newPerformanceIndex >= 8 && newPerformanceIndex <= 9)
            {
                appraisalPercentage = 0.1;
            }
            else
            {
                appraisalPercentage = 0.2;
            }

            salary = newsalary + (appraisalPercentage * newsalary);
            isCertified = true;
        }
        else
        {
            System.out.println("Salary is not approved. Tutor is not certified yet.");
        }  
    }
    //method to remove tutor
    public void removeTutor()
    {
        if(isCertified)
        {
            //Setting attributes to zero
            salary=0;
            specialization= "";
            academicQualification="";
            performanceIndex=0;
            //isCertified=false;
            System.out.println("Tutor has been removed Successfully");
        }
        else
        {
            System.out.println("Tutor has been certified.Removal is not allowed");
        }
    }
    //method to display details of the  tutor
    public void display()
    {
        super.display();
        if(isCertified)
    
        {
            System.out.println("Salary=" +salary);
            System.out.println("Specialization:"+specialization);
            System.out.println("Academic Qualification="+academicQualification);
            System.out.println("Performance Index="+performanceIndex);
        }
        else
        {
            System.out.println("Tutor has not been certified.");

        }
    }
}