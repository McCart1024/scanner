package training;

public class TrainerMain {

    public static void main(String[] args) {
        Trainer trainer = new Trainer();
        /*
        trainer.name = "John Doe";
        trainer.yearOfBirth=1980;
        System.out.println(trainer.name+" , "+trainer.yearOfBirth);
        */

        Trainer anotherTrainer= new Trainer();
        /*
        anotherTrainer.name="Jack Doe";
        anotherTrainer.yearOfBirth=1975;
        System.out.println(anotherTrainer.name+" , "+anotherTrainer.yearOfBirth);
        */

        anotherTrainer.setName("Aladar");
        anotherTrainer.setYearOfBirth((1944));
        System.out.println(anotherTrainer.getName()+" ; " +anotherTrainer.getNameAndYearOfBirth());
        anotherTrainer.setName("Joe Doe");
        System.out.println(anotherTrainer.getName());

        trainer.setName("Majomfenyo");
        System.out.println(trainer.getName());


    }
}
