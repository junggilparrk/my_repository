package day0322.mapEx01;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class EmployeeTest {
	public static void main(String[] args) {
		Map<Integer, Employee> m=new HashMap<Integer, Employee>();
		m.put(10000, new Employee("김길동", 30000000, "개발부서", "대리"));
		m.put(10001, new Employee("홍길동", 40000000, "인사팀", "과장"));
		m.put(10003,new Employee("박홍배", 20000000, "경호팀", "신입"));
		m.put(10010, new Employee("이수만", 50000000, "엔터테이너", "과장"));
		m.put(10020, new Employee("박진영", 35000000, "가수", "프리랜서"));
		
		System.out.println(m);
		int sum=0;int avg=0; 
		for(Entry<Integer, Employee> e:m.entrySet()) {
			System.out.println("이름:"+e.getValue().getName()+"연봉:"+e.getValue().getPay());
			sum+=e.getValue().getPay();
			avg=sum/5;
		}System.out.println(avg);
		System.out.println("사번 10003의 부서:"+m.get(10003).getTeam()+",사번 10003의 포지션:"+m.get(10003).getPosition());
		
		for(Entry<Integer, Employee> e:m.entrySet()) {
			Employee emp=e.getValue();
			if(emp.getPay()<=30000000) {
				System.out.println("연봉30000000원 이하 사원 이름:"+emp.getName()+",연봉30000000원 이하 사원 사번:"+e.getKey());
			}
		}
	}
}
