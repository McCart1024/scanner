package training;

public class TrainerkonstrMain {


    public static void main(String[] args) {

        Trainerkonstr trainerkonstr = new Trainerkonstr();
        System.out.println(trainerkonstr.getName());

        Trainerkonstr trainerkonstr2 = new Trainerkonstr("Joe doe");
        System.out.println(trainerkonstr2.getName());

        Trainerkonstr trainerkonstr3 = new Trainerkonstr("harmadik doe",3);
        System.out.println(trainerkonstr3.getName()+" , "+trainerkonstr3.getDateOfBirth());

    }
}
