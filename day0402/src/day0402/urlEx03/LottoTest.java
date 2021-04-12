package day0402.urlEx03;

import java.util.List;

public class LottoTest {
	public static void main(String[] args) {
		MyLotto myLotto=new MyLotto();
		
		List<String> lotto=myLotto.getWinNumbers(940);
		System.out.println(lotto);
		
		String[] myNums= {"3","5","10","24","41","45"};
		for(String num:myNums) {
			if(lotto.contains(num)) {
				System.out.println(num);
			}
		}
	}
}
