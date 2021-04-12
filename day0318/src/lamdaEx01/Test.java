package lamdaEx01;

public class Test {
	public static void main(String[] args) {
		Sum mySum=new MySumCalc();
		int result= mySum.sum(10, 5);
		System.out.println("두 수의 합:"+result);
		
		
		//한번만 저 기능을 쓸건데 그러면 클래스로 구현하기가 먼가 아깝다.
		//무명클래스->인터페이스로 객체를 구현하면서 사용한다.
		Sum myInterfaceSum=new Sum() {
			@Override
			public int sum(int num1, int num2) {
				return num1+num2;
			}
		};
		result=myInterfaceSum.sum(20, 10);
		System.out.println("두 수의 합:"+result);
		
		//람다 표현식(인터페이스 하나에 하나의 메서드만 있음)
		//Sum myLambdySum=(a,b)->{return a+b;};
		Sum myLambdySum=(a,b)->(a+b);//위아래 둘다 가능
		result=myLambdySum.sum(15, 3);
		System.out.println("두 수의 합:"+result);
		
		Sub myLambdySub=(a,b)->{return a-b;};
		result=myLambdySub.Sub(20, 10);
		System.out.println("두 수의 차:"+result);
		Sub myInterfaceSub=new Sub() {
			public int Sub(int a, int b) {
				return a-b;
			}
		};
		result=myInterfaceSub.Sub(30, 10);
		System.out.println("두 수의 차:"+result);
		
		Mul myLambdyMul=(c,d)->{return c*d;};
		result= myLambdyMul.mul(3, 4);
		System.out.println("두 수의 곱:"+result);
		
		Mul interfaceMul=new Mul() {	
			@Override
			public int mul(int c, int d) {	
				return c*d;
			}
		};
		result=interfaceMul.mul(4, 6);
		System.out.println("두 수의 곱:"+result);
		
		Div lambdyDiv=(a,b)->{return a/b;};
		result=lambdyDiv.div(30, 3);
		System.out.println("두 수의 나누기:"+result);
		
		Div interfaceDiv=new Div() {
			
			@Override
			public int div(int a, int b) {
				return a/b;
			}
		};
		result=lambdyDiv.div(20, 2);
		System.out.println("두 수의 나누기:"+result);
		
		Gugudan gugu=new Gugudan() {
			
			@Override
			public void getGugu(int dan) {
				for(int i=2;i<10;i++) {
					System.out.println(dan+"*"+i+"="+(dan*i));
				}
				
			}
		};
		
		
		Gugudan Gugu=(dan)->{
			for(int i=2;i<10;i++) {
				System.out.println(dan+"*"+i+"="+(dan*i));
				}
		};	
		Gugu.getGugu(5);		
				
	}
}
   