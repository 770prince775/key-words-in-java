public class tr {
    void display(){
        System.out.println("hello bro ");
    }
    void show(){
        this.display(); // this keyword in java bro // 
    } // this keyword  used in java to invoke the current class //  
    public static void main(String[] args) {
        tr t = new tr();
        t.display(); 
    }
    
}
