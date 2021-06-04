package de.flox.recyclinghof2;

import de.flox.recyclinghof2.objekte.Dose;
import de.flox.recyclinghof2.objekte.Karton;
import de.flox.recyclinghof2.utils.Muell;

import java.util.ArrayList;

public class Recyclinghof {

    private ArrayList<Object> objectArrayList = new ArrayList<>();

    public static void main(String[] args) {

        Recyclinghof recyclinghof = new Recyclinghof();

        Muell[] muell = new Muell[]{
                new Dose(0.250),
                new Karton(0.150),
                new Karton(0.50),
                new Dose(0.350)
        };
        recyclinghof.recycle(muell);
    }
    public void recycle(Muell[] muellObjects){

        for(Muell muell : muellObjects){

            if(muell instanceof Muell){
                muell.recycle();
            }

        }

    }

    public ArrayList<Object> getObjectArrayList() {
        return objectArrayList;
    }
}
