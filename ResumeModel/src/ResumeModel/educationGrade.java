package ResumeModel;

public enum educationGrade {
    NONE(0),
    MIDDLE(1),
    HIGH_MIDDLE(2),
    NOT_HIGH(3),
    HIGH(4);

    private int num;

    educationGrade(int num) { this.num = num; }
}
