package com.matias.mi_primer_api.rest.service.impl;

import com.matias.mi_primer_api.rest.model.dao.ClienteDao;
import com.matias.mi_primer_api.rest.model.dto.ClienteDto;
import com.matias.mi_primer_api.rest.model.entity.Cliente;
import com.matias.mi_primer_api.rest.service.ICliente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

//Aca vive la logica real del cliente

@Service //Le dice a Spring que esta clase pertenece al negocio
public class ClienteImpl implements ICliente {

    @Autowired
    private ClienteDao clienteDao;

    @Transactional
    @Override
    public ClienteDto save(ClienteDto clienteDto) {
        //Del postaman envia un JSON y el controller lo recibe como DTO
        //Aca convertimos ese DTO a Entity  porque el DAO solo entiende entidades
        //Convertimos DTO -> Entity para que el DAO la entienda
        Cliente cliente = Cliente.builder().idCliente(clienteDto.getIdCliente())
                .nombre(clienteDto.getNombre())
                .apellido(clienteDto.getApellido())
                .correo(clienteDto.getCorreo())
                .fechaRegistro(clienteDto.getFechaRegistro()).
                build();
        //Guardamos en la db
        Cliente clienteSaved = clienteDao.save(cliente);
        //Convertimos la entity guardada -> DTO para responderle al controller
        return ClienteDto.builder()
                .idCliente(clienteSaved.getIdCliente())
                .nombre(clienteSaved.getNombre())
                .apellido(clienteSaved.getApellido())
                .correo(clienteSaved.getCorreo())
                .fechaRegistro(clienteSaved.getFechaRegistro())
                .build();
    }

    @Transactional(readOnly = true) //Se usa solo en busquedas
    @Override
    public ClienteDto findById(Integer id) {
        // Buscamos la Entity en la DB
        Cliente cliente = clienteDao.findById(id).orElse(null);

        // Si no existe, devolvemos null (para evitar errores al buildear)
        if (cliente == null) {
            return null;
        }
        // Si existe, la convertimos a DTO y la devolvemos
        return ClienteDto.builder()
                .idCliente(cliente.getIdCliente())
                .nombre(cliente.getNombre())
                .apellido(cliente.getApellido())
                .correo(cliente.getCorreo())
                .fechaRegistro(cliente.getFechaRegistro())
                .build();
    }

    @Transactional
    @Override
    public void delete(ClienteDto clienteDto) {
        Cliente cliente = Cliente.builder()
                .idCliente(clienteDto.getIdCliente())
                .build();
        clienteDao.delete(cliente);
    }
}
