package main;

import game.Game;

import java.io.IOException;

public class Solution {
    public static void main(String[] args) throws IOException
    {
        Game game = new Game(2, 10);
        game.start();
    }
}
