public class JaegerTest {
    public static void main(String[] args) {
        Jaeger jaegerOne = new Jaeger();
        Jaeger jaegerTwo = new Jaeger("Tacit Ronin", "Mark-1", "Japan", 74.37f, 7.450f, 8, 7, 3);
        System.out.println("Model name Jaeger2: " + jaegerTwo.getModelName());
        jaegerOne.setModelName("Horizon Brave");
        System.out.println("Model name Jaeger1: " + jaegerOne.getModelName());
        System.out.print("Move Jaeger1: ");
        jaegerOne.move();
        System.out.println("Scan Jaeger2: " + jaegerTwo.scanKaiju());
    }
}