package com.kodilla.patterns.strategy.social;

import com.kodilla.patterns.strategy.social.publishers.TwitterPublisher;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UserTestSuite {

    @BeforeEach
    void printNewLine() {
        System.out.println();
    }

    @Test
    void testDefaultSharingStrategies() {
        //Given
        User userMillenials = new Millenials("User Millenials [facebook default]");
        User userYGeneration = new YGeneration("User YGeneration [snapchat default]");
        User userZGeneration = new ZGeneration("User ZGeneration [Twitter default]");
        //When
        String millenialsPublisher = userMillenials.sharePost();
        String yGenerationPublisher = userYGeneration.sharePost();
        String zGenerationPublisher = userZGeneration.sharePost();
        System.out.println(userMillenials.getName() + " will use " + millenialsPublisher);
        System.out.println(userYGeneration.getName() + " will use " + yGenerationPublisher);
        System.out.println(userZGeneration.getName() + " will use " + zGenerationPublisher);
        //Then
        assertEquals("Facebook publisher", millenialsPublisher);
        assertEquals("Snapchat publisher", yGenerationPublisher);
        assertEquals("Twitter publisher", zGenerationPublisher);
    }

    @Test
    void testIndividualSharingStrategies() {
        //Given
        User userMillenials = new Millenials("User Millenials [facebook default]");
        //When
        String millenialsPublisher = userMillenials.sharePost();
        System.out.println(userMillenials.getName() + " will use " + millenialsPublisher);
        userMillenials.setSocialPublisher(new TwitterPublisher());
        millenialsPublisher = userMillenials.sharePost();
        System.out.println(userMillenials.getName() + " will use " + millenialsPublisher);
        //Then
        assertEquals("Twitter publisher", millenialsPublisher);
    }
}
