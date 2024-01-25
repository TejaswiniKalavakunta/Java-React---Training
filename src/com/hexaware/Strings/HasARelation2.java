package com.hexaware.Strings;

import java.util.Arrays;

class EmployeeC{
    private String employeeName;
    private int employeeId;
    private int age;
    private String role;

    public EmployeeC(String employeeName, int employeeId, int age, String role) {
        this.employeeName = employeeName;
        this.employeeId = employeeId;
        this.age = age;
        this.role = role;
    }

    
    
    public String getEmployeeName() {
		return employeeName;
	}



	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}



	public int getEmployeeId() {
		return employeeId;
	}



	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}



	public int getAge() {
		return age;
	}



	public void setAge(int age) {
		this.age = age;
	}



	public String getRole() {
		return role;
	}



	public void setRole(String role) {
		this.role = role;
	}



	@Override
    public String toString() {
        return "Employee{" +
                "employeeName='" + employeeName + '\'' +
                ", employeeId=" + employeeId +
                ", age=" + age +
                ", role='" + role + '\'' +
                '}';
    }
}

class CompanyC {
    private String companyName;
    private String industryType;
    private EmployeeC[] employees;

    public CompanyC(String companyName, String industryType, EmployeeC[] employees) {
        this.companyName = companyName;
        this.industryType = industryType;
        this.employees = employees;
    }
    
    

    public String getCompanyName() {
		return companyName;
	}



	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}



	public String getIndustryType() {
		return industryType;
	}



	public void setIndustryType(String industryType) {
		this.industryType = industryType;
	}



	public EmployeeC[] getEmployees() {
		return employees;
	}



	public void setEmployees(EmployeeC[] employees) {
		this.employees = employees;
	}
	

	@Override
	public String toString() {
		return "CompanyC [companyName=" + companyName + ", industryType=" + industryType + ", employees="
				+ Arrays.toString(employees) + "]";
	}





	public void printEmployeeDetails() {
        System.out.println("Company: " + companyName);
        System.out.println("Industry Type: " + industryType);
        System.out.println("Employees:");

        for (EmployeeC employee : employees) {
            System.out.println(employee);
        }
    }
}

public class HasARelation2 {
	public static void main(String[] args) {
        // Create Employee objects
        EmployeeC employee1 = new EmployeeC("John Doe", 101, 30, "Developer");
        EmployeeC employee2 = new EmployeeC("Jane Smith", 102, 25, "Tester");
        EmployeeC employee3 = new EmployeeC("Bob Johnson", 201, 35, "Manager");
        EmployeeC employee4 = new EmployeeC("Alice Brown", 202, 28, "Analyst");

        // Create an array of Employee objects
        EmployeeC[] employees = {employee1, employee2, employee3, employee4};

        // Create Company object with employees
        CompanyC company = new CompanyC("ABC Corp", "Technology", employees);

        // Print Company details along with employee details
        company.printEmployeeDetails();
    }

}
