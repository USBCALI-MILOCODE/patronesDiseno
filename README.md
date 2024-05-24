
## Descripción de la implementación


## Singleton

 El patrón Singleton garantiza que una clase tenga una única instancia y proporciona un punto de acceso global a esa instancia

Se define una variable estática en la clase Singleton que guarda la única instancia de la clase. 

El constructor de la clase es privado, lo que significa que no se puede instanciar la clase directamente desde fuera de la clase. La única forma de obtener una instancia de la clase es a través del método estático getInstance().

Dentro del método getInstance(), se comprueba si la instancia es nula. Si es nula, se crea una nueva instancia de la clase Singleton y se asigna a la variable instance. Si ya existe una instancia, simplemente se devuelve la instancia existente.

El método showMessage() simplemente imprime un mensaje en la consola.

En la clase App, en el método main(), se crea una instancia de Singleton utilizando el método getInstance(). Luego se llama al método showMessage() en esa instancia para imprimir el mensaje en la consola.
## Decorator

Implementé LoggerDecorator para extender la funcionalidad de BaseDatos con logging. Este decorador recibe una instancia de BaseDatos y un Logger en su constructor. 

En inserta, añade un mensaje de inserción al logger y propaga la llamada a la base de datos original. En registros, añade un mensaje de lectura al logger y devuelve el resultado de la base de datos original. Así, se enriquece la funcionalidad de BaseDatosMemoria sin modificar su código.
## Mediator

En esta implementación del patrón Mediator, se creó una clase SistemaMediator que coordina las interacciones entre Coche, Radio y Telefono, eliminando las referencias directas entre ellas. 

Cada componente comunica sus acciones a través del Mediator. La configuración y prueba del sistema se manejan en una clase separada SistemaConfigurador, que organiza la creación de instancias y la prueba de funcionalidades. Este enfoque promueve un diseño desacoplado y facilita la gestión de las interacciones entre los componentes.
