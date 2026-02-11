public class Tarea 
{
   //Los atributos priv
   private int id;
   private String descripcion; 
   private boolean completados;

    //Metodo cronstructor
   public Tarea(boolean completados, String descripcion, int id) 
   {
    this.completados = completados;
    this.descripcion = descripcion;
    this.id = id;
   }

   //Metodos Gettters and setters
        //Getters
    public int getId() 
    {
        return id;
    }

    public String getDescripcion() 
    {
        return descripcion;
    }

    public boolean isCompletados() 
    {
        return completados;
    }
        //Setters

    public void setCompletados(boolean completados) 
    {
        this.completados = completados;
    }
    
    //Metodo to-String para que se muestre la tarea

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Tarea{");
        sb.append("id=").append(id);
        sb.append(", descripcion=").append(descripcion);
        sb.append(", completados=").append(completados);
        sb.append("}");
        return sb.toString();
    }

   
   



    




}
