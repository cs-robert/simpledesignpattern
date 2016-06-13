package com.designpattern.factory.simplefactory;

import com.designpattern.factory.ProductA;
import com.designpattern.factory.ProductA1;
import com.designpattern.factory.ProductA2;

/**
 * 简单工厂模式
 * 
 * @author chao
 *
 */
public class SimpleFactory {
	public static final int PRODUCTA1 = 0;
	public static final int PRODUCTA2 = 1;

	public static ProductA reateProdctA(int type) {
		switch (type) {
		case PRODUCTA1:
			return new ProductA1();
		case PRODUCTA2:
			return new ProductA2();
		default:
			return null;
		}
	}
}
