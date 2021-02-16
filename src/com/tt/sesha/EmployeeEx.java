package com.tt.sesha;


public class EmployeeEx  {
 private int EmpId;
 private String EmpName;
 Double EmpSalary;
 private String EmpCompany;
public int getEmpId() {
	return EmpId;
}
public EmployeeEx(int empId, String empName, double empSalary, String empCompany) {
	super();
	EmpId = empId;
	EmpName = empName;
	EmpSalary = empSalary;
	EmpCompany = empCompany;
}
public void setEmpId(int empId) {
	EmpId = empId;
}
public String getEmpName() {
	return EmpName;
}
public void setEmpName(String empName) {
	EmpName = empName;
}
public Double getEmpSalary() {
	return EmpSalary;
}
public void setEmpSalary(Double empSalary) {
	EmpSalary = empSalary;
}
public String getEmpCompany() {
	return EmpCompany;
}
public void setEmpCompany(String empCompany) {
	EmpCompany = empCompany;
}



}
