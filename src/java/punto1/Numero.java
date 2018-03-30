package punto1;

public class Numero {
  
    /**
     * Busca Numeros Impares en el rango de 0 a 100.
     * @return Retorna una cadena de Numeros impares.
     */
    public String buscarImpares(){
      String aux="";
      for(int i=0; i<=100; i++){
        if((i % 2) != 0){
           aux += i + ", ";         
         }
      }
    return aux;
    }
    
    /**
     * Muestra por consola los Numeros Impares recibido como parametros.
     * @param impares Cadena de Numeros Impares
     */
    public void mostrarImpares(String impares){
        System.out.println("Los Numeros Impares son: "+ impares);
    }
    
}
