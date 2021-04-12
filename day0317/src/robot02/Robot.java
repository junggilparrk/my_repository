package robot02;

public abstract class Robot {
	protected String name;
	
	//탬플릿 패턴 
	//이렇게 진행하라고 틀을 마련
	public void fight() {
		System.out.println(name+"가 전투를 시작합니다.");
		attack();
		move();
		attack();
		System.out.println(name+"가 전투를 종료합니다.");
	} 
	protected abstract void attack(); 
	
	protected abstract void move(); 
}
//디자인 패턴!!(많이 공부하면 좋음)
//디자인 패턴은 뭐가 좋다 할 수 는 없다. 상황에 맞게 패턴 제작
//개발 방법(설개 방법)
//-좀더 효율적인 방법
//-좀더 보기 좋은 방법
//-좀더 재사용 할 수 있는 방법