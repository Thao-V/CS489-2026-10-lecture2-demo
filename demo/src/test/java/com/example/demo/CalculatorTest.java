package com.example.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CalculatorTest {
  private Calculator calc;
  @BeforeEach 
  public void setup(){
    calc = new Calculator();
  }
  @Test
  public void shouldAddTwoNumbers(){
    assertEquals(5, calc.add(2, 3));
  }
}
