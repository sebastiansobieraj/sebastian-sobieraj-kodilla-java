package com.kodilla.patterns.strategy.social;

import org.junit.Assert;
import org.junit.Test;

public class UserTestSuite {

    @Test
    public void testDefaultSharingStrategies() {

        //Giver
        User andrzej = new Millenials("Andrzej Kowalski");
        User zbigniew = new YGeneration("Zbigniew Boniek");
        User krzysztof = new ZGeneration("Krzysztof Ibisz");

        //When
        String andrzejShare = andrzej.sharePost();
        System.out.println(andrzej.getName() +  " form millenias shared on " + andrzejShare);
        String zbigniewShare = zbigniew.sharePost();
        System.out.println(zbigniew.getName() + " from YGeneration shared on " + zbigniewShare);
        String krzysztofShare = krzysztof.sharePost();
        System.out.println(krzysztof.getName() + " from ZGeneration shared on " + krzysztofShare);

        //Then
        Assert.assertEquals("Facebook", andrzejShare);
        Assert.assertEquals("Snapchat", zbigniewShare);
        Assert.assertEquals("Twitter", krzysztofShare);
    }

    @Test
    public void testIndividualSharingStrategy() {

        //Given
        User andrzej = new Millenials("Andrzej Kowalski");

        //When
        String andrzejShare = andrzej.sharePost();
        System.out.println(andrzej.getName() +  " form millenias shared on " + andrzejShare);
        andrzej.setSocialPublisher(new TwitterPublisher());
        andrzejShare = andrzej.sharePost();
        System.out.println(andrzej.getName() +  " form millenias now shared on " + andrzejShare);

        //Then
        Assert.assertEquals("Twitter", andrzejShare);
    }
}
