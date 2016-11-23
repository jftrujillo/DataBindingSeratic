package com.example.jhon.databinding2;

import android.databinding.BindingAdapter;
import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import com.example.jhon.databinding2.databinding.ActivityMainBinding;
import com.example.jhon.databinding2.models.Vehiculo;
import com.squareup.picasso.Picasso;

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
        vehiculo.setImgUrl("https://co.mazdacdn.com/vpp/assets/thumbnails/cx5thumb.png");
        binding.setVehiculo(vehiculo);
    }


    @BindingAdapter({"bind:imageUrl"})
    public static void loadImage(ImageView view, String url) {
        Picasso.with(view.getContext()).load(url).into(view);
    }
}
