package prototype;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
// package prototype;

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

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {

    // Instancia del documento usando como tipo la interfaz para asignarle contenido
    // y luego imprimirse
    Documento documentoPrototipo = new DocumentoImpl();
    documentoPrototipo.setContenido("Contenido del documento prototipo");

    documentoPrototipo.imprimirContenido();
    // Clonacion de instancai para imprimir contenido creado en pasada linea
    Documento documentoClonado = documentoPrototipo.clonar();
    documentoClonado.imprimirContenido();
  }

}
