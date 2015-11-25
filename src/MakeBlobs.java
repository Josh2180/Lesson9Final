
public class MakeBlobs {

    public static void main(String[] args) {
        Blob b = new Blob();
        Blob c = new Blob();
        b.setName("Jeff");
        c.setName("Seyi");
        System.out.println("This is " + b.getName() + " the blob");
        System.out.println("This is " + c.getName() + " the blob");
        System.out.println("Currently I have " + Blob.getCount() + " blobs.");
        System.err.println(Blob.id());
    }

}
