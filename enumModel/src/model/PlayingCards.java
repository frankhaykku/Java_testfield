package model;

/**
 * Перечисление, которое описывает масти игральных карт
 */

public enum PlayingCards {
    CLUBS("Крести"),
    SPADES("Пики"),
    HEARTS("Черви"),
    DIAMONDS("Буби");

    private final String kind;

    PlayingCards(String kind) { this.kind = kind; }

    public String toString() { return "Масть вашей карты " + this.kind; }
}
