import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class MyClass {
    public static void main(String args[]) {
        
        Gson mGson;                             // declare the Gson object
        mGson = new GsonBuilder().create();     // instantiate a gson builder 
        
        dataThing mdataThing;                   // declare target object

        mdataThing = mGson.fromJson("{x:4, myList :[12, 13, 14]}", dataThing.class);
                                                // works because we have:
                                                //  - an int named x 
                                                //  - an int array named myList 

        int y=25;
        int z=mdataThing.x+y;

        System.out.println("Sum of x+y = " + z);
        System.out.println("array in:" + mdataThing.myList[0] + " " + mdataThing.myList[1]  + " " + mdataThing.myList[2]);
    }
    
    public class dataThing {
        public int x;
        public int[] myList;
    }
}