package Activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.Toast;

import com.example.arphone.R;

import java.util.ArrayList;
import java.util.List;

import API.APIRequestData;
import API.ARServer;
import Adapter.AdapterBrand;
import Adapter.AdapterSmartphone;
import Model.ModelBrand;
import Model.ModelSmartphone;
import Model.ResponseSmartphone;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class SmartphoneActivity extends AppCompatActivity {
    private RecyclerView rv_smartphone;
    private RecyclerView.Adapter adData;
    private RecyclerView.LayoutManager lmData;
    private List<ModelSmartphone> listsmartphone = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_smartphone);

        rv_smartphone =findViewById(R.id.rv_smartphone);
        lmData = new LinearLayoutManager(this);
        rv_smartphone.setLayoutManager(lmData);

        Bundle extras = getIntent().getExtras();
        if (extras != null){
            int getId_brand = extras.getInt("GET_ID");
            imgSmartphone(getId_brand);
        }
    }

    private void imgSmartphone(int getId_brand) {
        APIRequestData arddata = ARServer.koneksiRetrofit().create(APIRequestData.class);
        Call<ResponseSmartphone> responseSmartphoneCall = arddata.getSmartphone(getId_brand);

        responseSmartphoneCall.enqueue(new Callback<ResponseSmartphone>() {
            @Override
            public void onResponse(Call<ResponseSmartphone> call, Response<ResponseSmartphone> response) {
                listsmartphone = response.body().getDatasmartphone();
//                for (ModelSmartphone obj:listsmartphone) {
//                    obj.setLayar_singkat(obj.getLayar_singkat().replaceAll("<br>","\n"));
//                    obj.setKamera_singkat(obj.getKamera_singkat().replaceAll("<br>","\n"));
//                    obj.setSoc_singkat(obj.getSoc_singkat().replaceAll("<br>","\n"));
//                    obj.setBattery_singkat(obj.getBattery_singkat().replaceAll("<br>","\n"));
//                }
                adData = new AdapterSmartphone(SmartphoneActivity.this, listsmartphone);
                rv_smartphone.setAdapter(adData);
            }

            @Override
            public void onFailure(Call<ResponseSmartphone> call, Throwable t) {
                String pesan;
                Toast.makeText(SmartphoneActivity.this, "Data Tidak Tampil "+t.getMessage(), Toast.LENGTH_SHORT).show();
            }
        });
    }
}
