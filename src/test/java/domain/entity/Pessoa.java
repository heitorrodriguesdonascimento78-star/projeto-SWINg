package domain.entity;
import com.br.pdvpostodecombustivel.enums.TipoPessoa;
import jakarta.persistence.*;
import java.util.Date;
@Entity
@Table(name = "pessoa")
public class Pessoa {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name  = "nome_completo", length = 200, nullable = false)
        private String nomeCompleto;

    @Column(name =  "cpf_Cnpj",length = 14, nullable = false)
        private String cpfCnpj;

    @Column(length = 12)
    private Date dataNascimento;

    @Column(length = 10, nullable = false)
    private long numeroCtps;

    @Enumerated(EnumType.STRING)
    @Column(name = "tipo_pessoa", nullable = false, length = 15)
    private TipoPessoa tipoPessoa;

    public Pessoa(String nomeCompleto, String cpfCnpj, Date dataNascimento, Integer numeroCtps){
    this.nomeCompleto = nomeCompleto;
    this.dataNascimento = dataNascimento;
    this.numeroCtps = numeroCtps;
    this.cpfCnpj = cpfCnpj;
    this.tipoPessoa = tipoPessoa;
}
public Pessoa(){}

    public String getNomeCompleto(){ return nomeCompleto;}

   public void setNomeCompleto(String nomeCompleto){this.nomeCompleto = nomeCompleto;}
   public String getCpfCnpj(){ return cpfCnpj;}
   public void setCpfCnpj(String cpfCnpj){this.cpfCnpj = cpfCnpj;}
   public Date getDataNascimento(){return dataNascimento;}
   public void setDataNascimento(Date dataNascimento){this.dataNascimento = dataNascimento;}
   public Integer getNumeroCtps(){ return numeroCtps;}
   public void setNumeroCtps(Integer numeroCtps){this.numeroCtps = numeroCtps;}

}

