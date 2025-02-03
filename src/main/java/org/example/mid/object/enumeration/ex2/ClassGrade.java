package org.example.mid.object.enumeration.ex2;
// 타입 안전 열거형 패턴
public class ClassGrade {
	public static final ClassGrade BASIC = new ClassGrade();
	public static final ClassGrade GOLD = new ClassGrade();
	public static final ClassGrade DIAMOND = new ClassGrade();

	// 다른 클래스에서 새로운 객체 생성을 막음
	private ClassGrade() {
	}
}
