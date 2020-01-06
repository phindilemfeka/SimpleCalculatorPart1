import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

public class Main {
    public static void main(String[] args) {
        SimpleCalculator object = new SimpleCalculator();
        System.out.println(object.add(2,5));

        SimpleCalculator object2 = new SimpleCalculator();
        System.out.println(object2.product(2,5));
    }
}
