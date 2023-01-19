package com.example.restoranteostrovskybettini.Controller;

import com.example.restoranteostrovskybettini.Entity.Comida;
import com.example.restoranteostrovskybettini.Repository.ComidaRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;


//CRUD
@RestController
public class ComidaController {

    private final Logger log = LoggerFactory.getLogger(ComidaController.class);

    private final ComidaRepository comidaRepository;

    public ComidaController(ComidaRepository comidaRepository){
        this.comidaRepository = comidaRepository;
    }

    /**
     * Buscar todas las comidas en la base de datos
     * http://localhost:8080/api/comidas
     * @return ArrayList<Comida>
     */
    @GetMapping("/api/comidas")
    public List<Comida> findAll(){return comidaRepository.findAll();}


    /**
     * Buscar una comida por si id
     * http://localhost:8080/api/comida/1
     * @param id
     * @return
     */
    @GetMapping("/api/comida/{id}")
    public ResponseEntity<Comida> findOneById(@PathVariable Long id){
        Optional<Comida> comidaOpt = comidaRepository.findById(id);
        if(comidaOpt.isPresent()){
            return ResponseEntity.ok(comidaOpt.get());
        }else{
            return ResponseEntity.notFound().build();
        }
    }


    /**
     * Crear una comida en la base de datos
     * @param comida
     * @param headers
     * @return
     */
    @PostMapping("/api/comidas")
    public ResponseEntity<Comida> create(@RequestBody Comida comida, @RequestHeader HttpHeaders headers){
        System.out.println(headers.get("User-Agent"));
        if(comida.getId() != null){
            log.warn("trying to create a food with id");
            return ResponseEntity.badRequest().build();
        }
        Comida result = comidaRepository.save(comida);
        return  ResponseEntity.ok(result);
    }

    /**
     * Actualizar una comida ya existente en la base de datos
     * http://localhost:8080/api/comidas/1
     * @param comida
     * @return
     */
    @PutMapping("/api/comidas")
    public ResponseEntity<Comida> update(@RequestBody Comida comida){
        if(comida.getId() == null){
            log.warn("Trying to update a non existent food");
            return ResponseEntity.badRequest().build();
        }
        if(!comidaRepository.existsById(comida.getId())){
            log.warn("Trying to update a non existent food");
            return ResponseEntity.notFound().build();
        }

        Comida result = comidaRepository.save(comida);
        return ResponseEntity.ok(result);
    }


    /**
     * Eliminar una comida de la base de datos mediante su id
     * http://localhost:8080/api/comidas/1
     * @param id
     * @return
     */
    @DeleteMapping("/api/comidas/{id}")
    public ResponseEntity<Comida> delete(@PathVariable Long id){

        if(!comidaRepository.existsById(id)){
            log.warn("Trying to delete a non existent food");
            return ResponseEntity.notFound().build();
        }
        comidaRepository.deleteById(id);
        return  ResponseEntity.noContent().build();
    }


    /**
     * Eliminar todas las comidas de la base de datos
     * http://localhost:8080/api/comidas
     * @return
     */

    @DeleteMapping("/api/comidas")
    public ResponseEntity<Comida> deleteAll(){
        log.info("REST Request for delete all foods");
        comidaRepository.deleteAll();
        return ResponseEntity.noContent().build();
    }


}
