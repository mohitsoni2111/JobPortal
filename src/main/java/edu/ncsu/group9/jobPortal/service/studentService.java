package edu.ncsu.group9.jobPortal.service;

import edu.ncsu.group9.jobPortal.dao.studentDao;
import edu.ncsu.group9.jobPortal.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class studentService {

    @Autowired
    studentDao studentDao;

//    @Override
//    public void insertEmploye(Employee employee) {
//        employeeDao.insertEmployee(employee);
//    }
//
//    @Override
//    public void insertEmployees(List<Employee> employees) {
//        employeeDao.insertEmployees(employees);
//    }
//
//    public void getAllEmployees() {
//        List<Employee> employees = employeeDao.getAllEmployees();
//        for (Employee employee : employees) {
//            System.out.println(employee.toString());
//        }
//    }
//
//    @Override
//    public void getEmployeeById(String empId) {
//        Employee employee = employeeDao.getEmployeeById(empId);
//        System.out.println(employee);
//    }
}
