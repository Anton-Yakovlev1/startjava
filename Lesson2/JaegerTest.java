public class JaegerTest {
    public static void main(String[] args) {
        Jaeger jaegerOne = new Jaeger();
        Jaeger jaegerTwo = new Jaeger("Tacit Ronin", "Mark-1", "Japan", 74.37f, 7.450f, 8, 7, 3);
        System.out.println("Model name: " + jaegerTwo.getModelName());
        jaegerOne.setModelName("Horizon Brave");
        System.out.println("Model name: " + jaegerOne.getModelName());
    }
}