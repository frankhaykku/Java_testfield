package ResumeModel;

import java.util.Date;

/*
    Временная структура, стоит еще продумать типы переменных и поля.
 */

/**
 * Created by Сергей on 25.02.2015.
 */
public class Resume {
    private String lastName;            // Фамилия
    private String name;                // Имя
    private Date birthDate;             // Дата рождения
    private boolean sex;                // Пол
    private String city;                // Город проживания
    private String phoneNumber;         // Номер телефона
    private String nationality;         // Гражданство
    private boolean crossOver;          // Возможен ли переезд
    private byte educationLevel;        // Уровень обраования
    private String universityName;      // Имя университета
    private String faculty;             // Факультет
    private String specialization;      // Специализация
    private int year;                   // Год окончания
    private byte nativeLang;            // Родной язык
    private byte anotherLang;           // Другой язык (владение)
    private boolean exp;                // Опыт работы
}
