package Adapter;

import android.content.Context;
import android.content.Intent;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.arphone.R;
import com.squareup.picasso.Picasso;

import java.util.List;

import Activity.AR;
import Model.ModelSpesifikasi;

public class AdapterSpesifikasi extends RecyclerView.Adapter<AdapterSpesifikasi.HolderSpesifikasi> {
    private Context ctx;
    private List<ModelSpesifikasi> listspesifikasi;

    public AdapterSpesifikasi(Context ctx, List<ModelSpesifikasi> listspesifikasi) {
        this.ctx = ctx;
        this.listspesifikasi = listspesifikasi;
    }

    @NonNull
    @Override
    public HolderSpesifikasi onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View layout = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_spesifikasi, parent,false);
        HolderSpesifikasi holderSpesifikasi = new HolderSpesifikasi(layout);
        return holderSpesifikasi;
    }

    @Override
    public void onBindViewHolder(@NonNull HolderSpesifikasi holder, int position) {
        final ModelSpesifikasi msp = listspesifikasi.get(position);
//        final Animation animation = AnimationUtils.loadAnimation(this, R.drawable.shake);

//        holder.tv_nama_type.setText(msp.getNama_type());
        holder.tv_nama_type.setText(msp.getNama_type());
        holder.tvnetwork.setText(msp.getNetwork());
        holder.tvlaunch.setText(msp.getLaunch());
        holder.tvbody.setText(msp.getBody());
        holder.tvdisplay.setText(msp.getDisplay());
        holder.tvplatform.setText(msp.getPlatform());
        holder.tvmemory.setText(msp.getMemory());
        holder.tvmain_camera.setText(msp.getMain_kamera());
        holder.tvselfie_camera.setText(msp.getSelfie_kamera());
        holder.tvsound.setText(msp.getSound());
        holder.tvcomms.setText(msp.getComms());
        holder.tvfeature.setText(msp.getFeature());
        holder.tvbattery.setText(msp.getBattery());
        holder.tvmisc.setText(msp.getMisc());

        Picasso.with(ctx).load(msp.getGambar_type()).into(holder.imgSmartphone);
        holder.layar_singkat.setText(msp.getLayar_singkat());
        holder.kamera_singkat.setText(msp.getKamera_singkat());
        holder.soc_singkat.setText(msp.getSoc_singkat());
        holder.battery_singkat.setText(msp.getBattery_singkat());

        holder.btnar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //passing id ke AR class
                Intent intent = new Intent(v.getContext(), AR.class);
                intent.putExtra("GET_ID", msp.getId_spesifikasi());
                v.getContext().startActivity(intent);
//                v.startAnimation(animation);
            }
        });
    }

    @Override
    public long getItemId(int position) {
        return (position);
    }

    @Override
    public int getItemCount() {
        return listspesifikasi.size();
    }

    public class HolderSpesifikasi extends RecyclerView.ViewHolder {
        public ImageView imgSmartphone;
        public TextView tv_nama_type,  tvnetwork, tvlaunch, tvbody, tvdisplay, tvplatform, tvmemory, tvmain_camera, tvselfie_camera,
            tvsound, tvcomms, tvfeature, tvbattery,tvmisc, layar_singkat, kamera_singkat, soc_singkat, battery_singkat;
        private Button btnar;

        public HolderSpesifikasi(@NonNull View itemView) {
            super(itemView);

        tv_nama_type = itemView.findViewById(R.id.tv_nama_type);
        imgSmartphone = itemView.findViewById(R.id.smartphone);
        tvnetwork = itemView.findViewById(R.id.tv_network);
        tvlaunch= itemView.findViewById(R.id.tv_launch);
        tvbody= itemView.findViewById(R.id.tv_body);
        tvdisplay= itemView.findViewById(R.id.tv_display);
        tvplatform= itemView.findViewById(R.id.tv_platform);
        tvmemory= itemView.findViewById(R.id.tv_memory);
        tvmain_camera= itemView.findViewById(R.id.tv_main_camera);
        tvselfie_camera= itemView.findViewById(R.id.tv_selfie_camera);
        tvsound= itemView.findViewById(R.id.tv_sound);
        tvcomms= itemView.findViewById(R.id.tv_comms);
        tvfeature= itemView.findViewById(R.id.tv_feature);
        tvbattery= itemView.findViewById(R.id.tv_battery);
        tvmisc= itemView.findViewById(R.id.tv_misc);
        layar_singkat= itemView.findViewById(R.id.txt_layar);
        kamera_singkat= itemView.findViewById(R.id.txt_kamera);
        soc_singkat= itemView.findViewById(R.id.txt_soc);
        battery_singkat= itemView.findViewById(R.id.txt_battery);
            btnar = itemView.findViewById(R.id.button_ar);
        }
    }
}

