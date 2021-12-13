package Model;

public class ModelSpesifikasi {
    private int id_spesifikasi, id_smartphone;
    private String nama_type, gambar_type, network, launch, body, display, platform, memory, main_kamera,
            selfie_kamera, sound, comms, feature, battery, misc, layar_singkat, kamera_singkat, soc_singkat, battery_singkat;

    public ModelSpesifikasi(int id_spesifikasi, int id_smartphone, String nama_type, String gambar_type,
                            String network, String launch, String body, String display, String platform,
                            String memory, String main_kamera, String selfie_kamera, String sound, String comms,
                            String feature, String battery, String misc, String layar_singkat, String kamera_singkat,

                            String soc_singkat, String battery_singkat) {
        this.id_spesifikasi = id_spesifikasi;
        this.id_smartphone = id_smartphone;
        this.nama_type = nama_type;
        this.gambar_type = gambar_type;

        this.layar_singkat = layar_singkat;
        this.kamera_singkat = kamera_singkat;
        this.soc_singkat = soc_singkat;
        this.battery_singkat = battery_singkat;
    }

    public int getId_spesifikasi() {
        return id_spesifikasi;
    }

    public void setId_spesifikasi(int id_spesifikasi) {
        this.id_spesifikasi = id_spesifikasi;
    }

    public int getId_smartphone() {
        return id_smartphone;
    }

    public void setId_smartphone(int id_smartphone) {
        this.id_smartphone = id_smartphone;
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

    public String getNetwork() {
        return network;
    }

    public void setNetwork(String network) {
        this.network = network;
    }

    public String getLaunch() {
        return launch;
    }

    public void setLaunch(String launch) {
        this.launch = launch;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String getDisplay() {
        return display;
    }

    public void setDisplay(String display) {
        this.display = display;
    }

    public String getPlatform() {
        return platform;
    }

    public void setPlatform(String platform) {
        this.platform = platform;
    }

    public String getMemory() {
        return memory;
    }

    public void setMemory(String memory) {
        this.memory = memory;
    }

    public String getMain_kamera() {
        return main_kamera;
    }

    public void setMain_kamera(String main_kamera) {
        this.main_kamera = main_kamera;
    }

    public String getSelfie_kamera() {
        return selfie_kamera;
    }

    public void setSelfie_kamera(String selfie_kamera) {
        this.selfie_kamera = selfie_kamera;
    }

    public String getSound() {
        return sound;
    }

    public void setSound(String sound) {
        this.sound = sound;
    }

    public String getComms() {
        return comms;
    }

    public void setComms(String comms) {
        this.comms = comms;
    }

    public String getFeature() {
        return feature;
    }

    public void setFeature(String feature) {
        this.feature = feature;
    }

    public String getBattery() {
        return battery;
    }

    public void setBattery(String battery) {
        this.battery = battery;
    }

    public String getMisc() {
        return misc;
    }

    public void setMisc(String misc) {
        this.misc = misc;
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

