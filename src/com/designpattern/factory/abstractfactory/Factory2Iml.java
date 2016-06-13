package com.designpattern.factory.abstractfactory;

import com.designpattern.factory.ProductA;
import com.designpattern.factory.ProductA2;
import com.designpattern.factory.ProductB;
import com.designpattern.factory.ProductB2;

public class Factory2Iml implements Factory2 {

	@Override
	public ProductA createA2() {
		return new ProductA2();
	}

	@Override
	public ProductB createB2() {
		return new ProductB2();
	}
}
