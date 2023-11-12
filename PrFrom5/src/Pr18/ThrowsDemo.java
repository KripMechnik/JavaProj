package Pr18;

public class ThrowsDemo {
    public void printMessage(String key) {
        try {
            String message = getDetails(key);
            System.out.println( message );
        } catch (NullPointerException e) {
            System.out.println(e.getMessage());
        }
    }
    public String getDetails(String key) {
        if(key == null) {
            throw new NullPointerException("null key in getDetails");
        }
        return "data for " + key; }

    public static void main(String[] args) {
        ThrowsDemo demo = new ThrowsDemo();
        demo.printMessage(null);
    }
}
