package Model;

import java.util.List;

public class ResponseBrand {
    private String pesan;
    private List<ModelBrand> databrand;

    public ResponseBrand() {
    }

    public String getPesan() {
        return pesan;
    }

    public void setPesan(String pesan) {
        this.pesan = pesan;
    }

    public List<ModelBrand> getDatabrand() {
        return databrand;
    }

    public void setDatabrand(List<ModelBrand> databrand) {
        this.databrand = databrand;
    }

    public ResponseBrand(String pesan, List<ModelBrand> databrand) {
        this.pesan = pesan;
        this.databrand = databrand;


    }
}
