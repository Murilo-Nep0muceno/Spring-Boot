package acadamy.devdojo.controllers;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("v1/anime")
@CrossOrigin(origins = "*")
public class AnimesList {

    @GetMapping()
    public List<String>  animes() {
        List<String> animes = new ArrayList<>();

        animes.add("One Piece");
        animes.add("Bakugan");
        animes.add("Bleach");
        animes.add("Naruto");

        return animes;
    }

}
