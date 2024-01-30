package com.hexaware.test_core_spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.hexaware.test_core_spring.entity.School;
import com.hexaware.test_core_spring.entity.Student;

/**
 * Hello world!
 *
 */
public class App 
{
//	@Autowired
//	static School school;
	 //-> inside main methd autowired is not applicable cuz main mthd is static
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        
       // School s1 = context.getBean(School.class);
        
      //  s1.setSchoolName("NVIS");
      //  s1.setType("CBSE");
        
        Student stu1 = context.getBean(Student.class);
        stu1.setSname("Student1");
        stu1.setRole(48);
//        stu1.setSchool(s1);
        System.out.println(stu1);
        
//        Student stu2 = context.getBean(Student.class);
//        
//        System.out.println(stu2);
//        
//        Student s3 = new Student(2,"student2",school);
//        System.out.println(s3);
    }
}
