import java.util.Scanner;

class Main {

  // NUEVO METODO PARA ver el coche mas barato
  public static int indiceCocheBarato(Vehiculo coches[]){
    float precio;
    int indice=0;

    precio=coches[0].getPrecio();
      for(int i=1;i<coches.length;i++){
        if(coches[i].getPrecio()<precio){
          precio=coches[i].getPrecio();
          indice=i;
        }
      }
    return indice;
  }
  
  public static void main(String[] args) {
    Scanner entrada=new Scanner(System.in);
    String marca, modelo;
    float precio;
    int numvehiculos, indiceCocheMasBarato;
    // Numero de vehiculos
    System.out.println("Digite la cantidad de Vehiculos ");
    numvehiculos= entrada.nextInt();

    // objeto para cada vehículo arreglo:conjunto de datos del mismo tipo
// creamos los objetos para los coches 
    Vehiculo coches[]=new Vehiculo[numvehiculos];

    // coches. legth va seguir hasta la cantidad de elementos que tenga nuestro arrego coches
      for(int i=0;i<coches.length;i++){
        entrada.nextLine();
        System.out.println("Digite las caracteristicas del coche"+(i+1)+":");
        System.out.println("Introduzca la marca del vehiculo: ");
        marca=entrada.nextLine();
        System.out.println("Introduza el modelo del vehiculo: ");
        modelo=entrada.nextLine();
        System.out.println("Introduzca precio del vehiculo: ");
        precio=entrada.nextFloat();

        coches[i]=new Vehiculo(marca, modelo, precio);
      }
    indiceCocheMasBarato=indiceCocheBarato(coches);
    System.out.println("\nEl coche mas Barato es : ");
    System.out.println(coches[indiceCocheMasBarato].MostrarDatos());
  }
}




//REPASO: Construir un programa que dad una serie de vehiculos caracterizados por su marca, modelo y precio, imprima las propiedades del vehiculo mas barato. Para ello, se deberan leer por teclado las carcateristucas de cada vehiculo y crear unca clase que represente a cada uno de ellos