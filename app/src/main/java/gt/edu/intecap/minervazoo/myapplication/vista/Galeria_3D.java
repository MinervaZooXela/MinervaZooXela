package gt.edu.intecap.minervazoo.myapplication.vista;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;

import gt.edu.intecap.minervazoo.myapplication.R;

public class Galeria_3D extends Fragment {

    private static final String URLTUCAN =
            "https://sketchfab.com/models/678419db4373402ba48dd2ee7d5b0d37/embed";
    private WebView webView;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View vista = inflater.inflate(R.layout.fragment_galeria_3d, container, false);
        recuperarRecursos(vista);
        cargarView();
        return vista;
    }

    private void cargarView() {
        webView.getSettings().setJavaScriptEnabled(true);
        webView.loadUrl(URLTUCAN);
    }

    private void recuperarRecursos(View view) {
        webView = (WebView)view.findViewById(R.id.webView);

    }
}
