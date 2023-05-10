package com.eyuphanoguz.recycleviewlearn;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class FruitAdapter extends RecyclerView.Adapter<FruitAdapter.FruitHolder> {
    private ArrayList<Fruits> fruitList;
    private Context context;

    private OnItemClickListener onItemClickListener;

    public FruitAdapter(ArrayList<Fruits> fruitList, Context context) {
        this.fruitList = fruitList;
        this.context = context;
    }

    @NonNull
    @Override
    public FruitHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(context).inflate(R.layout.fruit_item, parent , false);

        return new FruitHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull FruitHolder holder, int position) {
        Fruits fruits = fruitList.get(position);
        holder.setData(fruits);
    }

    @Override
    public int getItemCount() {
        return fruitList.size();
    }

    class FruitHolder extends RecyclerView.ViewHolder{
        TextView fruitName, fruitCal;
        ImageView fruitImage;


        public FruitHolder(@NonNull View itemView) {
            super(itemView);
            fruitName =  itemView.findViewById(R.id.fruit_item_textView_name);
            fruitCal =  itemView.findViewById(R.id.fruit_item_textView_calori);
            fruitImage= itemView.findViewById(R.id.fruit_item_imageView);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    int position = getAdapterPosition();

                    if(onItemClickListener !=null &&  position != RecyclerView.NO_POSITION){
                        onItemClickListener.onItemClick(fruitList.get(position),position);
                    }
                }
            });


        }

        public void setData(Fruits fruits){
            this.fruitName.setText(fruits.getFruitName());
            this.fruitCal.setText(String.valueOf(fruits.getFruitCal()));
            this.fruitImage.setBackgroundResource(fruits.getFruitImage());
        }
    }


    public interface  OnItemClickListener{
        void onItemClick(Fruits fruits, int position);
    }

    public void setOnItemClickListener(OnItemClickListener listener){
        this.onItemClickListener = listener;
    }

}
