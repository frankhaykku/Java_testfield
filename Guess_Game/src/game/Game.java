package game;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 * Created by golubnichij_sa on 25.02.15.
 */
public class Game {
    private int tries;                                              /* Номер текущей попытки */
    private int triesCount;                                         /* Общее количество попыток */
    private int range = 10;                                         /* Диапозон чисел, которые использует компьютер для выбора числа */
    private int random;
    private ArrayList<String> phrasesGuess = new ArrayList<String>();    /* Набор фраз, если угадал число */
    private ArrayList<String> phrasesLarger = new ArrayList<String>();   /* Набор фраз, если число больше */
    private ArrayList<String> phrasesSmaller = new ArrayList<String>();  /* Набор фраз, если число меньше */

    /* Конструктор для инициализации игры используя только один параметр count - количество попыток для угадывания числа */
    public Game(int count)
    {
        this.triesCount = count;
        this.tries = 0;
        this.random = (int)(Math.random() * this.range);

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

    /* Конструктор для инициализации игры из двух параметров count - количество попыток для угадывания числа,
     * range - диапозон чисел, среди которых, компьютер выбирет число
     */
    public Game(int count, int range)
    {
        this.triesCount = count;
        this.tries = 0;

        /* Проверка, на то, чтобы диапозон был больше 10, иначе будем использовать диапозон числел от 0...9 */
        if(range > 10)
            this.range = range;

        this.random = (int)(Math.random() * range);

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

        System.out.println("Привет, друг! Я загадал число от 0 до "+ this.range +", попробуй отгадать за " + this.triesCount + " попытки его!");

        while(!isGuessed)
        {
            ++this.tries;

            int myNumber = Integer.parseInt(reader.readLine()); // Считываем число пользователя
            int guess = isMyNumber(myNumber);                   // Проверяем, угадал ли пользователь число

            if(((this.triesCount + 1) - this.tries)!= 0)
                if(guess > 0)
                    System.out.println(this.phrasesLarger.get((int) ((Math.random() * this.phrasesLarger.size()))) + "... Не забывай, что у тебя осталось " + (this.triesCount - this.tries) + " попыток(и)!");
                else if(guess < 0)
                    System.out.println(this.phrasesSmaller.get((int) ((Math.random() * this.phrasesSmaller.size()))) + "... Не забывай, что у тебя осталось " + (this.triesCount - this.tries) + " попыток(и)!");
                else
                    isGuessed = true;

            if((this.triesCount - this.tries) == 0)
                break;
        }

        if(!isGuessed)
            System.out.println("Извини, но ты не угадал. Мое число было " + this.random);
        else
            System.out.println("Хей, Амиго, ты выйграл! Ты смог угадать число, которое я загадал! :)");

        return true;
    }


    /* Метод, для проверки числа пользователя и "загадоного" числа
     * Возвращает 0, если число угадано.
     * Возвращает -1, если число меньше загадоного
     * Возвращает 1, если число больше загадоного
     */
    public int isMyNumber(int number)
    {
        int guess = 0;

        if(this.random == number)
            return guess;

        return number < this.random ? 1 : -1;
    }

    /* Метод для получения загадоного числа. В основном использовался для отладки */
    public int getRandom() { return this.random; }

    /* Метод для добавления пользовательских фраз в наборы фраз */
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
            default : { break; }
        }
    }
}
