package punto5;

public class EcuacionCuadratica {

    /**
     * Calcula La Raices de una Ecuacion Cuadratica.
     * @param a Valor de la variable a de la Ecuacion Cuadratica.
     * @param b Valor de la variable b de la Ecuacion Cuadratica.
     * @param c Valor de la variable c de la Ecuacion Cuadratica.
     * @return Retorna una Cadena con los Valores de X1 y X2 o ""(vacio) si no es una Ecuacion Cuadratica.
     */
    public String calcularEcuacionCuadratica(double a, double b, double c){
      String result="";
      double x1,x2, determinante =  Math.pow(b,2)-(4*a*c);
                if(determinante > 0){
			x1= (-b+Math.sqrt(determinante))/(2*a);
			x2= (-b-Math.sqrt(determinante))/(2*a);
                        result = x1 + ";" + x2;
		}
    return result;
    }
    
    /**
     * Mostrar el resultado de la Ecuacion Cuadratica.
     * @param result Cadena de Valores de X1 y X2.
     */
    public void mostrarResultado(String result){
        if(!"".equals(result)){
            String x1 = result.substring(0,result.indexOf(";"));
            String x2 = result.substring(result.indexOf(";")+1);
            System.out.println("El Valor de X1:"+ x1 + "\nEl Valor de X2:"+ x2 );
        }
        else{
           System.out.println("No es una Ecuacion Cuadratica");
        }
    }
}
