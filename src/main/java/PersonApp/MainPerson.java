package PersonApp;

public class MainPerson {
    public static void main(String[] args) {
        Language polish = new Polish();
        Language germany = new Germany();
        Language english = new English();
        Language russian = new Russian();

        Person linguist = new Person(polish);
        linguist.learn(germany);
        linguist.learn(english);
        linguist.learn(russian);

        Person littleLinguist = new Person(germany);
        littleLinguist.learn(english);

        Person russianPerson = new Person(russian);

        linguist.sayHello();
        littleLinguist.sayHello();
        russianPerson.sayHello();

    }
}