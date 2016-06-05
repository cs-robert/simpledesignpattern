package com.designpattern.singleton;

/**
 * 懒加载的饿汉单例模式
 * 
 * @author chao
 *
 */
public class Singleton5 {
	private static class SingletonHolder {
		private static final Singleton5 INSTANCE = new Singleton5();
	}

	private Singleton5() {
	}

	public static final Singleton5 getInstance() {
		return SingletonHolder.INSTANCE;
	}
}