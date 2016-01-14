package blog.fpu.example.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import blog.fpu.example.entity.Comentario;
import blog.fpu.example.entity.Post;

public interface PostRepository extends CrudRepository<Post, Long> {
	
	@Query("from Comentario order by data")
	public List<Comentario> findAllOrderByData();
	
}
