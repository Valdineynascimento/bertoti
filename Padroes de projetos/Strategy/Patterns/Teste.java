package strategypattern;

public class Teste {

   	public static void main(String[] args) {
       Pet garfield = new Pet();
       garfield.setbrincadeira (new BrincadeiraCaçar());
       garfield.brincarBrincadeira();

       System.out.println ("o gato gosta de caçar")

     garfield.setbrincadeira (new BrincadeiraBuscarbolinha());
     garfield.brincarBrincadeira();  

    System.out.println ("o gato gosta de brincar com a bolinha")
    
     