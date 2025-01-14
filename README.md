# ConversorMonedasChhallengeOne
# Conversor de Moneda

¡Bienvenido al Conversor de Moneda! Esta aplicación permite convertir entre diferentes monedas de manera rápida y sencilla usando una interfaz gráfica. También guarda los datos de conversión en un archivo JSON para referencia futura.

## Características

- Selecciona la moneda de origen y de destino entre las 35 monedas más comunes.
- Ingresa la cantidad a convertir y obtén el valor convertido.
- Guarda los resultados de la conversión en un archivo JSON.
- Interfaz gráfica fácil de usar.

## Video Demostrativo

[![Ver Video]([https://img.youtube.com/vi/TU_VIDEO_ID/maxresdefault.jpg](https://github.com/mauriander/ConversorMonedasChhallengeOne/blob/main/2025-01-14%2000-06-09.mkv))]([https://www.youtube.com/watch?v=TU_VIDEO_ID](https://github.com/mauriander/ConversorMonedasChhallengeOne/blob/main/2025-01-14%2000-06-09.mkv))

## Requisitos

- Java 8 o superior
- Biblioteca Gson para la manipulación de JSON

## Instalación

1. **Clona el repositorio:**

    ```sh
    git clone https://github.com/tu_usuario/conversor-moneda.git
    ```

2. **Navega al directorio del proyecto:**

    ```sh
    cd conversor-moneda
    ```

3. **Añade la biblioteca Gson a tu proyecto:**

    - **Con Maven:** Añade la siguiente dependencia en tu `pom.xml`:

        ```xml
        <dependency>
            <groupId>com.google.code.gson</groupId>
            <artifactId>gson</artifactId>
            <version>2.8.8</version>
        </dependency>
        ```

    - **Sin Maven:** Descarga el archivo JAR de Gson desde [Maven Repository](https://mvnrepository.com/artifact/com.google.code.gson/gson) y añádelo al classpath de tu proyecto.

4. **Ejecuta la aplicación:**

    ```sh
    javac Principal.java
    java Principal
    ```

## Uso

1. **Selecciona la moneda de origen.**
2. **Selecciona la moneda de destino.**
3. **Ingresa la cantidad a convertir.**
4. **Haz clic en "Convertir".**
5. **El valor convertido aparecerá en la etiqueta correspondiente.**
6. **Los datos de conversión se guardarán en un archivo JSON en el directorio del proyecto.**

## Contribuir

¡Nos encantaría recibir tus contribuciones! Para contribuir, sigue estos pasos:

1. Haz un fork del proyecto.
2. Crea una rama nueva (`git checkout -b feature-nueva`).
3. Realiza tus cambios y haz commits (`git commit -m 'Añadir nueva característica'`).
4. Haz push a la rama (`git push origin feature-nueva`).
5. Abre un Pull Request.



## Licencia

Este proyecto está licenciado bajo la Licencia MIT. Consulta el archivo [LICENSE](LICENSE) para más detalles.
