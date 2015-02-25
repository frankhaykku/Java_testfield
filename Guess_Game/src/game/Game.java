package game;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 * Created by golubnichij_sa on 25.02.15.
 */
public class Game {
    private static int tries;
    private static int triesCount;
    private static int range = 10;
    private static int random;
    private ArrayList<String> phrasesGuess = new ArrayList<String>();
    private ArrayList<String> phrasesLarger = new ArrayList<String>();
    private ArrayList<String> phrasesSmaller = new ArrayList<String>();

    public Game(int count)
    {
        triesCount = count;
        tries = 0;
        random = (int)(Math.random() * range);

        phrasesGuess.add("Амиго, ну давай, назови число: ");
        phrasesGuess.add("Ты ведь знаешь это число, и оно: ");
        phrasesGuess.add("Вижу по глазам, что ты хочешь назвать число, называй: ");
        phrasesGuess.add("И это число: ");
        phrasesGuess.add("Хочу назвать число и это: ");

        phrasesLarger.add("Нет, друг, мое число больше!");
        phrasesLarger.add("Ха, а число то больше");
        phrasesLarger.add("Близко, но мое число все таки больше");
        phrasesLarger.add("Слишком низко летишь, Амиго!");
        phrasesLarger.add("Тебе нужно брать выше, друг! ;)");

        phrasesSmaller.add("Мое число меньше :(");
        phrasesSmaller.add("Ого, какое большое число, но мое меньше.");
        phrasesSmaller.add("Бери ниже!");
        phrasesSmaller.add("Мое число меньше в сравнении с твоим!");
        phrasesSmaller.add("Нет, оно меньше твоего, друг!");

    }

    public Game(int count, int range)
    {
        triesCount = count;
        tries = 0;

        if(range > 10)
            Game.range = range;

        random = (int)(Math.random() * range);

        phrasesGuess.add("Амиго, ну давай, назови число: ");
        phrasesGuess.add("Ты ведь знаешь это число, и оно: ");
        phrasesGuess.add("Вижу по глазам, что ты хочешь назвать число, называй: ");
        phrasesGuess.add("И это число: ");
        phrasesGuess.add("Хочу назвать число и это: ");

        phrasesLarger.add("Нет, друг, мое число больше!");
        phrasesLarger.add("Ха, а число то больше");
        phrasesLarger.add("Близко, но мое число все таки больше");
        phrasesLarger.add("Слишком низко летишь, Амиго!");
        phrasesLarger.add("Тебе нужно брать выше, друг! ;)");

        phrasesSmaller.add("Мое число меньше :(");
        phrasesSmaller.add("Ого, какое большое число, но мое меньше.");
        phrasesSmaller.add("Бери ниже!");
        phrasesSmaller.add("Мое число меньше в сравнении с твоим!");
        phrasesSmaller.add("Нет, оно меньше твоего, друг!");

    }

    public boolean start() throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        boolean isGuessed = false;

        System.out.println("Привет, друг! Я загадал число от 0 до "+ range +", попробуй отгадать за " + triesCount + " попытки его!");

        while(!isGuessed)
        {
            ++tries;

            int myNumber = Integer.parseInt(reader.readLine());
            int guess = isMyNumber(myNumber);

            if(((triesCount + 1) - tries)!= 0)
                if(guess > 0)
                    System.out.println(this.phrasesLarger.get((int) ((Math.random() * phrasesLarger.size()))) + "... Не забывай, что у тебя осталось " + (triesCount - tries) + " попыток(и)!");
                else if(guess < 0)
                    System.out.println(this.phrasesSmaller.get((int) ((Math.random() * phrasesSmaller.size()))) + "... Не забывай, что у тебя осталось " + (triesCount - tries) + " попыток(и)!");
                else
                    isGuessed = true;

            if((triesCount - tries) == 0)
                break;
        }

        if(!isGuessed)
            System.out.println("Извини, но ты не угадал. Мое число было " + random);
        else
            System.out.println("Хей, Амиго, ты выйграл! Ты смог угадать число, которое я загадал! :)");

        return true;
    }

    public int isMyNumber(int number)
    {
        int guess = 0;

        if(random == number)
            return guess;

        return number < random ? 1 : -1;
    }

    public int getRandom() { return random; }

    public void addCustomPhrases(String text, int group)
    {
        switch(group)
        {
            case -1:
            {
                if(text != null)
                    this.phrasesSmaller.add(text);

                break;
            }
            case 0:
            {
                if(text != null)
                    this.phrasesGuess.add(text);

                break;
            }
            case 1:
            {
                if(text != null)
                    this.phrasesLarger.add(text);

                break;
            }
        }
    }
}
