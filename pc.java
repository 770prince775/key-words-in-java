public class pc { // aab ye h final method in java // 
    
  final  void m1(){// aab ye yaha error show kara dega // 
        System.out.println("i am in m1 method ");
    }
 
}
class demo extends pc{
    void m1(){ // final method kabhi bhi override nahi ho sakta h // 
        System.out.println(" i am in demo class ");
    }
    public static void main(String[] args) {
        pc p = new pc();
        p.m1(); 
        
    }
}
