package simple_factory_model;

public class Client {
    public static void main(String[] args) {
        NVwa person;
        person = Person.getPerson("R");
        person.display();
    }
}