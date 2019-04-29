package model;

public class Customer {

	private int customerID;
	private String userName;
	private String passWord;
	private String fName;
	private String lName;
	private String mInitial;
	private String emailAddress;
	private int age;
	private int phone;
	private String email;
	
	public Customer() {
		this.customerID = 1;
		this.userName = "";
		this.passWord = "";
		this.fName = "";
		this.lName = "";
		this.mInitial = "";
		this.emailAddress = "";
		this.age = 0;
		this.phone = 0;
		this.email = "";
	}

	public Customer(int customerID, String userName, String passWord, String fName, String lName, String mInitial,
			String emailAddress, int age, int phone, String email) {
		this.customerID = customerID;
		this.userName = userName;
		this.passWord = passWord;
		this.fName = fName;
		this.lName = lName;
		this.mInitial = mInitial;
		this.emailAddress = emailAddress;
		this.age = age;
		this.phone = phone;
		this.email = email;
	}

	/**
	 * @return the customerID
	 */
	public int getCustomerID() {
		return customerID;
	}

	/**
	 * @param customerID the customerID to set
	 */
	public void setCustomerID(int customerID) {
		this.customerID = customerID;
	}

	/**
	 * @return the userName
	 */
	public String getUserName() {
		return userName;
	}

	/**
	 * @param userName the userName to set
	 */
	public void setUserName(String userName) {
		this.userName = userName;
	}

	/**
	 * @return the passWord
	 */
	public String getPassWord() {
		return passWord;
	}

	/**
	 * @param passWord the passWord to set
	 */
	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}

	/**
	 * @return the fName
	 */
	public String getfName() {
		return fName;
	}

	/**
	 * @param fName the fName to set
	 */
	public void setfName(String fName) {
		this.fName = fName;
	}

	/**
	 * @return the lName
	 */
	public String getlName() {
		return lName;
	}

	/**
	 * @param lName the lName to set
	 */
	public void setlName(String lName) {
		this.lName = lName;
	}

	/**
	 * @return the mInitial
	 */
	public String getmInitial() {
		return mInitial;
	}

	/**
	 * @param mInitial the mInitial to set
	 */
	public void setmInitial(String mInitial) {
		this.mInitial = mInitial;
	}

	/**
	 * @return the emailAddress
	 */
	public String getEmailAddress() {
		return emailAddress;
	}

	/**
	 * @param emailAddress the emailAddress to set
	 */
	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}

	/**
	 * @param age the age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}

	/**
	 * @return the phone
	 */
	public int getPhone() {
		return phone;
	}

	/**
	 * @param phone the phone to set
	 */
	public void setPhone(int phone) {
		this.phone = phone;
	}

	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Customer [customerID=" + customerID + ", userName=" + userName + ", passWord=" + passWord + ", fName="
				+ fName + ", lName=" + lName + ", mInitial=" + mInitial + ", emailAddress=" + emailAddress + ", age="
				+ age + ", phone=" + phone + ", email=" + email + "]";
	}
	
}
