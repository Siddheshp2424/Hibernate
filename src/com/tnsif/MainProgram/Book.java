package com.tnsif.MainProgram;

 
import java.io.Serializable;

import javax.persistence.*;

@Entity
public class Book implements Serializable {
	@Id
	@Column(name="BookId")
	private int bId;
	
	@Column(name="BookTitle")
	private String bTitle;
	@Column(name="BookAuthor")
	private String bAuthor;
	@Column(name="BookSalary")
	private int bSalary;
	
	public Book(int bId,String bTitle,String bAuthor,int bSalary) {
		this.bId=bId;
		this.bTitle=bTitle;
		this.bAuthor=bAuthor;
		this.bSalary=bSalary;
	}

	public int getbId() {
		return bId;
	}

	public void setbId(int bId) {
		this.bId = bId;
	}

	public String getbTitle() {
		return bTitle;
	}

	public void setbTitle(String bTitle) {
		this.bTitle = bTitle;
	}

	public String getbAuthor() {
		return bAuthor;
	}

	public void setbAuthor(String bAuthor) {
		this.bAuthor = bAuthor;
	}

	public int getbSalary() {
		return bSalary;
	}

	public void setbSalary(int bSalary) {
		this.bSalary = bSalary;
	}

	@Override
	public String toString() {
		return "Book [bId=" + bId + ", bTitle=" + bTitle + ", bAuthor=" + bAuthor + ", bSalary=" + bSalary + "]";
	}
	
	 
	

}
