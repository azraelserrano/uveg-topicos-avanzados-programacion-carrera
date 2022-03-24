Instrucciones


Para cumplir con tu Reto, sigue los siguientes pasos: 

1.	Descarga NetBeans desde le siguiente enlace.




Enlace

Autor: Apache NEtBeans
Título: Lanzamientos de ApacheNetBeans



2.	Una vez instalado NetBeans, desarrolla un proyecto donde simules una carrera atlética entre cinco corredores. 

Considera los siguientes requerimientos: 

•	Diseño de la interfaz gráfica 

a)	Crea una clase que se llame AthleticRaceInterface y agrega los elementos gráficos correspondientes, como se muestra en la imagen. 
b)	Observa en la imagen que la ventana consta de tres secciones:

La número 1: un campo de texto y un botón para registrar a los corredores en el sistema.
La número 2: es un JTextArea que muestra los participantes registrados hasta el momento.
La número 3: consta de cuatro elementos gráficos.
c)	Un JTextArea que muestra el orden en que los competidores llegan a la meta.
d)	Tres botones para iniciar la carrera, reiniciar la carrera y terminar la ejecución del programa.
 
![image](https://user-images.githubusercontent.com/102324757/159998041-2438d8ce-dd88-44fe-b950-5262fcb8287e.png)


•	Lógica de programación

a.	Crea una clase encapsulada que se llame Runner para registrar a los corredores; esta clase tendrá los atributos name y speed. 

 El atributo name corresponde al nombre del corredor y el atributo speed, a un número aleatorio entre 0 y 30 (puedes usar el método random que provee la clase Math).

b.	En la clase AthleticRaceInterface debes definir un arreglo del tipo Runner con cinco elementos; de esta manera, el sistema aceptará cinco corredores como máximo. 

Cuando el usuario presione el botón Registrar, el programa debe validar que el nombre del corredor no está vacío y que no excede el tamaño del arreglo (agrega los mensajes correspondientes para que el usuario conozca lo que sucede internamente en el sistema. Puedes usar la clase JOptionPane).
![image](https://user-images.githubusercontent.com/102324757/159998090-6627178b-e009-4188-a983-ab733d99514e.png)

c.	Cuando se registre un usuario correctamente, éste debe aparecer listado en el JTextArea perteneciente a la sección 2 de la ventana (corredores registrados).

![image](https://user-images.githubusercontent.com/102324757/159998109-82c6ef73-2d0f-497f-a566-c6ee97660a70.png)

d.	Crea una clase que se llame ThreadRunner, que se puede extender desde la clase Thread o implementar la interfaz Runnable; 

El constructor de esta clase debe recibir el nombre del corredor y el JTextArea, es decir, una instancia de la clase Runner y la instancia del elemento gráfico JTextArea; esto es para agregar al corredor cuando el hilo se haya completado (en el método run() usa el método sleep que provee la clase Thread; éste debe recibir como argumento el valor del atributo speed del corredor actual, valor que debes multiplicar por 1000 para convertirlo a milisegundos).

 ![image](https://user-images.githubusercontent.com/102324757/159998149-852fe604-b792-4398-80ab-06d5cae14c79.png)


e.	Con el botón Iniciar y para comenzar la carrera, se debe validar que los cinco corredores están registrados.
f.	El botón Reiniciar debe limpiar todos los valores de las variables en la clase, así como los datos de lo JTextArea.
g.	Finalmente, el botón Terminar debe cerrar el programa.


3.	Una vez terminado tu proyecto, guárdalo en una carpeta con la nomenclatura:  Apellido Paterno_Nombre_R5_U3 y conviértelo en archivo ZIP para que lo envíes a tu Asesor.
