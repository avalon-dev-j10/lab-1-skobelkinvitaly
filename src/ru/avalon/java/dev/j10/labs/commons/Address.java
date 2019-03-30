/*
 * TODO(Студент): Создайте класс Address.
 *
 * 1. Добавте файл в пакет ru.avalon.java.dev.j10.labs.commons.
 *
 * 2. Создайте класс, видимый из пакета. Подумайте о том
 *    Какое имя должен иметь класс, если он объявленн в этом
 *    файле.
 *
 * 3. Подумайте над тем, какие переменные должены быть
 *    определены в классе.
 *
 * 4. Подумайте над тем, какие методы должны быть объявлены
 *    в классе.
 */
package ru.avalon.java.dev.j10.labs.commons;

public class Address {

    private int zipcode;
    private String region;
    private String city;
    private String street;
    private int houseNumber;
    private String houseLitera;
    private int houseKorpus;
    private int flatNumber;
    private static final String COMA = ", ";
    private static final String DOM = "дом ";
    private static final String KORPUS = "корпус ";
    private static final String FLAT = "квартира ";

    public String toStringAddress() {
        if (houseKorpus > 0 & flatNumber > 0 & (houseLitera.trim().length() == 0)) {
            return zipcode + COMA + region
                    + COMA + city + COMA + street + COMA + DOM + houseNumber
                    + COMA + KORPUS + houseKorpus
                    + COMA + FLAT + flatNumber;
        } else {
            return zipcode + COMA + region
                    + COMA + city + COMA + street + COMA + houseNumber;

        }
    }

    public Address(int zipcode, String region,
            String city, String street, int housenumber,
            String houseLitera, int houseKorpus, int flatNumber) {
        this.zipcode = zipcode;
        this.region = region;
        this.city = city;
        this.street = street;
        this.houseNumber = housenumber;
        this.houseLitera = houseLitera;
        this.houseKorpus = houseKorpus;
        this.flatNumber = flatNumber;
    }
}
