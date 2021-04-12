package com.test.formulario.FormularioTest.com.test.formulario.modeloDAO;

import com.test.formulario.FormularioTest.com.test.formulario.modelo.Persona;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class PersonaDAO implements  IPerson{

    @Autowired
    private JdbcTemplate template;

    @Override
    public List<Persona> listar() {
        String sql="select * from persona";
        List<Persona>personas=template.query(sql, new BeanPropertyRowMapper<Persona>(Persona.class));
        return personas;
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
