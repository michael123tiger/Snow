class Parent(
    public void add(){
        System.out.println("HELLO WORLD");
    }
)
class child extends Parent{
    void display(){
        add();
    }
}
public class Inheritance{
    public static void main(String arg[]){
    Child obj = new child();
    obj.display();
}