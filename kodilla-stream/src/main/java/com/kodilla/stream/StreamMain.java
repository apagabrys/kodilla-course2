package com.kodilla.stream;

import com.kodilla.stream.beautifier.PoemBeautifier;
import com.kodilla.stream.iterate.NumbersGenerator;
import com.kodilla.stream.lambda.*;
import com.kodilla.stream.reference.FunctionalCalculator;

public class StreamMain {
    public static void main(String[] args) {
        /*System.out.println("Welcome to module 7 - Stream");

        SaySomething saySomething = new SaySomething();
        saySomething.say();*/
        /*Processor processor = new Processor();
        processor.execute(() -> System.out.println("This is an example text."));*/
        /*
        ExpressionExecutor expressionExecutor = new ExpressionExecutor();

        System.out.println("Calculating expressions with lambdas");
        expressionExecutor.executeExpression(10,5, (a, b) -> a + b);
        expressionExecutor.executeExpression(10,5, (a, b) -> a - b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a * b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a / b);

        System.out.println("Calculating expressions with method references");
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::addAToB);
        expressionExecutor.executeExpression(3,4, FunctionalCalculator::divideAByB);
        expressionExecutor.executeExpression(3,4, FunctionalCalculator::multiplyAByB);
        expressionExecutor.executeExpression(3,4, FunctionalCalculator::subAFromB);*/


        PoemBeautifier poemBeautifier = new PoemBeautifier();
        poemBeautifier.beautify(" Zwykly tekst ", txt -> txt.toUpperCase());
        poemBeautifier.beautify("Zwykly tekst", txt -> "<3 " + txt + " <3" );
        poemBeautifier.beautify("Zwykly tekst", txt -> txt.toLowerCase());
        poemBeautifier.beautify("Zwykly tekst", txt -> txt + " " + txt);
        poemBeautifier.beautify("Zwykly tekst", txt -> txt.toUpperCase() + " " + txt.toLowerCase());
        poemBeautifier.beautify("Zwykly tekst", txt -> "grrr i znowu " + txt + " @@##@@#!!!");


        /*
        System.out.println("Using Stream to generate even numbers from 1 to 20");
        NumbersGenerator.generateEven(20);*/
    }
}
