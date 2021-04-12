package day0322.mapEx01;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class UserMapTest {
	public static void main(String[] args) {
		//key가 이름인 맵을 만들어보자.
		Map<String, User> userMap=new HashMap<String, User>();
		//각각의 사람 추가
		User user1= new User("여자라서 햄볶아요","1234");
		User user2= new User("바람과 함께 살빠지다","2222");
		User user3= new User("부릅뜨니숲이었어","3333");
		
		userMap.put("루피", user1);
		userMap.put("상디", user2);
		userMap.put("쵸파", user3);
		
		//상디의 비밀번호는?
		//쵸파의 아이디는?
		
		System.out.println(userMap.get("상디").getPassward());
		System.out.println(userMap.get("쵸파").getUserId());
		for(String key: userMap.keySet()) {
			System.out.println(userMap.get(key).getUserId());
		}	
		
	}
}
