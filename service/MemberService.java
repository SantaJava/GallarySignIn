package service;

import java.util.HashMap;
import java.util.Map;

import model.Member;

public class MemberService {

	Map<String, Member> map;

	private MemberService() {

		map = new HashMap<>();

		for (int i = 1; i < 4; i++) {
			Member member = new Member.Builder().setUserId("hong" + i).setPassword("1234").setName("홍길동" + i).build();
			map.put(member.getUserId(), member);
		}
	}

	private static MemberService instance = new MemberService();

	public static MemberService getInstance() {
		return instance;
	}

	public Member checkLogin(Member member) { //login 성공여부 결정. 
		Member m = map.get(member.getUserId());
		if (m == null) {
			return null;
		}
		if (!m.getPassword().equals(member.getPassword())) {
			return m;
		}
		return m;
	}
}
