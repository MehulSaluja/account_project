package account_application;

import java.util.ArrayList;
import java.util.List;


public class Accounts {
	String Fname;
	String Lname;
	int accountnumber;
	
	public Accounts(String first, String last, int accountNo) {
		this.Fname=first;
		this.Lname=last;
		this.accountnumber=accountNo;
		
		
		// TODO Auto-generated constructor stub
	}
	Accounts()
	{
		
	}

	public String getFname() {
		return Fname;
	}
	public void setFname(String fname) {
		Fname = fname;
	}
	public String getLname() {
		return Lname;
	}
	public void setLname(String lname) {
		Lname = lname;
	}
	public int getAccountnumber() {
		return accountnumber;
	}
	public void setAccountnumber(int accountnumber) {
		this.accountnumber = accountnumber;
	}
	@Override
	public String toString() {
		return "account [Fname=" + Fname + ", Lname=" + Lname + ", accountnumber=" + accountnumber + "]";
	}

}
