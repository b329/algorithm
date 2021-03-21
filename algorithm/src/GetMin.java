public class GetMin {
    public void testGetMin() {
        System.out.println(getMin(2,2,3));
        System.out.println(getMin(2,1,2));
        System.out.println(getMin(2,3,2));
        System.out.println(getMin("a","b","a"));
        System.out.println(getMin("b","c","b"));
        System.out.println(getMin("a","b","a"));
    }

    public <T extends Comparable<T>> T getMin(T ...a) {

        T TminT = a[0];
        for (T tempM : a ) {
            if (tempM.compareTo(TminT) == 0 ) {
              TminT = tempM;
            }
        }
        return TminT;
    }

    public static void main(String[] args) {
        GetMin getMin = new GetMin();
        getMin.testGetMin();
    }
}
