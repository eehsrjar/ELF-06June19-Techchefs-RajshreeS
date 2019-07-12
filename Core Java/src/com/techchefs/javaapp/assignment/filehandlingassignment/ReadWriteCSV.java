package com.techchefs.javaapp.assignment.filehandlingassignment;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class ReadWriteCSV {
private static final String COMMA_DELIMITER = ",";
    
    public static void main(String args[])
    {
        BufferedReader br = null;
        try
        {
            //Reading the csv file
            br = new BufferedReader(new FileReader("Employee.csv"));
            
            //Create List for holding Employee objects
            List<Employee> empList = new ArrayList<Employee>();
            
            String line = "";
            //Read to skip the header
            br.readLine();
            //Reading from the second line
            while ((line = br.readLine()) != null) 
            {
                String[] employeeDetails = line.split(COMMA_DELIMITER);
                
                if(employeeDetails.length > 0 )
                {
                    //Save the employee details in Employee object
                    Employee emp = new Employee(employeeDetails[0],Integer.parseInt(employeeDetails[1]),
                            Double.parseDouble(employeeDetails[2]), Integer.parseInt(employeeDetails[3]),employeeDetails[4]);
                    empList.add(emp);
                }
            }
            
            //Lets print the Employee List
            for(Employee e : empList)
            {
                System.out.println(e.getId()+"   "+e.getName()+"   "
                		+e.getSalary()+"   "+e.getExperience()+" "+e.getDesignation());
            }
        }
        catch(Exception ee)
        {
            ee.printStackTrace();
        }
       }
}



