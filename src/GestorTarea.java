import java.util.ArrayList;

public class GestorTarea 
{

    private ArrayList<Tarea> tareas;

    public GestorTarea(ArrayList<Tarea> tareas) 
    {
        this.tareas = tareas;
    }

    public void agregarTarea(Tarea t) 
    {
        tareas.add(t);
    }

    public void mostrarTarea() 
    {
        if (tareas.isEmpty()) 
        {
            System.out.println("No hay tareas registradas");
        } 
        else 
        {
            for (Tarea t : tareas) {
                System.out.println(t);
            }
        }
    }

    public Tarea buscarTarea(int id) 
    {
        for (Tarea t : tareas) 
        {
            if (t.getId() == id) 
            {
                return t;
            }
        }
        return null;
    }

    public void completarTarea(int id) throws TareaNoEncontrada 
    {
        Tarea t = buscarTarea(id);
        if (t == null) 
        {
            throw new TareaNoEncontrada("No existe una tarea con esa id: " + id + "Ingrese nuevamente el id");
        }
        t.setCompletados(true);
    }

    public void eliminarTarea(int id) throws TareaNoEncontrada 
    {
        Tarea t = buscarTarea(id);
        if (t == null) 
        {
            throw new TareaNoEncontrada("No existe una tarea con id: " + id);
        }
        tareas.remove(t);
    }
}
