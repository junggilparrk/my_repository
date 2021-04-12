package day0322.listEx02;

import java.util.LinkedList;

public class Ex01 {
	public static void main(String[] args) {
		//링크드리스트(연결리스트)
		LinkedList<String> list=new LinkedList<>();
		//음식리스트를 넣어보자
		list.add("소곱창");
		list.add("오징어회");
		list.add("돈까스");
		System.out.println(list);
		list.add(2, "햄버거");
		System.out.println(list);
		list.add(3, "경양까츠");
		System.out.println(list);
		String removed=list.remove(0);
		System.out.println("삭제된 데이타:"+removed);
		System.out.println(list);
		
		//써보니 ArrayList랑 사용 방법이 같다.
		//그럼 왜 두개를 나눴는가?
		//내부적으로 구현된 방식이 다르다.
		//링크드 리스트의 한개 한개를 노드라고 한다.
		//노드=데이터,주소;
		//데이터의 접근은 ArrayList가 훨씬 빠름.
		//새로운 데이터를 추가 삭제가 유리하다.
		//사용법은 같다 하지만 참조, 조회할때는 ArrayList가 좋고 삽입,삭제 LinkedList가 좋다.
		//둘다 List들 상속받기 떄문에 List로 형변환 해줄수 있음.
	}
}
