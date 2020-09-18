package ArgumentPassing.CallByValue;

public class Main {
    public static void main(String[] args) {

        CallByValue cbv = new CallByValue();
        int x = 10;
        System.out.println("Before Calling: "+x);

        cbv.change(x);
        System.out.println("After Calling: "+x);

    }
}

