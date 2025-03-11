package acadamy.devdojo.controllers;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

@RestController
@RequestMapping("v1/anime")
@CrossOrigin(origins = "*")
@Slf4j
public class AnimesControler {

    @GetMapping()
    public List<String>  animes() throws InterruptedException {
        List<String> animes = new ArrayList<>();

        animes.add("One Piece");
        animes.add("Bakugan");
        animes.add("Bleach");
        animes.add("Naruto");
        log.info(Thread.currentThread().getName());
        TimeUnit.SECONDS.sleep(1);
        return animes;
    }

}
