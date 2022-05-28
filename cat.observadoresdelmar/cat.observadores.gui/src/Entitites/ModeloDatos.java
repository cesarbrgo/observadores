package Entitites;

/**
 * Modelo
 * La clase Modelo es una estructura generica que permitira instanciar objetos genericos para la inserccion en la
 * base de datos, esto no es lo ideal, lo ideal es instanciar un objeto de los tipos que aparecen en este mismo package
 * como Alga, Aves, Corales... etc
 * Pero esto nos sirve para comprovar el buen funcionamiento del programa.
 * @author César Bravo
 * @version 11.0.14.1, 2022/05/28
 */
public class ModeloDatos {
    private String fecha, latitud, longitud, especie, profundidad, abundancia, size, habitat;

    /**
     * setAtribut
     * aquest es el tipic metode setter per a utilitzar de cara al constructor
     *
     */
    public void setAbundancia(String abundancia) {
        this.abundancia = abundancia;
    }
    /**
     * setAtribut
     * aquest es el tipic metode setter per a utilitzar de cara al constructor
     *
     */
    public void setEspecie(String especie) {
        this.especie = especie;
    }
    /**
     * setAtribut
     * aquest es el tipic metode setter per a utilitzar de cara al constructor
     *
     */
    public void setFecha(String fecha) { this.fecha = fecha; }
    /**
     * setAtribut
     * aquest es el tipic metode setter per a utilitzar de cara al constructor
     *
     */
    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }
    /**
     * setAtribut
     * aquest es el tipic metode setter per a utilitzar de cara al constructor
     *
     */
    public void setLatitud(String latitud) {
        this.latitud = latitud;
    }
    /**
     * setAtribut
     * aquest es el tipic metode setter per a utilitzar de cara al constructor
     *
     */
    public void setLongitud(String longitud) {
        this.longitud = longitud;
    }
    /**
     * setAtribut
     * aquest es el tipic metode setter per a utilitzar de cara al constructor
     *
     */
    public void setProfundidad(String profundidad) {
        this.profundidad = profundidad;
    }
    /**
     * setAtribut
     * aquest es el tipic metode setter per a utilitzar de cara al constructor
     *
     */
    public void setSize(String size) {
        this.size = size;
    }
    /**
     * getAtribut
     * aquest es el tipic metode getter per a utilitzar de obtindre els atributs de l'objecte
     *
     */
    public String getAbundancia() {
        return abundancia;
    }
    /**
     * getAtribut
     * aquest es el tipic metode getter per a utilitzar de obtindre els atributs de l'objecte
     *
     */
    public String getEspecie() {
        return especie;
    }
    /**
     * getAtribut
     * aquest es el tipic metode getter per a utilitzar de obtindre els atributs de l'objecte
     *
     */
    public String getFecha() {
        return fecha;
    }
    /**
     * getAtribut
     * aquest es el tipic metode getter per a utilitzar de obtindre els atributs de l'objecte
     *
     */
    public String getHabitat() {
        return habitat;
    }
    /**
     * getAtribut
     * aquest es el tipic metode getter per a utilitzar de obtindre els atributs de l'objecte
     *
     */
    public String getLatitud() {
        return latitud;
    }
    /**
     * getAtribut
     * aquest es el tipic metode getter per a utilitzar de obtindre els atributs de l'objecte
     *
     */
    public String getLongitud() {
        return longitud;
    }
    /**
     * getAtribut
     * aquest es el tipic metode getter per a utilitzar de obtindre els atributs de l'objecte
     *
     */
    public String getProfundidad() {
        return profundidad;
    }
    /**
     * getAtribut
     * aquest es el tipic metode getter per a utilitzar de obtindre els atributs de l'objecte
     *
     */
    public String getSize() {
        return size;
    }
}