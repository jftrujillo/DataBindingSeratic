package com.example.jhon.databinding2;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.jhon.databinding2.databinding.ActivityMainBinding;
import com.example.jhon.databinding2.models.Vehiculo;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityMainBinding binding = DataBindingUtil.
                setContentView(this,R.layout.activity_main);
        Vehiculo vehiculo = new Vehiculo();
        vehiculo.setMarca("Mazda");
        vehiculo.setModelo("2015");
        vehiculo.setTipo("Carro");
        binding.setVehiculo(vehiculo);
    }
}
