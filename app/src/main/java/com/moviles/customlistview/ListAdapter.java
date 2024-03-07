package com.moviles.customlistview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class ListAdapter extends BaseAdapter {
    Context Contexto;
    String[] Nombres,NumeroTelefono;
    int[] IdImagen;
    //El layoutInflater sirve para poner datos (inflar) en una interfaz gráfica
    LayoutInflater inflater;
    public ListAdapter (Context contexto,String[] nombres,String[] numeroTelefono,int[] idImagen){
        this.Contexto = contexto;
        this.Nombres = nombres;
        this.NumeroTelefono = numeroTelefono;
        this.IdImagen = idImagen;
        inflater  = LayoutInflater.from(Contexto);
    }

    @Override
    public int getCount() {
        return Nombres.length;
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
        view = inflater.inflate(R.layout.list_item,null);
        ImageView fotoPerfil = view.findViewById(R.id.fotoPerfilUsuario);
        TextView nombreUsuario  =view.findViewById(R.id.nombre);
        TextView telUsuario = view.findViewById(R.id.telefono);
        fotoPerfil.setImageResource(IdImagen[i]);//poner la imagen
        nombreUsuario.setText(Nombres[i]);
        telUsuario.setText(NumeroTelefono[i]);
        return view;
    }
}
