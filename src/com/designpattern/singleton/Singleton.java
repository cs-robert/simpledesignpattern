package com.designpattern.singleton;

/**
 * 利用枚举实现单利
 * 
 * @author chao
 *
 */
public enum Singleton {
	INSTANCE;
	public Object buid() {
		return new Object();
	}
}