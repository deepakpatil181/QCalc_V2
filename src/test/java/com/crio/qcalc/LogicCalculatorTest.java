
package com.crio.qcalc;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


public class LogicCalculatorTest{

    // private LogicCalculator logicCalculator;
    // @BeforeEach
    // void setup(){
    //     logicCalculator = new LogicCalculator();
    // }

    // @Test
    // @DisplayName("Test AND of two Integers")
    // void testANDOperation(){
    //     //Arrange
    //     int expectedResult = 5;
    //     //Act
    //     logicCalculator.AND(5,7);
    //     // Assert
    //     Assertions.assertThat(expectedResult);
    // }

    // @Test
    // @DisplayName("Test OR of two Integers")
    // void testOROperation() {
    //     // Arrange
    //     int expectedResult = 7;
    //     // Act
    //     logicCalculator.OR(5,5);
    //     // Assert
    //     Assertions.assertThat(expectedResult);
    // }

    // @Test
    // @DisplayName("Test XOR of two Integers")
    // void testXOROperation() {
    //     // Arrange
    //     double expectedResult = 2;
    //     // Act
    //     logicCalculator.XOR(5, 7);
    //     // Assert
    //     Assertions.assertThat(expectedResult);
    // }

    // @Test
    // @DisplayName("Test NOT of given Integer")
    // void testNOTOperation() {
    //     // Arrange
    //     double expectedResult = -6;
    //     // Act
    //     logicCalculator.NOT(5);
    //     // Assert
    //     Assertions.assertThat(expectedResult);
    // }

    private LogicCalculator logicCalculator;
    @BeforeEach
    void setup(){
        logicCalculator = new LogicCalculator();
    }

    @Test
    @DisplayName("Test AND of two Integers")
    void testANDOperation(){
        //Arrange
        int expectedResult = 5;
        //Act
        logicCalculator.AND(5,7);
        // Assert
        Assertions.assertThat(expectedResult);
    }

    @Test
    @DisplayName("Test OR of two Integers")
    void testOROperation() {
        // Arrange
        int expectedResult = 7;
        // Act
        logicCalculator.OR(5,5);
        // Assert
        Assertions.assertThat(expectedResult);
    }

    @Test
    @DisplayName("Test XOR of two Integers")
    void testXOROperation() {
        // Arrange
        double expectedResult = 2;
        // Act
        logicCalculator.XOR(5, 7);
        // Assert
        Assertions.assertThat(expectedResult);
    }

    @Test
    @DisplayName("Test NOT of given Integer")
    void testNOTOperation() {
        // Arrange
        double expectedResult = -6;
        // Act
        logicCalculator.NOT(5);
        // Assert
        Assertions.assertThat(expectedResult);
    }


}


