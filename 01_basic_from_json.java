/* 
    this example uses the basics of gson to create and populate a class object from a string.
*/

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class MyClass {
    public static void main(String args[]) {
        
        Gson mGson;                             // declare the Gson object
        mGson = new GsonBuilder().create();     // instantiate a gson builder 
        
        dataThing mdataThing;                   // declare target object

         // instantiate object from formatting JSON string!!
        mdataThing = mGson.fromJson("{x:4}", dataThing.class);
                                                // instantiate a new object from JSON, PROVIDED
                                                // we have a json string where the :
                                                //     - field names match those in the class arg , AND
                                                //     - data types match those in the class arg 
                                                // 
                                                // Therefore, this works because we have:
                                                //  - an int named x 


        int y=25;
        int z=mdataThing.x+y;

        System.out.println("Sum of x+y = " + z);
    }
    
    public class dataThing {
        public int x;
    }
}