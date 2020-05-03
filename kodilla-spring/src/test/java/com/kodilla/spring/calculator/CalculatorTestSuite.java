package com.kodilla.spring.calculator;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CalculatorTestSuite {
    @Test
    public void testCalculations() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Calculator calculator = context.getBean(Calculator.class);
        //When
        double addResult = calculator.add(5, 5);
        double subResult = calculator.sub(10, 2);
        double mulResult = calculator.mul(2, 2);
        double divResult = calculator.div(20, 2);
        //Then
        Assert.assertEquals(10, addResult, 0.01);
        Assert.assertEquals(8, subResult, 0.01);
        Assert.assertEquals(4,mulResult, 0.01);
        Assert.assertEquals(10, divResult, 0.01);

    }
}
