# AREP TALLER 1

Creacion de API Rest que consulta la informacion de peliculas de una pagina especifica, unicamente se usa la accion GET a traves del titulo de la misma

## Iniciando

### Prerequisites

* Git: controlador de versiones y administrador de repositorio
* Java: Ambiente de desarrollo
* Maven: Administrador del ciclo de vida del proyecto

### Installing

Primero debemos clonar el repositorio con el siguiente comando

```
git clone https://github.com/judibec/Taller_1_AREP.git
```

Luego entramos a la carpeta donde se encuenta el archivo ```pom.xml``` y ejecutamos el siguiente comando

```
mvn clean package exec:java -D "exec.mainClass"="edu.escuelaing.arem.ASE.app.HttpServer"
```

Entramos a cualquier Browser y entramos a la direccion http://localhost:34000 alli buscamos cualquier pelicula en "text" y le damos submit

Para visualizar el javadoc basta con ejecutar el comando 

```
mvn javadoc:javadoc
```
Y entramos a dicha ruta

```
...\miprimera-app\target\site\apidocs
```

## Corriendo tests

Para correr los test basta con entrar a la carpeta donde esta el ```pom.xml``` y corremos el siguiente comando 

```
mvn test
```

### Explicacion de tests

Tenemos 2 tests principales:
* testAppAPI: Revisa el funcionamiento adecuado de la API con el resultado que nos arroja la pagina base [OMDb API](http://www.omdbapi.com)
* testAppAPICache: Revisa el funcionamiento del cache, para que no se guarden datos que ya estan en memoria

### Stilo de los tests

Estos codigos muestran el funcionamiento principal del proyecto, ya que realiza el GET de la manera correcta y mantiene un cache multiusuario para la API

## Built With

* [Maven](https://maven.apache.org/) - Administrador de dependencias

## Version

Version 1.0

## Authors

* **Juan Diego Becerra Peña**: [judibec](https://github.com/judibec)

## Descripcion especifica

* Extensibilidad: Si se desean cambiar la pagina de la cual se obtiene la informacion, solamente se debe modificar la url o realizar los cambios respectivos a la misma, en temas de los filtros seria agregar un formulario mas en el HTML pues la respuesta en JSON ya la reconoce.
* Patrones: El principal patron que se uso fue Fachada, puesto que la clase Cache recibe toda la consulta inicialmente y antes de preguntarle a la API revisa si el puede responder.
* Modular: En cada clase se realizan funciones independientes. En HttpServer tenemos la que levanta el servidor la cual es el metodo main y la que crea la tabla respectiva del JSON, la clase Cache unicamente me guarda la informacion y me la retorna si ya esta en memoria y la HttpConnection realiza el enlace entre la pagina de las APIs y el socket creado por HttpServer.
