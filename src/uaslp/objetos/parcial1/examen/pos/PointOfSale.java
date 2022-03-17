package uaslp.objetos.parcial1.examen.pos;

import java.util.ArrayList;

public class PointOfSale {

   public  ArrayList<CartItem> productos=new ArrayList<CartItem>();
   public ArrayList<Integer> nums=new ArrayList<>();


    public void addToCart(int num,CartItem product){

        CartItem prod=product;
        prod.nume=num;//numero de elementos dado a cart item, cauntas papas y sbaritas
        productos.add(product);
    }
    public ArrayList<CartItem> getProducts() {
        return productos;
    }
    public float getTotal() {
        float total=0;
        float precio=0;
        int elementos=0;
        int cont;
        for( cont=0;cont< productos.size();cont=cont+1)
        {
            precio=productos.get(cont).precio;
            elementos=productos.get(cont).nume;
            total=precio*elementos+total;
        }
        return total;


    }
    public int getCountByName(String name) {
        int posicion = 0;
        for (CartItem p: productos)
        {
            if(p.nombre==name)
            {
                posicion=productos.indexOf(p);
            }
        }
       return productos.get(posicion).nume;


    }
}
