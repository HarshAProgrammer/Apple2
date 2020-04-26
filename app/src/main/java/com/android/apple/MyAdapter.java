package com.android.apple;

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

public class MyAdapter extends RecyclerView.Adapter<ProductViewHolder>{
    private Context mContext;
    private List<ProductData> myProductList;

    public MyAdapter(Context mContext, List<ProductData> myProductList) {
        this.mContext = mContext;
        this.myProductList = myProductList;
    }


    @Override
    public ProductViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
      View mView = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.recycler_row_item,viewGroup,false);
        return new ProductViewHolder(mView);
    }

    @Override
    public void onBindViewHolder(@NonNull final ProductViewHolder productViewHolder, int i) {
        productViewHolder.imageView.setImageResource(myProductList.get(i).getProductImage());
        productViewHolder.mTitle.setText(myProductList.get(i).getProductName());
        productViewHolder.mDescription.setText(myProductList.get(i).getProductDescription());
        productViewHolder.mPrice.setText(myProductList.get(i).getProductPrice());

        productViewHolder.mCardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent openDetailActivityFromMContext = new Intent(mContext,DetailActivity.class);
                openDetailActivityFromMContext.putExtra("Image",myProductList.get(productViewHolder.getAdapterPosition()).getProductImage());
                openDetailActivityFromMContext.putExtra("Description",myProductList.get(productViewHolder.getAdapterPosition()).getProductDescription());
                mContext.startActivity(openDetailActivityFromMContext);
            }
        });
    }

    @Override
    public int getItemCount() {
        return myProductList.size();
    }
}
class ProductViewHolder extends RecyclerView.ViewHolder{
    ImageView imageView;
    TextView mTitle,mDescription,mPrice;
    CardView mCardView;

    public ProductViewHolder( View itemView) {
        super(itemView);
        imageView = itemView.findViewById(R.id.ivImage);
        mTitle  = itemView.findViewById(R.id.tvTitle);
        mDescription = itemView.findViewById(R.id.tvDescription);
        mPrice = itemView.findViewById(R.id.tvPrice);
        mCardView = itemView.findViewById(R.id.myCardView);
    }
}
