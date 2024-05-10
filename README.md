
## Descripción de la implementación


## Singleton

 El patrón Singleton garantiza que una clase tenga una única instancia y proporciona un punto de acceso global a esa instancia

Se define una variable estática en la clase Singleton que guarda la única instancia de la clase. 

El constructor de la clase es privado, lo que significa que no se puede instanciar la clase directamente desde fuera de la clase. La única forma de obtener una instancia de la clase es a través del método estático getInstance().

Dentro del método getInstance(), se comprueba si la instancia es nula. Si es nula, se crea una nueva instancia de la clase Singleton y se asigna a la variable instance. Si ya existe una instancia, simplemente se devuelve la instancia existente.

El método showMessage() simplemente imprime un mensaje en la consola.

En la clase App, en el método main(), se crea una instancia de Singleton utilizando el método getInstance(). Luego se llama al método showMessage() en esa instancia para imprimir el mensaje en la consola.
