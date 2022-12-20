package Day6_Dropdown_SeleniumWaits;

import com.github.javafaker.Faker;
import org.junit.Test;

public class C01_Faker {
    //Faker degerler uretmek ıcın Faker Classından bir obje uretir ve var olan metodları kullanırız.

    @Test
    public void fakerExample(){

        //Faker objesini olusturuyoruz
        Faker faker = new Faker();
        System.out.println(faker.name().firstName());

        System.out.println(faker.name().lastName());

        System.out.println(faker.address().fullAddress());
    }
}
