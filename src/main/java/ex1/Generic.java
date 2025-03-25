package ex1;

public class Generic<T> {

    public static <T extends Phone> void method1(T argument) {
        argument.phoncall();
    }

    public static <T extends Smartphone> void method2(T argument) {
        argument.phoncall();
        argument.takePhoto();
    }
}
