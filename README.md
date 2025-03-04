# Pokedex Android Test

Este proyecto es una aplicación móvil de Pokedex desarrollada en Android utilizando Kotlin y las bibliotecas modernas de Jetpack. Permite a los usuarios explorar información detallada sobre diferentes Pokémon, incluyendo sus estadísticas, tipos, habilidades y más.

## Características

*   **Exploración de Pokémon:** Navega a través de una lista de Pokémon y accede a información detallada sobre cada uno.
*   **Detalles del Pokémon:** Visualiza estadísticas clave como HP, ataque, defensa, velocidad, peso y altura.
*   **Tipos y Habilidades:** Descubre los tipos y habilidades de cada Pokémon.
*   **Experiencia:** Muestra la experiencia del pokemon.
*   **Diseño Moderno:** Interfaz de usuario atractiva y fácil de usar, construida con Jetpack Compose.
*   **Persistencia de Datos:** Utiliza Room para almacenar datos localmente y mejorar la experiencia del usuario.
*   **Inyección de Dependencias:** Usa Hilt para la inyección de dependencias.
* **Navegación:** Usa Navigation Compose para la navegación.
* **Manejo de estado:** Usa ViewModels para el manejo de estado.
* **Manejo de peticiones:** Usa Retrofit para el manejo de peticiones.
* **Manejo de imagenes:** Usa Glide para el manejo de imagenes.

## Tecnologías Utilizadas

*   **Kotlin:** Lenguaje de programación principal.
*   **Android Jetpack:** Conjunto de bibliotecas para el desarrollo de aplicaciones Android.
    *   **Compose:** Para la construcción de la interfaz de usuario.
    *   **Room:** Para la persistencia de datos local.
    *   **ViewModel:** Para la gestión del estado de la UI.
    *   **Navigation:** Para la navegación entre pantallas.
*   **Hilt:** Para la inyección de dependencias.
*   **Retrofit:** Para realizar peticiones de red.
*   **Gson:** Para la serialización y deserialización de JSON.
* **Glide:** Para el manejo de imagenes.
*   **API:** [PokeAPI](https://pokeapi.co/) como fuente de datos.

## Estructura del Proyecto

El proyecto sigue una arquitectura limpia y modular, separando las responsabilidades en diferentes capas:

*   **`core`:** Contiene clases y funciones comunes a toda la aplicación.
    *   **`models`:** Contiene los modelos de datos.
*   **`data`:** Contiene la lógica de acceso a datos.
    *   **`database`:** Contiene la lógica de acceso a la base de datos local.
        *   **`entity`:** Contiene las entidades de la base de datos.
        *   **`mappers`:** Contiene los mappers para convertir entre entidades y modelos de dominio.
    *   **`network`:** Contiene la lógica de acceso a la red.
        *   **`api`:** Contiene las interfaces de la API.
        *   **`response`:** Contiene las respuestas de la API.
    * **`repository`:** Contiene los repositorios.
*   **`domain`:** Contiene la lógica de negocio.
    *   **`model`:** Contiene los modelos de dominio.
    *   **`usecase`:** Contiene los casos de uso.
*   **`features`:** Contiene las diferentes funcionalidades de la aplicación.
    *   **`details`:** Contiene la funcionalidad de detalles del pokemon.
    *   **`home`:** Contiene la funcionalidad de la pantalla principal.
*   **`di`:** Contiene los módulos de Hilt para la inyección de dependencias.
*   **`ui`:** Contiene los componentes de la interfaz de usuario.
    *   **`theme`:** Contiene los temas de la aplicación.

## Arquitectura y Patrones de Diseño

Este proyecto sigue una arquitectura limpia y utiliza varios patrones de diseño para garantizar la calidad, la mantenibilidad y la capacidad de prueba del código.

### Arquitectura Limpia (Arquitectura en Capas)

**Decisión:** El proyecto está estructurado en capas distintas: `core`, `data`, `domain`, `features`, `di` y `ui`.

**Razonamiento:** La Arquitectura Limpia promueve la separación de responsabilidades, la capacidad de prueba y el mantenimiento al aislar diferentes partes de la aplicación. Cada capa tiene una responsabilidad específica y solo interactúa con las capas adyacentes, lo que facilita la modificación y la evolución del código.

### Patrón de Repositorio

**Decisión:** Se utilizan repositorios para abstraer la lógica de acceso a datos.

**Razonamiento:** Los repositorios proporcionan una interfaz limpia para interactuar con las fuentes de datos (locales o remotas), ocultando los detalles de implementación del resto de la aplicación. Esto permite cambiar la fuente de datos (por ejemplo, de una base de datos local a un servicio web) sin afectar a otras partes del código.

### Casos de Uso (Interactors)

**Decisión:** Se utilizan casos de uso para encapsular la lógica de negocio.

**Razonamiento:** Los casos de uso definen acciones específicas que se pueden realizar en la aplicación, promoviendo una clara separación entre la lógica de negocio y el acceso a datos. Cada caso de uso representa una tarea o interacción específica del usuario, lo que facilita la comprensión y la prueba de la lógica de negocio.

### Inyección de Dependencias (Hilt)

**Decisión:** Se utiliza Hilt para la inyección de dependencias.

**Razonamiento:** Hilt simplifica la inyección de dependencias en aplicaciones Android, reduciendo el código repetitivo y mejorando la capacidad de prueba. Hilt gestiona la creación y el ciclo de vida de las dependencias, lo que facilita la gestión de las dependencias en toda la aplicación.

### Modelo-Vista-ViewModel (MVVM)

**Decisión:** MVVM se utiliza como el patrón arquitectónico para la capa de la interfaz de usuario.

**Razonamiento:** MVVM separa la interfaz de usuario de los datos y la lógica subyacentes, haciendo que la interfaz de usuario sea más fácil de probar y mantener. El ViewModel expone los datos y las acciones a la Vista, pero no tiene conocimiento de la Vista en sí, lo que permite probar la lógica de la interfaz de usuario de forma independiente.

## Instalación

1.  Clona el repositorio:
   2.  Abre el proyecto en Android Studio.
3.  Sincroniza el proyecto con Gradle.
4.  Ejecuta la aplicación en un emulador o dispositivo Android.

## Uso

1.  Abre la aplicación en tu dispositivo.
2.  Explora la lista de Pokémon en la pantalla principal.
3.  Selecciona un Pokémon para ver sus detalles.
4.  Navega entre las diferentes pantallas para explorar más información.

## Screnshots
![image](https://github.com/user-attachments/assets/85cb8ebb-154f-4f0b-8f55-509e7322ed08)
![image](https://github.com/user-attachments/assets/d6466b1c-dad7-457d-870e-f75942395dca)


## Créditos

*   **PokeAPI:** Por proporcionar la información de los Pokémon.

## Contacto

Si tienes alguna pregunta o sugerencia, no dudes en contactarme en gustavo.forero1997@gmail.com
