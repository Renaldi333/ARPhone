package Model;

public class ModelAr {
    private int id_ar;
    private String file;

    public ModelAr(int id_ar, String file) {
        this.id_ar = id_ar;
        this.file = file;
    }

    public int getId_ar() {
        return id_ar;
    }

    public void setId_ar(int id_ar) {
        this.id_ar = id_ar;
    }

    public String getFile() {
        return file;
    }

    public void setFile(String file) {
        this.file = file;
    }
}
