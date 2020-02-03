package edu.cnm.deepdive;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Objects;
import org.junit.jupiter.api.Test;

class PalindromesTest {

  static final String[] positiveTestData = {
      "2020-02-02",
      "racecar",
      "Race Car",
      "radar",
      "Rad aR",
      "",
      "a",
      "Aa",
      "A man, a plan, a canal - Panama!",

  };

  static  final String [] negativeTestData = {
      "xy",
      "sonar",
      "Madame, I'm Adam",
      "Burrito Dog",
      "2020-02-03"
  };

  @Test
  void isPalindromeAffirmative() {
    for (String testCase : positiveTestData) {
      assertTrue(Palindromes.isPalindrome(testCase));
    }
  }
  @Test
  void isPalindromeNegative() {
    for (String testCase : negativeTestData) {
      assertFalse(Palindromes.isPalindrome(testCase));
    }
  }
}