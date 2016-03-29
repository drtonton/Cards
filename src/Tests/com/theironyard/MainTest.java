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
        hand.add(new Card (Card.Suit.CLUBS, Card.Rank.FIVE));
        assertTrue(Main.isFlush(hand));
    }

    @Test
    public void testIsStraightFlush() throws Exception {
        HashSet<Card> hand = new HashSet<>();
        hand.add(new Card (Card.Suit.CLUBS, Card.Rank.ACE));
        hand.add(new Card (Card.Suit.CLUBS, Card.Rank.TWO));
        hand.add(new Card (Card.Suit.CLUBS, Card.Rank.THREE));
        hand.add(new Card (Card.Suit.CLUBS, Card.Rank.FOUR));
        assertTrue(Main.isStraightFlush(hand));
    }

    @Test
    public void testIsStraight() throws Exception {
        HashSet<Card> hand = new HashSet<>();
        hand.add(new Card (Card.Suit.SPADES, Card.Rank.ACE));
        hand.add(new Card (Card.Suit.CLUBS, Card.Rank.TWO));
        hand.add(new Card (Card.Suit.CLUBS, Card.Rank.THREE));
        hand.add(new Card (Card.Suit.CLUBS, Card.Rank.FOUR));
        assertTrue(Main.isStraight(hand));
    }

    @Test
    public void testIsFourOfKind() throws Exception {
        HashSet<Card> hand = new HashSet<>();
        hand.add(new Card (Card.Suit.CLUBS, Card.Rank.ACE));
        hand.add(new Card (Card.Suit.SPADES, Card.Rank.ACE));
        hand.add(new Card (Card.Suit.DIAMONDS, Card.Rank.ACE));
        hand.add(new Card (Card.Suit.HEARTS, Card.Rank.ACE));
        assertTrue(Main.isFourOfKind(hand));
    }

    @Test
    public void testIsThreeOfKind() throws Exception {
        HashSet<Card> hand = new HashSet<>();
        hand.add(new Card (Card.Suit.CLUBS, Card.Rank.ACE));
        hand.add(new Card (Card.Suit.SPADES, Card.Rank.ACE));
        hand.add(new Card (Card.Suit.DIAMONDS, Card.Rank.ACE));
        hand.add(new Card (Card.Suit.HEARTS, Card.Rank.TWO));
        assertTrue(Main.isThreeOfKind(hand));
    }

    @Test
    public void testIsTwoPair() throws Exception {
        HashSet<Card> hand = new HashSet<>();
        hand.add(new Card (Card.Suit.CLUBS, Card.Rank.ACE));
        hand.add(new Card (Card.Suit.SPADES, Card.Rank.ACE));
        hand.add(new Card (Card.Suit.DIAMONDS, Card.Rank.TWO));
        hand.add(new Card (Card.Suit.HEARTS, Card.Rank.TWO));
        assertTrue(Main.isTwoPair(hand));
    }
}