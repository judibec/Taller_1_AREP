package edu.escuelaing.arem.ASE.app;

import java.io.IOException;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Memoria cache de la API
 */
public class Cache {
    public static ConcurrentHashMap<String,String> movies = new ConcurrentHashMap<>();

    /**
     * Busca si los datos ya estan en memoria o si los debe consultar
     * @param titulo String del titulo de la pelicula
     * @return revisa si el titulo ya se ha buscado y retorna el resultado de la API sino hace la conexion y devuelve el resultado
     * @throws IOException
     */
    public static String findTitle(String titulo) throws IOException {
        String value="";
        if (movies.containsKey(titulo)){
            value += movies.get(titulo);
        }else{
            value += HttpConnection.RsponseApi(titulo);
            movies.put(titulo,value);
        }
        return value;
    }

}
