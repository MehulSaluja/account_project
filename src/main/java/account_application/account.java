package account_application;

public class account 
{
	String Fname;
	String Lname;
	int accountnumber;
	
	public account(String first, String last) {
		this.Fname=first;
		this.Lname=last;
		
		
		// TODO Auto-generated constructor stub
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
