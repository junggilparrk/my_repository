package day0322.mapEx01;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Ex01 {
	public static void main(String[] args) {
		//map
		//맵은 key와 value로 이루어짐
		//짝꿍
		//순서가 있지는 않다
		Map<Integer, String> map=new HashMap<Integer, String>();
		//넣는 메서드 put()
		map.put(5, "돌돔");
		map.put(6,"감성돔");
		map.put(7,"참동");
		map.put(8,"벵에돔");
		//값은 키로 가져온다.
		System.out.println(map.get(5));
		System.out.println(map.get(7));
		
		System.out.println("============================");
		Map<String, String> map2=new HashMap<String, String>();
		map2.put("자장면", "검정");
		map2.put("짬뽕", "빨강");
		map2.put("탕수육", "누런");
		System.out.println(map2.get("자장면"));
		System.out.println(map2.get("짬뽕"));
		System.out.println(map2.get("탕수육"));
		
		System.out.println(map2);
		//맵안에 들어 있는 값에 "색"이라는 글자를 붙여 출력하자
		for(Entry<String, String> e:map2.entrySet()) {//엔트리들의 셋
			System.out.println(e.getKey());
			System.out.println(e.getValue()+"색");
		}
		Set<String>keySet=map2.keySet();//key를 Set으로 묶어 반환 key는 중복값을 갖을 수 없음.
		map2.values();//value를 반환 Collection형태로 가져옴 value는 중복으로 가져올수 있음.
		
		System.out.println("key들");
		for(String k:keySet) {
			System.out.println(k);
		}
		
		
	}
}
