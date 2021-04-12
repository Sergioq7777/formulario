package com.test.formulario.FormularioTest.service;

import com.test.formulario.FormularioTest.com.test.formulario.modelo.Persona;
import com.test.formulario.FormularioTest.com.test.formulario.modeloDAO.IPerson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonaService implements  IPersonaService{

    @Autowired
    private IPerson dao;


    @Override
    public List<Persona> listar() {
        return dao.listar();
    }

    @Override
    public Persona listarPersonaId(int id) {
        return null;
    }

    @Override
    public int agragar(Persona p) {
        return 0;
    }

    @Override
    public int editar(Persona p) {
        return 0;
    }

    @Override
    public void delete(int id) {

    }
}
