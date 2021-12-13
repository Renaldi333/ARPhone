package Activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.Toast;

import com.example.arphone.R;

import java.util.ArrayList;
import java.util.List;

import API.APIRequestData;
import API.ARServer;
import Adapter.AdapterBrand;
import Model.ModelBrand;
import Model.ResponseBrand;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class BrandActivity extends AppCompatActivity {
    private RecyclerView rv_brand;
    private RecyclerView.Adapter adData;
    private RecyclerView.LayoutManager lmData;
    private List<ModelBrand> listbrand = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_brand);

        rv_brand = findViewById(R.id.rv_img);
        lmData = new GridLayoutManager(this,2);
        rv_brand.setLayoutManager(lmData);
        imgBrand();
    }

    private void imgBrand() {
        APIRequestData ardimg = ARServer.koneksiRetrofit().create(APIRequestData.class);
        Call<ResponseBrand> tampil = ardimg.imgbrand();

        tampil.enqueue(new Callback<ResponseBrand>() {
            @Override
            public void onResponse(Call<ResponseBrand> call, Response<ResponseBrand> response) {
                String pesan = response.body().getPesan();
                Toast.makeText(BrandActivity.this, "Selamat Datang Di ARPhone", Toast.LENGTH_SHORT).show();

                listbrand = response.body().getDatabrand();
                adData = new AdapterBrand(BrandActivity.this, listbrand);
                rv_brand.setAdapter(adData);
            }

            @Override
            public void onFailure(Call<ResponseBrand> call, Throwable t) {
                Toast.makeText(BrandActivity.this, "Pastikan Anda Terhubung ke Internet!", Toast.LENGTH_LONG).show();

            }
        });
    }
}
