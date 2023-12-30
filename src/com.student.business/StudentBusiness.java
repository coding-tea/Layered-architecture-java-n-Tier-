package com.student.business;

import com.student.dao.StudentDao;
import com.student.models.Student;
import java.io.FileWriter;
import java.io.IOException;

public class StudentBusiness extends Student implements StudentDao {

    @Override
    public void selectALL(){

    }

    @Override
    public void create(
        String cin,
        String name,
        int age,
    ){
         try {
            FileWriter myWriter = new FileWriter(".txt");
            myWriter.write(cin + "/" + name + "/" + age + "*" );
            myWriter.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }


}
