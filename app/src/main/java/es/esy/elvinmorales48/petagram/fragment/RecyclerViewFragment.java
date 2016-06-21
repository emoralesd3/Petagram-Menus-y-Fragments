package es.esy.elvinmorales48.petagram.fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

import es.esy.elvinmorales48.petagram.R;
import es.esy.elvinmorales48.petagram.adapter.MascotaAdaptador;
import es.esy.elvinmorales48.petagram.pojo.Mascota;


/**
 * A simple {@link Fragment} subclass.
 */
public class RecyclerViewFragment extends Fragment {

    private RecyclerView reciclador;
    private RecyclerView.LayoutManager layoutManager;
    private RecyclerView.Adapter recyclerAdapter;

    public RecyclerViewFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_recycler_view, container, false);
        ArrayList<Mascota> datos = new ArrayList<Mascota>();

        datos.add(new Mascota(R.drawable.perro1, "Pirulais",  0xFF00FF00));
        datos.add(new Mascota(R.drawable.perro2, "Terry",     0xFFa8285c));
        datos.add(new Mascota(R.drawable.perro3, "Rambo",     0xFF10D94C));
        datos.add(new Mascota(R.drawable.perro4, "Princesa",  0xFF45694C));
        datos.add(new Mascota(R.drawable.perro5, "Niño",      0xFF426989));
        datos.add(new Mascota(R.drawable.perro6, "Toby",      0xFF7a355b));
        datos.add(new Mascota(R.drawable.perro7, "Wiro",      0xFFd1c1fc));
        datos.add(new Mascota(R.drawable.perro8, "Rocky",     0xFF962489));

        reciclador = (RecyclerView) v.findViewById(R.id.ReciclerView_Reciclador);
        layoutManager = new LinearLayoutManager(getActivity(), LinearLayoutManager.VERTICAL, false);
        reciclador.setLayoutManager(layoutManager);

        recyclerAdapter = new MascotaAdaptador(datos);
        reciclador.setAdapter(recyclerAdapter);
        return v;
    }

}
