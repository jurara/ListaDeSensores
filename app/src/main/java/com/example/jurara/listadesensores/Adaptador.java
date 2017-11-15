package com.example.jurara.listadesensores;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

/**
 * Created by jurara on 13/11/2017.
 */

public class Adaptador extends BaseAdapter{
    Context context;
    String[] nombre;
    String[] maximo;
    String[] minimo;
    String[] power;
    LayoutInflater inflater;

    public Adaptador(Context context, String[] nombre, String[] maximo, String[] minimo, String[] power){
        this.context=context;
        this.nombre=nombre;
        this.maximo=maximo;
        this.minimo=minimo;
        this.power=power;
    }

    @Override
    public int getCount() {
        return nombre.length;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        TextView nom;
        TextView max;
        TextView min;
        TextView pow;
        inflater=(LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        View itemView=inflater.inflate(R.layout.itemsensor,viewGroup,false);
        nom=(TextView)itemView.findViewById(R.id.nombre);
        max=(TextView)itemView.findViewById(R.id.max);
        min=(TextView)itemView.findViewById(R.id.min);
        pow=(TextView)itemView.findViewById(R.id.power);
        nom.setText(nombre[i]);
        max.setText(maximo[i]);
        min.setText(minimo[i]);
        pow.setText(power[i]);


        return itemView;
    }
}
