package desafio_poo_dio.src;
import java.time.LocalDate;


public class curso{
    private String titulo;
    private String descricao;
    private int cargaHoraria;

public String getTitulo(){
    return titulo;
}

public void setTitulo(String titulo){
    this.titulo = titulo;
}

public String getDescricao(){
    return descricao;
}

public void setDescricao(String descricao){
    this.descricao = descricao;
}

public  int getCargaHoraria(){
    return cargaHoraria;
}

public void setcargaHoraria(int cargaHoraria){
    this.cargaHoraria = cargaHoraria;
}
@Override
    public String toString(){
        return "Curso{" + 
                "titulo = ' " + titulo + '\'' + 
                ", descricao='" + descricao + '\''+
                ", cargaHoraria= '" + cargaHoraria + 
                '}';
    }
}
