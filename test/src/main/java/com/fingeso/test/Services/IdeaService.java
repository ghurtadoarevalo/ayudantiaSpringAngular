package com.fingeso.test.Services;

import com.fingeso.test.Model.Idea;
import com.fingeso.test.Repository.IdeaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.apache.logging.log4j.util.PropertySource;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:4200",maxAge = 3600)
@RestController
@RequestMapping(value = "/ideas")
public class IdeaService {

    @Autowired
    private IdeaRepository repository;

    //OBTIENE LA IDEA POR EL ID
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    @ResponseBody
    public Idea getIdeaList(@PathVariable String id){

        return this.repository.findIdeaByIdNumber(id);
    }

    //OBTIENE LA IDEA POR EL ID
    @RequestMapping(value = "/getideas", method = RequestMethod.GET)
    @ResponseBody
    public List<Idea> getIdeas(){

        return this.repository.findAll();
    }


    //Obtiene idea por nombre
    @RequestMapping(value = "/byname/{name}", method = RequestMethod.GET)
    @ResponseBody
    public Idea getIdeaByNombre(@PathVariable String name) {
        return this.repository.findIdeaByName(name);
    }
}
