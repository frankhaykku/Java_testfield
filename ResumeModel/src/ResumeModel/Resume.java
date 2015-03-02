package ResumeModel;

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
    private educationGrade grade;       // Уровень обраования (0 - нет, 1 - среднее, 2 - среднее высшее, 3 - незаконченое
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

    public String getAllAnotherLang()
    {
        String langs = "";

        for(String lang : anotherLang)
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

        if(this.grade.ordinal() != node.grade.ordinal())
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
                "\nУровень образования: " + education[grade.ordinal()] +
                "\nНаименование университета: " + universityName +
                "\nФакультет: " + faculty +
                "\nСпециализация: " + specialization +
                "\nГод окончания: " + year +
                "\nРодной язык : " + nativeLang +
                "\nДругие языки: " + getAllAnotherLang() +
                "\nОпыт: " + (exp ? "Есть" : "Нет");
    }
}
