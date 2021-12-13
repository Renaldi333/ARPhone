package Model;


public class ModelSmartphone {
    private int id_smartphone, id_brand;
    private String nama_type, gambar_type, layar_singkat, kamera_singkat, soc_singkat,
            battery_singkat;

    public ModelSmartphone(int id_smartphone, int id_brand, String nama_type, String gambar_type,
                           String layar_singkat, String kamera_singkat, String soc_singkat, String battery_singkat) {
        this.id_smartphone = id_smartphone;
        this.id_brand = id_brand;
        this.nama_type = nama_type;
        this.gambar_type = gambar_type;
        this.layar_singkat = layar_singkat;
        this.kamera_singkat = kamera_singkat;
        this.soc_singkat = soc_singkat;
        this.battery_singkat = battery_singkat;
    }

    public int getId_smartphone() {
        return id_smartphone;
    }

    public void setId_smartphone(int id_smartphone) {
        this.id_smartphone = id_smartphone;
    }

    public int getId_brand() {
        return id_brand;
    }

    public void setId_brand(int id_brand) {
        this.id_brand = id_brand;
    }

    public String getNama_type() {
        return nama_type;
    }

    public void setNama_type(String nama_type) {
        this.nama_type = nama_type;
    }

    public String getGambar_type() {
        return gambar_type;
    }

    public void setGambar_type(String gambar_type) {
        this.gambar_type = gambar_type;
    }

    public String getLayar_singkat() {
        return layar_singkat;
    }

    public void setLayar_singkat(String layar_singkat) {
        this.layar_singkat = layar_singkat;
    }

    public String getKamera_singkat() {
        return kamera_singkat;
    }

    public void setKamera_singkat(String kamera_singkat) {
        this.kamera_singkat = kamera_singkat;
    }

    public String getSoc_singkat() {
        return soc_singkat;
    }

    public void setSoc_singkat(String soc_singkat) {
        this.soc_singkat = soc_singkat;
    }

    public String getBattery_singkat() {
        return battery_singkat;
    }

    public void setBattery_singkat(String battery_singkat) {
        this.battery_singkat = battery_singkat;
    }
}