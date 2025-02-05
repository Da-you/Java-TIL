package org.example.mid.object.enumeration.ex3;

import org.example.mid.object.enumeration.ex2.ClassGrade;

public class DiscountService {
	public int discount(Grade grade, int price) {
		int discountPercent = 0;

		if (grade == Grade.BASIC) {
			discountPercent = 10;
		} else if (grade == Grade.GOLD) {
			discountPercent = 20;
		} else if (grade == Grade.DIAMOND) {
			discountPercent = 30;
		} else {
			System.out.printf("할인X");
		}
		return price * discountPercent / 100;
	}
}
