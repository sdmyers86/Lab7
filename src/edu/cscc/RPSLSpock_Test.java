package edu.cscc;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class RPSLSpock_Test {

    private RPSLSpock test;

    @Before
    public void pretests() {
        test = new RPSLSpock();
    }

    @Test
    public void testSuite1() {
        Assert.assertTrue(test.isValidPick("rock"));
        Assert.assertTrue(test.isValidPick("paper"));
        Assert.assertTrue(test.isValidPick("scissors"));
        Assert.assertTrue(test.isValidPick("lizard"));
        Assert.assertTrue(test.isValidPick("spock"));
        Assert.assertFalse(test.isValidPick("pizza"));
        Assert.assertFalse(test.isValidPick("Tokyo"));
    }

    @Test
    public void testSuite2() {
        for (int i = 0; i < 1000000; i++) {
            Assert.assertNotNull(test.isValidPick(RPSLSpock.generatePick()));
        }
    }

    @Test
    public void testSuite3() {
        Assert.assertTrue(test.isComputerWin("rock", "scissors"));
        Assert.assertTrue(test.isComputerWin("rock", "lizard"));
        Assert.assertTrue(test.isComputerWin("paper", "rock"));
        Assert.assertTrue(test.isComputerWin("paper", "spock"));
        Assert.assertTrue(test.isComputerWin("scissors", "paper"));
        Assert.assertTrue(test.isComputerWin("scissors", "lizard"));
        Assert.assertTrue(test.isComputerWin("lizard", "paper"));
        Assert.assertTrue(test.isComputerWin("lizard", "spock"));
        Assert.assertTrue(test.isComputerWin("spock", "rock"));
        Assert.assertTrue(test.isComputerWin("spock", "scissors"));
        Assert.assertFalse(test.isComputerWin("scissors","spock"));
        Assert.assertFalse(test.isComputerWin("lizard","rock"));
    }

}
