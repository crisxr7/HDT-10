/*
 * Universidad del Valle de Guatemala
 * Autores:
 *  Cristhian Chilel - 12417 
 *  Cristian del Carmen - 12961
 */

import java.io.*;

public class Archivo{
    
    File archivo;
    FileReader varArchivo;
    BufferedReader varline;
    IntefazGrafo grafo = new MatrizGrafo();

    
    public void obtenerArchivo(String direccion) throws FileNotFoundException{
       archivo=new File(direccion); 
    }  

    public IntefazGrafo arregloNombres() throws IOException{

        varArchivo = new FileReader (archivo);
        varline = new BufferedReader(varArchivo);
        String linea;
        while((linea=varline.readLine())!=null){
            String[] tmp;
            tmp=linea.split(" ");
            grafo.agregar(tmp[0]);
            grafo.agregar(tmp[1]);
        }
        return grafo;
    }

    public IntefazGrafo matrizCostos() throws IOException{

        varArchivo = new FileReader (archivo);
        varline = new BufferedReader(varArchivo);
        String linea;

        while((linea=varline.readLine())!=null){
            String[] tmp;
            tmp=linea.split(" ");
            grafo.agregarVertice(tmp[0], tmp[1], tmp[2]);
        }
        return grafo;
    }
    

}

