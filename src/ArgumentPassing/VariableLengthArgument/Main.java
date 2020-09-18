package ArgumentPassing.VariableLengthArgument;

public class Main {
    public static void main(String[] args) {
        VariableLengthArgument vla = new VariableLengthArgument();

        vla.add(10, 30, 49);
        vla.add(10, 30, 49,55);
        vla.add(10, 30, 49,66,77);
        vla.add(10, 30, 49,66,22,44);
        vla.add(10, 30, 49, 676, 765,4432);
    }
}
