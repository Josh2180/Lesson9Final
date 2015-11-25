
public class Blob {

    private String name;
    private static int blobcount = 0;

    public Blob() {
        name = "unknown";
        blobcount++;
    }

    public void setName(String n) {
        name = n;
    }

    public String getName() {
        return name;
    }
    
    public static int getCount(){
        return blobcount;
    }
    
    public static String id(){
        return "We are blobs";
    }
}
