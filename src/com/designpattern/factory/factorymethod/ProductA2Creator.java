package com.designpattern.factory.factorymethod;

import com.designpattern.factory.ProductA;
import com.designpattern.factory.ProductA2;

public class ProductA2Creator implements ProductACreator {

	@Override
	public ProductA createProduct() {
		return new ProductA2();
	}

}
