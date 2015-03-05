package main.java.ResumeModel;

public enum educationGrade {
    NONE("нет"),
    MIDDLE("среднее"),
    HIGH_MIDDLE("среднее высшее"),
    NOT_HIGH("неоконченное высшее"),
    HIGH("высшее");

    private String grade;

    educationGrade(String grade) { this.grade = grade; }

    public String toString() { return grade; }
}
