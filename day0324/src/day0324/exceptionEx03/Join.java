package day0324.exceptionEx03;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Join {
	private Map<String, String> users;
	private String id;
	private String password;
	
	//users 맵 초기화(객체 생성후 변수에 대입)
	public Join() {
		users=new HashMap<String, String>();// hashmap 객체 생성, users대입.
	}
	//id,password 를 받아서 map에 저장
	public int join(String id, String password) throws DuplicationIdException {
		//id의 중복이 발생하면 예외를 던진다.
		if(users.containsKey(id)) {
			throw new DuplicationIdException();
		}
		users.put(id, password);
		return users.size();
	}
	
	//안에 있는 map을 반환하는 메서드
	public Map<String, String> getUsers(){
		return users;
	}
	
	 
	} 