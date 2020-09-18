package ArgumentPassing.CallByReference;

public class Main {
    public static void main(String[] args) {
        CallByReference cbr = new CallByReference();
        cbr.name = "Rubel";
        System.out.println("Before Calling: "+cbr.name);

        cbr.change(cbr);
        System.out.println("After Calling: "+cbr.name);

    }
}
