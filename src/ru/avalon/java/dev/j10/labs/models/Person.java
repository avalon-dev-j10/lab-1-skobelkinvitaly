package ru.avalon.java.dev.j10.labs.models;

//import ru.avalon.java.dev.j10.labs.commons.Address;

/**
 * Представление о человеке.
 * <p>
 * С точки зрения задания человек представляется как сущность, наделённая:
 * <ol>
 * <li>именем;
 * <li>паспортными данными;
 * <li>пропиской по месту жительства.
 * </ol>
 */
public class Person  {

    String name;
    String secondName;
    String surname;
    String patronymic;

    public Person(String name, String secondName, String patronymic, String surname) {
        this.name = name;
        this.secondName = secondName;
        this.surname = surname;
        this.patronymic = patronymic;
    }

    /**
     * Возврвщает полное имя человека.
     * <p>
     * Если у человека есть Имя, Фамилия и Отчество, то возвращет Имя, Фимилию и
     * Отчество, разделённые пробелом.
     * <p>
     * Если у человека нет Отчества, но есть второе имя, то возвращает Имя,
     * Первую букву второго имени, и Фамилию, разделённые пробелом. После
     * Инициала второго имени должна стоять точка. Например, "Джером К. Джером".
     * <p>
     * Если у человека нет ни Отчества ни Второго имени, а есть только Имя и
     * Фамилия, то возвращает их, разделённые пробелом.
     *
     * @return имя человека в виде строки.
     */
    public String getFullName() {
        String s;
        String gap = " ";

        if (secondName.length() > 1) {
            secondName = secondName.trim();
            secondName = secondName.toUpperCase();
            secondName = secondName.substring(0, 1) + ".";
            s = name + gap + secondName + gap + surname;

        } else {
            if (patronymic.length() > 1) {
                s = name + gap + patronymic + gap + surname;

            } else {
                s = name + gap + surname;
            }

        }
        return s;
    }

    /**
     * Возвращает адрес, по которому проживает человек.
     * <p>
     * Возвращаемый адрес соответствует месту постоянной регистрации человека,
     * согласно паспортным данным.
     *
     * @return адрес регистрации в виде строки.
     */
    public String getAddress() {

        return null;
        /*
         * TODO(Студент): Закончить определение метода 'getAddress()' класса 'Person'
         */
    
    }
    }
