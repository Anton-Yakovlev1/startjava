public class Methods {
    public static String getCurrentName() {
        return Thread.currentThread().getStackTrace()[2].getMethodName();
    }
}