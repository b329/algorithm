package generalFunction;

public class callBoundedWildcardMethod {


    public void wildcardMethodGeneric() {
        WildcardGeneric<Car> wildcard = new WildcardGeneric<Car>();
        wildcard.setWildcard(new Car("AUDI TT"));
        WildcardGeneric<SportsCar> wildcard2 = new WildcardGeneric<SportsCar>();
        wildcard2.setWildcard(new SportsCar("AUDI TT2"));

        WildcardGeneric<String> wildcard3 = new WildcardGeneric<String>();
        genericMethods(wildcard3, "DATA");

        WildcardGeneric<Car> wildcard4 = new WildcardGeneric<Car>();
        // multiGenericMethod(wildcard4, "DATA", "Another");

        // wildcardMethod(wildcard);
        boundedWildcardMethod(wildcard);
        boundedWildcardMethod(wildcard2);
    }

    public void wildcardMethod(WildcardGeneric<String> c) {

        String value = c.getWildcard();
        System.out.print(value);
    }

    public void boundedWildcardMethod(WildcardGeneric<? extends Car> c) {
        Car value = c.getWildcard();
        System.out.print(value);
    }

    public <T> void genericMethods(WildcardGeneric<T> c, T addValue) {
        c.setWildcard(addValue);
        T value = c.getWildcard();
        System.out.print(value);
    }

    public <S, T extends Car> void multiGenericMethod(WildcardGeneric<T> c, T addValue, S another) {
        c.setWildcard(addValue);
        T value = c.getWildcard();
        Car valueOfCar = c.getWildcard();
        System.out.print(value);
        System.out.print(valueOfCar);
    }


    public static void main(String[] args) {
        callBoundedWildcardMethod callBoundedWildcardMethod = new callBoundedWildcardMethod();
        callBoundedWildcardMethod.wildcardMethodGeneric();
    }
}
