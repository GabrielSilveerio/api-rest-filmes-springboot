package com.senai.Flixs.service;

import com.senai.Flixs.dto.TitulosCadastroDTO;
import com.senai.Flixs.model.Titulos;
import com.senai.Flixs.repository.TitulosRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TitulosService {
    private final TitulosRepository titulosRepository;
    @Autowired
    public TitulosService(TitulosRepository titulosRepository) {
        this.titulosRepository = titulosRepository;
    }
    public Titulos salvarTitulos(TitulosCadastroDTO titulosDTO){
        Titulos titulo = new Titulos();
        BeanUtils.copyProperties(titulosDTO, titulo);
        return titulosRepository.save(titulo);

    }
    public List<Titulos> buscarTitulos(){
        return titulosRepository.findAll();

    }
    public Titulos atualizarTitulos(Titulos novoTitulo, Long id){
        Titulos titulo = titulosRepository.findById(id).orElseThrow(() ->
            new RuntimeException("Não Encontrado")
        );
        BeanUtils.copyProperties(novoTitulo, titulo);
        return titulosRepository.save(titulo);
    }

    public void deletarTitulos(Long id){
        titulosRepository.findById(id).orElseThrow(() -> new RuntimeException("Não Encontrado"));
        titulosRepository.deleteById(id);
    }
}
