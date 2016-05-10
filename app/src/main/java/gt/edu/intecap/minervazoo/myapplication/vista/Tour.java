package gt.edu.intecap.minervazoo.myapplication.vista;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ZoomControls;

import gt.edu.intecap.minervazoo.myapplication.R;
import uk.co.senab.photoview.PhotoViewAttacher;

public class Tour extends Fragment {

    ImageView imageView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View vista = inflater.inflate(R.layout.fragment_tour, container, false);

        imageView = (ImageView) vista.findViewById(R.id.imageView);

        Drawable bitmap = getResources().getDrawable(R.drawable.mapa_temoporal);
        imageView.setImageDrawable(bitmap);

        PhotoViewAttacher mAttacher = new PhotoViewAttacher(imageView);
        mAttacher.update();
        return vista;
    }
}
