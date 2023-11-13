package com.sh.app;

import com.sh.app.animal.Bird;
import com.sh.app.animal.Cat;
import com.sh.app.animal.Dog;
import com.sh.app.animal.Fish;

public class Main 
{
	public static void main(String[] args)
	{
		System.out.println("HELLO WORLD"); //ctrl+shift+x
		System.out.println("HELLO GIT");
		
		//sub 클래스 제거
		//dog 클래스 bark 호출
		new Dog().bark();
		
		//cat 클래스 jump 호출
		new Cat().jump();
		
		//branch - animal bird 클래스 fly 호출
		new Bird().fly();
		
		//branch -
		new Fish().swim();
		
	}
}
