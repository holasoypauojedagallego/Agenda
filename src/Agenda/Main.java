package Agenda;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        ArrayList<Contacto> contacto = new ArrayList<>();
        int numContactoAscendente = 0;

        boolean exit = true;
        while (exit) {
            int eleccio1 = mostrarMenu(sc);

            System.out.println("Has elegido la opción " + eleccio1 + ".");
            switch (eleccio1) {
                case 1:

                    int idDelContacto = numContactoAscendente;

                    System.out.println("Nombre del nuevo contacto:");
                    String nombreDelContacto = sc.nextLine().trim();

                    System.out.println("Apellidos del nuevo contacto:");
                    String apellidosDelContacto = sc.nextLine().trim();

                    System.out.println("Telefono del nuevo contacto:");
                    int telefonoDelContacto = sc.nextInt();
                    sc.nextLine();

                    System.out.println("Correo del nuevo contacto:");
                    String correoDelContacto = sc.nextLine().trim();
                    contacto.add(new Contacto(idDelContacto, nombreDelContacto, apellidosDelContacto, telefonoDelContacto, correoDelContacto));

                    System.out.println("Contacto:");
                    System.out.println("ID: " + contacto.get(numContactoAscendente).getId() + "\n" + "   Nombre y apellidos: " + contacto.get(numContactoAscendente).getNombre() + " " + contacto.get(numContactoAscendente).getApellidos() + "\n" + "   Telefono: " + contacto.get(numContactoAscendente).getTelefono() + "\n" + "   Correo: " + contacto.get(numContactoAscendente).getCorreo());
                    numContactoAscendente = numContactoAscendente + 1;
                    break;
                case 2:
                    int eleccioBusqueda = mostrarMenuBusqueda(sc);

                    switch (eleccioBusqueda){
                        case 1:
                            for (int i = 0; i < numContactoAscendente; i++) {
                                System.out.println("ID: " + contacto.get(i).getId() + "\n" + "   Nombre y apellidos: " + contacto.get(i).getNombre() + " " + contacto.get(i).getApellidos() + "\n" + "   Telefono: " + contacto.get(i).getTelefono() + "\n" + "   Correo: " + contacto.get(i).getCorreo());
                            }
                            break;
                        case 2:
                            System.out.println("Escriba el nombre que quiere buscar:");
                            String nombreBuscar = sc.nextLine().trim().toLowerCase();
                            boolean coconut2 = false;
                            for (int i = 0; i < numContactoAscendente; i++) {
                                if (contacto.get(i).getNombre().toLowerCase().equals(nombreBuscar)){
                                    System.out.println("ID: " + contacto.get(i).getId() + "\n" + "   Nombre y apellidos: " + contacto.get(i).getNombre() + " " + contacto.get(i).getApellidos() + "\n" + "   Telefono: " + contacto.get(i).getTelefono() + "\n" + "   Correo: " + contacto.get(i).getCorreo());
                                    coconut2 = true;
                                }
                            }
                            if (!coconut2){
                                System.out.println("No hay ningún dato que se asemeje");
                            }
                            break;
                        case 3:
                            System.out.println("Escriba el apellido que quiere buscar:");
                            String apellidosBuscar = sc.nextLine().trim().toLowerCase();
                            boolean coconut3 = false;
                            for (int i = 0; i < numContactoAscendente; i++) {
                                if (contacto.get(i).getApellidos().toLowerCase().equals(apellidosBuscar)){
                                    System.out.println("ID: " + contacto.get(i).getId() + "\n" + "   Nombre y apellidos: " + contacto.get(i).getNombre() + " " + contacto.get(i).getApellidos() + "\n" + "   Telefono: " + contacto.get(i).getTelefono() + "\n" + "   Correo: " + contacto.get(i).getCorreo());
                                    coconut3 = true;
                                }
                            }
                            if (!coconut3){
                                System.out.println("No hay ningún dato que se asemeje");
                            }
                            break;
                        case 4:
                            System.out.println("Escriba la telefono que quiere buscar:");
                            int telefonoBuscar = sc.nextInt();
                            sc.nextLine();
                            boolean coconut4 = false;
                            for (int i = 0; i < numContactoAscendente; i++) {
                                if (contacto.get(i).getTelefono() == telefonoBuscar){
                                    System.out.println("ID: " + contacto.get(i).getId() + "\n" + "   Nombre y apellidos: " + contacto.get(i).getNombre() + " " + contacto.get(i).getApellidos() + "\n" + "   Telefono: " + contacto.get(i).getTelefono() + "\n" + "   Correo: " + contacto.get(i).getCorreo());
                                    coconut4 = true;
                                }
                            }
                            if (!coconut4){
                                System.out.println("No hay ningún dato que se asemeje");
                            }
                            break;
                        case 5:
                            System.out.println("Escriba el correo que quiere buscar:");
                            String correoBuscar = sc.nextLine().trim().toLowerCase();
                            boolean coconut5 = false;
                            for (int i = 0; i < numContactoAscendente; i++) {
                                if (contacto.get(i).getCorreo().toLowerCase().equals(correoBuscar)){
                                    System.out.println("ID: " + contacto.get(i).getId() + "\n" + "   Nombre y apellidos: " + contacto.get(i).getNombre() + " " + contacto.get(i).getApellidos() + "\n" + "   Telefono: " + contacto.get(i).getTelefono() + "\n" + "   Correo: " + contacto.get(i).getCorreo());
                                    coconut5 = true;
                                }
                            }
                            if (!coconut5){
                                System.out.println("No hay ningún dato que se asemeje");
                            }
                            break;
                        case 6:
                            System.out.println("Saliendo al menú");
                            break;
                    }
                    break;
                case 3:
                    int eleccioActualizar = mostrarMenuBusqueda(sc);

                    switch (eleccioActualizar){
                        case 1:
                            boolean coconut1 = false;
                            for (int i = 0; i < numContactoAscendente; i++) {
                                System.out.println("ID: " + contacto.get(i).getId() + "\n" + "   Nombre y apellidos: " + contacto.get(i).getNombre() + " " + contacto.get(i).getApellidos() + "\n" + "   Telefono: " + contacto.get(i).getTelefono() + "\n" + "   Correo: " + contacto.get(i).getCorreo());

                                System.out.println("¿Este es el contacto que quiere actualizar? (Si/No)");
                                String seguro = sc.nextLine().toLowerCase().trim();
                                if (seguro.equals("si")){
                                    System.out.println("Actualizando:");

                                    System.out.println("Nuevo nombre del contacto:");
                                    contacto.get(i).setNombre(sc.nextLine().trim());
                                    System.out.println("Nuevos apellidos del contacto:");
                                    contacto.get(i).setApellidos(sc.nextLine().trim());
                                    System.out.println("Nuevo telefono del contacto:");
                                    contacto.get(i).setTelefono(sc.nextInt());
                                    sc.nextLine();
                                    System.out.println("Nuevo correo del contacto:");
                                    contacto.get(i).setCorreo(sc.nextLine().trim());
                                    System.out.println("Contacto:");
                                    System.out.println("ID: " + contacto.get(i).getId() + "\n" + "   Nombre y apellidos: " + contacto.get(i).getNombre() + " " + contacto.get(i).getApellidos() + "\n" + "   Telefono: " + contacto.get(i).getTelefono() + "\n" + "   Correo: " + contacto.get(i).getCorreo());

                                    coconut1 = true;
                                    break;
                                } else if (seguro.equals("no")){
                                    System.out.println("Seguiremos buscando...");
                                } else {
                                    System.out.println("¿Sabe como escribir?");
                                    i = i -1;
                                }
                            }
                            if (!coconut1){
                                System.out.println("No hay ningún dato que se asemeje");
                            }
                            break;
                        case 2:
                            System.out.println("Escriba el nombre que quiere buscar:");
                            String nombreBuscar = sc.nextLine().trim().toLowerCase();
                            boolean coconut2 = false;
                            for (int i = 0; i < numContactoAscendente; i++) {
                                if (contacto.get(i).getNombre().toLowerCase().equals(nombreBuscar)){
                                    System.out.println("ID: " + contacto.get(i).getId() + "\n" + "   Nombre y apellidos: " + contacto.get(i).getNombre() + " " + contacto.get(i).getApellidos() + "\n" + "   Telefono: " + contacto.get(i).getTelefono() + "\n" + "   Correo: " + contacto.get(i).getCorreo());

                                    System.out.println("¿Este es el contacto que quiere actualizar? (Si/No)");
                                    String seguro = sc.nextLine().toLowerCase().trim();
                                    if (seguro.equals("si")){
                                        System.out.println("Actualizando:");

                                        System.out.println("Nuevo nombre del contacto:");
                                        contacto.get(i).setNombre(sc.nextLine().trim());
                                        System.out.println("Nuevos apellidos del contacto:");
                                        contacto.get(i).setApellidos(sc.nextLine().trim());
                                        System.out.println("Nuevo telefono del contacto:");
                                        contacto.get(i).setTelefono(sc.nextInt());
                                        sc.nextLine();
                                        System.out.println("Nuevo correo del contacto:");
                                        contacto.get(i).setCorreo(sc.nextLine().trim());
                                        System.out.println("Contacto:");
                                        System.out.println("ID: " + contacto.get(i).getId() + "\n" + "   Nombre y apellidos: " + contacto.get(i).getNombre() + " " + contacto.get(i).getApellidos() + "\n" + "   Telefono: " + contacto.get(i).getTelefono() + "\n" + "   Correo: " + contacto.get(i).getCorreo());

                                        coconut2 = true;
                                        break;
                                    } else if (seguro.equals("no")){
                                        System.out.println("Seguiremos buscando...");
                                    } else {
                                        System.out.println("¿Sabe como escribir?");
                                        i = i -1;
                                    }
                                }
                            }
                            if (!coconut2){
                                System.out.println("No hay ningún dato que se asemeje");
                            }
                            break;
                        case 3:
                            System.out.println("Escriba los apellidos que quiere buscar:");
                            String apellidosBuscar = sc.nextLine().trim().toLowerCase();
                            boolean coconut3 = false;
                            for (int i = 0; i < numContactoAscendente; i++) {
                                if (contacto.get(i).getApellidos().toLowerCase().equals(apellidosBuscar)){
                                    System.out.println("ID: " + contacto.get(i).getId() + "\n" + "   Nombre y apellidos: " + contacto.get(i).getNombre() + " " + contacto.get(i).getApellidos() + "\n" + "   Telefono: " + contacto.get(i).getTelefono() + "\n" + "   Correo: " + contacto.get(i).getCorreo());

                                    System.out.println("¿Este es el contacto que quiere actualizar? (Si/No)");
                                    String seguro = sc.nextLine().toLowerCase().trim();
                                    if (seguro.equals("si")){
                                        System.out.println("Actualizando:");

                                        System.out.println("Nuevo nombre del contacto:");
                                        contacto.get(i).setNombre(sc.nextLine().trim());
                                        System.out.println("Nuevos apellidos del contacto:");
                                        contacto.get(i).setApellidos(sc.nextLine().trim());
                                        System.out.println("Nuevo telefono del contacto:");
                                        contacto.get(i).setTelefono(sc.nextInt());
                                        sc.nextLine();
                                        System.out.println("Nuevo correo del contacto:");
                                        contacto.get(i).setCorreo(sc.nextLine().trim());
                                        System.out.println("Contacto:");
                                        System.out.println("ID: " + contacto.get(i).getId() + "\n" + "   Nombre y apellidos: " + contacto.get(i).getNombre() + " " + contacto.get(i).getApellidos() + "\n" + "   Telefono: " + contacto.get(i).getTelefono() + "\n" + "   Correo: " + contacto.get(i).getCorreo());

                                        coconut3 = true;
                                        break;
                                    } else if (seguro.equals("no")){
                                        System.out.println("Seguiremos buscando...");
                                    } else {
                                        System.out.println("¿Sabe como escribir?");
                                        i = i -1;
                                    }
                                }
                            }
                            if (!coconut3){
                                System.out.println("No hay ningún dato que se asemeje");
                            }
                            break;
                        case 4:
                            System.out.println("Escriba la telefono que quiere buscar:");
                            int telefonoBuscar = sc.nextInt();
                            sc.nextLine();
                            boolean coconut4 = false;
                            for (int i = 0; i < numContactoAscendente; i++) {
                                if (contacto.get(i).getTelefono() == telefonoBuscar){
                                    System.out.println("ID: " + contacto.get(i).getId() + "\n" + "   Nombre y apellidos: " + contacto.get(i).getNombre() + " " + contacto.get(i).getApellidos() + "\n" + "   Telefono: " + contacto.get(i).getTelefono() + "\n" + "   Correo: " + contacto.get(i).getCorreo());

                                    System.out.println("¿Este es el contacto que quiere actualizar? (Si/No)");
                                    String seguro = sc.nextLine().toLowerCase().trim();
                                    if (seguro.equals("si")){
                                        System.out.println("Actualizando:");

                                        System.out.println("Nuevo nombre del contacto:");
                                        contacto.get(i).setNombre(sc.nextLine().trim());
                                        System.out.println("Nuevos apellidos del contacto:");
                                        contacto.get(i).setApellidos(sc.nextLine().trim());
                                        System.out.println("Nuevo telefono del contacto:");
                                        contacto.get(i).setTelefono(sc.nextInt());
                                        sc.nextLine();
                                        System.out.println("Nuevo correo del contacto:");
                                        contacto.get(i).setCorreo(sc.nextLine().trim());
                                        System.out.println("Contacto:");
                                        System.out.println("ID: " + contacto.get(i).getId() + "\n" + "   Nombre y apellidos: " + contacto.get(i).getNombre() + " " + contacto.get(i).getApellidos() + "\n" + "   Telefono: " + contacto.get(i).getTelefono() + "\n" + "   Correo: " + contacto.get(i).getCorreo());

                                        coconut4 = true;
                                        break;
                                    } else if (seguro.equals("no")){
                                        System.out.println("Seguiremos buscando...");
                                    } else {
                                        System.out.println("¿Sabe como escribir?");
                                        i = i -1;
                                    }
                                }
                            }
                            if (!coconut4){
                                System.out.println("No hay ningún dato que se asemeje");
                            }
                            break;
                        case 5:
                            System.out.println("Escriba el correo que quiere buscar:");
                            String correoBuscar = sc.nextLine().trim().toLowerCase();
                            boolean coconut5 = false;
                            for (int i = 0; i < numContactoAscendente; i++) {
                                if (contacto.get(i).getCorreo().toLowerCase().equals(correoBuscar)){
                                    System.out.println("ID: " + contacto.get(i).getId() + "\n" + "   Nombre y apellidos: " + contacto.get(i).getNombre() + " " + contacto.get(i).getApellidos() + "\n" + "   Telefono: " + contacto.get(i).getTelefono() + "\n" + "   Correo: " + contacto.get(i).getCorreo());

                                    System.out.println("¿Este es el contacto que quiere actualizar? (Si/No)");
                                    String seguro = sc.nextLine().toLowerCase().trim();
                                    if (seguro.equals("si")){
                                        System.out.println("Actualizando:");

                                        System.out.println("Nuevo nombre del contacto:");
                                        contacto.get(i).setNombre(sc.nextLine().trim());
                                        System.out.println("Nuevos apellidos del contacto:");
                                        contacto.get(i).setApellidos(sc.nextLine().trim());
                                        System.out.println("Nuevo telefono del contacto:");
                                        contacto.get(i).setTelefono(sc.nextInt());
                                        sc.nextLine();
                                        System.out.println("Nuevo correo del contacto:");
                                        contacto.get(i).setCorreo(sc.nextLine().trim());
                                        System.out.println("Contacto:");
                                        System.out.println("ID: " + contacto.get(i).getId() + "\n" + "   Nombre y apellidos: " + contacto.get(i).getNombre() + " " + contacto.get(i).getApellidos() + "\n" + "   Telefono: " + contacto.get(i).getTelefono() + "\n" + "   Correo: " + contacto.get(i).getCorreo());

                                        coconut5 = true;
                                        break;
                                    } else if (seguro.equals("no")){
                                        System.out.println("Seguiremos buscando...");
                                    } else {
                                        System.out.println("¿Sabe como escribir?");
                                        i = i -1;
                                    }
                                }
                            }
                            if (!coconut5){
                                System.out.println("No hay ningún dato que se asemeje");
                            }
                            break;
                        case 6:
                            System.out.println("Saliendo al menú");
                            break;
                    }
                    break;
                case 4:
                    int eleccioBorrar = mostrarMenuBusqueda(sc);
                    switch (eleccioBorrar){
                        case 1:
                            System.out.println("Escriba lo que quiere buscar:");
                            boolean coconut1 = false;
                            for (int i = 0; i < numContactoAscendente; i++) {
                                System.out.println("ID: " + contacto.get(i).getId() + "\n" + "   Nombre y apellidos: " + contacto.get(i).getNombre() + " " + contacto.get(i).getApellidos() + "\n" + "   Telefono: " + contacto.get(i).getTelefono() + "\n" + "   Correo: " + contacto.get(i).getCorreo());
                                System.out.println("¿Está seguro de que quiere borrar este contacto? (Si/No)");
                                String seguro = sc.nextLine().toLowerCase().trim();
                                if (seguro.equals("si")){
                                    System.out.println("Borrando... (No hace nada xd)");
                                    coconut1 = true;
                                    break;
                                } else if (seguro.equals("no")){
                                    System.out.println("Seguiremos buscando...");
                                } else {
                                    System.out.println("¿Sabe como escribir?");
                                    i = i -1;
                                }
                            }
                            if (!coconut1){
                                System.out.println("No hay ningún dato que se asemeje");
                            }
                            break;
                        case 2:
                            System.out.println("Escriba el nombre que quiere buscar:");
                            String nombreBuscar = sc.nextLine().trim().toLowerCase();
                            boolean coconut2 = false;
                            for (int i = 0; i < numContactoAscendente; i++) {
                                if (contacto.get(i).getNombre().toLowerCase().equals(nombreBuscar)){
                                    System.out.println("ID: " + contacto.get(i).getId() + "\n" + "   Nombre y apellidos: " + contacto.get(i).getNombre() + " " + contacto.get(i).getApellidos() + "\n" + "   Telefono: " + contacto.get(i).getTelefono() + "\n" + "   Correo: " + contacto.get(i).getCorreo());

                                    System.out.println("¿Está seguro de que quiere borrar este contacto? (Si/No)");
                                    String seguro = sc.nextLine().toLowerCase().trim();
                                    if (seguro.equals("si")){
                                        System.out.println("Borrando... (No hace nada xd)");
                                        coconut2 = true;
                                        break;
                                    } else if (seguro.equals("no")){
                                        System.out.println("Seguiremos buscando...");
                                    } else {
                                        System.out.println("¿Sabe como escribir?");
                                        i = i -1;
                                    }
                                }
                            }
                            if (!coconut2){
                                System.out.println("No hay ningún dato que se asemeje");
                            }
                            break;
                        case 3:
                            System.out.println("Escriba el apellido que quiere buscar:");
                            String apellidosBuscar = sc.nextLine().trim().toLowerCase();
                            boolean coconut3 = false;
                            for (int i = 0; i < numContactoAscendente; i++) {
                                if (contacto.get(i).getApellidos().toLowerCase().equals(apellidosBuscar)){
                                    System.out.println("ID: " + contacto.get(i).getId() + "\n" + "   Nombre y apellidos: " + contacto.get(i).getNombre() + " " + contacto.get(i).getApellidos() + "\n" + "   Telefono: " + contacto.get(i).getTelefono() + "\n" + "   Correo: " + contacto.get(i).getCorreo());

                                    System.out.println("¿Está seguro de que quiere borrar este contacto? (Si/No)");
                                    String seguro = sc.nextLine().toLowerCase().trim();
                                    if (seguro.equals("si")){
                                        System.out.println("Borrando... (No hace nada xd)");
                                        coconut3 = true;
                                        break;
                                    } else if (seguro.equals("no")){
                                        System.out.println("Seguiremos buscando...");
                                    } else {
                                        System.out.println("¿Sabe como escribir?");
                                        i = i -1;
                                    }
                                }
                            }
                            if (!coconut3){
                                System.out.println("No hay ningún dato que se asemeje");
                            }
                            break;
                        case 4:
                            System.out.println("Escriba la telefono que quiere buscar:");
                            int telefonoBuscar = sc.nextInt();
                            sc.nextLine();
                            boolean coconut4 = false;
                            for (int i = 0; i < numContactoAscendente; i++) {
                                if (contacto.get(i).getTelefono() == telefonoBuscar){
                                    System.out.println("ID: " + contacto.get(i).getId() + "\n" + "   Nombre y apellidos: " + contacto.get(i).getNombre() + " " + contacto.get(i).getApellidos() + "\n" + "   Telefono: " + contacto.get(i).getTelefono() + "\n" + "   Correo: " + contacto.get(i).getCorreo());

                                    System.out.println("¿Está seguro de que quiere borrar este contacto? (Si/No)");
                                    String seguro = sc.nextLine().toLowerCase().trim();
                                    if (seguro.equals("si")){
                                        System.out.println("Borrando... (No hace nada xd)");
                                        coconut4 = true;
                                        break;
                                    } else if (seguro.equals("no")){
                                        System.out.println("Seguiremos buscando...");
                                    } else {
                                        System.out.println("¿Sabe como escribir?");
                                        i = i -1;
                                    }
                                }
                            }
                            if (!coconut4){
                                System.out.println("No hay ningún dato que se asemeje");
                            }
                            break;
                        case 5:
                            System.out.println("Escriba el correo que quiere buscar:");
                            String correoBuscar = sc.nextLine().trim().toLowerCase();
                            boolean coconut5 = false;
                            for (int i = 0; i < numContactoAscendente; i++) {
                                if (contacto.get(i).getCorreo().toLowerCase().equals(correoBuscar)){
                                    System.out.println("ID: " + contacto.get(i).getId() + "\n" + "   Nombre y apellidos: " + contacto.get(i).getNombre() + " " + contacto.get(i).getApellidos() + "\n" + "   Telefono: " + contacto.get(i).getTelefono() + "\n" + "   Correo: " + contacto.get(i).getCorreo());

                                    System.out.println("¿Está seguro de que quiere borrar este contacto? (Si/No)");
                                    String seguro = sc.nextLine().toLowerCase().trim();
                                    if (seguro.equals("si")){
                                        System.out.println("Borrando... (No hace nada xd)");
                                        coconut5 = true;
                                        break;
                                    } else if (seguro.equals("no")){
                                        System.out.println("Seguiremos buscando...");
                                    } else {
                                        System.out.println("¿Sabe como escribir?");
                                        i = i -1;
                                    }
                                }
                            }
                            if (!coconut5){
                                System.out.println("No hay ningún dato que se asemeje");
                            }
                            break;
                        case 6:
                            System.out.println("Saliendo al menú");
                            break;
                    }
                    break;
                case 5:
                    System.out.println("\nHasta pronto algodoncito de azúcar ;D");
                    exit = false;
                    break;
                case 33:
                    System.out.println("Jeje god");
                    break;
                default:
                    System.out.println("Ese valor no esta entre los indicados anteriormente");
                    break;
            }




        }
    }
    public static int mostrarMenu (Scanner sc){
        System.out.println("\nBienvenido a la agenda, por favor escoja una opción numérica:\n" +
                "   1. <Crear un nuevo contacto>\n" +
                "   2. <Buscar contacto>\n" +
                "   3. <Actualizar datos de contacto>\n" +
                "   4. <Borrar contacto>\n" +
                "   5. <Salir>\n");

        int selecto = sc.nextInt();
        sc.nextLine();
        return selecto;
    }
    public static int mostrarMenuBusqueda (Scanner sc){
        System.out.println("""
              ¿Cómo desea buscar dicho contacto? (Escoja valor numérico)\s
                 1. <Vía todos>
                 2. <Vía nombre>
                 3. <Vía apellidos>
                 4. <Vía telefono>
                 5. <Vía correo>
                 6. <Salir>
              """);
        int eleccio11 = sc.nextInt();
        sc.nextLine();
        return eleccio11;
    }
}
