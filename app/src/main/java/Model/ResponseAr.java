package Model;

import java.util.List;

public class ResponseAr {
    String pesan;
    List<ModelAr> dataar;

    public ResponseAr(String pesan, List<ModelAr> dataar) {
        this.pesan = pesan;
        this.dataar = dataar;
    }

    public String getPesan() {
        return pesan;
    }

    public void setPesan(String pesan) {
        this.pesan = pesan;
    }

    public List<ModelAr> getDataar() {
        return dataar;
    }

    public void setDataar(List<ModelAr> dataar) {
        this.dataar = dataar;
    }
}
