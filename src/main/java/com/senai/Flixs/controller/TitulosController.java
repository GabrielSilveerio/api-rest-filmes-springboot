package com.senai.Flixs.controller;
import com.senai.Flixs.dto.TitulosCadastroDTO;
import com.senai.Flixs.model.Titulos;
import com.senai.Flixs.service.TitulosService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/titulos")
public class TitulosController {

    @Autowired
    private final TitulosService titulosService;

    public TitulosController(TitulosService titulosService) {
        this.titulosService = titulosService;
    }

    @GetMapping
    public List<Titulos> buscarTitulos(){
        return titulosService.buscarTitulos();
    }
    @GetMapping("/terror")
    public String pegarFilmesTerror(){
        return "Terror";
    }
    @PostMapping
    public Titulos gravarTitulo(@RequestBody @Valid TitulosCadastroDTO titulosDTO){
        return titulosService.salvarTitulos(titulosDTO);

    }

    @PutMapping("/{id}")
    public Titulos atualizarTitulo(@RequestBody Titulos novoTitulos, @PathVariable Long id){
        return titulosService.atualizarTitulos(novoTitulos, id);
    }

    @DeleteMapping("/{id}")
    public void deletarTitulo(@PathVariable Long id){
        titulosService.deletarTitulos(id);

    }
}
