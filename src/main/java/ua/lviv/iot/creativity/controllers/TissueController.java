package ua.lviv.iot.creativity.controllers;

import java.util.LinkedList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import ua.lviv.iot.creativity.model.Tissue;
import ua.lviv.iot.creativity.repository.TissueRepository;
import ua.lviv.iot.creativity.model.CreativityGood;

@RestController
public class TissueController {

    
    @Autowired
    private TissueRepository tissueRepository;
    
    @RequestMapping(value="/creativityGood/", method = RequestMethod.GET)
    public List<CreativityGood> getTissue(){
        List<CreativityGood> goods = new LinkedList<>();
        tissueRepository.findAll().forEach(goods::add);
        if(goods.isEmpty()) {
            return null;
        }
        return goods;
    }
    
    @RequestMapping(value = "/creativityGood/{id}", method = RequestMethod.GET)
    public Tissue getTissue(@PathVariable Integer id) {
        if(tissueRepository.findById(id).isPresent()) {
            return tissueRepository.findById(id).get();
        }
        return null;
    }
    
    @RequestMapping(value="/creativityGood/", method = RequestMethod.POST)
    public Tissue addTissue(@RequestBody Tissue tissue) {
        return tissueRepository.save(tissue);
    }
    
    @RequestMapping(value = "/creativityGood/", method =RequestMethod.PUT)
    public Tissue updateTissue(@RequestBody Tissue tissue) {
        return tissueRepository.save(tissue);
    }
    
    @RequestMapping(value = "/creativityGood", method = RequestMethod.DELETE)
    public void deleteTissue(@PathVariable Integer id) {
        if(tissueRepository.findById(id).isPresent()) {
            tissueRepository.deleteById(id);
        }
    }

    public TissueRepository getTissueRepository() {
        return tissueRepository;
    }

    public void setTissueRepository(TissueRepository tissueRepository) {
        this.tissueRepository = tissueRepository;
    }
}
