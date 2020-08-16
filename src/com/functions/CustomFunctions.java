package com.functions;

public class CustomFunctions {

	interface UnaryOperation<T> {
		T action(T t);
	}

	interface BinaryOperation<T> {
		T action(T t1, T t2);
	}

	static UnaryOperation<String> toUpper = name -> name.toUpperCase();

	static BinaryOperation<String> combineToUpperCase = (word1, word2) -> (word1 + " " + word2).toUpperCase();

	public static void main(String[] args) {
		System.out.println(toUpper.action("hello world!"));
		System.out.println(combineToUpperCase.action("hello", "world!"));
	}
}
