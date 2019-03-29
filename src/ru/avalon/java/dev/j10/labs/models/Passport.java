package ru.avalon.java.dev.j10.labs.models;

/**
 * Представление о паспортных данных человека.
 * <p>
 * Паспортные данные должны включать:
 * <ol>
 * <li> серию и номер документа;
 * <li> имя;
 * <li> фамилию;
 * <li> отчество;
 * <li> второе имя;
 * <li> день рождения;
 * <li> дату выдачи;
 * <li> орган, выдавший документ.
 * </ol>
 */
public class Passport {

    public String mestoVudachi;
    public String dataVudachi;
    public int seriaPassporta;
    public int nomerPassporta;
    public String datarogdenia;

    /*
     * TODO(Студент): Закончить определение класса.
     *
     * 1. Объявить атрибуты класса.
     *
     * 2. Определить необходимые методы класса. Подумайте о
     *    том, какие методы должны существовать в классе,
     *    чтобы обеспечивать получение всей необходимой
     *    информации о состоянии объектов данного класса.
     *    Все ли поля обязательно будут проинициализированы
     *    при создании экземпляра?
     *
     * 3. Создайте все необходимые конструкторы класса.
     *
     * 4. Помните о возможности существования перегруженных
     *    конструкторов.
     *
     * 5. Обеспечте возможность использования класса за
     *    пределами пакета.
     */
    public String toStringPassport() {
        Person ivanov = new Person("Иван", "", "Иванович", "Иванов");
        return ivanov.name + " " + ivanov.secondName + " " + ivanov.patronymic + " " + ivanov.surname + ", "
                + "Дата рождения: " + datarogdenia
                + ". Паспорт, серия: " + seriaPassporta + ", " + "номер " + nomerPassporta + ", " + "выдан: "
                + mestoVudachi + ", " + "дата выдачи: " + dataVudachi;
    }
    
        public String toStringPassportSmith() {
        Person smith = new Person("John", "Edward", "", "Smith");
        return smith.name + " " + smith.secondName + " " + smith.patronymic + " " + smith.surname + ", "
                + "Дата рождения: " + datarogdenia
                + ". Паспорт, серия: " + seriaPassporta + ", " + "номер " + nomerPassporta + ", " + "выдан: "
                + mestoVudachi + ", " + "дата выдачи: " + dataVudachi;
    }

    public Passport(int seriaPassporta, int nomerPassporta, String mestoVudachi,
            String dataVudachi, String datarogdenia) {
        this.mestoVudachi = mestoVudachi;
        this.seriaPassporta = seriaPassporta;
        this.nomerPassporta = nomerPassporta;
        this.dataVudachi = dataVudachi;
        this.datarogdenia = datarogdenia;

    }


}
