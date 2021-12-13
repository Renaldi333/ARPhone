package Model;

import java.util.List;

public class ResponseSpesifikasi {
    String pesan;
    List<ModelSpesifikasi> dataspesifikasi;

    public ResponseSpesifikasi(String pesan, List<ModelSpesifikasi> dataspesifikasi) {
        this.pesan = pesan;
        this.dataspesifikasi = dataspesifikasi;
    }

    public String getPesan() {
        return pesan;
    }

    public void setPesan(String pesan) {
        this.pesan = pesan;
    }

    public List<ModelSpesifikasi> getDataspesifikasi() {
        return dataspesifikasi;
    }

    public void setDataspesifikasi(List<ModelSpesifikasi> dataspesifikasi) {
        this.dataspesifikasi = dataspesifikasi;
    }
}
