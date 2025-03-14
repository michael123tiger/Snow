Class Child extends parent {
    void display(){
        System.out.println("hello");
    }
}
class Child extends parent{
    void display(){
        System.out.println("home");
    }
}
public Class Simple{
    public static void main(String args[]){
        Child obj=new child();
        obj.display();
    }
}