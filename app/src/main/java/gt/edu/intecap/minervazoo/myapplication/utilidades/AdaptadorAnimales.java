package gt.edu.intecap.minervazoo.myapplication.utilidades;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import gt.edu.intecap.minervazoo.myapplication.R;
import gt.edu.intecap.minervazoo.myapplication.modelo.Animales;

/**
 * Created by GT on 09/05/2016.
 */
public class AdaptadorAnimales extends BaseAdapter{

    private Context context;
    public AdaptadorAnimales (Context context){
        this.context = context;
    }

    @Override
    public int getCount() {
        return Animales.ITEMS.length;
    }

    @Override
    public Object getItem(int position) {
        return Animales.ITEMS[position];
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null){
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = inflater.inflate(R.layout.grid_item, parent, false);
        }
        ImageView imagenAnimal = (ImageView) convertView.findViewById(R.id.imagen_animal);
        TextView nombreAnimal= (TextView) convertView.findViewById(R.id.nombre_animal);
        final Animales item = (Animales) getItem(position);
        imagenAnimal.setImageResource(item.getIdDrawable());
        nombreAnimal.setText(item.getNombre());
        return convertView;
    }
}
