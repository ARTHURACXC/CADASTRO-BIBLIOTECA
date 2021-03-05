
package cadrastrobiblioteca;

/*@author ARTHUR CASTRO testando*/

public class CadrastroBiblioteca {
    
    public static void main(String[] args) {
        
        Livro livro1 = new Livro();
        livro1.setCodigo(1001);
        livro1.setObra("LIVRO 01");
        livro1.setAutores("Arthur");
        livro1.setEditora("Java");
        livro1.setAnoPub(2020);
        
        Livro livro2 = new Livro();
        livro2.setCodigo(1002);
        livro2.setObra("LIVRO 02");
        livro2.setAutores("Laís");
        livro2.setEditora("Java");
        livro2.setAnoPub(2021);
        
        Livro livro3 = new Livro();
        livro3.setCodigo(1003);
        livro3.setObra("LIVRO 03");
        livro3.setAutores("Ana");
        livro3.setEditora("Java");
        livro3.setAnoPub(2019);
        
        livro1.info();
        livro2.info();
        livro3.info();
        
    }
    
}
