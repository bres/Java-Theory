package theStatic.staticEx2;

public class Main {

    public static void main(String[] args) {
        // I can access the method sayHi() because is public, but I need to create an object of the class Option1 first
        Option1 option1 = new Option1();
        option1.sayHi();

        // I can not access the method sayHi() because is private which means that is accessible only inside the declared class.
        Option2 option2 = new Option2();
        //option2.sayHi();

        // I can access the method sayHi() because is protected which means that is accessible in the same package and subclasses.
        Option3 option3 = new Option3();
        option3.sayHi();

        //On option4 class the sayHi() method is declared as static which means there is no need to instantiate the class to call the method
        Option4.sayHi();
    }

}
