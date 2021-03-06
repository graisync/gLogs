package org.gLogs.data.model;

import java.util.ArrayList;
import java.util.List;

import org.dizitart.no2.objects.Id;

/**
 * DTO representing a user into the database.
 * 
 * TODO : We should do something so when we get this user 
 * in the app, we don't take the password each time
 * 
 * @author jthulliez
 * 
 */

public class UserDTO {
	@Id
	private String userName;
	private String firstName;
	private String lastName;
	private String password;
	private List<RoleDTO> roles;

	public UserDTO() {
		roles = new ArrayList<RoleDTO>();
	}

	public UserDTO(String user, String pass) {
		roles = new ArrayList<RoleDTO>();
		this.userName = user;
		this.password = pass;
	}
	
	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void addRole(String role) {
		roles.add(new RoleDTO(role));
	}
	
	public List<RoleDTO> getRoles() {
		return roles;
	}

	public void setRoles(List<RoleDTO> roles) {
		this.roles = roles;
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
	
	
	
}
