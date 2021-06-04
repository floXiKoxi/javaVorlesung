package de.flox.recyclinghof1;

import de.flox.recyclinghof1.objekte.Dose;
import de.flox.recyclinghof1.objekte.Karton;
import de.flox.recyclinghof1.utils.Eigenschaften;

import java.util.ArrayList;

public class Recyclinghof {

    private ArrayList<Object> objectArrayList = new ArrayList<>();

    public static void main(String[] args) {

        Recyclinghof recyclinghof = new Recyclinghof();
        recyclinghof.getObjectArrayList().add(new Karton(0.250));
        recyclinghof.getObjectArrayList().add(new Dose(0.350));
        recyclinghof.recycle(recyclinghof.getObjectArrayList().toArray());

    }
    public void recycle(Object[] objects){

        for(Object o : objects){

            if(o instanceof Eigenschaften){

                System.out.println("Gewicht: "+((Eigenschaften) o).getGewicht());

                if(o instanceof Karton){

                    ((Karton) o).einweichen();

                }else if(o instanceof Dose){

                    ((Dose) o).einschmelzen();
                }

            }

        }

    }

    public ArrayList<Object> getObjectArrayList() {
        return objectArrayList;
    }
}
