
package registro.de.productos.en.un.inventario;


public class RegistroDeProductosEnUnInventario {

   
    public static void main(String[] args) {
        
        Producto producto = new Producto (1, "Café", -2.50);
        
        System.out.println("ID : " + producto.getId());
        System.out.println("Nombre : " + producto.getNombre());
        System.out.println("Precio : " + producto.getPrecio());
        
        System.out.println("---------------------------------");
        producto.setPrecio(5);
        System.out.println("Precio positivo : " + producto.getPrecio());

    }
  //Programacion2025*
    //https://github.com/Developer4850/Actividad-1.git
}
