package gt.edu.intecap.minervazoo.myapplication.vista;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ZoomControls;

import gt.edu.intecap.minervazoo.myapplication.R;

public class Tour extends Fragment {

    ImageView imageView;
    ZoomControls zoomControls;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View vista = inflater.inflate(R.layout.fragment_tour, container, false);

        imageView = (ImageView) vista.findViewById(R.id.imageView);
        zoomControls = (ZoomControls) vista.findViewById(R.id.zoomControls);

        zoomControls.setOnZoomInClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                float x = imageView.getScaleX();
                float y = imageView.getScaleY();

                imageView.setScaleX(x + 1);
                imageView.setScaleY(y + 1);
            }
        });

        zoomControls.setOnZoomOutClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                float x = imageView.getScaleX();
                float y = imageView.getScaleY();

                imageView.setScaleX(x - 1);
                imageView.setScaleY(y - 1);
            }
        });


        return vista;
    }
}
