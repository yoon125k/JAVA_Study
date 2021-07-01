package silsub1.run;

import silsub1.model.vo.Member;

public class Run {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Member mb = new Member();
	
		mb.setMemberId("ID");
		mb.setMemberPwd("123");
		mb.setMemberName("김아무");
		mb.setAge(24);
		mb.setGender('M');
		mb.setPhone("010-1234-4567");
		mb.setEmail("123@gmail.com");
		
		System.out.println(mb.getMemberId());
		System.out.println(mb.getMemberPwd());
		System.out.println(mb.getMemberName());
		System.out.println(mb.getAge());
		System.out.println(mb.getGender());
		System.out.println(mb.getPhone());
		System.out.println(mb.getEmail());
		
	}
}
