package Adapter;

import android.content.Context;
import android.content.Intent;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.arphone.R;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.List;

import Activity.AR;
import Activity.SpesifikasiActivity;
import Model.ModelSmartphone;

    public class AdapterSmartphone extends RecyclerView.Adapter<AdapterSmartphone.HolderSmartphone> {
    private Context ctx;
    private List<ModelSmartphone> listsmartphone;

    public AdapterSmartphone(Context ctx, List<ModelSmartphone> listsmartphone) {
        this.ctx = ctx;
        this.listsmartphone = listsmartphone;
    }

    @NonNull
    @Override
    public HolderSmartphone onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View layout = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_smartphone, parent, false);
        HolderSmartphone holder = new HolderSmartphone(layout);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull HolderSmartphone holder, int position) {
        final ModelSmartphone ms = listsmartphone.get(position);

        Picasso.with(ctx).load(ms.getGambar_type()).into(holder.imgSmartphone);
        holder.nama_type.setText(Html.fromHtml(ms.getNama_type()));
        holder.layar_singkat.setText(Html.fromHtml(ms.getLayar_singkat()));
        holder.kamera_singkat.setText(Html.fromHtml(ms.getKamera_singkat()));
        holder.soc_singkat.setText(Html.fromHtml(ms.getSoc_singkat()));
        holder.battery_singkat.setText(Html.fromHtml(ms.getBattery_singkat()));

        holder.imgSmartphone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), SpesifikasiActivity.class);
                intent.putExtra("GET_ID", ms.getId_smartphone());
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
        return listsmartphone.size();
    }

    public static class HolderSmartphone extends RecyclerView.ViewHolder {
        public ImageView imgSmartphone;
        public TextView nama_type, layar_singkat, kamera_singkat, soc_singkat, battery_singkat;


        public HolderSmartphone(@NonNull View itemView) {
            super(itemView);
            imgSmartphone = itemView.findViewById(R.id.smartphone);
            nama_type = itemView.findViewById(R.id.text_nama);
            layar_singkat = itemView.findViewById(R.id.txt_layar);
            kamera_singkat = itemView.findViewById(R.id.txt_kamera);
            soc_singkat = itemView.findViewById(R.id.txt_soc);
            battery_singkat = itemView.findViewById(R.id.txt_battery);


        }
    }
}
