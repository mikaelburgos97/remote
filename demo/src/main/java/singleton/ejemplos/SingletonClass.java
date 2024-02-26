package singleton.ejemplos;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
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
public class SingletonClass {
  private static SingletonClass instance;

  // Metodo privado para evitar que se creen instancias con el constructor
  private SingletonClass() {
  }

  public static SingletonClass getInstance() {
    // Condicional para evitar duplicacion de instancias.
    if (instance == null) {
      instance = new SingletonClass();
      return instance;
    } else {
      System.out.println("La instancia ya ha sido creada");
      return null;
    }

  }
}
