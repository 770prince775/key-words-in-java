public class ac {
  static  int i = 10; // static method static data ko hi access kar sakte h // 
    static void display()
    {
        show();  
        System.out.println(i); 
    }
    static void show(){
        System.out.println("this is the show method ");
    }
     public static void main(String[] args) {
        ac.display();
     }
}
  