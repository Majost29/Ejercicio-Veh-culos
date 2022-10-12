public class Vehiculo{
  private String marca;
  private String modelo;
  private float precio;
  
  // constructor 
  public Vehiculo(String marca, String modelo, float precio){
    this.marca=marca;
    this.modelo=modelo;
    this.precio=precio;
  }

  // get precio
  public float getPrecio(){
    return precio;
    
  }

  // Mostrar Datos
  public String MostrarDatos(){
    return "Marca:"+marca+"\nModelo:"+modelo+"\nPrecio:"+precio;
    
  }
}
