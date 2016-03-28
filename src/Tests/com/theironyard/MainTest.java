package com.theironyard;

import org.junit.Test;

import java.util.HashSet;

import static org.junit.Assert.*;

/**
 * Created by noellemachin on 3/28/16.
 */
public class MainTest {

    @Test
    public void testIsFlush() throws Exception {
        HashSet<Card> hand = new HashSet<>();
        hand.add(new Card (Card.Suit.CLUBS, Card.Rank.ACE));
        hand.add(new Card (Card.Suit.CLUBS, Card.Rank.TWO));
        hand.add(new Card (Card.Suit.CLUBS, Card.Rank.THREE));
        hand.add(new Card (Card.Suit.CLUBS, Card.Rank.FOUR));
        assertTrue(Main.isFlush(hand));
    }

    @Test
    public void testIsStraightFlush() throws Exception {

    }

    @Test
    public void testIsStraight() throws Exception {

    }

    @Test
    public void testIsFourOfKind() throws Exception {

    }

    @Test
    public void testIsThreeOfKind() throws Exception {

    }

    @Test
    public void testIsTwoOfKind() throws Exception {

    }
}