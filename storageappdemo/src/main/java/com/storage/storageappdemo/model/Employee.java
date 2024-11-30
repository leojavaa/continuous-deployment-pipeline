package com.storage.storageappdemo.model;

import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("employee")
public class Employee {
    
	@Id
    private String id;
    private String firstName;
    private String lastName;
    private String email;
    private String department;
    private double salary;
    private Date hireDate;
    private String status;
    private int managerId;
    private Date dob;
    private String phoneNumber;
    private String address;
    private String gender;
    private String nationality;
    private double bonusPercentage;
    
    // Default constructor
    public Employee() {
    }

    // Constructor with all fields
    public Employee(String id, String firstName, String lastName, String email, String department, 
                    double salary, Date hireDate, String status, int managerId, Date dob, 
                    String phoneNumber, String address, String gender, String nationality, 
                    double bonusPercentage) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.department = department;
        this.salary = salary;
        this.hireDate = hireDate;
        this.status = status;
        this.managerId = managerId;
        this.dob = dob;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.gender = gender;
        this.nationality = nationality;
        this.bonusPercentage = bonusPercentage;
    }

    // Getters and Setters
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Date getHireDate() {
        return hireDate;
    }

    public void setHireDate(Date hireDate) {
        this.hireDate = hireDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getManagerId() {
        return managerId;
    }

    public void setManagerId(int managerId) {
        this.managerId = managerId;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public double getBonusPercentage() {
        return bonusPercentage;
    }

    public void setBonusPercentage(double bonusPercentage) {
        this.bonusPercentage = bonusPercentage;
    }

    @Override
    public String toString() {
        return "Employee [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", email=" + email
                + ", department=" + department + ", salary=" + salary + ", hireDate=" + hireDate + ", status=" + status
                + ", managerId=" + managerId + ", dob=" + dob + ", phoneNumber=" + phoneNumber + ", address=" + address
                + ", gender=" + gender + ", nationality=" + nationality + ", bonusPercentage=" + bonusPercentage + "]";
    }

//    public static void main(String[] args) {
//        // Example of creating and printing 15 employee instances
//        Employee[] employees = new Employee[15];
//
//        for (int i = 0; i < 15; i++) {
//            employees[i] = new Employee(
//                i + 1, // id
//                "FirstName" + (i + 1), // first name
//                "LastName" + (i + 1), // last name
//                "email" + (i + 1) + "@company.com", // email
//                "Department" + (i % 3 + 1), // department
//                50000 + (i * 1000), // salary
//                new Date(), // hire date
//                "active", // status
//                (i % 3 + 1), // manager id
//                new Date(), // dob
//                "123-456-7890", // phone number
//                "Address " + (i + 1), // address
//                (i % 2 == 0) ? "Male" : "Female", // gender
//                "Country" + (i % 5 + 1), // nationality
//                10.0 + (i % 5) // bonus percentage
//            );
//            System.out.println(employees[i]);
//        }
//    }
}