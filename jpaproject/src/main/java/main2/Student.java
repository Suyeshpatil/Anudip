package main2;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Student {

		private long studentId;
		
		
		private String fname;
		private String lname;
		private String contact;
		@Id
		public long getStudentId() {
			return studentId;
		}
		public void setStudentId(long studentId) {
			this.studentId = studentId;
		}
		public String getFname() {
			return fname;
		}
		public void setFname(String fname) {
			this.fname = fname;
		}
		public String getLname() {
			return lname;
		}
		public void setLname(String lname) {
			this.lname = lname;
		}
		public String getContact() {
			return contact;
		}
		public void setContact(String contact) {
			this.contact = contact;
		}
		@Override
		public String toString() {
			return "Student [studentId=" + studentId + ", fname=" + fname + ", lname=" + lname + ", contact=" + contact
					+ "]";
		}
}
