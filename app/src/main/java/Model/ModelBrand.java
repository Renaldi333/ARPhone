package Model;

public class ModelBrand {
    private int id_brand;
    private String nama_brand, img_brand;

    public ModelBrand() {
    }

    public ModelBrand(int id_brand, String nama_brand, String img_brand) {
        this.id_brand = id_brand;
        this.nama_brand = nama_brand;
        this.img_brand = img_brand;
    }

    public int getId_brand() {
        return id_brand;
    }

    public void setId_brand(int id_brand) {
        this.id_brand = id_brand;
    }

    public String getNama_brand() {
        return nama_brand;
    }

    public void setNama_brand(String nama_brand) {
        this.nama_brand = nama_brand;
    }

    public String getImg_brand() {
        return img_brand;
    }

    public void setImg_brand(String img_brand) {
        this.img_brand = img_brand;
    }
}
