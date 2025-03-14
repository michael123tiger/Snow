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
class Third extends child{
    void helper(){
        display()
    }
}
public class  Third{
    public static void main(String arg[]){
    Child obj = new child();
    obj.display();
}
}