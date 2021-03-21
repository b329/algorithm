


public class CatchExam {
    public static void main(String[] args) {
        try {
            ExeptionExam ex = new ExeptionExam();
            int[] array = {1, 2};
            ex.get50thItem(array);
        } catch (Exception e) {
            System.out.println("ArrayIndexOutOfBoundsException");

        }
    }

}

