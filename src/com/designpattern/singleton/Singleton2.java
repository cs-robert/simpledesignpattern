package com.designpattern.singleton;

/**
 * 线程安全的单利模式懒汉实现
 * 
 * @author chao
 *
 */
public class Singleton2 {
	private static Singleton2 instance;

	private Singleton2() {
	}

	public static synchronized Singleton2 getInstance() {
		if (instance == null) {
			instance = new Singleton2();
		}
		return instance;
	}
}