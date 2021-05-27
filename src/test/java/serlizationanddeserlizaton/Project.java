package serlizationanddeserlizaton;

public class Project {
	String title;
	String author;
	int id;
	
	public Project(String title, String author, int id) {
		super();
		this.title = title;
		this.author = author;
		this.id = id;
	}
	
	Project(){}

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

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	
	
	
	

}
