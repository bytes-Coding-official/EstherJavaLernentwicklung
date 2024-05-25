package aufgabe9;

public class Maximierer<T extends Comparable<T>> {

    private T max;

    public Maximierer<T> neuesElement(T ti) {
        if (max == null) {
            max = ti;
        } else if (ti.compareTo(max) > 0) {
            max = ti;
        }
        return this;
    }

    public T getMaximum() throws IllegalStateException {
        if (max == null) throw new IllegalStateException("Liste ist leer");
        return max;
    }

    public static void main(String[] args) {
        
        //nache einen aufruf mit Maximierer und String und teste es 5mal
        
        Maximierer<String> max = new Maximierer<>();
        max.neuesElement("a").neuesElement("b").neuesElement("c").neuesElement("d").neuesElement("e");
        System.out.println(max.getMaximum());

        Maximierer<String> max1 = new Maximierer<>();
        System.out.println(max1.getMaximum());
        
    }

}
