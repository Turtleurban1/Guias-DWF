package Cesar_semana2_DWF.ejercicio1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/datos")
public class MiControlador {
    @Autowired
    private MiServicio miServicio;

    @GetMapping
    public List<String> obtenerDatos() {
        return miServicio.obtenerDatos();
    }

    @PostMapping
    public String agregarDato(@RequestBody String nuevoDato) {
        miServicio.agregarDato(nuevoDato);
        return "Dato agregado correctamente: " + nuevoDato;
    }
}
