package Adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.arphone.R;
import com.squareup.picasso.Picasso;

import java.util.List;

import Activity.SmartphoneActivity;
import Model.ModelBrand;

public class AdapterBrand extends RecyclerView.Adapter<AdapterBrand.HolderBrand> {
    private Context ctx;
    private List<ModelBrand> listbrand;

    public AdapterBrand(Context ctx, List<ModelBrand> listbrand) {
        this.ctx = ctx;
        this.listbrand = listbrand;
    }

    @NonNull
    @Override
    public HolderBrand onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View layout = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_brand, parent, false);
        HolderBrand holderBrand = new HolderBrand(layout);
        return holderBrand;
    }

    @Override
    public void onBindViewHolder(@NonNull HolderBrand holder, int position) {
        final ModelBrand mb = listbrand.get(position);

        Picasso.with(ctx).load(mb.getImg_brand()).into(holder.imgBrand);
        holder.imgBrand.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Toast.makeText(ctx, "Toast"+mb.getId_brand(), Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(v.getContext(), SmartphoneActivity.class);
                intent.putExtra("GET_ID", mb.getId_brand());
                v.getContext().startActivity(intent);
            }
        });
    }

    @Override
    public long getItemId(int position){
        return position;
    }

    @Override
    public int getItemCount() {
        return listbrand.size();
    }

    public class HolderBrand extends RecyclerView.ViewHolder {
        public ImageView imgBrand;

        public HolderBrand(@NonNull View itemView) {
            super(itemView);

            imgBrand = itemView.findViewById(R.id.img_brand);
        }
    }
}
