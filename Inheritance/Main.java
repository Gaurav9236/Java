class Parent{
    void display(){
        privatemethod();

        System.out.println("I am in display () of parent class");
    }
    private void privatemethod(){
        System.out.println("I am in private method of parent class");
    }
}
class Child extends Parent{
    void show(){
        System.out.println("I am show () of child class");
    }
}
public class Main {
    public static void main(String[] args) {
        // Parent P = new Parent();
        // P.display();
        Child C = new Child();
        C.show();
        C.display();
        C.show();
        
    }
    
}
