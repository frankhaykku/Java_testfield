package ResumeModel;

import java.util.*;

/*
    Временная структура, стоит еще продумать типы переменных и поля.
 */

/**
 * Created by Сергей on 25.02.2015.
 */
public class Resume {
    private String lastName;            // Фамилия
    private String name;                // Имя
    private Calendar birthDate;             // Дата рождения
    private boolean sex;                // Пол (false - м, true - ж)
    private String city;                // Город проживания
    private String phoneNumber;         // Номер телефона
    private String nationality;         // Гражданство
    private boolean crossOver;          // Возможен ли переезд
    private byte educationLevel;        // Уровень обраования (0 - нет, 1 - среднее, 2 - среднее высшее, 3 - незаконченое
                                        // высшее, 4 - высшее
    private String education[] = {"нет", "среднее", "среднее высшее", "незаконченое высшее", "высшее"};
    private String universityName;      // Имя университета
    private String faculty;             // Факультет
    private String specialization;      // Специализация
    private int year;                   // Год окончания
    private String nativeLang;            // Родной язык
    private ArrayList<String> anotherLang = new ArrayList<String>();           // Другой язык (владение)
    private boolean exp;                // Опыт работы

    public static void main(String[] args) {
        Resume resume = new Resume();
        System.out.println(resume);
    }

    public Resume()
    {
        this.lastName = "Иванов";
        this.name = "Иван";
        this.birthDate = new GregorianCalendar(1985, 1, 13);
        this.sex = false;
        this.city = "Магнитагорск";
        this.phoneNumber = "+79123456789";
        this.nationality = "Русское";
        this.crossOver = true;
        this.educationLevel = 3;
        this.universityName = "Выдуманный университет";
        this.faculty = "Информационные технологии и вычислительные техники";
        this.specialization = "Програмнное обеспечыение вычислительной техники";
        this.year = 2010;
        this.nativeLang = "Русский";
        this.anotherLang.add("Английский");
        this.exp = true;
    }

    public String getAllAnotherLang()
    {
        String langs = "";

        for(String lang : this.anotherLang)
                langs += lang + " ";
        langs.trim();
        return langs;
    }

    @Override
    public boolean equals(Object obj) {
        Resume node = (Resume)obj;
        boolean isEqual = true;
        int diff = 0;

        if(!this.lastName.equals(node.lastName))
            diff++;

        if(!this.name.equals(node.name))
            diff++;

        if(!this.birthDate.equals(node.birthDate))
            diff++;

        if(this.sex != node.sex)
            diff++;

        if(!this.city.equals(node.city))
            diff++;

        if(!this.phoneNumber.equals(node.phoneNumber))
            diff++;

        if(!this.nationality.equals(node.nationality))
            diff++;

        if(this.crossOver != node.crossOver)
            diff++;

        if(this.educationLevel != node.educationLevel)
            diff++;

        if(!this.universityName.equals(node.universityName))
            diff++;

        if(!this.faculty.equals(node.faculty))
            diff++;

        if(!this.specialization.equals(node.specialization))
            diff++;

        if(this.year != node.year)
            diff++;

        if(!this.nativeLang.equals(node.nativeLang))
            diff++;

        if(!this.anotherLang.equals(node.anotherLang))
            diff++;

        if(this.exp != node.exp)
            diff++;

        if(diff > 0)
            isEqual = false;

        return isEqual;
    }

    @Override
    public int hashCode() {
        return  this.lastName.length() +
                this.name.length() +
                this.birthDate.get(Calendar.DAY_OF_WEEK) +
                this.birthDate.get(Calendar.MONTH) +
                this.birthDate.get(Calendar.YEAR) +
                (this.sex ? 1 : 0) +
                this.city.length() +
                this.phoneNumber.length() +
                this.nationality.length() +
                (this.crossOver ? 1 : 0) +
                this.educationLevel +
                this.universityName.length() +
                this.faculty.length() +
                this.specialization.length() +
                this.year +
                this.nativeLang.length() +
                this.anotherLang.size() +
                (this.exp ? 1 : 0) * 17;
    }

    @Override
    public String toString() {
        return "Резюме по умолчанию: \n" +
                "Фамилия: " + this.lastName +
                "\nИмя: " + this.name +
                "\nДата рождения: " + this.birthDate.get(Calendar.DAY_OF_MONTH) + "." + this.birthDate.get(Calendar.MONTH) +
                "." + this.birthDate.get(Calendar.YEAR) +
                "\nПол: " + (this.sex ? "Женский" : "Мужской") +
                "\nГород проживания: " + this.city +
                "\nТелефон: " + this.phoneNumber +
                "\nГражданство: " + this.nationality +
                "\nГотов ли к переезду: " + (this.crossOver ? "Да" : "Нет") +
                "\nУровень образования: " + this.education[this.educationLevel] +
                "\nНаименование университета: " + this.universityName +
                "\nФакультет: " + this.faculty +
                "\nСпециализация: " + this.specialization +
                "\nГод окончания: " + this.year +
                "\nРодной язык : " + this.nativeLang +
                "\nДругие языки: " + getAllAnotherLang() +
                "\nОпыт: " + (this.exp ? "Есть" : "Нет");
    }
}
