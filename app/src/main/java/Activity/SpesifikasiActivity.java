package Activity;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.arphone.R;

import java.util.ArrayList;
import java.util.List;

import API.APIRequestData;
import API.ARServer;
import Adapter.AdapterSpesifikasi;
import Model.ModelSpesifikasi;
import Model.ResponseSpesifikasi;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class SpesifikasiActivity extends AppCompatActivity {
    private RecyclerView rv_spesifikasi;
    private RecyclerView.Adapter adData;
    private RecyclerView.LayoutManager lmData;
    private List<ModelSpesifikasi> listspesifikasi = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spesifikasi);

        rv_spesifikasi = findViewById(R.id.rv_spesifikasi);
        lmData = new LinearLayoutManager(this);
        rv_spesifikasi.setLayoutManager(lmData);

        Bundle extras = getIntent().getExtras();
        if (extras != null){
            int getIdSmartphone = extras.getInt("GET_ID");
            SpesifikasiData (getIdSmartphone);
        }
    }

    private void SpesifikasiData(int getIdSmartphone) {
        APIRequestData arddata = ARServer.koneksiRetrofit().create(APIRequestData.class);
        Call<ResponseSpesifikasi> responseSpesifikasiCall= arddata.getSpesifikasi(getIdSmartphone);

        responseSpesifikasiCall.enqueue(new Callback<ResponseSpesifikasi>() {
            @Override
            public void onResponse(Call<ResponseSpesifikasi> call, Response<ResponseSpesifikasi> response) {
                if (response.body().getDataspesifikasi() == null) {
                    AlertDialog.Builder alert = new AlertDialog.Builder(SpesifikasiActivity.this);
                    alert.setTitle("Data Spesifikasi Belum Di buat");
                    alert.setMessage("Silahkan Hubungi Admin");
                    alert.setPositiveButton("Keluar", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            //kill activity
                            dialog.dismiss();
                            finish();
                        }
                    });
                    alert.show();
                } else {
                    listspesifikasi = response.body().getDataspesifikasi();


                    for (ModelSpesifikasi obj : listspesifikasi
                    ) {
                        obj.setLayar_singkat(obj.getLayar_singkat().replaceAll("<br>", "\n"));
                        obj.setKamera_singkat(obj.getKamera_singkat().replaceAll("<br>", "\n"));
                        obj.setSoc_singkat(obj.getSoc_singkat().replaceAll("<br>", "\n"));
                        obj.setBattery_singkat(obj.getBattery_singkat().replaceAll("<br>", "\n"));

                        obj.setNetwork(obj.getNetwork().replaceAll("<br>", "\n"));
                        obj.setLaunch(obj.getLaunch().replaceAll("<br>", "\n"));
                        obj.setBody(obj.getBody().replaceAll("<br>", "\n"));
                        obj.setDisplay(obj.getDisplay().replaceAll("<br>", "\n"));
                        obj.setPlatform(obj.getPlatform().replaceAll("<br>", "\n"));
                        obj.setMemory(obj.getMemory().replaceAll("<br>", "\n"));
                        obj.setMain_kamera(obj.getMain_kamera().replaceAll("<br>", "\n"));
                        obj.setSelfie_kamera(obj.getSelfie_kamera().replaceAll("<br>", "\n"));
                        obj.setSound(obj.getSound().replaceAll("<br>", "\n"));
                        obj.setComms(obj.getComms().replaceAll("<br>", "\n"));
                        obj.setFeature(obj.getFeature().replaceAll("<br>", "\n"));
                        obj.setBattery(obj.getBattery().replaceAll("<br>", "\n"));
                        obj.setMisc(obj.getMisc().replaceAll("<br>", "\n"));
                    }

                    adData = new AdapterSpesifikasi(SpesifikasiActivity.this, listspesifikasi);
                    rv_spesifikasi.setAdapter(adData);
                }
            }

            @Override
            public void onFailure(Call<ResponseSpesifikasi> call, Throwable t) {
                Toast.makeText(SpesifikasiActivity.this, "Data Tidak Tampil"+t.getMessage(), Toast.LENGTH_SHORT).show();
            }
        });
    }
}
