package de.flox.sort.produkte;

import java.util.Comparator;

public class AutoComparator implements Comparator<Auto> {

    @Override
    public int compare(Auto o1, Auto o2) {
        return (int) o1.getBreite() - (int) o2.getBreite();
    }
}
