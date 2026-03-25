API REST con Spring Boot

¡Hola! Este es mi primer proyecto desarrollando una API REST funcional. El objetivo es gestionar un catálogo de clientes conectado a una base de datos PostgreSQL, aplicando las mejores prácticas de arquitectura de software.

## Tecnologías Utilizadas
* **Java 17**
* **Spring Boot 3** (Spring Data JPA, Spring Web)
* **PostgreSQL** (Base de datos relacional)
* **Lombok** (Para limpieza de código)
* **Maven** (Gestor de dependencias)

## Arquitectura del Proyecto
He implementado una arquitectura por capas para separar las responsabilidades:

1.  **Entity**: Mapeo de la tabla `clientes` de PostgreSQL a objetos Java.
2.  **DAO (Data Access Object)**: Interfaz que extiende de `CrudRepository` para manejar el SQL de forma automática.
3.  **Service**: Capa de lógica de negocio. Utilizo el patrón de **Interfaz + Implementación** para lograr un código desacoplado y fácil de testear.
4.  **Controller**: (En desarrollo) Punto de entrada de las peticiones HTTP.

## Notas de Aprendizaje
Durante este proceso he aprendido conceptos clave como:
* **Inyección de Dependencias**: Uso de `@Autowired` para conectar componentes.
* **ORM (Object-Relational Mapping)**: Cómo sincronizar Java con SQL usando `@Column` e `@Id`.
* **Transaccionalidad**: El uso de `@Transactional` para asegurar la integridad de los datos.
* **Git**: Manejo de versiones y resolución de conflictos de fin de línea (LF vs CRLF).

---
*Proyecto en construcción...*