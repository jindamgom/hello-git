package com.sh.app;

import com.sh.app.animal.Bird;
import com.sh.app.animal.Dog;
import com.sh.app.animal.Fish;
import com.sh.app.animal.Mouse;

public class Main 
{
	public static void main(String[] args)
	{
		System.out.println("HELLO WORLD"); //ctrl+shift+x
		System.out.println("HELLO GIT");
		
		//오류 형식 삭제 후...둘다 쓰기로 결정
		System.out.println("동물기능 시작");
		System.out.println("Animal go");

		//sub 클래스 제거
		//dog 클래스 bark 호출
		new Dog().bark();

		//branch - animal bird 클래스 fly 호출
		new Bird().fly();
		
		//branch -
		new Fish().swim();
		
		//branch - animal
		new Mouse().hiding();
	}
	
	//branch - animal - mouse 이후로 
	//다시 master로 돌아와 test메소드 추가
	public void test()
	{
		System.out.println("test");

	}
}
