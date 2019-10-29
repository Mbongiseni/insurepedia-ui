package za.co.insurepedia.models;

import java.util.Date;

import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;

public class Client {
	
	
	private int clientId;
	
	@NotEmpty(message = "Titile must not be empty.")
	private String title;
	
	@NotEmpty(message = "Inintials must not be empty.")
	@Size(max = 3, message="Initials must not exceed 3 characters.")
	private String initials;
	
	@NotEmpty(message = "First name must not be empty.")
	private String firstName;
	private String middleName;
	
	@NotEmpty(message = "First name must not be empty.")
	private String lastName;
	
	@NotEmpty(message = "ID number must not be empty.")
	private String idNumber;
	private Date dateOfBirth;
	
	
	public Client() {}
	
	public Client(int clientId, String title, String initials, String firstName, String middleName, String lastName, String idNumber,
			Date dateOfBirth) {
		super();
		this.clientId = clientId;
		this.title = title;
		this.initials = initials;
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
		this.idNumber = idNumber;
		this.dateOfBirth = dateOfBirth;
	}
	
	public int getClientId() {
		return clientId;
	}

	public void setClientId(int clientId) {
		this.clientId = clientId;
	}
	
	public String getTitle() {
		return title;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public String getInitials() {
		return initials;
	}
	
	public void setInitials(String initials) {
		this.initials = initials;
	}
	
	public String getFirstName() {
		return firstName;
	}
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public String getMiddleName() {
		return middleName;
	}
	
	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public String getIdNumber() {
		return idNumber;
	}
	
	public void setIdNumber(String idNumber) {
		this.idNumber = idNumber;
	}
	
	public Date getDateOfBirth() {
		return dateOfBirth;
	}
	
	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	@Override
	public String toString() {
		return "Client [clientId=" + clientId + ", title=" + title + ", initials=" + initials + ", firstName="
				+ firstName + ", middleName=" + middleName + ", lastName=" + lastName + ", idNumber=" + idNumber
				+ ", dateOfBirth=" + dateOfBirth + "]";
	}
	
}


