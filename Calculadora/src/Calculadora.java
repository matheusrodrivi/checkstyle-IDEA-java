public final class Calculadora {

    /**
     * Soma dois números e retorna o resultado.
     * Este método recebe dois números, soma-os e retorna o valor resultante.
     * Ele pode ser sobrescrito por subclasses, se necessário,
     * para adaptar o comportamento
     * de soma, mas deve garantir que a operação de soma
     * seja realizada corretamente.
     * @param valor1 o primeiro número a ser somado
     * @param valor2 o segundo número a ser somado
     * @return a soma de valor1 e valor2
     */
    public double somar(final double valor1, final double valor2) {
        return valor1 + valor2;
    }

    /**
     * Subtrai o segundo número do primeiro e retorna o resultado.
     *
     * Este método recebe dois números, subtrai o segundo número do primeiro
     * e retorna o resultado da operação.
     *
     * @param valor1 o número de onde será subtraído
     * @param valor2 o número a ser subtraído
     * @return a diferença entre valor1 e valor2
     */

    public double subtrair(final double valor1, final double valor2) {
        return valor1 - valor2;
    }

    /**
     * Multiplica o segundo número do primeiro e retorna o resultado.
     *
     * Este método recebe dois números, multiplica o segundo número do primeiro
     * e retorna o resultado da operação.
     *
     * @param valor1 o número de onde será multiplicado
     * @param valor2 o número a ser multiplicador
     * @return o resultado entre valor1 e valor2
     */

    public double multiplicar(final double valor1, final double valor2) {
        return valor1 * valor2;
    }

    /**
     * Divide o segundo número do primeiro e retorna o resultado.
     *
     * Este método recebe dois números, divide o segundo número do primeiro
     * e retorna o resultado da operação.
     *
     * @param valor1 o número de onde será dividido
     * @param valor2 o número a ser divisor
     * @return o resultado entre valor1 e valor2
     */

    public double dividir(final double valor1, final double valor2) {
        return valor1 / valor2;
    }
}
