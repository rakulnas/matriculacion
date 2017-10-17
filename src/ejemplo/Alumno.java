
package ejemplo;

public class Alumno {
    //Atributos
    private String alias;
    
    //Nombre completo
    private String nombre;
    private String ape1;
    private String ape2;
    
    //Año de nacimiento
    private int anioNac;
    
    //CONSTRUCTORES
    public Alumno()
    {
        this.alias="";
        this.nombre="";
        this.ape1="";
        this.ape2="";
        this.anioNac=0;
    }
    public Alumno(String alias)
    {
        this.alias=alias;
    }
    public Alumno (String alias,int anioNac)
    {
        this.alias=alias;
        this.anioNac=anioNac;
    }
    
   //METODOS
    //método get
    public String getAlias()
    {
        return this.alias;
    }
    //método set
    public void setAlias(String alias)
    {
        this.alias=alias;
    }
   //método toString
    public String toString()
    {
        return ape1+" "+ape2+","+nombre+"("+alias+")"+"nacido en el año"+anioNac;
    }
}
