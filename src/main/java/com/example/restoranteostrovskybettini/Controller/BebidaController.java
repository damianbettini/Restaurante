package com.example.restoranteostrovskybettini.Controller;

import com.example.restoranteostrovskybettini.Entity.Bebida;
import com.example.restoranteostrovskybettini.Repository.BebidaRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class BebidaController {

    private final Logger log = LoggerFactory.getLogger(ComidaController.class);

    private final BebidaRepository bebidaRepository;

    public BebidaController(BebidaRepository bebidaRepository){
        this.bebidaRepository = bebidaRepository;
    }

    /**
     * Buscar todas las bebidas en la base de datos
     * http://localhost:8080/api/bebidas
     * @return ArrayList<Bebida>
     */
    @GetMapping("/api/bebidas")
    public List<Bebida> findAll(){return bebidaRepository.findAll();}


    /**
     * Buscar una bebida por si id
     * http://localhost:8080/api/bebida/1
     * @param id
     * @return
     */
    @GetMapping("/api/bebida/{id}")
    public ResponseEntity<Bebida> findOneById(@PathVariable Long id){
        Optional<Bebida> bebidaOpt = bebidaRepository.findById(id);
        if(bebidaOpt.isPresent()){
            return ResponseEntity.ok(bebidaOpt.get());
        }else{
            return ResponseEntity.notFound().build();
        }
    }


    /**
     * Crear una bebida en la base de datos
     * @param bebida
     * @param headers
     * @return
     */
    @PostMapping("/api/bebidas")
    public ResponseEntity<Bebida> create(@RequestBody Bebida bebida, @RequestHeader HttpHeaders headers){
        System.out.println(headers.get("User-Agent"));
        if(bebida.getId() != null){
            log.warn("trying to create a drink with id");
            return ResponseEntity.badRequest().build();
        }
        Bebida result = bebidaRepository.save(bebida);
        return  ResponseEntity.ok(result);
    }

    /**
     * Actualizar una bebida ya existente en la base de datos
     * http://localhost:8080/api/bebidas/1
     * @param bebida
     * @return
     */
    @PutMapping("/api/bebidas")
    public ResponseEntity<Bebida> update(@RequestBody Bebida bebida){
        if(bebida.getId() == null){
            log.warn("Trying to update a non existent drink");
            return ResponseEntity.badRequest().build();
        }
        if(!bebidaRepository.existsById(bebida.getId())){
            log.warn("Trying to update a non existent drink");
            return ResponseEntity.notFound().build();
        }

        Bebida result = bebidaRepository.save(bebida);
        return ResponseEntity.ok(result);
    }


    /**
     * Eliminar una bebida de la base de datos mediante su id
     * http://localhost:8080/api/bebidas/1
     * @param id
     * @return
     */
    @DeleteMapping("/api/bebidas/{id}")
    public ResponseEntity<Bebida> delete(@PathVariable Long id){

        if(!bebidaRepository.existsById(id)){
            log.warn("Trying to delete a non existent drink");
            return ResponseEntity.notFound().build();
        }
        bebidaRepository.deleteById(id);
        return  ResponseEntity.noContent().build();
    }


    /**
     * Eliminar todas las bebidas de la base de datos
     * http://localhost:8080/api/bebidas
     * @return
     */

    @DeleteMapping("/api/bebidas")
    public ResponseEntity<Bebida> deleteAll(){
        log.info("REST Request for delete all drinks");
        bebidaRepository.deleteAll();
        return ResponseEntity.noContent().build();
    }

}
