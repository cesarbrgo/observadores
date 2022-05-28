package Entitites;
/**
 * Corales
 * La clase Corales  es un objeto que puede ser avistado por un usuario, lo ideal seria instanciar este objeto a traves de la selección del usuario
 * una vez instanciado el objeto introducirlo en la base de datos, aunque esta seria la siguiente fase de desarrollo del programa
 * @author César Bravo
 * @version 11.0.14.1, 2022/05/28
 */
public class Corales {
    private String fecha, latitud, longitud, especie, profundidad, abundancia, size, habitat;

    public Corales(String fechadeobservacion, String latitud, String longitud, String especie, String profundidad, String abundancia, String sizefish, String selechabitat) {
        this.fecha=getFecha();
        this.latitud=getLatitud();
        this.longitud=getLongitud();
        this.especie=getEspecie();
        this.profundidad=getEspecie();
        this.abundancia=getAbundancia();
        this.size=getSize();
        this.habitat=getHabitat();
    }
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
    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
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
     * setAtribut
     * aquest es el tipic metode setter per a utilitzar de cara al constructor
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
