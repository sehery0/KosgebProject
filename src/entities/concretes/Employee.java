package entities.concretes;

public class Employee extends User {
	private int employeeId;
	private String firstName;
	private String lastName;
	private String title;

	public Employee() {
		super();
	}

	public Employee(int id, String userName, String password, String email, int employeeId, String firstName, String lastName, String title ) {
		super(id, userName, password, email);
		this.employeeId = employeeId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.title = title;
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
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

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

}