package gt.edu.intecap.minervazoo.myapplication.vista;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;

import gt.edu.intecap.minervazoo.myapplication.R;
import gt.edu.intecap.minervazoo.myapplication.utilidades.AdaptadorAnimales;

public class Galeria extends Fragment {

    private GridView gridLayout;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View vista = inflater.inflate(R.layout.fragment_galeria, container, false);
        AdaptadorAnimales animales = new AdaptadorAnimales(getContext());
        gridLayout = (GridView) vista.findViewById(R.id.grid);
        gridLayout.setAdapter(animales);
        return vista;
    }
}
