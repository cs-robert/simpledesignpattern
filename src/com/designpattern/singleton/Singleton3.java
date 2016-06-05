package com.designpattern.singleton;

/**
 * 线程安全的单例模式，双重锁校验
 * 
 * @author chao
 *
 */
public class Singleton3 {
	private volatile static Singleton3 instance;

	private Singleton3() {
	}

	public static Singleton3 getSingleton() {
		if (instance == null) {
			synchronized (Singleton3.class) {
				if (instance == null) {
					instance = new Singleton3();
				}
			}
		}
		return instance;
	}
}