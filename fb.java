final class fb { // ye h final class in java //
  void m1(){
    System.out.println(" i am in m1 method ");
  }
    
}
class demo extends fb{ // aab ye yaha pe error show kar dega // 
void m1(){
    System.out.println("i am in demo class bro ");
}
public static void main(String[] args) {
 fb f = new fb();
 f.m1(); 

}
}
