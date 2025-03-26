import java.util.List;

public class ShoppingCart {
    private Integer cantidad;
    private Float precioTotal;
    private List<Products> listaProductos;

    public void addItem(Products newProducts){
        listaProductos.forEach( products ->{
            if ( products.getName().equals(newProducts.getName()) ){
                throw new Exception("Ya existe el producto.");
            }
        });
    }
}
