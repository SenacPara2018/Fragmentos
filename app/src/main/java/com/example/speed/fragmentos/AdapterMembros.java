package com.example.speed.fragmentos;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import com.example.speed.fragmentos.modelo.Membros;

import java.util.List;

public class AdapterMembros extends BaseAdapter {
    private List<Membros> membros;
    private Activity act;

    public AdapterMembros(List<Membros> membros, Activity act){
        this.membros = membros;
        this.act = act;
    }


    @Override
    public int getCount() {
        return membros.size();
    }

    @Override
    public Object getItem(int position) {
        return membros.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view = act.getLayoutInflater().inflate(R.layout.modelo_list_adapter_membros, parent, false);
        return null;
    }
}
