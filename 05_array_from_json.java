import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class MyClass {
    public static void main(String args[]) {
        
        Gson mGson;                             // define the Gson object
        mGson = new GsonBuilder().create();     // create a gson builder 
        
        dataThing mdataThing;                   // define target object
        mdataThing = mGson.fromJson("{x:4, myList :[12, 13, 14]}", dataThing.class); // instantiate object from formatting JSON string!!
        
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