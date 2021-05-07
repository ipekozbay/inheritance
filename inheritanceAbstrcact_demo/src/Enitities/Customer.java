package Enitities;

public class Customer {

	int id;
	String FirstName;
	String LastName;
	double DateOfBirth;
	String NationalityId;

	public Customer() {
		
	}

	public Customer(int id, String FirstName, String LastName, double dateOfBirth, String nationalityId) {

		super();
		this.id = id;
		this.FirstName = FirstName;
		this.LastName = LastName;
		DateOfBirth = dateOfBirth;
		NationalityId = nationalityId;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return FirstName;
	}

	public void setFirstName(String FirstName) {
		this.FirstName = FirstName;
	}

	public String getLastName() {
		return LastName;
	}

	public void setLastName(String LastName) {
		this.LastName = LastName;
	}

	public double getDateOfBirth() {
		return DateOfBirth;
	}

	public void setDateOfBirth(double dateOfBirth) {
		DateOfBirth = dateOfBirth;
	}

	public String getNationalityId() {
		return NationalityId;
	}

	public void setNationalityId(String nationalityId) {
		NationalityId = nationalityId;
	}

}
