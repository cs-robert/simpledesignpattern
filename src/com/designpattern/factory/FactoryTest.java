package com.designpattern.factory;

import com.designpattern.factory.abstractfactory.Factory1Iml;
import com.designpattern.factory.abstractfactory.Factory2Iml;
import com.designpattern.factory.factorymethod.ProductA1Creator;
import com.designpattern.factory.factorymethod.ProductA2Creator;
import com.designpattern.factory.factorymethod.ProductACreator;
import com.designpattern.factory.simplefactory.SimpleFactory;

/**
 * 工厂模式测试
 * 
 * @author chao
 *
 */
public class FactoryTest {

	public static void main(String[] args) {
		testSimpleFactory();
		testFactoryMethod();
		testAbstractFactory();
	}

	private static void testAbstractFactory() {
		Factory1Iml f1 = new Factory1Iml();
		f1.createA1().describe();
		f1.createB1().describe();
		Factory2Iml f2 = new Factory2Iml();
		f2.createA2().describe();
		f2.createB2().describe();
	}

	private static void testFactoryMethod() {
		ProductACreator aCreator = new ProductA1Creator();
		aCreator.createProduct().describe();
		aCreator = new ProductA2Creator();
		aCreator.createProduct().describe();
	}

	private static void testSimpleFactory() {
		ProductA product = SimpleFactory.reateProdctA(SimpleFactory.PRODUCTA1);
		product.describe();
		product = SimpleFactory.reateProdctA(SimpleFactory.PRODUCTA2);
		product.describe();
	}

}
