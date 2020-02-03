package edu.cnm.deepdive;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Objects;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

class PalindromesTest {

  @ParameterizedTest
  @CsvFileSource(resources = "/affirmative.csv")
  void isPalindromeAffirmative(String testCase) {
      assertTrue(Palindromes.isPalindrome(testCase));
    }

  @ParameterizedTest
  @CsvFileSource( resources = "/negative.csv")
  void isPalindromeNegative(String testCase) {
      assertFalse(Palindromes.isPalindrome(testCase));
    }
  }
