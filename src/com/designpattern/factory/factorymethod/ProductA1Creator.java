package com.designpattern.factory.factorymethod;

import com.designpattern.factory.ProductA;
import com.designpattern.factory.ProductA1;

public class ProductA1Creator implements ProductACreator {

	@Override
	public ProductA createProduct() {
		return new ProductA1();
	}

}
