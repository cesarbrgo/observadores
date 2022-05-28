package Entitites;

public class Algas {
    private String fecha, latitud, longitud, especie, profundidad, abundancia, size, habitat;

    public Algas(String fechadeobservacion, String latitud, String longitud, String especie, String profundidad, String abundancia, String sizefish, String selechabitat) {
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

    public String getEspecie() {
        return especie;
    }

    public String getFecha() {
        return fecha;
    }

    public String getHabitat() {
        return habitat;
    }

    public String getLatitud() {
        return latitud;
    }

    public String getLongitud() {
        return longitud;
    }

    public String getProfundidad() {
        return profundidad;
    }

    public String getSize() {
        return size;
    }
}
