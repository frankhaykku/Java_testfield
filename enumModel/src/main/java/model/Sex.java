package model;

/**
 * Перечисление пола
 */

public enum Sex {
    MALE{
        public String toString() { return "Мужской"; }
    },
    FEMALE {
        public String toString() { return "Женский"; }
    };
}
