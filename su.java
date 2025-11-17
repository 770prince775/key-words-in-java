public class su {
    int i = 10; // ye h super keyword in java super means parent class in java // 
    
}
class bc extends su{
    int i = 20;
    void show(int i ){
  System.out.println(i); // ye 30 value output kara dega // 
  System.out.println(this.i); // yaha pe 20 value ko print kara dega // 
  System.out.println(super.i); // yaha pe ye 10 value ko print kara dega kyuki ye parent class ko access kara dega  // 
    }
    public static void main(String[] args) {
        bc b = new bc(); 
        b.show(30); 
    }  
}
