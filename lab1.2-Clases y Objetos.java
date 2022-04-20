
/*
Ejercicio 02:
Declare y crree un objeto de tipo Alumno e ingrese datos fijos a sus atributos. 
Finalmente muestre su dirección de memoria, los datos completos del alumno y también su 
promedio.
*/

protected void actionPerformedBtnProcesar(ActionEvent arg0) {
 Alumno a = new Alumno();
    a.codigo = 12345;
    a.nombre = "Juan";
    a.nota1 = 13;
    a.nota2 = 15;
  
    imprimir("DirMem : " + a);
    imprimir("código : " + a.codigo);
    imprimir("nombre : " + a.nombre);
    imprimir("nota 1 : " + a.nota1);
    imprimir("nota 2 : " + a.nota2);
    imprimir("promedio : " + a.promedio());
  
  // Imprime una línea de texto incluyendo un salto de línea al final
void imprimir(String cad) {
    txtS.append(cad + "\n");
  }
}

