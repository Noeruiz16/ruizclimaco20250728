/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ruizclimaco_28725;

/**
 *
 * @author UFG
 */
public class Main {
    
    //VARIABLES GLOBALES
    public static String nombres = "Noe Isaac";
    public static String apellidos = "Ruiz Climaco";
    public static int anio_nacimiento = 2002;
    public static int mes_nacimiento = 15;
    public static float estatura = 1.85f; //Estatura en metros
    public static float peso = 150.9f; //Peso en Libras
    public static char genero = 'M';
    public static String estado_familiar = "Ocupado";
    public static double salario_mensual = 1500d;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //VARIABLES LOCALES
        double imc = 0.0d;
        float tasa_kilogramo = 0.453592f; //1 Libra Equivale a 0.453592 Kilogramos
        int dias_laborales = 22; // 22 Dias Laborales Al Mes
        int horas_laborales = 8; //8 Horas Laborales Al Dia
        
        //CONVERTIR EL PESO DE LIBRAS A KILOGRAMOS
        
        float peso_kilogramos = Main.peso * tasa_kilogramo;
        
        //ELEVANDO EL VALOR DE LA ESTATURA AL CUADRADO
        float estatura_al_cuadrado = Main.estatura * Main.estatura;
        
        //CALCULAR EL INDICE DE MASA CORPORAL
        
        imc = peso_kilogramos/estatura_al_cuadrado;
        
        //CALCULANDO EL SALARIO DIARIO
        double salario_diario = Main.salario_mensual/dias_laborales;
        
        //CALCULANDO EL SALARIO POR HORA
        double salario_hora = salario_diario/horas_laborales;
        
        /****************************/
        /*******SALIDA DE DATOS*****/
        /**************************/
        
        System.out.println("Saludos" + Main.nombres+ " "+ Main.apellidos);
        System.out.println("Su peso en libras es: " + Main.peso + ", pero en kilogramos es: " + peso_kilogramos);
        System.out.println("Su Indice de Masa Corporal es: " + imc);
        System.out.println("Su salario mensual es: " + Main.salario_mensual);
        System.out.println("Su salario diario es:" + salario_diario);
        System.out.println("Su salario por hora es: " + salario_hora);
    } 
    
    
    
}
