package gt.edu.intecap.minervazoo.myapplication.vista;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.text.Html;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.ViewFlipper;

import gt.edu.intecap.minervazoo.myapplication.R;

public class Noticias extends Fragment {

    private static final int INTERVALO = 5000;
    private ViewFlipper flipper;
    private TextView paginaOficial;
    private String urlPaginaOficial;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View vista = inflater.inflate(R.layout.fragment_noticias, container, false);
        flipper = (ViewFlipper)vista.findViewById(R.id.flipper);
        flipper.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                flipper.showNext();
            }
        });
        flipper.setFlipInterval(INTERVALO);
        flipper.startFlipping();
        paginaOficial = (TextView) vista.findViewById(R.id.tvPaginaOficial);
        paginaOficial.setMovementMethod(LinkMovementMethod.getInstance());
        urlPaginaOficial = "<a href='https://www.facebook.com/ZOOLOGICO-MINERVA-QUETZALTENANGO-159173550812934'> Visita nuestra página oficial </a>";
        paginaOficial.setText(Html.fromHtml(urlPaginaOficial));
        return vista;
    }

    @Override
    public void onResume() {
        super.onResume();
        flipper.startFlipping();
    }

    @Override
    public void onPause() {
        super.onPause();
        flipper.stopFlipping();
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
    }
}
