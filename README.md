# Java Desde Mac

## prerequisitos
instalar java de acuerdo a su versión:

### desde su pagina oficial:

- link: https://www.oracle.com/java/technologies/downloads/?er=221886#jdk23-mac

### o desde la terminal:

usando brew

```bash
brew install openjdk@23
```

configurando del entorno desde la terminal:

```bash
echo 'export JAVA_HOME="$(brew --prefix openjdk@23)"' >> ~/.bash_profile
echo 'export PATH="$JAVA_HOME/bin:$PATH"' >> ~/.bash_profile
source ~/.bash_profile
```

verificar si todo esta okey:

```bash
java -version
```

crear un archivo basico de java: `OperacionesMatematicas.java`

```java
public class OperacionesMatematicas {
    public static void main(String[] args) {
        int a = 10;
        int b = 5;

        // 1. Suma
        int suma = a + b;
        System.out.println("Suma: " + suma); // Resultado: 15

        // 2. Resta
        int resta = a - b;
        System.out.println("Resta: " + resta); // Resultado: 5

        // 3. Multiplicación
        int multiplicacion = a * b;
        System.out.println("Multiplicación: " + multiplicacion); // Resultado: 50

        // 4. División
        int division = a / b;
        System.out.println("División: " + division); // Resultado: 2

        // 5. Módulo (Residuo de la división)
        int modulo = a % b;
        System.out.println("Módulo: " + modulo); // Resultado: 0

        // 6. Potenciación
        double potencia = Math.pow(a, b); // Eleva a a la potencia de b
        System.out.println("Potenciación: " + potencia); // Resultado: 100000.0
    }
}
```

para correr el archivo de java

```bash
java OperacionesMatematicas.java
```

## Para usar Spring

instalar maven para manejar el paquete

```bash
brew install maven
```

verificar si se instalo correctamente

```bash
mvn -v
```

### Para crear un proyecto con spring web

dirigirse a la página web de Spring Initializr

- link: https://start.spring.io/

y de aqui configuramos masomenos asi:

```
Configura el proyecto:
Project: Maven Project
Language: Java
Spring Boot: (última versión estable)
Group: com.example
Artifact: my-spring-app
Name: my-spring-app
Packaging: Jar
Java: 23
```

Dependencies: Agrega Spring Web y Spring Data JPA (y H2 Database si lo deseas).

- y hay un boton que dice `generate` y con eso se descargara un zip comprimido, luego lo descomprimes y lo abres desde un editor de codigo como vscode

## para ejecutar el proyecto minimo

primero tenemos que crear un controller
creamos un archivo dentro de: ` src/main/java/com/example/emerson1/HelloController.java` en el caso mio
y el controller debe estar asi:

```java
package com.example.emerson1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public String helloWorld() {
        return "¡Hola, Mundo! desde JAva";
    }
}
```

y para correr el proyecto:

```bash
mvn spring-boot:run
```

y generalmente se va mostrar el la ruta del navegador
`http://127.0.0.1:8080/hello`
