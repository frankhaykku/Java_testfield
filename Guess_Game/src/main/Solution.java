package main;

import game.Game;

import java.io.IOException;

public class Solution {
    public static void main(String[] args) throws IOException
    {
        Game game = new Game(3, 10);

        game.addCustomPhrases("Ой, это число какое - то мелкое :( ...", -1);
        game.addCustomPhrases("Придумай что-нибудь поменьше, Амиго...", 1);
        game.addCustomPhrases("Молодец! Мне понравилось с тобой играть :)", 0);

        game.start();
    }
}
