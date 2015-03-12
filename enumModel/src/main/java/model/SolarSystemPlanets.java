package model;

/**
 * Перечисление, которое описывает планеты солнечной системы
 */

public enum SolarSystemPlanets {
    SUN("Солнце"),
    MERCURY("Меркурий"),
    VENUS("Венера"),
    EARTH("Земля"),
    MARS("Марс"),
    JUPITER("Юпитер"),
    SATURN("Сатурн"),
    URANUS("Уран"),
    NEPTUNE("Нептун");

    private final String name;

    SolarSystemPlanets(String name) { this.name = name; }

    @Override
    public String toString() { return "Мы живем на планете " + name + ". Ура!"; }
}
