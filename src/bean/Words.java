package bean;

import java.io.Serializable;

public class Words implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 6870106821985805779L;
	private int id;
	private String name;
	private String type;
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
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
}
