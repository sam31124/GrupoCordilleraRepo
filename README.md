# Microservicio de Inventario - Grupo Cordillera

Este módulo es responsable del control de existencias, gestión de stock y monitoreo de materiales de construcción dentro de las plantas operativas de Grupo Cordillera.

## Tecnologías Utilizadas
* Java 17 con Framework Spring Boot 3.x
* Persistencia mediante Spring Data JPA
* Motor de base de datos H2 en memoria
* Anotaciones Lombok para reducción de código repetitivo

## Instrucciones de Instalación y Ejecución
1. Sitúese en la carpeta raíz del microservicio mediante una terminal.
2. Utilice el comando de Maven para iniciar la aplicación:
   mvn spring-boot:run
3. El microservicio escuchará peticiones en el puerto: 8080

## Endpoints Disponibles
* GET /inventario/stock: Retorna la lista detallada de todos los materiales en inventario.
* GET /inventario/alertas-criticas: Identifica productos con niveles de existencia por debajo del umbral de seguridad (50 unidades).
* GET /inventario/cargar-ejemplos: Inserta datos de materiales reales (Cemento, Fierro, Áridos) para validación del sistema.

## Eficiencia de Recursos y Sostenibilidad
La arquitectura de microservicios permite que este componente sea escalado de forma independiente según la demanda de las plantas. Esto optimiza el consumo de recursos de cómputo en el servidor, alineándose con las políticas de eficiencia energética de la organización.
