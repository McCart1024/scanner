package training;

public class Trainerkonstr {

    public Trainerkonstr(){
        this.setName("fsd");
    }


    public Trainerkonstr(String name){
        this.name=name;
    }

    public Trainerkonstr(String name, int dateOfBirth){
        this.name=name;
        this.dateOfBirth=dateOfBirth;
    }


    private String name;
    private int dateOfBirth;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(int dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }
}
