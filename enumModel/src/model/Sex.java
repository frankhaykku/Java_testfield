package model;

/**
 * Перечисление пола
 */

public enum Sex {
    MALE{
        public String toString() { return "Мужчина"; }
    },
    FEMALE {
        public String toString() { return "Женщина"; }
    };
}
