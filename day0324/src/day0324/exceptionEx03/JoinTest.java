package day0324.exceptionEx03;

import java.io.IOException;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
//DuplicationIdException 사용자 정의 예외를 만듬
	//사용자로부터 5명의 아이디와 비밀번호를 입력받는다.
	//입력받은 아이디와 비밀번호는 Join 객체의  join()메서드를 이용하여
	//데이터(id,password)를 추가한다.
	//이때 id가 이미 있다면! 사용자에  "중복된 아이디 입니다."라고 출력하고//catch처리를 joinTest에서 한다. 에외 발생? 다시 입력 받음
	//다시 입력받도록 한다.
	//입력이 끝나면
	//join객체의 getUser()라는 메서드로 가입된 사람의 정보를 Map으로 받는다.
	//Map을 이용하여 가입된 사람의 정보를 모두 출력!
	//join()메서드에는 기존 id를 비교하는 로직, 예외를 발생시키는 로직!
public class JoinTest {
	public static void main(String[] args) throws IOException {
		Join jo=new Join();
		Scanner sc=new Scanner(System.in);
		System.out.println("정보를 입력해 주세요");
		int cnt=0;
		while(cnt<5){
			System.out.println("id를 입력해 주세요");
			String id=sc.next();
			System.out.println("password를 입력해주세요");
			String password=sc.next();
			
			try {
				cnt=jo.join(id, password);
			} catch (DuplicationIdException e) {
				System.out.println(id+" 아이디가 중복되었습니다.");
				System.out.println("다른 아이디를 입력하세요");
				
			}
			}
		System.out.println("입력 완료");
		
		//안에 들은 데이터 출력하기
		Map<String, String> users=jo.getUsers();
		for(String key : users.keySet()) {
			System.out.println("아이디:"+key+",비밀번호:"+users.get(key));
		}
 		
		
			
		
		
		

		

	}
}
