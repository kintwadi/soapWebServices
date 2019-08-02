package bookstore.domain;

import java.io.Serializable;


public class Book  implements Serializable {

	private static final long serialVersionUID = 1L;
	private String reference;
	private String title;
	private String author;
	private String cover;
	private String description;
	
	
	public Book() {
	
	}

	public Book(String reference, String title, String author, String cover, String description) {
		super();
		this.reference = reference;
		this.title = title;
		this.author = author;
		this.cover = cover;
		this.description = description;
	}




	public String getReference() {
		return reference;
	}


	public void setReference(String reference) {
		this.reference = reference;
	}


	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getCover() {
		return cover;
	}
	public void setCover(String cover) {
		this.cover = cover;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	
}
