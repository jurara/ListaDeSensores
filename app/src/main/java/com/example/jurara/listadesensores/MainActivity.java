package com.example.jurara.listadesensores;

import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;
import android.widget.TextView;

import java.util.List;

public class MainActivity extends AppCompatActivity {
    private SensorManager sensorManager;
    TextView textView = null;
    String[] nombre;
    String[] maximo;
    String[] minimo;
    String[] power;
    int tam=0;
    ListView lista1;
    @Override protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lista1=(ListView)findViewById(R.id.ListView1);
        sensorManager = (SensorManager)this.getSystemService(SENSOR_SERVICE);
        List<Sensor> lista = sensorManager.getSensorList(Sensor.TYPE_ALL);
        StringBuilder data = new StringBuilder();
        tam=lista.size();
        nombre=new String[tam];
        maximo=new String[tam];
        minimo=new String[tam];
        power=new String[tam];
        for(int i=0; i<lista.size(); i++){
            nombre[i]="Nombre: "+lista.get(i).getName() + "\n"+"Fabricante: "+lista.get(i).getVendor() + "\n"+"Version :"+lista.get(i).getVersion();
            maximo[i]="Maximo: "+lista.get(i).getMaximumRange();
            minimo[i]="Minimo: "+lista.get(i).getMinDelay();
            power[i]="Power: "+lista.get(i).getPower();

        }

        Adaptador ad=new Adaptador(getApplicationContext(),nombre,maximo,minimo,power);
        lista1.setAdapter(ad);
    }
}