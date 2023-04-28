import java.io.IOException;
import java.util.Scanner;

public class Principal {
	public Principal() throws IOException {
	}
	public static void main(String[] args) throws IOException {
		Log log = new Log("Log.txt");
		try (Scanner leitura = new Scanner(System.in)) {
			log.logger.info("A Aplicação calculadora foi iniciada.");
			Calculadora c = new Calculadora();
			float a = 0, b = 0, resultado = 0;
			String operador;
			System.out.println("Calculadora");
			do {
				System.out.println("Insira o operador +, -, *, /");
				operador = leitura.nextLine();
			} while (!(operador.contains("+") || operador.contains("-") || operador.contains("*")
					|| operador.contains("/")));

			System.out.println("Insira o 1o valor");
			a = leitura.nextFloat();
			System.out.println("Insira o 2o valor");
			b = leitura.nextFloat();
			log.logger.info("Informações para as operações foram coletadas, operador: " + operador + "a: "+ a + "b: " + b);
			resultado = c.calcular(a, b, operador.charAt(0), log);
			System.out.println("O resultado de " + a + " " + operador + " " + b + " é:" + resultado);
			log.logger.info("Operações da aplicação foram finalizadas com o resultado: " + resultado);
		}

	}

}
