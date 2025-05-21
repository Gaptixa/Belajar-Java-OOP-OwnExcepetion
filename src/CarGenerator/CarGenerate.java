package CarGenerator;

public class CarGenerate {

    private String nama,warna;
    private int roda;

    public CarGenerate(String nama, int roda, String warna){
        this.nama = nama;
        this.roda = roda;
        this.warna = warna;
    }

    public int getRoda() {
        return roda;
    }

    public String getNama() {
        return nama;
    }

    public String getWarna() {
        return warna;
    }
}
