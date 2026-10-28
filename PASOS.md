# Pasos del dojo

Guía completa del taller, en el orden recomendado. Cada bloque termina con algo que se puede
ejecutar y comprobar.

> **Los pasos 1 a 10 son la preparación del entorno**: instalar JDK y Gradle, configurar el proyecto
> y el build. Están desarrollados en la guía del blog enlazada en el README, y no se repiten aquí.

## 11–18 · Esqueleto del proyecto

- [ ] **11** Crear el paquete base de la aplicación: grupo `com.cedaniel200.screenplay` + nombre de app `dojo` → `com.cedaniel200.screenplay.dojo`.
- [ ] **12** Crear el paquete `runner` dentro del paquete base.
- [ ] **13** Crear la suite de pruebas (`InicioSesionTestSuite.java`) con las anotaciones de JUnit Platform:
  ```java
  @Suite
  @IncludeEngines("cucumber")
  @SelectClasspathResource("features")
  @ConfigurationParameter(key = GLUE_PROPERTY_NAME, value = "com.cedaniel200.screenplay.dojo.stepdefinition")
  ```
- [ ] **14** Crear el paquete `stepdefinition` dentro del paquete base.
- [ ] **15** Ejecutar la suite.
- [ ] **16** Crear la definición de los pasos (`InicioSesionStepDefinition.java`) a partir de lo que devuelve la ejecución.
- [ ] **17** Crear en `InicioSesionStepDefinition` el método `setTheStage` con la anotación `@Before` y esta línea:
  ```java
  OnStage.setTheStage(new OnlineCast());
  ```
- [ ] **18** Implementar el método con la anotación `@Given`: crear el actor y abrir la página con `InicioSesionPage`.

## 19–22 · Paquete base y página de login

- [ ] **19** Confirmar el paquete base de la aplicación: `com.cedaniel200.screenplay.dojo`.
- [ ] **20** Crear el paquete `userinterfaces` dentro del paquete base.
- [ ] **21** Crear `InicioSesionPage.java` en `userinterfaces`, heredando de `PageObject`.
- [ ] **22** Agregar la anotación de clase `@DefaultUrl("https://github.com/login")`.

## 23–30 · La tarea de autenticarse

- [ ] **23** Implementar el método con la anotación `@When`: debe crear la tarea, que recibe un usuario.
- [ ] **24** Crear el paquete `tasks` dentro del paquete base.
- [ ] **25** Crear el paquete `models` dentro del paquete base.
- [ ] **26** Crear el modelo `Usuario.java` en `models`, con los atributos `usuario` y `contrasena`, y sus getters.
- [ ] **27** Crear la tarea en `tasks`, implementando la interfaz `Task`.
- [ ] **28** Mapear los elementos de la página de inicio de sesión de GitHub en `InicioSesionPage`.
- [ ] **29** Crear la instancia de la tarea usando el método `instrumented`.
- [ ] **30** Implementar `performAs` de la tarea con los elementos mapeados.

## 31–34 · Modelo y builder

- [ ] **31** Ejecutar la prueba.
- [ ] **32** Mejorar la legibilidad usando un Builder.
- [ ] **33** Crear `UsuarioBuilder.java` en `models`.
- [ ] **34** Validar el estado del modelo: que los `String` no estén vacíos ni nulos.

## 35–38 · Excepciones y utilidades

- [ ] **35** Crear el paquete `exceptions` dentro del paquete base.
- [ ] **36** Crear la excepción `UsuarioEstadoIlegalException.java` en `exceptions`.
- [ ] **37** Crear el paquete `utils` dentro del paquete base.
- [ ] **38** Crear `ValidadorString.java` y mover allí el método que valida los `String`.

## 39–43 · La pregunta y la página de inicio

- [ ] **39** Implementar el método con la anotación `@Then`: verificar si es visible la página de inicio.
- [ ] **40** Crear el paquete `questions` dentro del paquete base.
- [ ] **41** Crear la question.
- [ ] **42** Crear `InicioPage.java` en `userinterfaces`.
- [ ] **43** Mapear el elemento con el que se verificará la visibilidad de la página de inicio.

## 44–48 · Compilar, ejecutar y documentar

- [ ] **44** Limpiar las ejecuciones anteriores: `./gradlew clean`.
- [ ] **45** Ejecutar la prueba: `./gradlew test`.
- [ ] **46** Generar la documentación: `./gradlew aggregate`.
- [ ] **47** Revisar la documentación.
- [ ] **48** Agregar `@Step` y `@Subject` para mejorar la salida del reporte.

## 49–53 · Datos y excepciones de negocio

- [ ] **49** Configurar `-Dusuario=` y `-Dcontrasena=` para no tener los datos en el código.
- [ ] **50** Configurar `-Dcontext=` y `-Dwebdriver.driver=` para el contexto y el navegador.
- [ ] **51** Configurar `serenity.properties` para probar con diferentes navegadores.
- [ ] **52** Usar `orComplainWith` dentro del método con la anotación `@Then`.
- [ ] **53** Crear la excepción `AutenticacionFallidaError.java` en `exceptions`.

## 54–56 · Cierre

- [ ] **54** Limpiar las ejecuciones anteriores: `./gradlew clean`.
- [ ] **55** Ejecutar la prueba con datos válidos y luego con datos inválidos.
- [ ] **56** Generar la documentación: `./gradlew aggregate`.
