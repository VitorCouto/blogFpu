package blog.fpu.example.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Post {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String nome;
	private String titulo;
	private String postagem;
	@OneToMany(mappedBy="post")
	private List<Comentario> comentario;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	
	public List<Comentario> getComentario() {
		return comentario;
	}

	public void setComentario(List<Comentario> comentario) {
		this.comentario = comentario;
	}

	public String getPostagem() {
		return postagem;
	}

	public void setPostagem(String postagem) {
		this.postagem = postagem;
	}

}
