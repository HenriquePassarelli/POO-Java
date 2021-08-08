package SubClasses;

public class Professor extends Person{
    // Attributes
    private Integer professorId;
    private String title;
    private String area;

    // Methods
    public Integer getStudentId() { return professorId; }
    public String getTitle() { return title; }
    public String getArea() { return area; }

    public void setStudentId(Integer studentId) { this.professorId = studentId; }
    public void setTitle(String title) { this.title = title; }
    public void setArea(String area) { this.area = area; }

    // Constructor
    public Professor(Integer Rg, String name, String email, Integer professorId, String title, String area ){
        super(Rg,name,email);
        this.professorId = professorId;
        this.title = title;
        this.area = area;
    }

    @Override
    public String toString() {
        return "Professor{" +
                "Rg=" + Rg +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", studentId=" + professorId +
                ", title='" + title + '\'' +
                ", area='" + area + '\'' +
                '}';
    }
}
