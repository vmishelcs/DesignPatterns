package main.java.adapterpattern.arraylistexample;

import java.util.Enumeration;
import java.util.Iterator;

public class EnumerationAdapter implements Enumeration {
    Iterator it;

    public EnumerationAdapter(Iterator it) {
        this.it = it;
    }

    @Override
    public boolean hasMoreElements() {
        return it.hasNext();
    }

    @Override
    public Object nextElement() {
        return it.next();
    }
}
