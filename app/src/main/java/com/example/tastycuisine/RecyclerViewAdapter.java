package com.example.tastycuisine;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.MyHolder> {

    private Context mContext;
    private List<Recepies> mData;

    public RecyclerViewAdapter(Context mContext,List<Recepies> mData){
        this.mContext = mContext;
        this.mData = mData;
    }



    @NonNull
    @Override
    public MyHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view;
        LayoutInflater layoutInflater = LayoutInflater.from(mContext);
        view = layoutInflater.inflate(R.layout.cardview_recepie,viewGroup,false);
        return  new MyHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull  final MyHolder holder, final int i) {
         holder.recepieTitle.setText(mData.get(i).getRecepieName());
         holder.img_recepie_thumbnail.setImageResource(mData.get(i).getThumbnail());
         holder.cardView.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 Intent intent = new Intent(mContext,RecepieActivity.class);

                 intent.putExtra("RecepieName",mData.get(i).getRecepieName());
                 intent.putExtra("RecepieIngredients",mData.get(i).getRecepieIngredients());
                 intent.putExtra("RecepieMethodTitle",mData.get(i).getRecepieMethodTitle());
                 intent.putExtra("Recepie",mData.get(i).getRecepie());
                 intent.putExtra("Thumbnail",mData.get(i).getThumbnail());

                 mContext.startActivity(intent);
             }
         });

    }

    @Override
    public int getItemCount() {
        return mData.size();
    }

    public class MyHolder extends RecyclerView.ViewHolder {
        TextView recepieTitle;
        CardView cardView;
        ImageView img_recepie_thumbnail;

        public MyHolder(@NonNull View itemView) {
            super(itemView);

            recepieTitle = (TextView)itemView.findViewById(R.id.recipe_text);
            img_recepie_thumbnail = (ImageView)itemView.findViewById(R.id.recepie_img_id);
            cardView = (CardView)itemView.findViewById(R.id.cardview_id);
        }
    }
}
