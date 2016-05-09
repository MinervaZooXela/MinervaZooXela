package gt.edu.intecap.minervazoo.myapplication.modelo;

import gt.edu.intecap.minervazoo.myapplication.R;

/**
 * Created by GT on 09/05/2016.
 */
public class Animales {

    private String nombre;
    private int idDrawable;
    public Animales (String nombre, int idDrawable){
        this.nombre = nombre;
        this.idDrawable = idDrawable;
    }

    public String getNombre(){
        return nombre;
    }

    public int getIdDrawable(){
        return idDrawable;
    }

    public int getId(){
        return nombre.hashCode();
    }

    public static Animales[] ITEMS ={
            new Animales("Aguila", R.mipmap.imagen),
            new Animales("Buho", R.drawable.buho_hd),
            new Animales("Guacamaya", R.drawable.guaca_hd),
            new Animales("Leon", R.mipmap.imagen),
            new Animales("Mapache", R.mipmap.imagen),
            new Animales("Mono", R.mipmap.imagen),
            new Animales("Pizote", R.mipmap.imagen),
            new Animales("Tecolote", R.mipmap.imagen),
            new Animales("Tucan", R.mipmap.imagen),
            new Animales("Zorro", R.mipmap.imagen),
            new Animales("Jaguar", R.mipmap.imagen),
            new Animales("Ovejas", R.mipmap.imagen),
            new Animales("Coyotes", R.mipmap.imagen),
            new Animales("Pecari de collar", R.mipmap.imagen),
    };

    public static Animales getItem(int id){
        for (Animales item : ITEMS){
            if (item.getId()==id){
                return item;
            }
        }
        return null;
    }
}
