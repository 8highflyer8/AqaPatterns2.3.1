package ru.netology.delivery.data;

import com.github.javafaker.Faker;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Random;

public  class DataGenerator {


    public static String generateDate(int shift, String pattern) {
        return LocalDate.now().plusDays(shift).format(DateTimeFormatter.ofPattern(pattern));
    }

    public static String generateCity(String locale) {
       String[] validCities = {"Абакан", "Анадырь", "Архангельск", "Астрахань", "Барнаул", "Владикавказ", "Горно-Алтайск",
                "Йошкар-Ола", "Казань", "Калининград", "Калуга", "Краснодар", "Магадан", "Магас", "Махачкала", "Нарьян-Мар", "Петропавловск-Камчатский",
                "Салехард", "Самара", "Саранск", "Саратов", "Хабаровск", "Ханты-Мансийск", "Южно-Сахалинск"};
        int rnd = new Random().nextInt(validCities.length);
        String city;
        return city = validCities[rnd];
    }


    public static String generateName(String locale) {
        Faker faker = new Faker(new Locale(locale));
        String name;
        return name = faker.name().fullName().replaceAll("ё","е");

    }

   public static String  generatePhone(String locale) {
       Faker faker = new Faker(new Locale(locale));
       String phone;
       return phone = faker.phoneNumber().phoneNumber();

    }


}