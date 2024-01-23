package com.bouchra.calcul_app;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.HashMap;
import java.util.List;

public class ListeAdapter extends BaseAdapter {
    private Context context;
    private List<HashMap<String, Object>> listeCts;
    private LayoutInflater myLf;

    public ListeAdapter(Context context, List<HashMap<String, Object>> listeCts) {
        this.context = context;
        this.listeCts = listeCts;
        this.myLf= LayoutInflater.from(context);
    }

    @Override
    public int getCount() {
        return listeCts.size();
    }

    @Override
    public Object getItem(int position) {
        return listeCts.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    public static class ViewHolder{
        TextView ln,vn, lp,vp,lt,vt;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup viewGroup) {
        ViewHolder holder;
        if(convertView==null){
            holder= new ViewHolder();
            convertView= myLf.inflate(R.layout.list_view_bloc,null);
            holder.ln= convertView.findViewById(R.id.labelNom);
            holder.vn= convertView.findViewById(R.id.valNom);
            holder.lp= convertView.findViewById(R.id.labelPrenom);
            holder.vp= convertView.findViewById(R.id.valPrenom);
            holder.lt= convertView.findViewById(R.id.labelTel);
            holder.vt= convertView.findViewById(R.id.valTel);
            convertView.setTag(holder);

        }
        else {
            holder= (ViewHolder) convertView.getTag();

        }

        holder.ln.setText(listeCts.get(position).get("ln").toString());
        holder.vn.setText(listeCts.get(position).get("vn").toString());
        holder.lp.setText(listeCts.get(position).get("lp").toString());
        holder.vp.setText(listeCts.get(position).get("vp").toString());
        holder.lt.setText(listeCts.get(position).get("lt").toString());
        holder.vt.setText(listeCts.get(position).get("vt").toString());

        return convertView;
    }
}