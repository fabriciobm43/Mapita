package com.example.mapita;

import androidx.fragment.app.FragmentActivity;

import android.graphics.Color;
import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdate;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.gms.maps.model.PolylineOptions;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }

    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;
        // Add a marker in Sydney and move the camera
        PolylineOptions lineas = new PolylineOptions().add(new LatLng(-1.011732, -79.471871))
                .add(new LatLng(-1.012215, -79.467121))
                .add(new LatLng(-1.013731, -79.467145))
                .add(new LatLng(-1.013281, -79.471937))
                .add(new LatLng(-1.011732, -79.471871));
        lineas.width(8);
        lineas.color(Color.RED);
        mMap.addPolyline(lineas);

        mMap.setMapType(GoogleMap.MAP_TYPE_SATELLITE);
        LatLng position = new LatLng(-1.012730, -79.469510);
        CameraPosition camPos = new CameraPosition.Builder()
                .target(position)
                .zoom(17)
                .bearing(5)
                .build();

        CameraUpdate camUpd3 =CameraUpdateFactory.newCameraPosition(camPos);

        mMap.animateCamera(camUpd3);
        LatLng sydney = new LatLng(-1.012957, -79.469255);
        mMap.addMarker(new MarkerOptions().position(sydney).title("Facultad Agrarias"));
        LatLng sydney1 = new LatLng(-1.012599, -79.470621);
        mMap.addMarker(new MarkerOptions().position(sydney1).title("Facultad Ingenieria"));
        LatLng sydney2 = new LatLng(-1.012178, -79.470160);
        mMap.addMarker(new MarkerOptions().position(sydney2).title("Facultad Empresariales"));
        LatLng sydney3 = new LatLng(-1.012244, -79.469687);
        mMap.addMarker(new MarkerOptions().position(sydney3).title("Instituto de Informatica"));
        LatLng sydney4 = new LatLng(-1.012965, -79.470014);
        mMap.addMarker(new MarkerOptions().position(sydney4).title("Comedor"));
        LatLng sydney5 = new LatLng(-1.012721, -79.471462);
        mMap.addMarker(new MarkerOptions().position(sydney5).title("Canchas"));
        LatLng sydney6 = new LatLng(-1.012385, -79.468455);
        mMap.addMarker(new MarkerOptions().position(sydney6).title("Biblioteca"));
        LatLng sydney7 = new LatLng(-1.013018, -79.468813);
        mMap.addMarker(new MarkerOptions().position(sydney7).title("Rectorado"));
        LatLng sydney8 = new LatLng(-1.012970, -79.467720);
        mMap.addMarker(new MarkerOptions().position(sydney8).title("Auditorio"));
        LatLng sydney9 = new LatLng(-1.012447, -79.467770);
        mMap.addMarker(new MarkerOptions().position(sydney9).title("Parqueadero"));


    }
}