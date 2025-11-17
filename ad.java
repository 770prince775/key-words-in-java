public class ad {
    void show(){
        System.out.println(" i am in class ad ");
    }
}
class df extends ad{
    void kg(){ // ye h super keyword in method in java //   
        super.show();  
        
    }
public static void main(String[] args) {
    df d = new df();
    d.kg();
}
}
  