package API;

import Model.ModelAr;
import Model.ResponseAr;
import Model.ResponseBrand;
import Model.ResponseSmartphone;
import Model.ResponseSpesifikasi;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface APIRequestData {
    @GET("brand.php")
    Call<ResponseBrand> imgbrand();

    @GET("smartphone.php")
    Call<ResponseSmartphone> getSmartphone(@Query("id_brand") int getId_brand);

    @GET("spesifikasi.php")
    Call<ResponseSpesifikasi> getSpesifikasi(@Query("id_smartphone") int getId_Smartphone);

    @GET("ar.php")
    Call<ResponseAr> getAr(@Query("id_spesifikasi") int getId_Spesifikasi);
}
