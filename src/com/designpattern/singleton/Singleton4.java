package com.designpattern.singleton;

/**
 * 饿汉方式创建
 * 
 * @author chao
 *
 */
public class Singleton4 {
	private static Singleton4 instance = null;// 或者直接对instance赋值
	static {
		instance = new Singleton4();
	}

	private Singleton4() {
	}

	public static Singleton4 getInstance() {
		return instance;
	}
}