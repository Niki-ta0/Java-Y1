import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.Color;
import java.util.ArrayList;



public class TeacherGUI
{
    private JFrame jf;
    private JPanel jp1, jp;
    private JLabel jl1, jl2, jl3, j1, j2, j3, j4, j5, j6, j7, j8, j9,
    j10,j11, j12,j13, j14, j15, j16, j17, j18, j19, j20, j21, j22;
    private JTextField  f1, f2, f3, f4, f5, f6, f7, f8, f9, f10,
    f11, f12,f13, f14, f15, f16, f17, f18, f19, f20, f21, f22;
    private JButton b, b1, b2, b3, b4, b5, b6, b7;
    
    ArrayList<Teacher> arrayy= new ArrayList<Teacher>();
    
    public void GUI()
    {
        JFrame jf=new JFrame("23047392_NikitaGUI");//object is created 
        jf.setLayout(null);//for positioning
        jf.setSize(850,775);//seting size breadth then height
        
        
        Color c= new Color(143, 172, 180);
        Color bc=new Color(245, 245, 245);
        Color no=new Color(248,124,124);
        
        JPanel jp1=new JPanel();
        jp1.setBounds(0,0,850,350);
        jp1.setBackground(c);
        jp1.setLayout(null);
        jf.add(jp1);

        JLabel Jl1=new JLabel("Lecturer");//label JL1 is made
        Jl1.setBounds(370,5,50,30);//right, down, length and height
        jp1.add(Jl1);// add in l1
        
        JLabel l=new JLabel("Teacher ID:");
        l.setBounds(10,50,100,25);
        jp1.add(l);
        
        JTextField f=new JTextField();//textfield f is created
        f.setBounds(160,50,150,25);//right, down, length and height
        jp1.add(f);//added f in jf
        
        JLabel l1=new JLabel("Teacher Name:");
        l1.setBounds(10,80,100,25);
        jp1.add(l1);
        
        JTextField f1=new JTextField();
        f1.setBounds(160,80,150,25);
        jp1.add(f1);
        
        JLabel l2=new JLabel("Address:");
        l2.setBounds(10,110,100,25);
        jp1.add(l2);
        
        JTextField f2=new JTextField();
        f2.setBounds(160,110,150,25);
        jp1.add(f2);
    
        JLabel l3=new JLabel("Working Type:");
        l3.setBounds(10,140,100,25);
        jp1.add(l3);
        
        JTextField f3=new JTextField();
        f3.setBounds(160,140,150,25);
        jp1.add(f3);
        
        JLabel l4=new JLabel("Working Hours");
        l4.setBounds(500,140,150,25);
        jp1.add(l4);
        
        JTextField f4=new JTextField();
        f4.setBounds(650,140,150,25);
        jp1.add(f4);
        
        
        JLabel l5=new JLabel("Employment Status:");
        l5.setBounds(500,50,150,25);
        jp1.add(l5);
        
        JTextField f5=new JTextField();
        f5.setBounds(650,50,150,25);
        jp1.add(f5);
        
        JLabel l6=new JLabel("Department:");
        l6.setBounds(500,80,100,25);
        jp1.add(l6);
        
        JTextField f6=new JTextField();
        f6.setBounds(650,80,150,25);
        jp1.add(f6);
        
        JLabel l7=new JLabel("Year Of Experience:");
        l7.setBounds(500,110,150,25);
        jp1.add(l7);
        
        JTextField f7=new JTextField();
        f7.setBounds(650,110,150,25);
        jp1.add(f7);
        
        JLabel Jl3=new JLabel("Grade Assignment");//label JL1 is made
        Jl3.setBounds(350,200,150,30);//right, down, length and height
        jp1.add(Jl3);// add in l1
               
        JLabel l8=new JLabel("Graded Score:");
        l8.setBounds(500,230,150,25);
        jp1.add(l8);
        
        JTextField f8=new JTextField();
        f8.setBounds(650,230,150,25);
        jp1.add(f8);
        
        JLabel l9=new JLabel("New Teacher Id:");
        l9.setBounds(10,230,150,25);
        jp1.add(l9);
        
        JTextField f9=new JTextField();
        f9.setBounds(160,230,150,25);
        jp1.add(f9);
        
        JLabel l23=new JLabel("YearsOfExperience:");
        l23.setBounds(500,270,150,25);
        jp1.add(l23);
        
        JTextField f23=new JTextField();
        f23.setBounds(650,270,150,25);
        jp1.add(f23);
        
        JLabel l24=new JLabel("department:");
        l24.setBounds(10,270,150,25);
        jp1.add(l24);
        
        JTextField f24=new JTextField();
        f24.setBounds(160,270,150,25);
        jp1.add(f24);
        
        JButton b=new JButton("Add Lecturer");
        b.setBounds(160,180,150,20);
        b.setBackground(bc);
        jp1.add(b);
        
        JButton b2=new JButton("gradeAssignment");
        b2.setBounds(160,320,150,20);
        b2.setBackground(bc);
        jp1.add(b2);
        
        JButton b1=new JButton("Display");//Button b is created
        b1.setBounds(500,180,100,20);//right, down, left, right
        b1.setBackground(bc);//backgroud color is set
        jp1.add(b1);
        
        JButton b3=new JButton("Clear");
        b3.setBounds(500,320,100,20);
        b3.setBackground(bc);
        jp1.add(b3);
        
        
        b.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent ni)
            {
                try
                {
                    if(f.getText().isEmpty() || f1.getText().isEmpty() || f2.getText().isEmpty() || f3.getText().isEmpty() 
                    || f4.getText().isEmpty()|| f5.getText().isEmpty() ||f6.getText().isEmpty() || f7.getText().isEmpty())
                    {
                        b.setBackground(no);
                        JOptionPane.showMessageDialog(null, "Fill in the text field");
                    }
                    else if (!f1.getText().matches("[a-zA-Z ]+") ||!f2.getText().matches("[a-zA-Z ]+") ||!f3.getText().matches("[a-zA-Z ]+")
                    ||!f5.getText().matches("[a-zA-Z ]+") ||!f6.getText().matches("[a-zA-Z ]+"))
                    {
                        b.setBackground(no);
                        JOptionPane.showMessageDialog(null, "Invalid input. Only letters are allowed.");
                    }
                    else
                    {
                        //integer ma convert handinxw-step 1 
                        b.setBackground(Color.PINK);
                        int teacherId=Integer.parseInt(f.getText());
                        String teacherName= f1.getText();
                        String address= f2.getText();
                        String workingType= f3.getText();
                        String employmentStatus= f5.getText();
                        String department= f6.getText();
                        int yearsOfExperience=Integer.parseInt(f7.getText()); 
                        int workingHours= Integer.parseInt(f4.getText());
                    
                        Lecturer lobj = new Lecturer(teacherId,teacherName,address,workingType, employmentStatus,department,yearsOfExperience,workingHours);
                
                        arrayy.add(lobj);
    
                        JOptionPane.showMessageDialog(null, "Data is added successfully");   
                    }
                }
                catch(NumberFormatException ne)
                {
                    JOptionPane.showMessageDialog(null, "Number Format exception!Please insert integer.");
                }
            }
        });
        
        
        //actionfor display
        b1.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent ni)
            {
                b1.setBackground(Color.PINK);  
                for (Teacher  teacher: arrayy)
                {
                    if (teacher instanceof Lecturer)
                    {
                        Lecturer L1=(Lecturer) teacher;
                        L1.display();
                        JOptionPane.showMessageDialog(null, "Data is displayed");
                        System.out.println("\n");
                    }
                }  
            }
        });
        
        //GRADE Assignment 
        b2.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent ni)
            {
                try
                {
                    if(f.getText().isEmpty() || f9.getText().isEmpty() ||f8.getText().isEmpty() ||f23.getText().isEmpty()
                    || f24.getText().isEmpty())
                    {
                        b.setBackground(no);
                        JOptionPane.showMessageDialog(null, "Fill in the text field");
                    }
                    else
                    {
                        //Converts into integer
                        int newteacherId=Integer.parseInt(f9.getText());
                        int score = Integer.parseInt(f8.getText());
                        int YearsOfExperience = Integer.parseInt(f23.getText());
                        String Department=f24.getText();
                        for (Teacher teacher: arrayy) 
                        {
                            if(teacher instanceof Lecturer && teacher.getTeacherId()==newteacherId 
                            && ((Lecturer)teacher).getDepartment().equals(Department))
                            {
                                b2.setBackground(Color.PINK);
                                //downcasting
                                Lecturer L1=(Lecturer) teacher;
                                L1.gradeAssignment(score,Department,YearsOfExperience);
                                JOptionPane.showMessageDialog(null, "Your scores has been graded sucessfull");
                            }
                            else
                            {
                                JOptionPane.showMessageDialog(null, "The new input value must match from array list");
                            }
                        }
                    }
                }
                catch(Exception ne)
                {
                    f24.setText("");
                    f8.setText("");
                    f23.setText("");
                    JOptionPane.showMessageDialog(null,"Number Format exception!Please insert integer.");
                }
            }
        });

        //actionfor clear button
        b3.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent ni)
            {
                b3.setBackground(Color.PINK);
                f.setText("");
                f1.setText("");
                f2.setText("");
                f3.setText("");
                f4.setText("");
                f5.setText("");
                f6.setText("");
                f7.setText("");
                f8.setText("");
                f9.setText("");
                f23.setText("");
                f24.setText("");
                
                JOptionPane.showMessageDialog(null, "All data are cleared");
            }
        });
        
        //JPanel for Tutor class is created
        
        JPanel jp=new JPanel();
        jp.setBounds(0,340,850,400);
        jp.setBackground(Color.LIGHT_GRAY);
        jp.setLayout(null);
        jf.add(jp);
        
        JLabel Jl2=new JLabel("Tutor");
        Jl2.setBounds(360,5,100,30);
        jp.add(Jl2);
        
        JLabel l10=new JLabel("Teacher ID:");
        l10.setBounds(30,70,100,25);
        jp.add(l10);
        
        JTextField f10=new JTextField();
        f10.setBounds(180,70,150,25);
        jp.add(f10);
        
        JLabel l11=new JLabel("Teacher Name:");
        l11.setBounds(30,100,100,25);
        jp.add(l11);
        
        JTextField f11=new JTextField();
        f11.setBounds(180,100,150,25);
        jp.add(f11);
        
        JLabel l12=new JLabel("Address:");
        l12.setBounds(30,130,100,25);
        jp.add(l12);
        
        JTextField f12=new JTextField();
        f12.setBounds(180,130,150,25);
        jp.add(f12);
    
        JLabel l13=new JLabel("Working Type:");
        l13.setBounds(30,160,100,25);
        jp.add(l13);
        
        JTextField f13=new JTextField();
        f13.setBounds(180,160,150,25);
        jp.add(f13);
        
        JLabel l14=new JLabel("Employment Status :");
        l14.setBounds(30,190,150,25);
        jp.add(l14);
        
        JTextField f14=new JTextField();
        f14.setBounds(180,190,150,25);
        jp.add(f14);
        
        
        JLabel l15=new JLabel("Salary:");
        l15.setBounds(460,70,100,25);
        jp.add(l15);
        
        JTextField f15=new JTextField();
        f15.setBounds(625,70,150,25);
        jp.add(f15);
        
        JLabel l16=new JLabel("Specialization:");
        l16.setBounds(460,100,100,25);
        jp.add(l16);
        
        JTextField f16=new JTextField();
        f16.setBounds(625,100,150,25);
        jp.add(f16);
        
        JLabel l17=new JLabel("Academic Qualification:");
        l17.setBounds(460,130,150,25);
        jp.add(l17);
        
        JTextField f17=new JTextField();
        f17.setBounds(625,130,150,25);
        jp.add(f17);
        
        JLabel l18=new JLabel("Performance Index:");
        l18.setBounds(460,160,150,25);
        jp.add(l18);
        
        JTextField f18=new JTextField();
        f18.setBounds(625,160,150,25);
        jp.add(f18);
        
        JLabel l19=new JLabel("Working Hours:");
        l19.setBounds(460,190,150,25);
        jp.add(l19);
        
        JTextField f19=new JTextField();
        f19.setBounds(625,190,150,25);
        jp.add(f19);
        
        JLabel l20=new JLabel("New Salary:");
        l20.setBounds(580,275,150,25);
        jp.add(l20);
        
        JTextField f20=new JTextField();
        f20.setBounds(655,275,150,25);
        jp.add(f20);
        
        JLabel l21=new JLabel("New Performance Index:");
        l21.setBounds(20,275,150,25);
        jp.add(l21);
        
        JTextField f21=new JTextField();
        f21.setBounds(170,275,150,25);
        jp.add(f21);
        
        JLabel l22=new JLabel("New Teacher ID:");
        l22.setBounds(300,310,150,25);
        jp.add(l22);
        
        JTextField f22=new JTextField();
        f22.setBounds(420,310,150,25);
        jp.add(f22);
        
        JButton b4=new JButton("Add Tutor");
        b4.setBounds(140,230,120,20);
        b4.setBackground(bc);
        jp.add(b4);
        
        JButton b5=new JButton("Display");
        b5.setBounds(560,230,120,20);
        b5.setBackground(bc);
        jp.add(b5);
        
        JButton b6=new JButton("Remove Tutor");
        b6.setBounds(140,350,120,20);
        b6.setBackground(bc);
        jp.add(b6);
        
        JButton b7=new JButton("Clear");
        b7.setBounds(370,350,100,20);
        b7.setBackground(bc);
        jp.add(b7);
        
        JButton b8=new JButton("Set Slary");
        b8.setBounds(560,350,120,20);
        b8.setBackground(bc);
        jp.add(b8);
        
        b4.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent ni)
            {
                try
                {    
                    if(f10.getText().isEmpty() || f11.getText().isEmpty() || f12.getText().isEmpty() || f13.getText().isEmpty() || f14.getText().isEmpty()
                    || f15.getText().isEmpty() ||f16.getText().isEmpty() || f17.getText().isEmpty() ||f18.getText().isEmpty() ||f19.getText().isEmpty() )
                    {
                        b4.setBackground(no);
                        JOptionPane.showMessageDialog(null, "Please fill in the text field");
                    }
                    if (!f11.getText().matches("[a-zA-Z ]+") || !f12.getText().matches("[a-zA-Z ]+") ||!f13.getText().matches("[a-zA-Z ]+") 
                    || !f14.getText().matches("[a-zA-Z ]+") || !f16.getText().matches("[a-zA-Z ]+") ||!f17.getText().matches("[a-zA-Z ]+")  )
                    {
                        b4.setBackground(no);
                        JOptionPane.showMessageDialog(null, "Invalid input. Only letters are allowed.");
                    }
                    else
                    {
                        //integer ma convert handinxw-step 1
                        b4.setBackground(Color.PINK);
                        int teacherId=Integer.parseInt(f10.getText());
                        String teacherName= f11.getText();
                        String address= f12.getText();
                        String workingType= f13.getText();
                        String employmentStatus= f14.getText();
                        double salary=Integer.parseInt(f15.getText());
                        String specialization= f16.getText(); 
                        String academicQualification= f17.getText(); 
                        int performanceIndex= Integer.parseInt(f18.getText());
                        int workingHours= Integer.parseInt(f19.getText());
                    
                        Tutor tobj = new Tutor(teacherId,teacherName,address,
                        workingType,employmentStatus,workingHours,salary,specialization,academicQualification,performanceIndex);
                    
                        arrayy.add(tobj);
                    
                        JOptionPane.showMessageDialog(null, "Data is added successfully.");
                    }
                }
                catch(NumberFormatException e)
                {
                    JOptionPane.showMessageDialog(null, "Number Format exception!Please insert integer.");
                }
            }
        });
        
        
        
        //for display button
        b5.addActionListener(new ActionListener()
        {   
            public void actionPerformed(ActionEvent ni)
            {  
                for (Teacher  t: arrayy)
                {
                    b5.setBackground(Color.PINK);
                    if(t instanceof Tutor)
                    {
                        Tutor t1=(Tutor)t;
                        t1.display();
                        JOptionPane.showMessageDialog(null, "Data is displayed");
                        System.out.print("\n");
                    }
                }
            }
        });
        //button to remove tutor
        b6.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent ni)
            {
                try
                {
                    if(f10.getText().isEmpty() || f15.getText().isEmpty() ||f16.getText().isEmpty() || f17.getText().isEmpty()
                    ||f18.getText().isEmpty() ||f22.getText().isEmpty() )
                    {
                        b6.setBackground(no);
                        JOptionPane.showMessageDialog(null, "Please fill in the text field");
                    }
                    if ( !f16.getText().matches("[a-zA-Z ]+") ||!f17.getText().matches("[a-zA-Z ]+")  )
                    {
                        b6.setBackground(no);
                        JOptionPane.showMessageDialog(null, "Invalid input. Only letters are allowed.");
                    }
                    else
                    {
                        //conveert into integer
                        b6.setBackground(Color.PINK);
                        int teacherId=Integer.parseInt(f10.getText());
                        double salary=Integer.parseInt(f15.getText());
                        String specialization= f16.getText(); 
                        String academicQualification= f17.getText(); 
                        int performanceIndex= Integer.parseInt(f18.getText());
                        int newteacherId=Integer.parseInt(f22.getText());
                        
                        for (Teacher  t: arrayy )
                        {
                            b6.setBackground(Color.PINK);
                            if(t instanceof Tutor && teacherId==newteacherId)
                            {
                                Tutor t1=(Tutor)t;
                                t1.removeTutor();
                                JOptionPane.showMessageDialog(null, "Removal is done");
                            }
                            else
                            {
                                JOptionPane.showMessageDialog(null, "Teacher id must be same");
                            }
                        }
                    }
                }
                catch(NumberFormatException e)
                {
                    JOptionPane.showMessageDialog(null, "Number Format exception!Please insert integer.");
                }
            }
        });
        
        
        //kjggdfggfiu
        b8.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent ni)
            {
                try
                 {
                    if(f10.getText().isEmpty() || f20.getText().isEmpty() 
                    ||f21.getText().isEmpty() ||f22.getText().isEmpty() )
                    {
                        b8.setBackground(no);
                        JOptionPane.showMessageDialog(null, "Please fill in the text field");
                    }
                    if ( !f16.getText().matches("[a-zA-Z ]+") ||!f17.getText().matches("[a-zA-Z ]+")  )
                    {
                        b8.setBackground(no);
                        JOptionPane.showMessageDialog(null, "Invalid input. Only letters are allowed.");
                    }
                    else
                    { 
                        //conveert into integer
                        b8.setBackground(Color.PINK);
                        double newsalary=Integer.parseInt(f20.getText()); 
                        int newPerformanceIndex= Integer.parseInt(f21.getText());
                        int newteacherId=Integer.parseInt(f22.getText());
                        for (Teacher  t: arrayy )
                        {
                            if(t instanceof Tutor && t.getTeacherId()==newteacherId)
                            {
                                Tutor t1=(Tutor)t;
                                t1.setSalaryAndCertification(newsalary,newPerformanceIndex);
                                JOptionPane.showMessageDialog(null, "Salary is set");
                            }
                            else
                            {
                                JOptionPane.showMessageDialog(null, "Teacher id must be same");
                            }
                        }
                    }
                }
                catch(NumberFormatException e)
                {
                    JOptionPane.showMessageDialog(null, "Number Format exception!Please insert integer.");
                }
            }
        });
        
        //actionfor clear button
        b7.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent ni)
            {
                b7.setBackground(Color.PINK);
                f10.setText("");
                f11.setText("");
                f12.setText("");
                f13.setText("");
                f14.setText("");
                f15.setText("");
                f16.setText("");
                f17.setText("");
                f18.setText("");
                f19.setText("");
                f20.setText("");
                f21.setText("");
                f22.setText("");
                JOptionPane.showMessageDialog(null, "All datas are cleared");
            }
        });
        jf.setVisible(true);//invisible is made visible
    }
    public static void main (String [] args)
    {
        
        TeacherGUI obj = new TeacherGUI();
        obj.GUI();
    }
    
}