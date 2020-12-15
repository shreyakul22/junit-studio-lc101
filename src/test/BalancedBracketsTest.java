package test;

import main.BalancedBrackets;
import org.junit.Test;

import java.util.Scanner;
import static org.junit.Assert.*;

public class BalancedBracketsTest {

    //TODO: add tests here

    @Test
    public void emptyTest() {
        assertEquals(true, true);
    }



    @Test
    public void onlyBracketsReturnsTrue () {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]"));
    }

    @Test
    public void bracketsAndStringReturnsTrue () {
        assertTrue(BalancedBrackets.hasBalancedBrackets("Launch code[]"));
    }

    @Test
    public void nestedReturnsTrue () {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[[]]"));
    }

    @Test
    public void BracketMatchesReturnsTrue () {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[[[Launch] [code]]]"));

    }

    @Test
    public void OnlyStringReturnsTrue(){
        assertTrue(BalancedBrackets.hasBalancedBrackets("Launch code"));
    }

    @Test
    public void StringWithinBracketsReturnsTrue () {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[Launch code]"));
    }


    @Test
    public void BracketWithStringMisMatchReturnsFalse () {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[Launch]]code[]"));
    }


    @Test
    public void OnlyLeftBracketWithStringReturnsFalse () {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[Launch code"));
    }

    @Test
    public void onlyRightBracketsReturnsFalse () {
        assertFalse(BalancedBrackets.hasBalancedBrackets("Launch code]"));
    }

    @Test
    public void WrongOrderBracketsReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[[][[]"));
    }

    @Test
    public void otherMisMatchReturnsFalse () {
        assertFalse(BalancedBrackets.hasBalancedBrackets("{Launch code]"));
    }


    @Test
    public void LeftBracketWithStringReturnFalse () {
        assertFalse(BalancedBrackets.hasBalancedBrackets("][Launch[][code]]"));
    }

    @Test
    public void noBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("String"));
    }

    @Test
    public void emptyStringReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets(""));
    }

    @Test
    public void illegalArgumentError() {
        try {
            BalancedBrackets.hasBalancedBrackets(null);
        } catch (Exception e) {
            assertTrue(e instanceof NullPointerException);
        }
    }




}
