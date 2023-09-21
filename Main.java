package org.example;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        menu();
    }
    public static void menu() {
        Scanner sc = new Scanner(System.in);
        int opcion;
        boolean condicion = true;

        while (condicion) {
            System.out.println("Menú:");
            System.out.println("1. Operaciones aritmeticas");
            System.out.println("2. Calcular perimetros, areas y volumenes");
            System.out.println("3. Resolver ecuaciones cuadraticas");
            System.out.println("4. Resolver sistema de 2 ecuaciones");
            System.out.println("5. Calcular la ecuacion de la recta");
            System.out.println("6. Salir");

            System.out.print("Seleccione una opción: ");
            opcion = sc.nextInt();

            if (opcion == 1) {
                operacionesAritmeticas();
            } else if (opcion == 2) {
                menuPermiterosAreasYVolumenes();
            } else if (opcion == 3) {
                ecuacionCuadratica();
            } else if (opcion == 4) {
                sistemaEcuaciones();
            } else if (opcion == 5) {
                ecuacionRecta();
            } else if (opcion == 6) {
                break;

            }
        }
    }

    public static void operacionesAritmeticas() {
        boolean esNumero = true;
        float numero1=0;
        float numero2=0;
        Scanner sc = new Scanner(System.in);
        do{
            try{
                esNumero=true;
                System.out.println("Ingrese su primer numero");
                numero1 = sc.nextFloat();
                System.out.println("Ingrese su segundo numero");
                numero2 = sc.nextFloat();

            } catch (Exception e){
                sc.next();
                System.out.println("Tienen que ser numeros, ingreselos nuevamente");
                esNumero=false;
            }
        } while(!esNumero);
        menuOperacionesAritmeticas(numero1,numero2);
    }
    public static void menuOperacionesAritmeticas(float numero1, float numero2){
        Scanner sc = new Scanner(System.in);
        int opcion;
        boolean condicion = true;

        while(condicion) {
            System.out.println("Menú:");
            System.out.println("1. Sumar los numeros");
            System.out.println("2. Restar los numeros");
            System.out.println("3. Multiplicar los numeros");
            System.out.println("4. Dividir los numeros");
            System.out.println("5. Mostrar el numero mayor");
            System.out.println("6. Mostrar el numero menor");
            System.out.println("7. Calcular el primer numero elevado al segundo");
            System.out.println("8. Calcular el porcentaje del primer numero respecto al segundo");
            System.out.println("9. Retroceder");

            System.out.print("Seleccione una opción: ");
            opcion = sc.nextInt();

            if(opcion==1){
                System.out.println(sumarNumeros(numero1,numero2));
            }
            else if(opcion==2){
                System.out.println(restarNumeros(numero1,numero2));
            }
            else if(opcion==3){
                System.out.println(multiplicarNumeros(numero1,numero2));
            }
            else if(opcion==4){
                System.out.println(dividirNumeros(numero1,numero2));
            }
            else if(opcion==5){
                System.out.println(numeroMayor(numero1,numero2));
            }
            else if(opcion==6){
                System.out.println(numeroMenor(numero1,numero2));
            }
            else if(opcion==7){
                System.out.println(calcularPotencia(numero1,numero2));
            }
            else if(opcion==8){
                System.out.println(calcularPorcentaje(numero1,numero2)+"%");
            }
            else if(opcion==9){
                break;
            }
            else{
                System.out.println("Opcion no valida");
            }
        }
    }



    public static float sumarNumeros(float num1, float num2) {
        System.out.println("La suma de sus numeros es: ");
        return num1 + num2;
    }

    public static float restarNumeros(float num1, float num2) {
        System.out.println("La resta de sus numeros es: ");
        return num1 - num2;
    }

    public static float multiplicarNumeros(float num1, float num2) {
        System.out.println("La multiplicacion de sus numeros es: ");
        return num1 * num2;
    }

    public static float dividirNumeros(float num1, float num2) {
        System.out.println("La division de sus numeros es: ");
        return num1 / num2;
    }

    public static float numeroMayor(float num1, float num2) {
        float num3 =0;
        if (num1 > num2) {
            num3=num1;
            System.out.println("El numero mayor es " + num1);
        } else if (num2 > num1) {
            num3=num2;
            System.out.println("El numero mayor es " + num2);
        } else if (num1 == num2) {
            num3=num1;
            System.out.println("Los numeros son iguales, por lo cual ambos son los mayores");
        }

        return num3;
    }
    public static float numeroMenor(float num1, float num2) {
        float num3 =0;
        if (num1 > num2) {
            num3=num2;
            System.out.println("El numero menor es " + num2);
        } else if (num2 > num1) {
            num3=num1;
            System.out.println("El numero menor es " + num1);
        } else if (num1 == num2) {
            num3=num1;
            System.out.println("Los numeros son iguales, por lo cual ambos son los mayores");
        }
        return num3;
    }
    public static float calcularPotencia(float num1, float num2){
        System.out.println("El "+ num1 + " elevado a "+ num2 +" es:");
        return (float) Math.pow(num1,num2);
    }
    public static float calcularPorcentaje(float num1, float num2){
        System.out.println("Tiene un porcentaje de: ");
        return num1*100/num2;
    }

    // ECUACION CUADRATICA

    public static void ecuacionCuadratica(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el valor de a: ");
        float a = sc.nextFloat();
        System.out.println("Ingrese el valor de b: ");
        float b = sc.nextFloat();
        System.out.println("Ingrese el valor de c: ");
        float c = sc.nextFloat();
        while (a==0){
            System.out.println("El valor de a no puede ser 0, ingreselo nuevamente");
            a = sc.nextFloat();
        }
        System.out.println(ecuacion1(a,b,c));
        System.out.println(ecuacion2(a,b,c));
    }

    public static double ecuacion1(double a, double b, double c){
        System.out.println("El primer valor de x es: ");
        return (-b+Math.sqrt((b*b)-(4*a*c)))/2*a ;
    }
    public static double ecuacion2(double a, double b, double c){
        System.out.println("El segundo valor de x es: ");
        return (-b-Math.sqrt((b*b)-(4*a*c)))/2*a ;
    }

    //SISTEMA DE ECUACIONES


    public static void sistemaEcuaciones() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese los valores para resolver el sistema de ecuaciones de 2 variables con forma: ");
        System.out.println("ax + by = c");
        System.out.println("dx + ey = f");
        System.out.println("Ingrese el valor de a: ");
        double a = sc.nextFloat();
        System.out.println("Ingrese el valor de b: ");
        double b = sc.nextFloat();
        System.out.println("Ingrese el valor de c: ");
        double c = sc.nextFloat();
        System.out.println("Ingrese el valor de d: ");
        double d = sc.nextFloat();
        System.out.println("Ingrese el valor de e: ");
        double e = sc.nextFloat();
        System.out.println("Ingrese el valor de f: ");
        double f = sc.nextFloat();
        while (a == 0) {
            System.out.println("El valor de a no puede ser 0, ingreselo nuevamente");
            a = sc.nextFloat();
        }
        while (b == 0) {
            System.out.println("El valor de b no puede ser 0, ingreselo nuevamente");
            b = sc.nextFloat();
        }
        while (d == 0) {
            System.out.println("El valor de d no puede ser 0, ingreselo nuevamente");
            d = sc.nextFloat();
        }
        while (e == 0) {
            System.out.println("El valor de e no puede ser 0, ingreselo nuevamente");
            e = sc.nextFloat();
        }
        System.out.println("El valor del determinante es: ");
        System.out.println(determinante(a, b, c, d, e, f));
        resultadoSistemaEcuaciones(a, b, c, d, e, f, determinante(a, b, c, d, e, f));
    }
    public static double determinante(double a, double b, double c, double d, double e, double f){
        return a*e - b*d;
    }
    public static double valorX(double a, double b, double c, double d, double e, double f, double determinante){
        return (c*e - b*f)/determinante;
    }
    public static double valorY(double a, double b, double c, double d, double e, double f, double determinante) {
        return (a * f - c * d) / determinante;
    }

    public static void resultadoSistemaEcuaciones(double a,double b, double c, double d, double e, double f, double determinante){
        if (determinante==0){
            System.out.println("El sistema tiene infinitas soluciones");
        }
        else if (determinante<0){
            System.out.println("El sistema no tiene solucion en los reales");
        }
        else if (determinante>0){
            System.out.println("El valor de x es de: ");
            System.out.println(valorX(a,b,c,d,e,f,determinante(a,b,c,d,e,f)));
            System.out.println("El valor de y es de: ");
            System.out.println(valorY(a,b,c,d,e,f,determinante(a,b,c,d,e,f)));
        }

    }
    // PERMITEROS AREAS Y VOLUMENES

    public static void ingresoAreaRectangulo(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el ancho del rectangulo");
        int ancho = sc.nextInt();
        System.out.println("Ingrese el alto del rectangulo");
        int alto = sc.nextInt();
        areaRectangulo(ancho,alto);
    }
    public static int areaRectangulo(int ancho, int alto) {
        int area = ancho * alto;
        System.out.println("El area del rectangulo es: "+area);
        return area;
    }
    public static int areaCuadrado(int lado){
        int area = lado*lado;
        System.out.println("El area del cuadrado es: "+area);
        return area;
    }
    public static void ingresoAreaCuadrado(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el lado del cuadrado");
        int lado = sc.nextInt();
        areaCuadrado(lado);
    }
    public static double areaCirculo(int radio){
        double area = Math.PI * radio*radio;
        System.out.println("El area del circulo es: "+area);
        return area;
    }
    public static void ingresoAreaCirculo(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el radio del circulo");
        int radio = sc.nextInt();
        areaCirculo(radio);
    }
    public static double areaEsfera(int radio){
        double area = 4*Math.PI*radio*radio;
        System.out.println("El area de la esfera es: "+area);
        return area;
    }
    public static void ingresoAreaEsfera(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el radio de la esfera");
        int radio = sc.nextInt();
        areaEsfera(radio);
    }
    public static int areaCubo(int lado){
        int area = lado*lado*6;
        System.out.println("El area del cubo es: "+area);
        return area;
    }
    public static void ingresoAreaCubo(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el lado del cubo");
        int lado = sc.nextInt();
        areaCubo(lado);
    }
    public static double areaCono(int radio, int g){
        double area = (Math.PI*radio*radio)+(Math.PI*radio*g);
        System.out.println("El area del cono es: "+area);
        return area;
    }
    public static void ingresoAreaCono(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el radio del cono");
        int radio = sc.nextInt();
        System.out.println("Ingrese la geriatriz del cono");
        int g = sc.nextInt();
        areaCono(radio, g);
    }
    public static int perimetroCuadrado(int lado){
        int perimetro = 4*lado;
        System.out.println("El perimetro del cuadrado es: "+perimetro);
        return perimetro;
    }
    public static void ingresoPerimetroCuadrado(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el lado del cuadrado");
        int lado = sc.nextInt();
        perimetroCuadrado(lado);
    }
    public static int perimetroRectangulo(int ancho, int alto){
        int perimetro = 2*ancho+2*alto;
        System.out.println("El perimetro del rectangulo es: "+perimetro);
        return perimetro;
    }
    public static void ingresoPerimetroRectangulo(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el ancho del rectangulo");
        int ancho = sc.nextInt();
        System.out.println("Ingrese el alto del rectangulo");
        int alto = sc.nextInt();
        perimetroRectangulo(ancho,alto);
    }
    public static double perimetroCirculo(int radio) {
        double perimetro = radio*2*Math.PI;
        System.out.println("El perimetro del circulo es: "+perimetro);
        return perimetro;
    }
    public static void ingresoPerimetroCirculo(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el radio del circulo");
        int radio = sc.nextInt();
        perimetroCirculo(radio);
    }
    public static double volumenEsfera(int radio){
        double volumen = (4.0/3.0)*Math.PI*Math.pow(radio,3);
        System.out.println("El volumen de la esfera es: "+volumen);
        return volumen;
    }
    public static void ingresoVolumenEsfera(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el radio de la esfera");
        int radio = sc.nextInt();
        volumenEsfera(radio);
    }
    public static double volumenCubo(int lado){
        double volumen = Math.pow(lado,3);
        System.out.println("El volumen del cubo es: "+volumen);
        return volumen;
    }
    public static void ingresoVolumenCubo(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el lado del cubo");
        int lado = sc.nextInt();
        volumenCubo(lado);
    }
    public static double volumenCono(int radio, int altura){
        double volumen = (1.0/3.0)*Math.PI*radio*radio*altura;
        System.out.println("El volumen del cono es: "+volumen);
        return volumen;
    }
    public static void ingresoVolumenCono(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el radio del cono");
        int radio = sc.nextInt();
        System.out.println("Ingrese la altura del cono");
        int altura = sc.nextInt();
        volumenCono(radio,altura);
    }
    public static void menuPermiterosAreasYVolumenes(){
        Scanner sc = new Scanner(System.in);
        int opcionMenuPrincipal;

        do {
            // Menú principal
            System.out.println("Menú Principal:");
            System.out.println("1. Perímetros");
            System.out.println("2. Volúmenes");
            System.out.println("3. Áreas");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opción: ");
            opcionMenuPrincipal = sc.nextInt();

            switch (opcionMenuPrincipal) {
                case 1:

                    int opcionPerimetros;
                    do {
                        System.out.println("\nMenú de Perímetros:");
                        System.out.println("1. Cuadrado");
                        System.out.println("2. Rectángulo");
                        System.out.println("3. Círculo");
                        System.out.println("4. Volver al menú principal");
                        System.out.print("Seleccione una opción: ");
                        opcionPerimetros = sc.nextInt();

                        switch (opcionPerimetros) {
                            case 1:
                                ingresoPerimetroCuadrado();
                                break;
                            case 2:
                                ingresoPerimetroRectangulo();
                                break;
                            case 3:
                                ingresoPerimetroCirculo();
                                break;
                            case 4:
                                break;
                            default:
                                System.out.println("Opción no válida. Intente de nuevo.");
                        }
                    } while (opcionPerimetros != 4);
                    break;
                case 2:

                    int opcionVolúmenes;
                    do {
                        System.out.println("\nMenú de Volúmenes:");
                        System.out.println("1. Esfera");
                        System.out.println("2. Cubo");
                        System.out.println("3. Cono");
                        System.out.println("4. Volver al menú principal");
                        System.out.print("Seleccione una opción: ");
                        opcionVolúmenes = sc.nextInt();

                        switch (opcionVolúmenes) {
                            case 1:
                                ingresoVolumenEsfera();
                                break;
                            case 2:
                                ingresoVolumenCubo();
                                break;
                            case 3:
                                ingresoVolumenCono();
                                break;
                            case 4:
                                break;
                            default:
                                System.out.println("Opción no válida. Intente de nuevo.");
                        }
                    } while (opcionVolúmenes != 4);
                    break;
                case 3:
                    int opcionAreas;
                    do {
                        System.out.println("\nMenú de Áreas:");
                        System.out.println("1. Rectángulo");
                        System.out.println("2. Cuadrado");
                        System.out.println("3. Círculo");
                        System.out.println("4. Esfera");
                        System.out.println("5. Cubo");
                        System.out.println("6. Cono");
                        System.out.println("7. Volver al menú principal");
                        System.out.print("Seleccione una opción: ");
                        opcionAreas = sc.nextInt();

                        switch (opcionAreas) {
                            case 1:
                                ingresoAreaRectangulo();
                                break;
                            case 2:
                                ingresoAreaCuadrado();
                                break;
                            case 3:
                                ingresoAreaCirculo();
                                break;
                            case 4:
                                ingresoAreaEsfera();
                                break;
                            case 5:
                                ingresoAreaCubo();
                                break;
                            case 6:
                                ingresoAreaCono();
                                break;
                            case 7:
                                break;
                            default:
                                System.out.println("Opción no válida. Intente de nuevo.");
                        }
                    } while (opcionAreas != 7);
                    break;
                case 4:
                    System.out.println("Adios");
                    break;
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
            }

        } while (opcionMenuPrincipal != 4);
    }



    //ECUACION RECTA

    public static void ecuacionRecta() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Tenemos los dos puntos: P1(x1,y1) y P2(x2,y2) ");
        System.out.println("Ingrese la cordenada x del primer punto: ");
        double x1 = scanner.nextDouble();

        System.out.print("Ingrese la cordenada y del primer punto: ");
        double y1 = scanner.nextDouble();

        System.out.print("Ingrese la cordenada x del segundo punto: ");
        double x2 = scanner.nextDouble();

        System.out.print("Ingrese la cordenada y del segundo punto: ");
        double y2 = scanner.nextDouble();

        double m = (y2 - y1) / (x2 - x1);
        double b = y1 - m * x1;
        System.out.println("La ecuación de la recta es: y = " + m + "x + " + b);
    }
}