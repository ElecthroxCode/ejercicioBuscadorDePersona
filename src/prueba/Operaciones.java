package prueba;

import java.util.ArrayList;
import java.util.Scanner;

public class Operaciones {

    Persona p;
    ArrayList<Persona> list = new ArrayList();
    ArrayList<Persona> lista2 = new ArrayList();

    public void agregarLista(Persona p) {
        list.add(p);
    }

    public Persona buscarPorNombre(String nombre) {
        Persona resultado = null;
        for (Persona pe : list) {
            if (pe.getNombre().equals(nombre)) {
                resultado = pe;
                break;
            }
        }
        return resultado;
    }

    public Persona buscarPorApellido(String apellido) {
        Persona resultado = null;
        for (Persona pe : list) {
            if (pe.getApellido().equals(apellido)) {
                resultado = pe;
                break;
            }
        }
        return resultado;
    }

    public void mostrarLista() {
        list.forEach((l) -> {
            System.out.println(l.getNombre() + " " + l.getApellido());
        });
    }

    public void menu() {
        Scanner sc = new Scanner(System.in);
        String nombre, apellido;
        Persona pers;
        int opc = 0;
        do {
            System.out.println("======================================");
            System.out.printf("\tMENU%n");
            System.out.println("1.Agregar una persona");
            System.out.println("2.Buscar una persona por nombre");
            System.out.println("3.Buscar una persona por apellido");
            System.out.println("4.Mostrar lista");
            System.out.println("5.Salir");
            System.out.printf("Elije una opción: ");
            opc = sc.nextInt();
            System.out.println("======================================");
            switch (opc) {
                case 1:

                    sc.nextLine();
                    System.out.println("*******************************");
                    System.out.print("Escribe el NOMBRE: ");
                    nombre = sc.nextLine();
                    System.out.println("");
                    System.out.print("Escribe el APELLIDO: ");
                    apellido = sc.nextLine();
                    System.out.println("");
                    p = new Persona(nombre, apellido);
                    agregarLista(p);
                    System.out.println("*******************************");
                    break;
                case 2:
                    sc.nextLine();
                    System.out.println("Escriba el Nombre de la persona:");
                    nombre = sc.nextLine();
                    pers = buscarPorNombre(nombre);
                    if(pers != null){
                        System.out.println("\n------------------------------------");
                        System.out.printf("RESULTADO:  %s %s%n", pers.getNombre(), pers.getApellido());
                        System.out.println("------------------------------------");
                    }else{
                        System.out.println("No se encontró.");
                    }
                    break;
                case 3:
                    sc.nextLine();
                    System.out.println("Escriba el Apellido de la persona:");
                    apellido = sc.nextLine();
                    pers = buscarPorApellido(apellido);
                    if(pers != null){
                        System.out.println("\n------------------------------------");
                        System.out.printf("RESULTADO:  %s %s%n", pers.getNombre(), pers.getApellido());
                        System.out.println("------------------------------------");
                    }else{
                        System.out.println("No se encontró.");
                    }
                    
                    break;
                case 4:
                    System.out.println("\tLISTA\n");
                    if(list != null){
                        mostrarLista();
                    }else{
                        System.out.println("La lista está vacia.");
                    }
                    break;
                default:
                    System.out.println("Esa opción no existe.");
                    opc = 5;
                    break;
            }
        } while (opc != 5);
        System.out.println(">>>>>>>>FIN DEL PROGRAMA<<<<<<<<");

    }
}
