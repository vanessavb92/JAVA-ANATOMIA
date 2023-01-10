public class MinhaClasse {
    
 
    public static void main (String[]args){

    //metodos
   

    String primeiroNome = ("vanessa");
    String segundoNome = ("borges");

    String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);
    System.out.print(nomeCompleto);



    

   public static String nomeCompleto (String primeiroNome, String segundoNome) {
    return primeiroNome.concat("").concat(segundoNome);

   }
}
