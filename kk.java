public class kk { // this keyword in constructor //
    kk(){
        System.out.println(" this is the no argument constructor");
    }
    kk(int a ){
        this(); // this keyword in constructor in java // 
        System.out.println("this is the paramaterized constructor in java ");
    }
    public static void main(String[] args) {
        kk k = new kk(10); 
    }
}
