package com.example.optimizer;

import com.example.optimizer.model.Rune;
import com.example.optimizer.repository.RuneRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class LoadDatabase {

    private static final Logger log = LoggerFactory.getLogger(LoadDatabase.class);

    @Bean
    CommandLineRunner initDatabase(RuneRepository repository) {

        return args -> {
            log.info("Preloading " + repository.save(new Rune("ATK", "150")));
            log.info("Preloading " + repository.save(new Rune("ATK", "56%")));
        };
    }
}