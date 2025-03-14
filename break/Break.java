class third extends Parent{
    void helper(){

    }
}
public class Break{
    public static void main (String arg[]){
        int i=0;
        while(i<11){
            if(i%2==0){
                if(i>5){
                    break;
                }
                System.out.println(i);
            }
            i=i+1;
        }
    }
}