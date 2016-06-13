package com.designpattern.factory.abstractfactory;

import com.designpattern.factory.ProductA;
import com.designpattern.factory.ProductA1;
import com.designpattern.factory.ProductB;
import com.designpattern.factory.ProductB1;

public class Factory1Iml implements Factory1 {

	@Override
	public ProductA createA1() {
		return new ProductA1();
	}

	@Override
	public ProductB createB1() {
		return new ProductB1();
	}

}
