public class Main {

    public static void main(String[] args) {
        BinOps binOps = new BinOps();

        System.out.println("Результат сложения 1010(10) и 1001(9): " + binOps.sum("1010", "1001"));
        System.out.println("Результат умножения 1011(11) и 1001(9): " + binOps.mult("1011", "1001"));
    }
}
