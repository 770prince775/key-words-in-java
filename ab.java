public class ab {
     static void display(){ // static method belong to the class not the method // 
        System.out.println(1);
    }
    public static void main(String[] args) {   
       // directly class ke name se method ko call kara sakete h aab // 
       // kyuki ye method aab static h //
       ab.display(); // ye direct call ho rha h class ke name se or method se // 
       // agar object create karte h tho memory occupy karta h //    
    }
    
} 
