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

## Créditos

*   **PokeAPI:** Por proporcionar la información de los Pokémon.

## Contacto

Si tienes alguna pregunta o sugerencia, no dudes en contactarme en gustavo.forero1997@gmail.com
