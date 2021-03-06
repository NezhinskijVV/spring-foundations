package ru.itsjava.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import ru.itsjava.service.NotebookService;
import ru.itsjava.service.NotebookServiceImpl;
import ru.itsjava.service.ProgrammerService;
import ru.itsjava.service.ProgrammerServiceImpl;

@Configuration
public class MyConfig {

    @Bean
    public NotebookService noteService(){
        return new NotebookServiceImpl();
    }

    @Bean
    public ProgrammerService programmerService(NotebookService notebookService){
        return new ProgrammerServiceImpl(notebookService);
    }

}