public class Human {

    String name;
    int age;
    int aadharNumber;

//    String name = "Ajay";
//    int age = 13;

    Human(String _name, int age, int aadharNumber) {
        name = _name;
        this.age = age; // 'this' refers to the instance variable
        this.aadharNumber = aadharNumber;
    }

    Human(String _name, int age) {
        name = _name;
        this.age = age; // 'this' refers to the instance variable
    }



    void humanInfo() {
        System.out.println("Name is: " + this.name + ", Age is: " + age);
    }

    String getName() {
        return this.name;
    }
}
