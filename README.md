# Microservicio de Pedidos - Grupo Cordillera

Este componente backend se encarga de la gestión y persistencia de las órdenes de compra y transacciones de la organización. Ha sido desarrollado siguiendo un arquetipo Maven para asegurar la escalabilidad del sistema de ventas.

## Tecnologías Utilizadas
* Java 17 y Spring Boot 3.x
* Spring Data JPA para el acceso a datos
* Base de Datos H2 (Persistencia independiente por servicio)
* Project Lombok para la optimización de código

## Instrucciones de Instalación y Ejecución
1. Verifique que cuenta con el JDK 17 y Maven instalados en su sistema.
2. Desde la terminal, acceda a la carpeta raíz del proyecto.
3. Ejecute el comando de compilación y despliegue:
   mvn spring-boot:run
4. El servicio estará operativo en la dirección: http://localhost:8081

## Endpoints Disponibles
* GET /api/pedidos/todos: Recupera el listado completo de pedidos registrados.
* GET /api/pedidos/resumen-ventas: Genera una respuesta formal de datos para el Dashboard gerencial.
* POST /api/pedidos/crear: Registra una nueva orden de pedido en la base de datos.
* GET /api/pedidos/cargar-ejemplos: Utilidad para poblar la base de datos con registros de prueba iniciales.

## Consideraciones Éticas y Arquitectónicas
El diseño implementa el patrón Database-per-Service, lo que garantiza el aislamiento de la información financiera de los clientes. Esta estructura previene que fallos de seguridad en otros módulos afecten la integridad de los datos de ventas.
