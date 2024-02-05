package com.example.demo.dto;

import com.example.demo.model.User;

public class UserDto {
    
    private String username;
    private String password;
    private String email;
    private String phone;
    private String name;
    private String businessTitle;

    public User getUserFromDto(){
        User user = new User();
        user.setUsername(username);
        user.setPassword(password);
        user.setEmail(email);
        user.setPhone(phone);
        user.setName(name);
        user.setBusinessTitle(businessTitle);
        
        return user;
    }

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBusinessTitle() {
		return businessTitle;
	}

	public void setBusinessTitle(String businessTitle) {
		this.businessTitle = businessTitle;
	}

	@Override
	public String toString() {
		return "UserDto [username=" + username + ", password=" + password + ", email=" + email + ", phone=" + phone
				+ ", name=" + name + ", businessTitle=" + businessTitle + "]";
	}

	public UserDto() {
		super();
		// TODO Auto-generated constructor stub
	}

	public UserDto(String username, String password, String email, String phone, String name, String businessTitle) {
		super();
		this.username = username;
		this.password = password;
		this.email = email;
		this.phone = phone;
		this.name = name;
		this.businessTitle = businessTitle;
	} 
    
    
}
