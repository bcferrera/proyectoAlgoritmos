/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package algoritmos;

import java.util.Scanner;

/**
 *
 * @author bcalderon
 */
public class Programas {

    // Funcion para resolver ecuacion, ejercicio 1.7
    public static void prograUno() {

        //Crear variable que sacanea consola para asignar datos a variables
        Scanner sc = new Scanner(System.in);

        //Creacion de Variables
        double datoA;
        double datoB;
        double resultado;
        
        // CAMNBIOS VARIOS

        //Ingresemos datos
        System.out.println("Ingrese el Dato A. ");
        datoA = sc.nextDouble();

        System.out.println("Ingrese el Datos B. ");
        datoB = sc.nextDouble();

        // Operacion del problema
        resultado = ((datoA + datoB) * (datoA + datoB)) / 3;

        //Mostrar Resultado
        System.out.println("El resultado del problema es: " + resultado);

    }

    //Calcula promedio de 5 calificaciones
    public static void promedioCalificaciones() {

        //Crear variable que sacanea consola para asignar datos a variables
        Scanner sc = new Scanner(System.in);

        //Creacion de variables
        int matricula;
        double cal1;
        double cal2;
        double cal3;
        double cal4;
        double cal5;
        double promedio;

        //Ingresamos datos
        System.out.println("Ingrese el numero de su Matricula.");
        matricula = sc.nextInt();

        System.out.println("Ingrese la calificacion UNO.");
        cal1 = sc.nextDouble();

        System.out.println("Ingrese la calificacion DOS.");
        cal2 = sc.nextDouble();

        System.out.println("Ingrese la calificaicon TRES.");
        cal3 = sc.nextDouble();

        System.out.println("Ingrese la calificacion CUATRO.");
        cal4 = sc.nextDouble();

        System.out.println("Ingrese la calificacion CINCO.");
        cal5 = sc.nextDouble();

        //Operacion. Calcula promedio.
        promedio = (cal1 + cal2 + cal3 + cal4 + cal5) / 5;

        //Muestra resultado.
        System.out.println("La matricula del alumno es: " + matricula);
        System.out.println("El promedio de sus calificaciones es: " + promedio);
    }

    //Calcula superficie y perimetro de un rectangulo
    public static void rectangulo() {

        //Crear variable que sacanea consola para asignar datos a variables
        Scanner sc = new Scanner(System.in);

        //creacion de variables
        double base;
        double altura;
        double superficie;
        double perimetro;

        //Solicita datos
        System.out.println("Ingrese la Base del Rectangulo.");
        base = sc.nextDouble();

        System.out.println("Ingrese la Altura del Rectangulo.");
        altura = sc.nextDouble();

        //Operacion. calcula Superficie y Perimetro.
        superficie = base * altura;
        perimetro = (base + altura) * 2;

        // Muestra resultados
        System.out.println("La Superficie del Rectangulo es: " + superficie + " El perimetro es: " + perimetro);
    }

    //Clase sabado 29 de agosto
    public static void compra() {

        //Crear variable que sacanea consola para asignar datos a variables
        Scanner sc = new Scanner(System.in);

        //Creacion de Variables 
        double totalProductos;
        double pago;
        double vuelto;

        //Asigna valores a las variables 
        System.out.println("Ingrese total comprado de productos.");
        totalProductos = sc.nextDouble();

        System.out.println("Ingrese el total del pago del cliente.");
        pago = sc.nextDouble();

        //Operacion. Calcula el vuelto a entregar al cliente. 
        vuelto = pago - totalProductos;

        //Muestro resultado
        System.out.println("El vuelto a entregar al cliente es: Q" + vuelto);

    }

    public static void superficieTriangulo() {

        //Crear variable que sacanea consola para asignar datos a variables
        Scanner teclado = new Scanner(System.in);

        //creacion de variables 
        int base;
        int altura;
        int superficie;

        //Ingresamos datos
        System.out.println("Ingrese la Base de Triangulo.");
        base = teclado.nextInt();

        System.out.println("Ingrese la Altura del Triangulo.");
        altura = teclado.nextInt();

        //Operacion. Calcula superficie del triangulo
        superficie = (base * altura) / 2;

        //Mostramos resultados
        System.out.println("La Superficie del Triangulo es: " + superficie);
    }

    public static void dinosaurio() {
        //Crear variable que sacanea consola para asignar datos a variables
        Scanner teclado = new Scanner(System.in);

        //Variables 
        String nombreDino;
        double pesoLibras;
        double longitudPies;

        double pesoKilos;
        double longitudMetro;

        //Ingreso de datos
        System.out.println("Ingrese el nombre de su Dinosaurio.");
        nombreDino = teclado.next();

        System.out.println("Ingrese el peso en libras del Dinosaurio.");
        pesoLibras = teclado.nextDouble();

        System.out.println("Ingrese la longitud en pies, del Dinosaurio.");
        longitudPies = teclado.nextDouble();

        //Operacion.
        pesoKilos = pesoLibras * 1000;
        longitudMetro = longitudPies * 0.3047;

        //Mostrar Resultados.
        System.out.println("El nombre del Dinosaurio es: " + nombreDino);
        System.out.println("El peso de su Dinosaurio en Kilobrados es: " + pesoKilos);
        System.out.println("El longitud de su Dinosaurio en Metros es: " + longitudMetro);
    }

    public static void gasolinera() {
        //Crear variable que sacanea consola para asignar datos a variables
        Scanner teclado = new Scanner(System.in);

        //Variables
        double precioPorLitro;
        double totalConsumidoGalones;
        double totalConsumidoLitros;
        double totalPagar;

        //Asignamos valor.
        System.out.println("Ingrese el precio de combustible por litro.");
        precioPorLitro = teclado.nextDouble();

        System.out.println("Ingrese el total suministrado al cliente. ");
        totalConsumidoGalones = teclado.nextDouble();

        //Operacion
        totalConsumidoLitros = totalConsumidoGalones * 3.785;
        totalPagar = totalConsumidoLitros * precioPorLitro;

        //Mostrar datos
        System.out.println("----------------------------------------");
        System.out.println("El total consumido en Litros es: " + totalConsumidoLitros);
        System.out.println("El total a pagar por el cliente es: " + totalPagar);
        System.out.println("----------------------------------------");
    }

    public static void cilindro() {
        //Crear variable que sacanea consola para asignar datos a variables
        Scanner teclado = new Scanner(System.in);

        //creacion de variables
        double radio;
        double altura;
        double volumen;
        double area;

        // ingreso de informacion o data
        System.out.println("Ingrese el Radio de su Cilindro. ");
        radio = teclado.nextDouble();

        System.out.println("Ingrese la Altura de su Radio. ");
        altura = teclado.nextDouble();

        //Operacion. Calculo de volumne y area.
        volumen = 3.1416 * (radio * radio) * altura;
        area = 2 * 3.1416 * radio * altura;

        //Muestra resultados.
        System.out.println("El Volumen del Cilindro es: " + volumen);
        System.out.println("El Area del Cilindro es: " + area);
    }

    public static void triangulo() {
        //Crear variable que sacanea consola para asignar datos a variables
        Scanner teclado = new Scanner(System.in);

        //creacion de variables 
        double ladoUno;
        double ladoDos;
        double ladoTres;
        double s;
        double area;

        //Ingreso de datos
        System.out.println("Ingrese el Lado Uno de su Triangulo.");
        ladoUno = teclado.nextDouble();

        System.out.println("Ingrese el Lado Dos de su Triangulo.");
        ladoDos = teclado.nextDouble();

        System.out.println("Ingrese el Lado Tres de su Triangulo.");
        ladoTres = teclado.nextDouble();

        //Operacion.
        s = (ladoUno + ladoDos + ladoTres) / 2;

        area = s * (s - ladoUno) * (s - ladoDos) * (s - ladoTres);
        area = Math.sqrt(area);

        //Muestra datos
        System.out.println("El Area del Triangulo es: " + area);
    }

    public static void carrerasUniversitarias() {
        //Crear variable que sacanea consola para asignar datos a variables
        Scanner teclado = new Scanner(System.in);

        //Creacion de variables
        int carrera;
        int matricula;
        int semestre;
        double promedio;

        //Ingreso de datos
        System.out.println("Ingrese la matricula del alumno.");
        matricula = teclado.nextInt();

        System.out.println("Ingrese el semestra del alumno.");
        semestre = teclado.nextInt();

        System.out.println("Ingrese el promedio del alumno.");
        promedio = teclado.nextDouble();

        System.out.println("Ingrese la carrera que desea ingresar. \n"
                + "Economía = 1. \n"
                + "Computación = 2. \n"
                + "Contabilidad o Administración = 3. \n");
        carrera = teclado.nextInt();

        switch (carrera) {
            case 1: //Carrera de economia
                if (semestre >= 6 && promedio >= 8.8) {
                    System.out.println("La Matricula del alumno es: " + matricula);
                    System.out.println("Felicidades fue ACEPTADO a la carrera de Economía.");
                }
                break;
            case 2: //Carrera de Computacion
                if (semestre > 6 && promedio > 8.5) {
                    System.out.println("La Matricula del alumno es: " + matricula);
                    System.out.println("Felicidades fue ACEPTADO a la carrera de Computación.");
                }
                break;
            case 3: //Carrera de Contabilidad o Administracion
                if (semestre > 5 && promedio > 8.5) {
                    System.out.println("La Matricula del alumno es: " + matricula);
                    System.out.println("Felicidades fue ACEPTADO a la carrera de Contabilidad o Administración.");
                }
            default:
                System.out.println("No ingreso una opcion valida.");
        }
    }

    public static void horasExtra() {
        //Crear variable que sacanea consola para asignar datos a variables
        Scanner teclado = new Scanner(System.in);

        //Creacion de variables
        double sueldoBase;
        int categoria;
        double horasExtra;
        double extras = 0; // cantidad de horas extras en dinero
        double totalSueldo;

        //Ingreso de datos
        System.out.println("Ingrese el sueldo base del trabajador.");
        sueldoBase = teclado.nextDouble();

        System.out.println("Ingrese la categoria del trabajador.");
        categoria = teclado.nextInt();

        System.out.println("Ingrese las horas extra trabajadas.");
        horasExtra = teclado.nextDouble();

        //Operacion
        switch (categoria) {
            case 1:
                if (horasExtra <= 30) {
                    extras = horasExtra * 30;
                } else {
                    extras = 30 * 30;
                }
                break;
            case 2:
                if (horasExtra <= 30) {
                    extras = horasExtra * 38;
                } else {
                    extras = 30 * 38;
                }
                break;
            case 3:
                if (horasExtra <= 30) {
                    extras = horasExtra * 50;
                } else {
                    extras = 30 * 50;
                }
                break;
            case 4:
                if (horasExtra <= 30) {
                    extras = horasExtra * 70;
                } else {
                    extras = 30 * 70;
                }
                break;
            default:
                System.out.println("Por su categoria no se le pagará horas extras.");
        }
        
        //sumar el sueldo base con las horas extras trabajadas
        totalSueldo = sueldoBase + extras;
        
        //Mostrar datos
        System.out.println("El sueldo base del trabajador es: Q" + sueldoBase);
        System.out.println("El sueldo a recibir es: Q" +  totalSueldo);
    }
    
    public static void gastosViaje(){
        //Crear variable que sacanea consola para asignar datos a variables
        Scanner teclado = new Scanner(System.in);
        
        //creacion de variables
        double gastos = 0;
        double sumaGastos = 0;
    
        //ciclo
        while(gastos != -1){
            System.out.println("Ingrese el gasto del viaje.");
            gastos = teclado.nextDouble();
            
            System.out.println("Para salir ingrese un -1");
            
            if (gastos != -1) {
                sumaGastos = sumaGastos + gastos;
            }
        }
    
        System.out.println("El total gastado en el viaje fue de: Q" + sumaGastos);
    }
}
