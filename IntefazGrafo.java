/*
 * Universidad del Valle de Guatemala
 * Autores:
 *  Cristhian Chilel - 12417 
 *  Cristian del Carmen - 12961
 */


public interface IntefazGrafo<V,E> {

    public void agregar(V label);

    public void agregarVertice(V vtx1, V vtx2, E label);

    public void mostrar();
 
    public int getIndex(V label);

    public V get(int label);

    public int getVertice(V label1, V label2);

    public boolean contains(V label);

    public int size();
    
}
