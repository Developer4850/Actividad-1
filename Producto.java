
package registro.de.productos.en.un.inventario;


public class Producto {
    
    int id;
    String nombre;
    double precio;

    public Producto(int id, String nombre, double precio) {
        this.id = id;
        this.nombre = nombre;
        this.precio = precio;
        setPrecio(precio);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
          if (precio > 0){
          this.precio = precio;
        } else{
            System.out.println("Precio debe ser positivo");
        }
        
    }
}
