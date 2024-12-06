package com.p3;

import com.p2.*;

public class Child extends Father{

	public void play() {
		System.out.println("게임을 한다");
	}
	
	@Override
	public void sing() {
		System.out.println("노래를 아주 잘한다");
	}

	@Override
	public void work() {
		System.out.println("코딩을 한다");
	}

	
	
	
}
