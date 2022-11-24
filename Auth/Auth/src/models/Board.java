package models;

import lombok.Data;

@Data
public class Board {
	private long id;
	private String username;
	private String title;
	private String contents;

	public Board() {
	}

	public Board(long id, String username, String title, String contents) {
		this.id = id;
		this.username = username;
		this.title = title;
		this.contents = contents;
	}

}