package Beans;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class VideoGameController {
	@Autowired VideoGameDao dao;
		
	@RequestMapping(value = "/form")
	public ModelAndView game( ){
		ModelAndView modelAndView = new ModelAndView( );
		modelAndView.setViewName("gameForm");
		modelAndView.addObject("videoGame", new VideoGame( ));
		return modelAndView;
	}
	
	@RequestMapping(value = "/result")
	public ModelAndView processGame(VideoGame game){
		ModelAndView modelAndView = new ModelAndView();
		dao.insertGame(game);
		modelAndView.setViewName("gameResult");
		modelAndView.addObject("g", game);
		return modelAndView;
	}
	
	@RequestMapping(value = "/viewAll")
	public ModelAndView viewAll( ){
		ModelAndView modelAndView = new ModelAndView();
		List<VideoGame> allGames = dao.getAllGames();
		modelAndView.setViewName("viewAllGames");
		modelAndView.addObject("all", allGames);
		return modelAndView;
	}
	
	@Bean
	public VideoGameDao dao(){
		VideoGameDao bean = new VideoGameDao();
		return bean;
	}
}
