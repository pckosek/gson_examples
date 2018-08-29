import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class MyClass {
    public static void main(String args[]) {
        
        Gson mGson;
        mGson = new GsonBuilder().create();
        
        dataThing mdataThing;
        mdataThing = mGson.fromJson("{x:4, y:12, msg: \"result: \"}", dataThing.class);
        
        int z= mdataThing.x + mdataThing.y;

        System.out.println(mdataThing.msg + z);
    }
    
    public class dataThing {
        public int x;
        public int y;
        public String msg;
    }
}