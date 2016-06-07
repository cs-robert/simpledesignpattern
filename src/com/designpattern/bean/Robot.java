package com.designpattern.bean;

import java.io.Serializable;

/**
 * 机器人实例
 * 
 * @author chao
 *
 */
public class Robot implements Serializable {
	public String name;// 名字
	public int age;// 寿命
	public Battery battery;// 电池

	@Override
	public String toString() {
		return "     Robot hashCode:" + hashCode() + " name:" + name + " age:" + age
				+ (battery == null ? "" : battery.toString());
	}

	/**
	 * 电池实例
	 * 
	 * @author chao
	 *
	 */
	public static class Battery implements Serializable {
		public String name;// 电池名称
		public int level;// 电池电量 0-100

		@Override
		public String toString() {
			return "      Battery hashCode:" + hashCode() + " name:" + name + " level:" + level;
		}
	}

}
