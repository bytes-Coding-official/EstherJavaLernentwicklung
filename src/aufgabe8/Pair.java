package aufgabe8;

/**
 * Klasse Pair, Beispiel für Generics mit Wildcards
 *
 * @author Holger Arndt & Ich, Werner Hofschuster
 * @version 30.05.2007
 */

public class Pair<T0, T1> implements Cloneable {
    private T0 elem0;
    private T1 elem1;

    public Pair(T0 e0, T1 e1) {
        elem0 = e0;
        elem1 = e1;
    }

    public T0 get0() {
        return elem0;
    }

    public T1 get1() {
        return elem1;
    }

    public void set(T0 e0, T1 e1) {
        elem0 = e0;
        elem1 = e1;
    }


    @Override
    public String toString() {
        return "Pair{" +
                "elem0=" + elem0 +
                ", elem1=" + elem1 +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        //WILDCARD CAST.
        Pair<?, ?> pair = (Pair<?, ?>) o;
        return elem0.equals(pair.elem0) && elem1.equals(pair.elem1);
    }


    @Override
    protected Object clone() {
        return new Pair<T0, T1>(elem0, elem1);
    }
}
