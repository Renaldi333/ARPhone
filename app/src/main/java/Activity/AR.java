package Activity;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.MotionEvent;
import android.widget.Toast;

import com.example.arphone.R;
import com.google.ar.core.Anchor;
import com.google.ar.core.HitResult;
import com.google.ar.core.Plane;
import com.google.ar.sceneform.AnchorNode;
import com.google.ar.sceneform.ArSceneView;
import com.google.ar.sceneform.rendering.ModelRenderable;
import com.google.ar.sceneform.ux.ArFragment;
import com.google.ar.sceneform.ux.BaseArFragment;
import com.google.ar.sceneform.ux.TransformableNode;

import API.APIRequestData;
import API.ARServer;
import Model.ModelAr;
import Model.ResponseAr;
import Model.ResponseSpesifikasi;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class AR extends AppCompatActivity {

    private ArSceneView arSceneView;
    private ArFragment arFragment;
    private BaseArFragment baseArFragment;
    private ModelRenderable modelRenderable;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ar);

        arFragment = (ArFragment) getSupportFragmentManager().findFragmentById(R.id.ar);

        //get id from spesifikasi class
        Bundle extras = getIntent().getExtras();
        Integer getIdSpesifikasi = null;
        if (extras != null){
            getIdSpesifikasi = extras.getInt("GET_ID");
        }
        setUpModel(getIdSpesifikasi, this);
        setupPlane();
    }

    private void setUpModel(Integer id, Context context) {
        APIRequestData arddata = ARServer.koneksiRetrofit().create(APIRequestData.class);
        Call<ResponseAr> responseArCall= arddata.getAr(id);

        responseArCall.enqueue(new Callback<ResponseAr>() {
            @Override
            public void onResponse(Call<ResponseAr> call, Response<ResponseAr> response) {
                if (response.body().getDataar() == null) {
                    AlertDialog.Builder alert = new AlertDialog.Builder(AR.this);
                    alert.setTitle("AR Belum Di buat");
                    alert.setMessage("Silahkan Hubungi Admin");
                    alert.setPositiveButton("Keluar", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            //kill activity
                            dialog.dismiss();
                            finish();
                        }
                        });alert.show();


                }else{
                    ModelAr model = response.body().getDataar().get(0);
//                    file3D = model.getFile();
                    ModelRenderable.builder()
                            .setSource(context, Uri.parse(model.getFile()))
                            .build()
                            .thenAccept(renderable -> modelRenderable = renderable)
                            .exceptionally(throwable -> {
                                Toast.makeText(AR.this, "AR Tidak Dapat Dimuat",Toast.LENGTH_SHORT).show();
                                return null;
                            });
                }
            }

            @Override
            public void onFailure(Call<ResponseAr> call, Throwable t) {

            }
        });
    }

    private void setupPlane() {
        arFragment.getArSceneView().setLightEstimationEnabled(true);
            arFragment.setOnTapArPlaneListener(new BaseArFragment.OnTapArPlaneListener() {
                @Override
                public void onTapPlane(HitResult hitResult, Plane plane, MotionEvent motionEvent) {
                    Anchor anchor = hitResult.createAnchor();
                    AnchorNode anchorNode = new AnchorNode(anchor);
                    anchorNode.setParent(arFragment.getArSceneView().getScene());
                    createModel(anchorNode);
                }
            });
        }

    private void createModel(AnchorNode anchorNode) {
        TransformableNode node = new TransformableNode(arFragment.getTransformationSystem());
        node.setParent(anchorNode);
        node.setRenderable(modelRenderable);
        node.select();
    }

}
