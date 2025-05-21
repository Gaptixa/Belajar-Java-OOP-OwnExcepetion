package CarUtil;

import CarExcepetion.CarException;
import CarGenerator.CarGenerate;

import java.util.ArrayList;

public class CarExceptionUtil {

    public static void cekCar(CarGenerate c) throws CarException {

        if(c.getNama() == null || c.getNama().isBlank()){
            throw new CarException("Nama mobil tidak valid");
        }else if(c.getRoda() == 0) {
            throw new CarException("Roda tidak ada");
        }else if(c.getWarna() == null || c.getWarna().isBlank()) {
            throw new CarException("Warna mobil tidak valid");
        }
    }

}
