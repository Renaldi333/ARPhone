package API;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ARServer {
    private static final String baseURL = "https://arphone.000webhostapp.com/apiarphone/";
    private static Retrofit retro;

//    Gson gson = new GsonBuilder()
//            .setLenient()
//            .create();

    public static Retrofit koneksiRetrofit(){
        if (retro == null){
            HttpLoggingInterceptor client = new HttpLoggingInterceptor().setLevel(HttpLoggingInterceptor.Level.BODY);
            OkHttpClient okHttpClient = new OkHttpClient.Builder().addInterceptor(client).build();
            retro = new Retrofit.Builder()
                    .baseUrl(baseURL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .client(okHttpClient)
                    .build();
        }return retro;
    }
}
