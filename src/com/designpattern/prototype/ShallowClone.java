package com.designpattern.prototype;

import com.designpattern.bean.Robot;

/**
 * 浅克隆
 * 
 * @author chao
 *
 */
public class ShallowClone implements Cloneable {
	public Robot robot;
	public String name;
	public int number;

	@Override
	public Object clone() {
		try {
			return super.clone();
		} catch (CloneNotSupportedException e) {
			System.out.println(e.getMessage());
		}
		return null;
	}

	@Override
	public String toString() {
		return "     ShallowClone hashCode:" + hashCode() + " name:" + name + " number:" + number
				+ (robot == null ? "" : robot.toString());
	}
}
