package com.example.restoranteostrovskybettini.Controller;

import com.example.restoranteostrovskybettini.Entity.Bebida;
import com.example.restoranteostrovskybettini.Interface.BebidaService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class BebidaDosController {

    private BebidaService bebidaService;

    public BebidaDosController(BebidaService bebidaService){
        this.bebidaService = bebidaService;
    }


    @GetMapping("/bebidas")
    public String listarTodasLasBebidas(Model modelo){
        modelo.addAttribute("bebidas",bebidaService.listarTodasLasBebidas());
        return "/bebidas/bebidas";  //retorna un html bebidas
    }

    @GetMapping("/bebidas/nueva")
    public String mostrarFormularioBebidaNueva(Model modelo){
        Bebida bebida = new Bebida();
        modelo.addAttribute("bebida", bebida);
        return "/bebidas/crear_bebida";
    }

    @PostMapping("/bebidas")
    public String guardarBebidas(@ModelAttribute("bebida") Bebida bebida){
        bebidaService.guardarBebida(bebida);
        return "redirect:/bebidas";
    }

    @GetMapping("/bebidas/editar/{id}")
    public String mostrarFormularioEditarBebida(@PathVariable Long id, Model modelo){
        modelo.addAttribute("bebida",bebidaService.obtenerBebidaPorId(id));
        return "/bebidas/editar_bebida";
    }

    @PostMapping("/bebidas/{id}")
    public String actualizarBebida(@PathVariable Long id, @ModelAttribute("bebida") Bebida bebida, Model modelo){
        Bebida bebidaExistente = bebidaService.obtenerBebidaPorId(id);
        bebidaExistente.setId(id);
        bebidaExistente.setNombre(bebida.getNombre());
        bebidaExistente.setPrecio(bebida.getPrecio());
        bebidaExistente.setCategoriaBebida(bebida.getCategoriaBebida());

        bebidaService.actualizarBebida(bebidaExistente);
        return "redirect:/bebidas";
    }

    @GetMapping("/bebidas/{id}")
    public String eliminarBebida(@PathVariable Long id){
        bebidaService.eliminarBebida(id);
        return "redirect:/bebidas";
    }

}
