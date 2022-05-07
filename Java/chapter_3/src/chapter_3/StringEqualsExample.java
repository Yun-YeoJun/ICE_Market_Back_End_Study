package chapter_3;

public class StringEqualsExample {
	public static void main(String[] args) {
		String strVar1 = "¿±ø©¡ÿ";
		String strVar2 = "¿±ø©¡ÿ";
		String strVar3 = new String("¿±ø©¡ÿ");
		
		System.out.println(strVar1 == strVar2);
		System.out.println(strVar1 == strVar3);
		System.out.println();
		System.out.println(strVar1.equals(strVar2));
		System.out.println(strVar1.equals(strVar3));
	}
}
