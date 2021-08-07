package SubClasses;


public class Student extends Person {
    // Attributes to Students
    private Integer Ra;
    private String course;
    private String semester;

    // Methods
    public Integer getRa() { return Ra; }
    public String getCourse() { return course; }
    public String getSemester() { return semester; }

    public void setRa(Integer ra) { Ra = ra; }
    public void setCourse(String course) { this.course = course; }
    public void setSemester(String semester) { this.semester = semester; }

    //Constructor
    public Student( Integer Rg, String name, String email, Integer Ra, String course, String semester) {
        super(Rg, name, email); // Person Constructor
        this.Ra = Ra ;
        this.course = course ;
        this.semester = semester;
    }

    @Override
    public String toString() {
        return "Student{" +
                "Rg=" + Rg +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", Ra=" + Ra +
                ", course='" + course + '\'' +
                ", semester='" + semester + '\'' +
                '}';
    }
}
