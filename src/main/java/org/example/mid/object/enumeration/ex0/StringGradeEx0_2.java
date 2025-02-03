package org.example.mid.object.enumeration.ex0;

public class StringGradeEx0_2 {
	public static void main(String[] args) {
		int price = 10000;

		DiscountService discountService = new DiscountService();
		// 휴먼 에러 또는 존재하지 않는 등급 발생
		int basic = discountService.discount("BASI", price); // 오타
		int vip = discountService.discount("VIP", price); // 존재하지 않는 등급
		int gold = discountService.discount("gold", price); // 소문자 입력
		int diamond = discountService.discount("DIAMOND", price);

		System.out.println("basic :" + basic);
		System.out.println("vip :" + vip );
		System.out.println("gold :" + gold);
		System.out.println("diamond :" + diamond);
	}
}
