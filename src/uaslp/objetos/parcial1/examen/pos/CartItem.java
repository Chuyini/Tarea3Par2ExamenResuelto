package uaslp.objetos.parcial1.examen.pos;


import java.util.ArrayList;

public class CartItem {

    protected float precio;
    protected String nombre;
   public int nume;


    CartItem(String nombre,float precio)
    {
        this.nombre=nombre;
        this.precio=precio;

    }







    public int getQuantity() {




        return nume;


    }

    public String getProductName() {
        return nombre;
    }

    public float getAmount() {

        return precio;
    }



}
