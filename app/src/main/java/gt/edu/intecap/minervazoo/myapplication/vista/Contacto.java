package gt.edu.intecap.minervazoo.myapplication.vista;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

import gt.edu.intecap.minervazoo.myapplication.R;

public class Contacto extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View vista = inflater.inflate(R.layout.fragment_contacto, container, false);
        TextView call = (TextView) vista.findViewById(R.id.Llamar);
        TextView fb = (TextView) vista.findViewById(R.id.Faceboock);
        TextView tw = (TextView) vista.findViewById(R.id.Twiiter);
        TextView yt = (TextView) vista.findViewById(R.id.Youtube);
        TextView goo = (TextView) vista.findViewById(R.id.Google);


        call.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent llamar = new Intent(android.content.Intent.ACTION_DIAL,
                        Uri.parse("tel:+50222200020"));
                startActivity(llamar);
            }
        });

        fb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent facebook = new Intent(Intent.ACTION_VIEW,
                        Uri.parse("https://www.facebook.com"));
                startActivity(facebook);
            }
        });

        tw.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent twiiter = new Intent(Intent.ACTION_VIEW,
                        Uri.parse("https://www.twitter.com"));
                startActivity(twiiter);
            }
        });

        yt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent youtube = new Intent(Intent.ACTION_VIEW,
                        Uri.parse("https://www.youtube.com"));
                startActivity(youtube);
            }
        });

        goo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent google = new Intent(Intent.ACTION_VIEW,
                        Uri.parse("http://www.google.com"));
                startActivity(google);
            }
        });


        return vista;
    }
}
