package com.designpattern.builder;

/**
 * 创建者模式
 * 
 * @author chao
 *
 */
public class Product {

	Object part1;
	Object part2;

	private Product(Object part1, Object part2) {
		this.part1 = part1;
		this.part2 = part2;
	}

	public static class Builder {
		Object part1;
		Object part2;

		public void buildpart1(Object part1) {
			this.part1 = part1;
		}

		public void buildpart2(Object part2) {
			this.part2 = part2;
		}

		public Product buildProcudt() {
			return new Product(part1, part2);
		}
	}
}
