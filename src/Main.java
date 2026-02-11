import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) 
    {

        ArrayList<Tarea> lista = new ArrayList<>();
        GestorTarea gestor = new GestorTarea(lista);
        Scanner sc = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("===================\n  ===| MENU |===\n===================");
            System.out.println("| 1.Agregar tarea |\n===================");
            System.out.println("| 2.Mostrar tareas |\n====================");
            System.out.println("| 3.Completar tarea |\n====================");
            System.out.println("| 4. Eliminar tarea |\n=====================");
            System.out.println("| 0.Salir          |\n===================");
            System.out.println("Ingrese una opcion: "+"\n====================");

            opcion = Integer.parseInt(sc.nextLine());

            try {
                switch (opcion) 
                {
                    case 1:
                        System.out.println("Ingrese id:");
                        int id = Integer.parseInt(sc.nextLine());
                        System.out.println("Ingrese descripcion:");
                        String descripcion = sc.nextLine();
                        gestor.agregarTarea(new Tarea(false, descripcion, id));
                        System.out.println("!¡Tarea agregada con exito¡!");
                        break;

                    case 2:
                        gestor.mostrarTarea();
                        break;

                    case 3:
                        System.out.println("Ingrese id de la tarea:");
                        int idCompletar = Integer.parseInt(sc.nextLine());
                        gestor.completarTarea(idCompletar);
                        System.out.println("!¡Tarea completada con exito¡!");
                        break;

                    case 4:
                        System.out.println("Ingrese id de la tarea:");
                        int idEliminar = Integer.parseInt(sc.nextLine());
                        gestor.eliminarTarea(idEliminar);
                        System.out.println("!¡Tarea eliminada con exito¡!");
                        break;

                    case 0:
                        System.out.println("Saliendo..."
                        +"!Adios.....");
                        break;
                    default:
                    {
                        System.out.println("!¡OJO¡!"
                        +"OPCÖN INVALIDA...\n");
                    }
                
                }
            } catch (TareaNoEncontrada t) 
            {
                System.out.println("ERROR: " + t.getMessage());
            }

        } while (opcion != 0);

        sc.close();
    }
}