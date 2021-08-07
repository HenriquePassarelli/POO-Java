package SubClasses;

// Persons is a SuperClass

public class Person {

    // Attributes
    protected Integer Rg;
    protected String name;
    protected String email;

    // Methods
    public void setRg(Integer rg) { this.Rg = Rg; }
    public void setName(String name) { this.name = name; }
    public void setEmail(String email) { this.email = email; }

    public Integer getRg() { return Rg; }
    public String getName() { return name; }
    public String getEmail() { return email; }

    // Constructor
    public Person(Integer Rg, String name, String email ) {
        this.Rg = Rg ;
        this.name = name ;
        this.email = email ;
    }

    @Override
    public String toString(){

        return "Pessoa(" + "RG = " + Rg + ", Nome = " + name + ", Email = " + email +" )";
    }


}