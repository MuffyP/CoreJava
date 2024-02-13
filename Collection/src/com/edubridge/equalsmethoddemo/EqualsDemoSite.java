package com.edubridge.equalsmethoddemo;

import java.util.Objects;

public class EqualsDemoSite {
	private String Name;
	private Integer id;
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	
	//overriding hashcode() and equals() method
	@Override
	public int hashCode() {
		return Objects.hash(Name, id);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		EqualsDemoSite other = (EqualsDemoSite) obj;
		return Objects.equals(Name, other.Name) && Objects.equals(id, other.id);
	}
	
	// creating gconstructor
	public EqualsDemoSite(String Name,Integer id) {
		super();
		this.id=id;
		this.Name=Name;
	}
	
}
