package com.designpattern.factory.abstractfactory;

import com.designpattern.factory.ProductA;
import com.designpattern.factory.ProductB;

/**
 * 抽象工厂模式
 * 
 * @author chao
 *
 */
public interface Factory1 {
	public ProductA createA1();

	public ProductB createB1();
}
