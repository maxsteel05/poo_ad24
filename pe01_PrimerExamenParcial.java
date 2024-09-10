import java.util.Scanner;

public class pe01_PrimerExamenParcial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 

        int totalAlumnos = 0, totalDocentes = 0, totalTrabajadores = 0;
        int totalHombres = 0, totalMujeres = 0;
        int totalParticipantes = 0, totalRechazados = 0;
        int sumaEdades = 0;

        double totalDineroAlumnos = 0, totalDineroDocentes = 0, totalDineroTrabajadores = 0;

        while (true) {
            System.out.print("\033[H\033[2J"); 
            System.out.flush();

            System.out.println("Registro de Participante al Curso de Técnicas Avanzadas de Programación");
            
            
            System.out.print("Ingrese su Nombre: ");
            String nombre = scanner.nextLine();

            System.out.print("ingrese su Edad: ");
            int edad = scanner.nextInt();
            scanner.nextLine(); 

            if (edad < 23) {
                System.out.println("Lo sentimos, solo aceptamos participantes de 23 años o más.");
                totalRechazados++;
                continue;
            }

           
            System.out.print("Sexo (Hombre / Mujer): ");
            char sexo = Character.toUpperCase(scanner.nextLine().charAt(0));

           
            if (sexo == 'H') {
                totalHombres++;
            } else if (sexo == 'M') {
                totalMujeres++;
            }

            
            System.out.println("Tipo de Participante:\n1. Alumno 40$\n2. Docente 60$\n3. Trabajador 80$ ");
            System.out.print("Elija la incripcion que debe pagar (1/2/3): ");
            int tipoParticipante = scanner.nextInt();
            scanner.nextLine(); 
           
            double costoInscripcion = 0;
            switch (tipoParticipante) {
                case 1:
                    totalAlumnos++;
                    costoInscripcion = 40;
                    totalDineroAlumnos += costoInscripcion;
                    break;
                case 2:
                    totalDocentes++;
                    costoInscripcion = 60;
                    totalDineroDocentes += costoInscripcion;
                    break;
                case 3:
                    totalTrabajadores++;
                    costoInscripcion = 80;
                    totalDineroTrabajadores += costoInscripcion;
                    break;
                default:
                    System.out.println("Opción inválida. Participante rechazado.");
                    totalRechazados++;
                    continue;
            }

            
            totalParticipantes++;
            sumaEdades += edad;

            
            System.out.println("¡Bienvenido " + nombre + "!");
            System.out.println("Edad: " + edad);
            System.out.println("Sexo: " + (sexo == 'H' ? "Hombre" : "Mujer"));
            System.out.println("Tipo de Participante: " + (tipoParticipante == 1 ? "Alumno" : tipoParticipante == 2 ? "Docente" : "Trabajador"));
            System.out.println("Costo de Inscripción: $" + costoInscripcion);
            System.out.println( "Al pagar la incripcion seras Aceptado en universidad chilaquiles!! ");
    
            
            System.out.print("¿Desea registrar otro participante? (Si/No): ");
            char continuar = Character.toUpperCase(scanner.nextLine().charAt(0));
            if (continuar == 'N') {
                break;
            }
        }

      
        double totalDineroGeneral = totalDineroAlumnos + totalDineroDocentes + totalDineroTrabajadores;
        double promedioEdad = totalParticipantes > 0 ? (double) sumaEdades / totalParticipantes : 0;

        
        System.out.println("\nResumen de Inscripción:");
        System.out.println("Total de Alumnos: " + totalAlumnos);
        System.out.println("Total de Docentes: " + totalDocentes);
        System.out.println("Total de Trabajadores: " + totalTrabajadores);
        System.out.println("Total de Hombres: " + totalHombres);
        System.out.println("Total de Mujeres: " + totalMujeres);
        System.out.println("Total de Participantes: " + totalParticipantes);
        System.out.println("Promedio de Edad: " + promedioEdad);
        System.out.println("Total de Rechazados: " + totalRechazados);

        
        System.out.println("\nResumen de Dinero Recaudado:");
        System.out.println("Total dinero recaudado de Alumnos: $" + totalDineroAlumnos);
        System.out.println("Total dinero recaudado de Docentes: $" + totalDineroDocentes);
        System.out.println("Total dinero recaudado de Trabajadores: $" + totalDineroTrabajadores);
        System.out.println("Total dinero en general recaudado: $" + totalDineroGeneral);

        
        System.out.println("\nMensaje Final:");
        if (totalDineroGeneral < 50) {
            System.out.println("El evento concluye con ganancias BAJAS.");
        } else if (totalDineroGeneral < 1000) {
            System.out.println("El evento concluye con ganancias MODERADAS.");
        } else {
            System.out.println("El evento concluye con BUENAS ganancias.");
        }

        scanner.close(); // Se cierra el Scanner para evitar la fuga de recursos
    }
}

