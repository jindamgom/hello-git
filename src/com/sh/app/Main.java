package com.sh.app;

import com.sh.app.animal.Bird;
import com.sh.app.animal.Cat;
import com.sh.app.animal.Dog;
import com.sh.app.animal.Fish;
import com.sh.app.animal.Mouse;

public class Main 
{
	public static void main(String[] args)
	{
		System.out.println("HELLO WORLD"); //ctrl+shift+x
		System.out.println("HELLO GIT");
		
		System.out.println("Animal go");
		//sub 클래스 제거
		//dog 클래스 bark 호출
		new Dog().bark();
		
		//cat 클래스 jump 호출
		new Cat().jump();
		
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
