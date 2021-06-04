package de.flox.recyclinghof2.objekte;

import de.flox.recyclinghof2.utils.Muell;

public class Karton extends Muell {

    public Karton(double gewicht) {
        super(gewicht);
    }

    @Override
    public void recycle() {
        System.out.println("Der Karton mit dem Gewicht "+getGewicht()+"kg wird eingeweicht");
    }

}
