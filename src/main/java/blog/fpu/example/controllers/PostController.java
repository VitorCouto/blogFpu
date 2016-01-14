package blog.fpu.example.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import blog.fpu.example.entity.Post;
import blog.fpu.example.repository.PostRepository;

@Controller
public class PostController {

	@Autowired
	PostRepository postRepository;
	
	@RequestMapping(value="/")
	public String lista(Post post, Model model){
		model.addAttribute("posts", postRepository.findAll());		
		if(post.getId() != null){
			model.addAttribute("post", postRepository.findOne(post.getId()));
		} else {
			model.addAttribute("post", new Post());
		}
		return "cadPosts";
	}
	
	@RequestMapping(value="/save")
	public String salvar (Post post){
		postRepository.save(post);
		return "redirect:/";
	}
	
	@RequestMapping(value="/del")
	public String deletar (Post post){
		postRepository.delete(post);
		return "redirect:/";		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
//	@Autowired
//	ComentarioRepository comentarioRepository;
//	
//	@RequestMapping(value = "/")
//	public String listPost (Model model){		
//		model.addAttribute("posts", postRepository.findAll());
//		model.addAttribute("comentarios", comentarioRepository.findAllOrderByData());		
//		return "Posts";		
//	}
//	
//	@RequestMapping(value = "/post/save")
//	public String salvar (Post post) {
//		postRepository.save(post);
//		return "redirect:/";
//	}
	
}
