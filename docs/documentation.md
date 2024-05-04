# Documentación - Supermercado Hiperdino

### Clases de Utilidad:

## Format

Esta clase proporciona métodos estáticos para formatear cadenas de texto, como la creación de encabezados.

Método header(String title, char c): Crea un encabezado con un título centrado y bordes decorativos.

Método repeatChar(char c, int n): Repite un carácter específico un número dado de veces.

## Random

Proporciona métodos estáticos para generar clientes y productos aleatorios.

Método nexCustomer(): Genera un cliente aleatorio seleccionando un nombre aleatorio de la lista availableNames.

Método nextProduct(): Genera un producto aleatorio seleccionando un nombre de producto aleatorio de la lista availableProducts.

> Estos métodos son útiles para simular la llegada de clientes con nombres aleatorios y la compra de productos aleatorios en la aplicación del supermercado.

### Clases Principales:

## SupermarketException

Esta clase representa una excepción específica para errores relacionados con operaciones en el supermercado.

- **Constructor SupermarketException(String message):** Crea una nueva instancia de SupermarketException con el mensaje de error proporcionado.

## Product

Esta clase representa un producto que se puede comprar en el supermercado.

- **Constructor Product(String name):** Inicializa un nuevo objeto Product con el nombre proporcionado.

- **Método toString():** Retorna el nombre del producto en forma de cadena.

## Customer

Esta clase representa a un cliente en un supermercado, con una lista de productos que ha comprado.

- **Constructor Customer(String name):** Inicializa un nuevo objeto Customer con el nombre proporcionado y una lista vacía de productos.

- **Método getName():** Retorna el nombre del cliente.

- **Método addProduct(Product product):** Agrega un producto a la lista de productos del cliente.

- **Método removeProduct():** Remueve y retorna el último producto agregado a la lista de productos del cliente.

- **Método toString():** Genera una representación en forma de cadena del cliente y su lista de productos comprados.

## Cashier

Esta clase representa una caja registradora en un supermercado, gestionando la cola de clientes que esperan ser atendidos.

- **Constructor Cashier():** Inicializa un nuevo objeto Cashier, asignando un ID único y creando una nueva cola de clientes.

- **Método isOpen():** Verifica si la caja está abierta.

- **Método open():** Abre la caja registradora.

- **Método close():** Cierra la caja registradora.

- **Método addCustomer(Customer customer):** Agrega un cliente a la cola de la caja registradora.

- **Método nextCustomer():** Elimina y devuelve al siguiente cliente en la cola de la caja registradora.

- **Método customersLeft():** Retorna el número de clientes que quedan en la cola de la caja registradora.

- **Método toString():** Genera una representación en forma de cadena de la caja registradora.

## Manager

Esta clase gestiona las operaciones de apertura, cierre y atención de clientes en una caja registradora de un supermercado.

- **Constructor Manager():** Inicializa un nuevo objeto Manager, creando una nueva instancia de Cashier.

- **Método openCashier():** Abre la caja registradora. SupermarketException se lanza si la caja ya está abierta.

- **Método addCustomer():** Añade un cliente a la cola de la caja registradora, generando productos aleatorios para el cliente. SupermarketException se lanza si la caja está cerrada.

- **Método serveCustomer():** Atiende al siguiente cliente en la cola de la caja registradora. SupermarketException se lanza si no hay clientes en la cola.

- **Método checkQueue():** Muestra el estado actual de la cola de la caja registradora. SupermarketException se lanza si no hay clientes en la cola.

- **Método closeCashier():** Cierra la caja registradora. SupermarketException se lanza si aún hay clientes pendientes en la cola.

### Clase Ejecutable:

## HiperdinoApp

Clase principal que ejecuta la simulación del supermercado, proporcionando una interfaz de usuario para interactuar con el sistema.

- **Método main(String[] args):** Este método inicia la ejecución de la simulación del supermercado, y contiene un bucle que muestra continuamente el menú de opciones y espera la entrada del usuario hasta que se cierre el programa.

- **Método showMenu():** Muestra el menú de opciones disponibles para el usuario.

- **Método performAction():** Interpreta la opción ingresada por el usuario y realiza la acción correspondiente. Si se ingresa una opción no válida o cualquiera de los métodos que se invocan en su interior lanza alguna excepción, se captura y maneja la excepción del tipo SupermarketException, mostrando un mensaje de error al usuario.

- **Método exitProgram():** Finaliza la ejecución del programa.

[<- Volver](../README.md)
