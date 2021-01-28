package training.spring.joke.jokeapp.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.actuate.endpoint.annotation.ReadOperation;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import training.spring.joke.jokeapp.services.JokeService;

@Controller
public class JokeController {


    private JokeService jokeService;

    @Autowired
    public JokeController(JokeService jokeService) {
        this.jokeService = jokeService;
    }

    @RequestMapping({"/","","/bigmamam"})
    public String showJoke(Model model){ //also Spring will make here Autowired
        model.addAttribute("joke",jokeService.getJoke());

        return "checknorris";
    }
}
