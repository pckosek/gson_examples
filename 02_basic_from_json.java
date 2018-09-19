import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class MyClass {
    public static void main(String args[]) {
        
        Gson mGson;                             // declare the Gson object
        mGson = new GsonBuilder().create();     // instantiate a gson builder 
        
        dataThing mdataThing;                   // declare target object

        mdataThing = mGson.fromJson("{x:4, y:12}", dataThing.class);
                                                // works because we have an int named x and an int named y
        
        int z= mdataThing.x + mdataThing.y;

        System.out.println("Sum of x+y = " + z);
    }
    
    public class dataThing {
        public int x;
        public int y;
    }
}