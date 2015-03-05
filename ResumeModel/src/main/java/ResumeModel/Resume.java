package main.java.ResumeModel;

import java.util.*;

/*
    Временная структура, стоит еще продумать типы переменных и поля.
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
    private educationGrade grade;       // Уровень обраования
    private String universityName;      // Имя университета
    private String faculty;             // Факультет
    private String specialization;      // Специализация
    private int year;                   // Год окончания
    private String nativeLang;            // Родной язык
    private List<String> anotherLang = new ArrayList<String>();           // Другой язык (владение)
    private boolean exp;                // Опыт работы

    public Resume()
    {
        lastName = "Иванов";
        name = "Иван";
        birthDate = new GregorianCalendar(1985, 1, 13);
        sex = false;
        city = "Магнитагорск";
        phoneNumber = "+79123456789";
        nationality = "Русское";
        crossOver = true;
        grade = educationGrade.NOT_HIGH;
        universityName = "Выдуманный университет";
        faculty = "Информационные технологии и вычислительные техники";
        specialization = "Програмнное обеспечыение вычислительной техники";
        year = 2010;
        nativeLang = "Русский";
        anotherLang.add("Английский");
        exp = true;
    }

    public boolean addNewAnotherLang(String lang) {
        if(lang == null || lang.isEmpty())
            return false;

        anotherLang.add(lang);

        return true;
    }

    public String getAllAnotherLang()
    {
        String langList = "";

        for(String lang : anotherLang)
                langList += lang + ", ";

        langList = langList.trim();
        langList = langList.substring(0, langList.length() - 1);
        return langList;
    }

    @Override
    public boolean equals(Object anObject) {
        if(!(anObject instanceof Resume))
            return false;

        Resume object = (Resume)anObject;

        if(!lastName.equals(object.lastName)) return false;
        if(!name.equals(object.name)) return false;
        if(!birthDate.equals(object.birthDate)) return false;
        if(sex != object.sex) return false;
        if(!city.equals(object.city)) return false;
        if(!phoneNumber.equals(object.phoneNumber)) return false;
        if(!nationality.equals(object.nationality)) return false;
        if(crossOver != object.crossOver) return false;
        if(!grade.toString().equals(object.grade.toString())) return false;
        if(!universityName.equals(object.universityName)) return false;
        if(!faculty.equals(object.faculty)) return false;
        if(!specialization.equals(object.specialization)) return false;
        if(year != object.year) return false;
        if(!nativeLang.equals(object.nativeLang)) return false;
        if(!anotherLang.equals(object.anotherLang)) return false;
        if(exp != object.exp) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return  lastName.length() +
                name.length() +
                birthDate.get(Calendar.DAY_OF_WEEK) +
                birthDate.get(Calendar.MONTH) +
                birthDate.get(Calendar.YEAR) +
                (sex ? 1 : 0) +
                city.length() +
                phoneNumber.length() +
                nationality.length() +
                (crossOver ? 1 : 0) +
                 +
                universityName.length() +
                faculty.length() +
                specialization.length() +
                year +
                nativeLang.length() +
                anotherLang.size() +
                (exp ? 1 : 0) * 17;
    }

    @Override
    public String toString() {
        return "Резюме по умолчанию: \n" +
                "Фамилия: " + lastName +
                "\nИмя: " + name +
                "\nДата рождения: " + birthDate.get(Calendar.DAY_OF_MONTH) + "." + birthDate.get(Calendar.MONTH) +
                "." + birthDate.get(Calendar.YEAR) +
                "\nПол: " + (sex ? "Женский" : "Мужской") +
                "\nГород проживания: " + city +
                "\nТелефон: " + phoneNumber +
                "\nГражданство: " + nationality +
                "\nГотов ли к переезду: " + (crossOver ? "Да" : "Нет") +
                "\nУровень образования: " + grade +
                "\nНаименование университета: " + universityName +
                "\nФакультет: " + faculty +
                "\nСпециализация: " + specialization +
                "\nГод окончания: " + year +
                "\nРодной язык : " + nativeLang +
                "\nДругие языки: " + getAllAnotherLang() +
                "\nОпыт: " + (exp ? "Есть" : "Нет");
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
