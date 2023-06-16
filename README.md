# Ejercicio: Sistema que permita buscar por nombre a una persona dentro de una lista.

------------
![](https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTeJrwPiIwe7ElYLdGWHmRpFIO2KgPMph5V1Q&usqp=CAU)

------------
Planteamiento del problema:
> *Crea un programa que tenga un arreglo con nombres completos de personas.* 


##Agregar una persona
```java
Persona p;
    ArrayList<Persona> list = new ArrayList();

    public void agregarLista(Persona p) {
        list.add(p);
    }
```
##Buscar por nombre o por apellido
```java

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
```
##Mostrar lista
```java
    public void mostrarLista() {
        list.forEach((l) -> {
            System.out.println(l.getNombre() + " " + l.getApellido());
        });
    }
```
