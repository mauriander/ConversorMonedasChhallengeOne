import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;
import java.io.IOException;

public class GeneradorDeArchivo {
    public void guardarJson(TasaDeCambio tasa) throws IOException {
        Gson gson = new Gson();
        FileWriter writer = new FileWriter("tasa_de_cambio.json");
        gson.toJson(tasa, writer);
        writer.close();
    }
}
