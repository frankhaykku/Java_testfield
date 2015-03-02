package main;

import model.PlayingCards;
import model.Sex;
import model.SolarSystemPlanets;


public class Main {
    public static void main(String[] args) {
        PlayingCards clubs = PlayingCards.CLUBS;
        PlayingCards hearts = PlayingCards.HEARTS;

        System.out.println(clubs);
        System.out.println(hearts);

        Sex female = Sex.FEMALE;
        Sex male = Sex.MALE;
        System.out.println("Пол: " + male);
        System.out.println("Пол: " + female);

        SolarSystemPlanets earth = SolarSystemPlanets.EARTH;
        System.out.println(earth);

        String name = "URANUS";
        SolarSystemPlanets uranus = SolarSystemPlanets.valueOf(name);
        System.out.println(uranus);
    }
}
