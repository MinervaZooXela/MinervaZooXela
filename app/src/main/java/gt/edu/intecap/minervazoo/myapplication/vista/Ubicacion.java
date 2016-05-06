package gt.edu.intecap.minervazoo.myapplication.vista;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.MapView;
import com.google.android.gms.maps.MapsInitializer;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import gt.edu.intecap.minervazoo.myapplication.R;

public class Ubicacion  extends Fragment {
    private static final double LATITUD1 = 14.8473029;
    private static final double LATITUD2 = 91.5366699;
    GoogleMap mMap;
    MapView mapView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        // Inflate the layout for this fragment
        View vista = inflater.inflate(R.layout.fragment_ubicacion, container, false);

        mapView = (MapView) vista.findViewById(R.id.map);
        mapView.onCreate(savedInstanceState);
        mapView.onResume();
        MapsInitializer.initialize(getActivity());

        mMap = mapView.getMap();
        LatLng zoo = new LatLng(LATITUD1,-LATITUD2);
        mMap.addMarker(new MarkerOptions().position(zoo).title("Zoologico Minerva"));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(zoo, 15));
        mMap.animateCamera(CameraUpdateFactory.zoomIn());
        mMap.animateCamera(CameraUpdateFactory.zoomTo(40), 2500, null);
        CameraPosition cameraPosition = new CameraPosition.Builder()
                .target(zoo)
                .zoom(18)
                .bearing(90)
                .tilt(25)
                .build();
        mMap.animateCamera(CameraUpdateFactory.newCameraPosition(cameraPosition));
        return vista;
    }


    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
    }

    @Override
    public void onResume() {
        mapView.onResume();
        super.onResume();
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        mapView.onDestroy();
    }

    @Override
    public void onLowMemory() {
        super.onLowMemory();
        mapView.onLowMemory();
    }
}