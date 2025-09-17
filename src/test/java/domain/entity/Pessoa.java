package domain.entity;

import jakarta.persistence.*;
import java.util.Date;

@Entity
@Table(name = "pessoa")

public class Pessoa {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(length = 200, nullable = false)
        private String nomeCompleto;

    @Column(length = 14, nullable = false)
        private String cpfCnpj;

    @Column(length = 12)
    private long numeroCtps;

    @Column(length = 10, nullable = false)
    private Date dataNascimento;
@Column(length)
    public Pessoa(String nomeCompleto, String cpfCnpj, Date dataNascimento, Integer numeroCtps){
    this.nomeCompleto = nomeCompleto;
}
public String getNomeCompleto(){ return nomeCompleto;}

   public void setNomeCompleto(String nomeCompleto){this.nomeCompleto = nomeCompleto;}
   public String getCpfCnpj(){ return cpfCnpj;}
   public void setCpfCnpj(String cpfCnpj){this.cpfCnpj = cpfCnpj;}
   public Date getDataNascimento(){return dataNascimento;}
   public void setDataNascimento(Date dataNascimento){this.dataNascimento = dataNascimento;}
   public Integer getNumeroCtps(){ return numeroCtps;}
   public void setNumeroCtps(Integer numeroCtps){this.numeroCtps = numeroCtps;}

}

