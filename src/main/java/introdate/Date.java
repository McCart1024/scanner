package introdate;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

public class Date {

    public static void main(String[] args) {

        System.out.println(LocalDate.of(2020,1,15));
        LocalDate date=LocalDate.of(2020,1,15);

        LocalDate date2=LocalDate.of(2022,12,11);
        System.out.println(date2);


        LocalDate date3=LocalDate.of(1988, Month.OCTOBER,24);
        System.out.println(date3);

        LocalDate now=LocalDate.now();
        System.out.println(now);

        LocalTime time= LocalTime.of(11,15);
        System.out.println(time);

        LocalTime time2= LocalTime.of(11,15,15,987654321);
        System.out.println(time2);

        LocalDateTime dateTime=LocalDateTime.of(1956,12,12,23,12,24,123456987);
        System.out.println(dateTime);


        System.out.println();
        System.out.println();


        System.out.println(date2.equals(date3));

        System.out.println();

        LocalDateTime now2=LocalDateTime.now();
        System.out.println(now2);

        System.out.println(now2.getSecond());

        System.out.println();

        System.out.println(date.isBefore(date2));
        System.out.println(date2.isAfter(date));
    }
}
