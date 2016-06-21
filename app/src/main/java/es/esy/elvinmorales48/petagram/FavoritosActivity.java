package es.esy.elvinmorales48.petagram;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Toast;

import java.util.ArrayList;

import es.esy.elvinmorales48.petagram.adapter.MascotaAdaptador;
import es.esy.elvinmorales48.petagram.pojo.Mascota;

public class FavoritosActivity extends AppCompatActivity {

    private RecyclerView recicladorFav;
    private RecyclerView.LayoutManager layoutManagerFav;
    private RecyclerView.Adapter recyclerAdapterFav;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_favoritos);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbarSub);
        setSupportActionBar(toolbar);

        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(FavoritosActivity.this, "Regresando", Toast.LENGTH_SHORT).show();
                finish();
            }
        });


        ArrayList<Mascota> datosFav = new ArrayList<Mascota>();

        datosFav.add(new Mascota(R.drawable.perro3, "Rambo",     0xFF10D94C));
        datosFav.add(new Mascota(R.drawable.perro6, "Toby",      0xFF7a355b));
        datosFav.add(new Mascota(R.drawable.perro5, "Niño",      0xFF426989));
        datosFav.add(new Mascota(R.drawable.perro1, "Pirulais",  0xFF00FF00));
        datosFav.add(new Mascota(R.drawable.perro4, "Princesa",  0xFF45694C));

        recicladorFav = (RecyclerView) findViewById(R.id.ReciclerView_RecicladorFavorito);
        layoutManagerFav = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);
        recicladorFav.setLayoutManager(layoutManagerFav);

        recyclerAdapterFav = new MascotaAdaptador(datosFav);
        recicladorFav.setAdapter(recyclerAdapterFav);

    }
}
