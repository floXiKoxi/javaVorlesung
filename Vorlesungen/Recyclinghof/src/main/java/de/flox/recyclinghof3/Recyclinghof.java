package de.flox.recyclinghof3;

import de.flox.recyclinghof3.objekte.Auto;
import de.flox.recyclinghof3.objekte.Dose;
import de.flox.recyclinghof3.objekte.Karton;
import de.flox.recyclinghof3.utils.Muell;
import de.flox.recyclinghof3.utils.Recyclebar;

import java.util.ArrayList;

public class Recyclinghof {

    private ArrayList<Object> objectArrayList = new ArrayList<>();

    public static void main(String[] args) {

        Recyclinghof recyclinghof = new Recyclinghof();

        Recyclebar[] muell = new Recyclebar[]{
                new Dose(0.250),
                new Karton(0.150),
                new Karton(0.50),
                new Dose(0.350),
                new Auto()
        };
        recyclinghof.recycle(muell);
    }
    public void recycle(Recyclebar[] recyclebars){

        for(Recyclebar recyclebar : recyclebars){

            if(recyclebar instanceof Recyclebar){
                recyclebar.recycle();
            }

        }

    }

    public ArrayList<Object> getObjectArrayList() {
        return objectArrayList;
    }
}
