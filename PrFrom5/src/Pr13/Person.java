package Pr13;

public class Person {
    private String name;
    private String surname;
    private String patronymic;

    public Person(String name, String surname, String patronymic) {
        this.name = name;
        this.surname = surname;
        this.patronymic = patronymic;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    @Override
    public String toString() {
        if (!this.name.isEmpty() && !this.surname.isEmpty() && !this.patronymic.isEmpty()){
            return this.surname + " " + this.name.charAt(0) + "." + this.patronymic.charAt(0) + ".";
        } else {
            return "Некоторые поля не заполнены";
        }
    }

    public static void main(String[] args) {
        Person man1 = new Person("Александр", "Иванов", "Владимирович");
        Person man2 = new Person("Александр", "", "Владимирович");
        System.out.println(man1);
        System.out.println(man2);
    }
}
