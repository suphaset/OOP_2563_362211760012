package LAB8;

public class PersonApp {
    public static void main(String[] args) {

        //objects
        Person p1 = new Person();
        p1.setName("Suphaset");
        p1.setAge(22);

        Person p2 = new Teacher("RUTS");
        p2.setName("Piyapong Senanut");
        p2.setAge(37);


        Person p3 = new Doctor("Thungsong");
        p3.setName("Nattapong Kaewboonma");
        p3.setAge(40);

        p1.introduce();
        p2.introduce();
        p3.introduce();
    }
}