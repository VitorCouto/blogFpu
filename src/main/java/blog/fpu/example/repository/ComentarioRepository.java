package blog.fpu.example.repository;

import org.springframework.data.repository.CrudRepository;

import blog.fpu.example.entity.Comentario;

public interface ComentarioRepository extends CrudRepository<Comentario, Long> {
	
}
