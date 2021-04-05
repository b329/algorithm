package DynamicProgramming;

import generalFunction.WildcardGeneric;

public class WildcardSample {

    public void callWildcardMethod() {
        // dㅓ떤 객체를 wildcard 로 선언하고, 그 객체의 값은 가여올 수 있다.
        // 하지만, 객체에 제네릭 타입으로 값을 지정하는 것은 "불가능"하다.
        WildcardGeneric<String> wildcard = new WildcardGeneric<String>();
        // WildcardGeneric<?> wildcard = new WildcardGeneric<String>();
        wildcard.setWildcard("A");
        wildcardMethod(wildcard);
        wildcardMethod2(wildcard);
    }

    public void wildcardMethod(WildcardGeneric<String> C) {
        String value = C.getWildcard();
        System.out.println(value);
    }

    public void wildcardMethod2(WildcardGeneric<?> C) {
        Object value = C.getWildcard();
        System.out.println(value);
    }

    public static void main(String[] args) {
        WildcardSample sample = new WildcardSample();
        sample.callWildcardMethod();

    }
}
