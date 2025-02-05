public class FinalizeExample {
    String name ="abc";
    @Override
    protected void finalize() throws Throwable {
        System.out.println("Object is being garbage collected");
    }
}
