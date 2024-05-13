package n2;

final class GenericMethods{

    @SafeVarargs
    static <T> void printGenericStuff(T... varargs){
        if (varargs.length != 3) throw new IllegalArgumentException("Deben ser exactamente tres elementos.");

        for (T t: varargs) System.out.println(t);
    }

}
