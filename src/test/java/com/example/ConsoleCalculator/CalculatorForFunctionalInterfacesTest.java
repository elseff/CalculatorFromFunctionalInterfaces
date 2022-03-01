package com.example.ConsoleCalculator;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.util.Scanner;

public class CalculatorForFunctionalInterfacesTest {
    private String input = "";

    @Test
    public void getOperationIf_Operation_Is_Multiplication_Should_Return_True() throws Exception {
        input = "*";
        System.setIn(new ByteArrayInputStream(input.getBytes()));

        Assertions.assertThat(CalculatorForFunctionalInterfaces
                .getOperation(new Scanner(System.in))
                .getResult(5.0, 6.0))
                .isEqualTo(30.0);
    }
    @Test
    public void getOperationIf_Operation_Is_Division_Should_Return_True() throws Exception {
        input = "/";
        System.setIn(new ByteArrayInputStream(input.getBytes()));

        Assertions.assertThat(CalculatorForFunctionalInterfaces
                .getOperation(new Scanner(System.in))
                .getResult(5.0, 6.0))
                .isEqualTo(0.8333333333333334);
    }
    @Test
    public void getOperation_If_Operation_Is_Additional_Should_Return_True()throws Exception {
        input = "+";
        System.setIn(new ByteArrayInputStream(input.getBytes()));

        Assertions.assertThat(CalculatorForFunctionalInterfaces
                .getOperation(new Scanner(System.in))
                .getResult(5.0, 6.0))
                .isEqualTo(11.0);

    }
    @Test
    public void getOperation_If_Operation_Is_Subtraction_Should_Return_True()throws Exception{
        input = "-";
        System.setIn(new ByteArrayInputStream(input.getBytes()));

        Assertions.assertThat(CalculatorForFunctionalInterfaces
                .getOperation(new Scanner(System.in))
                .getResult(5.0, 6.0))
                .isEqualTo(-1.0);
    }

    @Test

    public void getOperationIfDenominatorIsZero() throws Exception {
        input = "/";
        System.setIn(new ByteArrayInputStream(input.getBytes()));

        Assertions.assertThat(CalculatorForFunctionalInterfaces
                .getOperation(new Scanner(System.in))
                .getResult(10.0, 0.0))
                .isEqualTo(0.0);
    }


    @Test
    public void getOperationIfSymbolIsNotOperation() throws Exception {
        input = "A";
        System.setIn(new ByteArrayInputStream(input.getBytes()));

        Assertions.assertThat(CalculatorForFunctionalInterfaces
                .getOperation(new Scanner(System.in))
                .getResult(10.0, 5.0))
                .isEqualTo(0.0);

    }
}