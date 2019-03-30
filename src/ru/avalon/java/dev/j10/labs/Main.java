package ru.avalon.java.dev.j10.labs;

import ru.avalon.java.dev.j10.labs.models.Person;
import ru.avalon.java.dev.j10.labs.commons.Address;
import ru.avalon.java.dev.j10.labs.models.Passport;

public class Main {

    public static void main(String[] args) {
        Person ivanov = new Person("Иван", "", "Иванович", "Иванов");
        String ivanovFullName;
        ivanovFullName = ivanov.getFullName();
        System.out.println(ivanovFullName);

        Person smith = new Person("John", "Edward", "", "Smith");
        String smithFullName;
        smithFullName = smith.getFullName();
        System.out.println(smithFullName);

        String ivanovAddress;
        Address ivanovAdress = new Address(353900, "Ленинградская область",
                "город Мурино", "улица Новая", 7, "литера A", 1, 1023);
        ivanovAddress = ivanovAdress.toStringAddress();
        System.out.println(ivanovAddress);

        String smithAddress;
        Address smithAdress = new Address(94065, "California", "Redwood City", "Oracle Parkway", 500, "", 0, 0);
        smithAddress = smithAdress.toStringAddress();
        System.out.println(smithAddress);
    
       
        String smithPassport;
        Passport smithP = new Passport(0101, 999111, "New-York Police Department №1", "12/12/1979", "01/09/1961");
        smithPassport = smithP.toStringPassportSmith();
        System.out.println(smithPassport);
        
        
        String ivanovPassport;
        Passport ivanovP = new Passport(3021, 466109, "Полицейский участок №1", "05/01/1999", "11/10/1981");
        ivanovPassport = ivanovP.toStringPassportIvanov();
        System.out.println(ivanovPassport);
        
        
    }


    /*
         * TODO(Студент): Создайте экземпляры класса 'Person'  
         *
         * 1. Проинициализируейте переменную 'ivanov', так,
         *    чтобы она адресовала объект типа 'Person'
         *    описывающий человека по имени 'Иванов Иван Иванович'.
         *
         * 2. Проинициализируейте переменную 'smith', так,
         *    чтобы она адресовала объект типа 'Person'
         *    описывающий человека по имени 'John Edvard Smith'.
     */

 /*
         * TODO(Студент): Создайте несколько строковых переменных:
         *
         * 1. Строковую переменную, содержащую полное имя
         *    человека, описанного объектом, адресованным
         *    переменной 'ivanov'.
         *
         * 2. Строковую переменную, содержащую полное имя
         *    человека, описанного объектом, адресованным
         *    переменной 'smith'.
         *
         * 3. Строковую переменную, содержащую адрес проживания
         *    человека, описанного объектом, адресованным
         *    переменной 'ivanov'.
         *
         * 4. Строковую переменную, содержащую адрес проживания
         *    человека, описанного объектом, адресованным
         *    переменной 'smith'.
     */

 /*
         * TODO(Студент): Выведите в консоль значения созданных строковых переменных:
         *
         * Значение каждой переменной должно быть выведено на
         * отдельной строке.
     */
}
