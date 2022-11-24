package models;

import java.sql.Timestamp;

import lombok.Data;

@Data
public class Member {
	private long id;
	private String username;
	private String password;
	private String name;
	private String email;
	private String phone;
	private Timestamp createDate;

	public Member() {
	}

	public Member(long id, String username, String password, String name, String email, String phone,
			Timestamp createDate) {
		this.id = id;
		this.username = username;
		this.password = password;
		this.name = name;
		this.email = email;
		this.phone = phone;
		this.createDate = createDate;
	}

}