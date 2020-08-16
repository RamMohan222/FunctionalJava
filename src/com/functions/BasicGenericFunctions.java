package com.functions;

import java.util.Random;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

public class BasicGenericFunctions {

	// It will take one argument as input and return output.
	// Function<Input,Output>
	Function<Integer, Double> areaOfCircle = number -> Math.PI * number * number;

	// It will always expects one input argument and return type is void.
	// Consumer<Input>
	Consumer<Object> logger = word -> System.out.println(word);

	// It will not take any input arguments and it always return a specified type.
	// Supplier<Output>
	Supplier<Integer> randomIntProducer = () -> (int) Math.floor(new Random().nextDouble() * 100);

	// It will take one input argument and always return boolean.
	// It used to define conditions
	// Predicate<Input>
	Predicate<Integer> isEvenNumber = number -> number % 2 == 0;

	// It will take one integer argument as input and return output as integer.
	// UnaryOperator<InputOuput>
	UnaryOperator<Integer> squire = number -> number * number;

	// It will take two integer arguments as input and return output as integer.
	BinaryOperator<Integer> areaOfRectAngle = (height, width) -> height * width;

	public void run() {
		System.out.println("Power = " + areaOfCircle.apply(4));
		System.out.println("Get Random Number = " + randomIntProducer.get());
		System.out.println("Is Even Number = " + isEvenNumber.test(100));
		System.out.println("Squire Value = " + squire.apply(2));
		System.out.println("Area = " + areaOfRectAngle.apply(2, 3));

		System.out.println("========================================");
		
		logger.accept(areaOfCircle.apply(4));
		logger.accept(randomIntProducer.get());
		logger.accept(isEvenNumber.test(100));
		logger.accept(squire.apply(2));
		logger.accept(areaOfRectAngle.apply(2, 3));

	}

	public static void main(String[] args) {
		new BasicGenericFunctions().run();
	}

}
