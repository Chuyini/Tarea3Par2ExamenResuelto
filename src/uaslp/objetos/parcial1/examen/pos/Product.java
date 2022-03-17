package uaslp.objetos.parcial1.examen.pos;

import java.util.ArrayList;

public class Product extends CartItem {

    public Product(String nombre, float precio)
    {
        super(nombre,precio);
    }

    public String getNombre() {
        return nombre;
    }

    public float getPrecio() {
        return precio;
    }

}
