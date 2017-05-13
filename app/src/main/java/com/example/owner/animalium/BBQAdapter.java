package com.example.owner.animalium;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

/**
 * Created by Jefri Yushendri on 7/5/2017.
 */

public class BBQAdapter extends RecyclerView.Adapter<BBQAdapter.MyViewHolder> {

    List<BBQModel> BBQModelList;
    Context context;


    public BBQAdapter(Context context, List<BBQModel> BBQModelList){
        this.BBQModelList = BBQModelList;
        this.context = context;
    }


    @Override
    public BBQAdapter.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_list, parent, false);
        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(BBQAdapter.MyViewHolder holder, int position) {
        final BBQModel BBQModel = BBQModelList.get(position);

        holder.judul.setText(BBQModel.getNamaIndo());
        holder.gambar.setImageResource(BBQModel.getGambar());

        holder.layout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context, BBQModel.getNamaEng(), Toast.LENGTH_SHORT).show();
            }
        });


    }

    @Override
    public int getItemCount() {
        return BBQModelList.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {

        TextView judul;
        ImageView gambar;
        LinearLayout layout;

        public MyViewHolder(View itemView) {
            super(itemView);

            judul = (TextView) itemView.findViewById(R.id.judulayam);
            gambar = (ImageView) itemView.findViewById(R.id.ayam);
            layout = (LinearLayout) itemView.findViewById(R.id.layout);

        }
    }
}
