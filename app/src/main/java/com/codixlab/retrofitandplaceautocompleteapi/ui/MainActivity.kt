package com.codixlab.retrofitandplaceautocompleteapi.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.codixlab.retrofitandplaceautocompleteapi.R
import com.codixlab.retrofitandplaceautocompleteapi.databinding.ActivityMainBinding
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.MapsInitializer
import com.google.android.gms.maps.OnMapReadyCallback
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), OnMapReadyCallback {
    lateinit var mGoogleMap: GoogleMap
    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        mapView.onCreate(savedInstanceState)
        MapsInitializer.initialize(this)
        mapView.getMapAsync(this)

    }


    override fun onMapReady(map: GoogleMap?) {
        map?.let {
            mGoogleMap = map
            mGoogleMap.clear()
        }

    }


    override fun onResume() {
        if (mapView != null) mapView.onResume()
        super.onResume()
    }

    override fun onPause() {
        if (mapView != null) mapView.onPause()
        super.onPause()
    }

    override fun onStop() {
        if (mapView != null) mapView.onStop()
        super.onStop()
    }

    override fun onDestroy() {
        if (mapView != null) mapView.onDestroy()
        super.onDestroy()
    }

}