package practico2;
import java.util.Scanner;
public class salud {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//Declaración de variables del programa que se deben guardar
			int i=0;
		//-----------------------------------------------------------
				
		boolean activo = true;
		while (activo == true) {
		switch (i) {
				case 0:
					System.out.println("Bienvenido al Analizador de sueño y trabajo");
					System.out.println("------");
					System.out.println("Seleccione una opción: \n 1.Almacenar datos \n 2.Calcular sueldo vacacional \n 3.Revisar horas de sueño \n 4.Salir");
					i=sc.nextInt();
					break;
			
				case 1:

					System.out.println("Ingrese la cantidad de personas que quiera registrar:");
					int cantPersonas = sc.nextInt();
					//Arreglos para almacenar personas
					String[] nombre = new String[cantPersonas];
					String[] apellido = new String[cantPersonas];
					int[] edad = new int[cantPersonas];
					String[] cedula = new String[cantPersonas];
					String[] credencial = new String[cantPersonas];
					
					int contador = 0;
					
					for (int x = 0; x < cantPersonas; x++) {
						
						System.out.println("Persona " + (x+1));
					
						System.out.println("Nombre: ");
						nombre[x] = sc.next();
					
						System.out.println("Apellido: ");
						apellido[x] = sc.next();
					
						System.out.println("Edad: ");
						edad[x] = sc.nextInt();
					
						System.out.println("Cédula: ");
						cedula[x] = sc.next();
					
						System.out.println("Credencial: ");
						credencial[x] = sc.next();
					
					
					
					}
					System.out.println("Nombre / Apellido / Edad / Cédula / Credencial");
					for (int x = 0;x<cantPersonas;x++) {
						System.out.println(nombre [x]+" / "+ apellido [x] +" / "+ edad [x]+" / "+cedula[x]+" / "+credencial[x] );
				
					}
					i=0;
					break;
					
				case 2:
					//(Esto lo "sustraje parcialmente" de un código que tenía parecido) Hecho por Yami.
					System.out.println("Ingresa tu sueldo mensual:");
					double sueldo = sc.nextInt();
					int days;
					System.out.println("Ingresa los días de vacaciones:");
					days = sc.nextInt();
					System.out.println();
					double sueldoVacacional;
					sueldoVacacional = sueldo /30 * days;
					System.out.println("Tu sueldo vacacional es de: $"+sueldoVacacional);
					i = 0;
					break;
					
				case 3:
					sleep();
					i = 0;
					break;
						
				case 4:
						System.out.println("Hasta luego.");
						activo = false;
						break;
						
				default:
						System.out.println("Seleccione una opción correcta.");
						i = 0;
						break;

	}
				}
				}
	public static void sleep() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Cuántas horas duerme a diario?: ");
		float horas = sc.nextFloat();
		System.out.println("Ingrese su edad: ");
		int edad = sc.nextInt();
		
		if (edad<2) {
			if (horas>11 && horas<17) {
				System.out.println("Su hijo duerme bien.");
			} else if(horas<11) { 
				System.out.println("Su hijo duerme poco, tiene que dormir entre 12 y 16 horas.");
			}else {
				System.out.println("Su hijo duerme mucho, tiene que dormir entre 12 y 16 horas.");
			}
		
			
		}else if(edad==2) {
			if (horas>10 && horas<15) {
				System.out.println("Su hijo duerme bien.");
			} else if(horas<10) { 
				System.out.println("Su hijo duerme poco, tiene que dormir entre 11 y 14 horas.");
			}else {
				System.out.println("Su hijo duerme mucho, tiene que dormir entre 11 y 14 horas.");
			}
			
		}else if (edad>2 && edad<6) {
			if (horas>9 && horas<14) {
				System.out.println("Usted duerme bien.");
			} else if(horas<9) { 
				System.out.println("Usted duerme poco, tiene que dormir entre 10 y 13 horas.");
			}else {
				System.out.println("Usted duerme mucho, tiene que dormir entre 10 y 13 horas.");
			}
			
		}else if (edad>5 && edad<13) {
			if (horas>8 && horas<13) {
				System.out.println("Usted duerme bien");
			} else if(horas<9) { 
				System.out.println("Usted duerme poco, tiene que dormir entre 9 y 12 horas.");
			}else {
				System.out.println("Usted duerme mucho, tiene que dormir entre 9 y 12 horas.");
			}
			
		}else if (edad>12 && edad<19) {
			if (horas>7 && horas<11) {
				System.out.println("Usted duerme bien");
			} else if(horas<9) { 
				System.out.println("Usted duerme poco, tiene que dormir entre 8 y 10 horas.");
			}else {
				System.out.println("Usted duerme mucho, tiene que dormir entre 8 y 10 horas.");
			}

		}else if (edad>18) {
			if (horas>7) {
				System.out.println("Usted duerme bien.");
			} else  { 
				System.out.println("Usted duerme poco, tiene que dormir entre 10 y 13 horas.");
			}
		}
	}

}