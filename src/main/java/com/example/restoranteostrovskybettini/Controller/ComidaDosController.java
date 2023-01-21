package com.example.restoranteostrovskybettini.Controller;

import com.example.restoranteostrovskybettini.Entity.Comida;
import com.example.restoranteostrovskybettini.Interface.BebidaService;
import com.example.restoranteostrovskybettini.Interface.ComidaService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ComidaDosController {

    private ComidaService comidaService;

    public ComidaDosController(ComidaService comidaService){

        this.comidaService = comidaService;
    }


    @GetMapping("/comidas")
    public String listarTodasLasComidas(Model modelo){
        modelo.addAttribute("comidas",comidaService.listarTodasLasComidas());
        return "/comidas/comidas";  //retorna un html comidas
    }

    @GetMapping("/comidas/nueva")
    public String mostrarFormularioComidaNueva(Model modelo){
        Comida comida = new Comida();
        modelo.addAttribute("comida", comida);
        return "/comidas/crear_comida";
    }

    @PostMapping("/comidas")
    public String guardarComidas(@ModelAttribute("comida") Comida comida){
        comidaService.guardarComida(comida);
        return "redirect:/comidas";
    }

    @GetMapping("/comidas/editar/{id}")
    public String mostrarFormularioEditarComida(@PathVariable Long id, Model modelo){
        modelo.addAttribute("comida",comidaService.obtenerComidaPorId(id));
        return "/comidas/editar_comida";
    }

    @PostMapping("/comidas/{id}")
    public String actualizarComida(@PathVariable Long id, @ModelAttribute("comida") Comida comida, Model modelo){
        Comida comidaExistente = comidaService.obtenerComidaPorId(id);
        comidaExistente.setId(id);
        comidaExistente.setNombre(comida.getNombre());
        comidaExistente.setPrecio(comida.getPrecio());

        comidaService.actualizarComida(comidaExistente);
        return "redirect:/comidas";
    }

    @GetMapping("/comidas/{id}")
    public String eliminarComida(@PathVariable Long id){
        comidaService.eliminarComida(id);
        return "redirect:/comidas";
    }

}
