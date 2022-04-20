
/*
Ejercicio 03: Declare la clase Alumno en un archivo independiente.
*/

package gui;

class Alumno {
   // Atributos
    int codigo, nota1, nota2;
    String nombre;

  // Operaciones
    double promedio() {
        return (nota1 + nota2) / 2.0;
    }
}

