package com.designpattern.prototype;

import com.designpattern.bean.Robot;
import com.designpattern.bean.Robot.Battery;

public class PrototypeTest {

	public static void main(String[] args) {
		testShallowClone();
		System.out.println();
		testDeepClone();
	}

	private static void testDeepClone() {
		DeepClone deepClone = new DeepClone();
		deepClone.name = "1";
		deepClone.number = 1;
		deepClone.robot = new Robot();
		deepClone.robot.name = "1";
		deepClone.robot.battery = new Battery();
		deepClone.robot.battery.name = "1";
		System.out.println(deepClone.toString());
		DeepClone deepclone2 = (DeepClone) deepClone.deepclone();
		System.out.println(deepclone2.toString());
		deepClone.name = "2";
		deepClone.number = 2;
		deepClone.robot.name = "2";
		deepClone.robot.battery.name = "2";
		System.out.println(deepClone.toString());
		System.out.println(deepclone2.toString());

	}

	private static void testShallowClone() {
		ShallowClone shallowClone = new ShallowClone();
		shallowClone.name = "1";
		shallowClone.number = 1;
		shallowClone.robot = new Robot();
		shallowClone.robot.name = "1";
		shallowClone.robot.battery = new Battery();
		shallowClone.robot.battery.name = "1";
		System.out.println(shallowClone.toString());
		ShallowClone shallowClone2 = (ShallowClone) shallowClone.clone();
		System.out.println(shallowClone2.toString());
		shallowClone.name = "2";
		shallowClone.number = 2;
		shallowClone.robot.name = "2";
		shallowClone.robot.battery.name = "2";
		System.out.println(shallowClone.toString());
		System.out.println(shallowClone2.toString());

	}
}
