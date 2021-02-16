package com.tt.sesha;

public class StudentEx implements Comparable<StudentEx>{

	
		private int StudentId;
		private String StudentFName;
		private String StudentLName;
		private int StudentClass;
		public StudentEx(int studentId, String studentFName, String studentLName, int studentClass) {
			super();
			StudentId = studentId;
			StudentFName = studentFName;
			StudentLName = studentLName;
			StudentClass = studentClass;
		}
		public int getStudentId() {
			return StudentId;
		}
		public void setStudentId(int studentId) {
			StudentId = studentId;
		}
		public String getStudentFName() {
			return StudentFName;
		}
		public void setStudentFName(String studentFName) {
			StudentFName = studentFName;
		}
		public String getStudentLName() {
			return StudentLName;
		}
		public void setStudentLName(String studentLName) {
			StudentLName = studentLName;
		}
		public int getStudentClass() {
			return StudentClass;
		}
		public void setStudentClass(int studentClass) {
			StudentClass = studentClass;
		}
		@Override
		public int compareTo(StudentEx o) {
			 return this.StudentLName.compareTo(o.StudentLName);
		   
		    
			
		}
		
	
}
