package Model;

import java.util.List;

public class ResponseSmartphone {
    private String pesan;
    private List<ModelSmartphone> datasmartphone;

    public ResponseSmartphone() {
    }

    public ResponseSmartphone(String pesan, List<ModelSmartphone> datasmartphone) {
        this.pesan = pesan;
        this.datasmartphone = datasmartphone;
    }

    public String getPesan() {
        return pesan;
    }

    public void setPesan(String pesan) {
        this.pesan = pesan;
    }

    public List<ModelSmartphone> getDatasmartphone() {
        return datasmartphone;
    }

    public void setDatasmartphone(List<ModelSmartphone> datasmartphone) {
        this.datasmartphone = datasmartphone;
    }
}
