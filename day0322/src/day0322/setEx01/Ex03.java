package day0322.setEx01;

import java.util.HashSet;
import java.util.Set;

public class Ex03 {
	//set은 집합을 관리하기 위해 쓴다.
	public static void main(String[] args) {
		
	
	Set<String> cSet=new HashSet<>();
	cSet.add("박원형");
	cSet.add("박진출");
	cSet.add("김명주");
	cSet.add("박정길");
	cSet.add("손승연");
	cSet.add("송민현");
	cSet.add("유영선");
	cSet.add("이윤학");
	cSet.add("한의진");
	System.out.println("총 인원:"+cSet.size());
	Set<String> aBan=new HashSet<String>();
	aBan.add("김상준");
	aBan.add("박민영");	
	aBan.add("오주원");
	aBan.add("박정길");
	aBan.add("박진출");
	aBan.add("유영선");
	aBan.add("김명주");
	//오늘 나오지 않은 사람은?
	Set<String> biBan=new HashSet<String>();
	biBan.add("강현우");
	biBan.add("박예나");
	
	Set<String> allBan=new HashSet<String>();
	allBan.addAll(aBan);
	allBan.addAll(cSet);
	allBan.addAll(biBan);
	
	System.out.println("총 인원:"+allBan.size());
	System.out.println(allBan);
	
	Set<String> koBan=new HashSet<String>();
	koBan.addAll(cSet);
	koBan.retainAll(aBan);
	System.out.println("고정:"+koBan);
	
	}
}
