package problemas;
import java.util.Scanner;

public class Pro3 {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		int numero, i;
		float restante=1;
		String primo=" ";
		
		System.out.println("Ingrese un numero:");
		numero = scan.nextInt();
		i=numero;
		i--;
		while(i>1&&restante>0){
			restante = numero%i;
			if (restante==0)
				primo=" no es un numero primo";
			else if (restante>0)
				primo=" es un numero primo";
			i--;
		}
		if (numero<=1)
			primo=" no es un numero primo";
		
		else if (numero==2);
			primo=" es un numero primo";
		System.out.println(numero+primo);
		scan.close();
	}

}