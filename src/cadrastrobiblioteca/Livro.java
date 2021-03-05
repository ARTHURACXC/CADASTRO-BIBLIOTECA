
package cadrastrobiblioteca;

/*@author ARTHUR CASTRO*/
 
public class Livro {
    
    /*ATRIBUTOS*/
    
    public int codigo;
    public String obra;
    public String autores;
    public String editora;
    public int anoPub;
    
    /*METODOS*/

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getObra() {
        return obra;
    }

    public void setObra(String obra) {
        this.obra = obra;
    }

    public String getAutores() {
        return autores;
    }

    public void setAutores(String autores) {
        this.autores = autores;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public int getAnoPub() {
        return anoPub;
    }

    public void setAnoPub(int anoPub) {
        this.anoPub = anoPub;
    }
    
    public void info(){
    System.out.println("\n_____________________________________");
            System.out.println("CÓDIGO: "+this.getCodigo());
            System.out.println("OBRA: "+this.getObra());
            System.out.println("AUTORES: "+this.getAutores());
            System.out.println("EDITORA: "+this.getEditora());
            System.out.println("ANO DE PUBLICAÇÃO: "+this.getAnoPub());
            System.out.println("_____________________________________");
}
}
