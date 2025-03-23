package Principal;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		int eleccion;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Elija un ejercicio 1-10");
		eleccion = scanner.nextInt();
		switch(eleccion) {
		case 1:
			int x = -1+5/3%2*5+7*2+1;
			System.out.println("El valor de x es:"+ x);
		break;
		case 2:
			int y = -1+(5/3)%2*(5+7)*2+1;
			System.out.println("El valor de x es:"+ y);

		break;
		case 3:
			boolean z = 3>2 && 6<10^true;
			System.out.println("El valor de x es:"+ z);
		break;
		case 4:
			//utilice una variable llamada aux como auxiliar para guardar los numeros correctamente 
			short a = 26;
			long b = 12348;
			float c = 1391.123f;
			String d = "32";
			System.out.println("(antes) El valor de a: "+ a +"\n  el valor de b :"+b +"\n El valor de c:  "+ c +"\n El valor de D:"+d+"\n");

			long aux;
			aux = b; 
			b = a;
			a = Short.parseShort(d);
			d = Float.toString(c);
			c = (float) aux;
			System.out.println("(Despues) El valor de a: "+ a +"\n el valor de b: "+b +" \n El valor de c:  "+ c +" \n El valor de D: "+d);
			
		break;
		case 5:
			int e = 5;
			e *= e%2*3+2;
			/*System.out.println("int e = 5;");
			System.out.println("e *= e%2*3+2;\"");*/
			System.out.println("e= "+e);
			break;
		case 6:
			int f = 1; // vale 1
			System.out.println(f);
			++f; //vale 2
			System.out.println(f);
			f += f++; //4
			System.out.println(f);
			--f; //3
			System.out.println(f);
		break;
		case 7:
			
		break;
		
		default:
			System.out.println("Ingresaste un numero incorrecto");
		break;
		
		}
		
		
		
	scanner.close();
	}

}
