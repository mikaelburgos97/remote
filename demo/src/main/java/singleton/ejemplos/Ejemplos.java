package singleton.ejemplos;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

// package calculadoraprog.ejemplos;

/**
 *
 * @author Alan Alexander Perez (2023-1069)
 * 
 *         Fecha: 25-2-2024
 *         Version: 1.0
 *         Organizacion del codigo: Clase Main con instancias de archivo
 *         SingletonClass para mostrar ejemplos
 */
public class Ejemplos {

  public static void main(String[] args) {
    // Llamamos el metodo que controla la creacion de instancias
    SingletonClass obj = SingletonClass.getInstance();
    SingletonClass obj2 = SingletonClass.getInstance();
    System.out.println("");

    // Revisamos si en ambos objetos el resultado es similar.
    System.out.println("----- Viendo el contenido de cada objeto---------------");
    System.out.println(obj);
    System.out.println(obj2);
  }
}
