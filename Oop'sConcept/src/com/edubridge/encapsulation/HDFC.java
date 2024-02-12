package com.edubridge.encapsulation;
//parent class
public class HDFC {
	private String branch;
	private String IFFCcode;
	
	//getter and setter
	public String getBranch() {
		return branch;
	}


	public void setBranch(String branch) {
		this.branch = branch;
	}


	public String getIFFCcode() {
		return IFFCcode;
	}


	public void setIFFCcode(String iFFCcode) {
		IFFCcode = iFFCcode;
	}

	// generating tostring method
	@Override
	public String toString() {
		return "HDFC [branch=" + branch + ", IFFCcode=" + IFFCcode + "]";
	}
	


	
}
