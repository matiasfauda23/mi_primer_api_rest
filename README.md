🚀 Mi Primer API REST con Spring Boot

¡Hola! Este es mi primer proyecto desarrollando una API REST funcional. El objetivo es gestionar un catálogo de clientes conectado a una base de datos PostgreSQL, aplicando las mejores prácticas de arquitectura de software.
🛠️ Tecnologías Utilizadas

    Java 17/25

    Spring Boot 3 (Spring Data JPA, Spring Web)

    PostgreSQL (Base de datos relacional)

    Lombok (Para limpieza de código)

    Maven (Gestor de dependencias)

🏗️ Arquitectura del Proyecto

He implementado una arquitectura por capas para separar las responsabilidades, garantizando un código mantenible y escalable:

    Entity: Mapeo de la tabla clientes de PostgreSQL a objetos Java. Representa la estructura real de la base de datos.

    DTO (Data Transfer Object): Objetos diseñados para el transporte de datos entre el cliente y el servidor, actuando como un "escudo" de seguridad para las Entities.

    DAO (Data Access Object): Interfaz que extiende de CrudRepository para manejar el persistencia de datos (SQL) de forma automática.

    Service: Capa de lógica de negocio. Utilizo el patrón de Interfaz + Implementación para lograr un código desacoplado. Aquí se realiza el "Mapping" entre DTOs y Entities.

    Controller: Punto de entrada de las peticiones HTTP que gestiona la comunicación con el cliente externo.

📝 Notas de Aprendizaje

Durante este proceso he aprendido conceptos clave como:

    Inyección de Dependencias: Uso de @Autowired para conectar componentes sin instanciarlos manualmente.

    Patrón DTO: Implementación de objetos de transferencia para mejorar la seguridad y el desacoplamiento de la API.

    ORM (Object-Relational Mapping): Sincronización de Java con SQL usando JPA/Hibernate.

    Patrón Builder (Lombok): Creación de objetos de forma fluida y legible, facilitando la conversión entre capas.

    Transaccionalidad: Uso de @Transactional para asegurar que las operaciones en la DB sean atómicas (todo o nada).

    Git: Manejo de versiones, ramas y resolución de conflictos de configuración.

Proyecto en construcción... 🚧