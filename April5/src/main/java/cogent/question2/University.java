package cogent.question2;

import org.springframework.beans.factory.annotation.Required;

public class University {
	private int id;
	private String name;
	private String loc;
	
	@Required
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLoc() {
		return loc;
	}
	public void setLoc(String loc) {
		this.loc = loc;
	}
	@Override
	public String toString() {
		return "University [id=" + id + ", name=" + name + ", loc=" + loc + "]";
	}
	
}
