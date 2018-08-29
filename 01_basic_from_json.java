/* 
    this example uses the basics of gson to create and populate a class object from a string.
*/

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class MyClass {
    public static void main(String args[]) {
        
        Gson mGson;
        mGson = new GsonBuilder().create();
        
        dataThing mdataThing;
        mdataThing = mGson.fromJson("{x:4}", dataThing.class);
        
        int y=25;
        int z=mdataThing.x+y;

        System.out.println("Sum of x+y = " + z);
    }
    
    public class dataThing {
        public int x;
    }
}