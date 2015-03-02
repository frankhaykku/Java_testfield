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
        System.out.println(male);
        System.out.println(female);

        SolarSystemPlanets earth = SolarSystemPlanets.EARTH;
        System.out.println(earth.toString());

        String name = "URANUS";
        SolarSystemPlanets uranus = SolarSystemPlanets.valueOf(name);
        System.out.println(uranus);
    }
}
