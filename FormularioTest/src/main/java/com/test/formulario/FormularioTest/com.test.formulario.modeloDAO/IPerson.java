package com.test.formulario.FormularioTest.com.test.formulario.modeloDAO;

import com.test.formulario.FormularioTest.com.test.formulario.modelo.Persona;

import java.util.List;

public interface IPerson {

    public List<Persona>listar();
    public Persona listarPersonaId(int id);
    public int agragar(Persona p);
    public int editar(Persona p);
    public void delete(int id);

}
