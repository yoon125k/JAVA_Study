package com.poly.part0.test07;

public class MyProfile extends Profile implements Display, Job {

	private String loc;
	
	public MyProfile() {}
	
	public MyProfile(String name, String phone) {
		super(name,phone);
	}
	
	@Override
	public void jobLoc(String loc) {
		this.loc = loc;
		
	}

	@Override
	public void display() {
		super.printProfile();
		System.out.println("회사주소: " +loc);
		System.out.println("회사직종: " +jobId);
	}

}
