
public class Calculadora {

	public float calcular(float a, float b, char operacao, Log log) {
		log.logger.info("Dentro da classe Calculadora, método calcular.");
		float resultado = 0;
		switch (operacao) {
		case '+': {
			resultado = a + b;
			log.logger.info("O case '+' foi executado");
		}
		case '-': {
			resultado = ( a > b )  ? a - b : b - a;
			log.logger.info("O case '-' foi executado");
		}
		case '/': {
			resultado = a / b;
			log.logger.info("O case '/' foi executado");
		}
		case '*': {
			resultado = a * b;
			log.logger.info("O case '*' foi executado");
		}
		}
		return resultado;

	}
}
