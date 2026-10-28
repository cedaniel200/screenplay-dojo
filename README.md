# Screenplay Dojo — Autenticación

![Java](https://img.shields.io/badge/Java-17-blue)
![Serenity BDD](https://img.shields.io/badge/Serenity%20BDD-5.4.1-green)
![Cucumber](https://img.shields.io/badge/Cucumber-8.0.4-brightgreen)
![Gradle](https://img.shields.io/badge/Gradle-9.8.2-darkgreen)
[![License](https://img.shields.io/badge/License-MIT-yellow)](LICENSE)

Taller para practicar el patrón Screenplay implementando, paso a paso, la autenticación en GitHub.
La suite está escrita y **falla a propósito**: el escenario lanza `PendingException` hasta que se
completan las tareas.

## Qué se practica

| Pieza | Qué hay que construir |
|---|---|
| `models` | Un modelo de usuario con sus validaciones |
| `tasks` | La tarea de autenticarse, compuesta con las acciones de Screenplay |
| `userinterfaces` | El mapeo de los campos de la página de login |
| `questions` | La comprobación de que se llegó a la página de inicio |

La guía con el orden de los ejercicios está en
[`Pasos.java`](src/main/java/com/cedaniel200/screenplay/dojo/Pasos.java): los `TODO` numerados son
el recorrido recomendado.

## Requisitos

- **JDK 17**. El build fija un toolchain de Java 17.
- **Un navegador instalado** (Chrome por defecto). El driver lo resuelve Selenium Manager.
- **Una cuenta de GitHub**: el escenario se autentica en el sitio real.

## Cómo se ejecuta

```sh
./gradlew test
```

Mientras no estén implementados los pasos, el escenario falla con:

```
io.cucumber.java.PendingException: TODO: implement me
```

Eso es la señal de partida, no un error de configuración. Cuando los tres pasos estén completos, la
suite debe quedar en verde.

Para el informe:

```sh
./gradlew aggregate
```

Queda en `target/site/serenity/index.html`.

## Estructura

```text
src/main/java/com/cedaniel200/screenplay/dojo
├── Pasos.java        # guía del taller
├── tasks/            # por implementar
├── models/           # por implementar
├── questions/        # por implementar
├── userinterfaces/   # InicioSesionPage
└── exceptions/

src/test
├── java/.../runner/InicioSesionTestSuite.java
├── java/.../stepdefinition/InicioSesionStepDefinition.java
└── resources/features/inicio_sesion.feature
```

## Relación con la plantilla

Usa la estructura de [serenity-screenplay-template](https://github.com/cedaniel200/serenity-screenplay-template).
Aquí las capas están vacías porque el ejercicio consiste en llenarlas.

## Ten en cuenta

- **El escenario necesita credenciales propias.** Autenticarse en GitHub exige una cuenta; con 2FA
  activo, el login por interfaz no funciona.
- **No hay Docker**: el taller se ejecuta en local, con el navegador de tu máquina.
- **Los `TODO` son el ejercicio.** No los borres: son el mapa.

## Licencia

[MIT](LICENSE) © Cesar Daniel
