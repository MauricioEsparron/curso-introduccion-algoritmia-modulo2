/*
Ejercicio 01: 
Declare la clase Alumno con:
Atributos:

código, nombre, y dos notas

Método: Retorne la nota promedio.
*/

class Alumno {
    // Atributos
    int codigo, nota1, nota2;
    String nombre;
  
    // Operaciones
    // Método que retorna la nota promedio
    double promedio() {
           return (nota1 + nota2) / 2.0;
    }
 }
