import CarExcepetion.CarException;
import CarGenerator.CarGenerate;
import CarUtil.CarExceptionUtil;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String nama = scan.nextLine();
        int roda = scan.nextInt();
        String warna = scan.next();

        CarGenerate car = new CarGenerate(nama, roda, warna);

        try {
            CarExceptionUtil.cekCar(car);
            System.out.println("Kode berjalan lancar");
            System.out.println("Nama mobil: " + car.getNama());
            System.out.println("Jumlah roda: " + car.getRoda());
            System.out.println("Warna mobil: " + car.getWarna());

        } catch (CarException e) {
            System.out.println("Terjadi eror: " + e.getMessage());
        }


    }

}