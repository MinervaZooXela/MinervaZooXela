package gt.edu.intecap.minervazoo.myapplication.vista;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import gt.edu.intecap.minervazoo.myapplication.R;

public class Galeria_3D extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View vista = inflater.inflate(R.layout.fragment_galeria_3d, container, false);
        return vista;
    }
}
