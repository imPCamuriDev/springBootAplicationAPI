package br.com.pepo.notasproject.Entities;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "foto_perfil")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class FotoPerfilEntities {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @OneToOne
    @JoinColumn(name = "usuario_id", referencedColumnName = "id")
    private UsuariosEntities usuario;

    @Lob
    private byte[] imagem;  // Usando o tipo byte[] para armazenar blobs
}
