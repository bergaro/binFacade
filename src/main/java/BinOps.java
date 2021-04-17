public class BinOps {

    private int integerNumA;
    private int integerNumB;

    /**
     * Переводит числа из двоичной записи в
     * строках в int, складывает и переведит
     * обратно в двоичную запись
     * @param a число А в двоичной стстеме
     * @param b число В в двоичной стстеме
     * @return результат сложения, в двоичной стстеме
     */
    public String sum(String a, String b) {
        integerNumA = Integer.parseInt(a, 2);
        integerNumB = Integer.parseInt(b, 2);
        return Integer.toBinaryString(integerNumA + integerNumB);
    }
    /**
     * Переводит числа из двоичной записи в
     * строках в int, перемножает и переведит
     * обратно в двоичную запись
     * @param a число А в двоичной стстеме
     * @param b число В в двоичной стстеме
     * @return результат сложения, в двоичной стстеме
     */
    public String mult(String a, String b) {
        integerNumA = Integer.parseInt(a, 2);
        integerNumB = Integer.parseInt(b, 2);
        return Integer.toBinaryString(integerNumA * integerNumB);
    }
}
