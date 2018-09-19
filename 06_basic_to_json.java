import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class MyClass {
    public static void main(String args[]) {
        
        Gson mGson = new Gson();
        
        dataThing mdataThing = new dataThing();
        mdataThing.x = 5;
        mdataThing.y = 100;
        mdataThing.msg = "hello world";

        String foo = mGson.toJson(mdataThing);

        System.out.println(foo);
    }
    
}

class dataThing {
    public int x;
    public int y;
    public String msg;
    private int privateVal;

    public dataThing() {
        privateVal = 17;
    }

    public int getprivateVal() {
        return privateVal;
    }

}