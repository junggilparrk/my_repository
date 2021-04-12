package day0317.abstractEx.ex01;

public abstract class Test {
	public static void main(String[] args) {
	
		//Animal animal= new Animal(); 바로 사용 불가
		//is a 관계(상속 관계는 같다고 봄)
		
		
		Lion lion = new Lion();
		lion.setName("똥개");
		lion.bark();
	
		Dog dog= new Dog("히릿");
		dog.bark();
		
		Chicken chicken= new Chicken();
		chicken.bark();
		
		//배열(같은 타입인 애들의 묶음)
		//서로 다른 타입을 부모로 묶어 줄수 있다.
		//다형성이라고 함.
		Animal animal=new Lion();
		Animal animal1=new Chicken();
		animal.bark();
		animal1.bark();
		
		Animal[] animals=new Animal[3];
		animals[0]=lion;
		animals[1]=dog;
		animals[2]=chicken;
		for(Animal a:animals) {
			a.bark();
		}
		for(int i=0;i>animals.length;i++) {
			animals[i].bark();
		}
		//이 메서드는 부모인 Animals에 정의 되어 있지 않기 떄문에 사용할 수 없다.
		//animals[2].isfried();
		
		//다운 캐스팅하여 자식 자료형에 담으면 사용가능
		Chicken c=(Chicken)animals[2];
		System.out.println(c.isFried());
		
		//cast 예외가 발생한다.
		//lion을 chicken으로 바꾸려 해서
		//Chicken c1= (Chicken)animals[0];
		
		
		//부모 변수에 들어있는 객체의 실제 타입을 비교하는 키워드 instanceof
		if(animals[0] instanceof Chicken) {
			System.out.println(((Chicken)animals[0]).isFried());
		}
	}
	
}
