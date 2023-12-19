package com.fsantana.fileuploadtest.api.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fsantana.fileuploadtest.domain.entity.Client;
import com.fsantana.fileuploadtest.infra.repository.ClientRepository;

import lombok.AllArgsConstructor;

@RestController()
@RequestMapping(path = "/clients")
@AllArgsConstructor
public class ClientController {

  private final ClientRepository clientRepository;

  @GetMapping
  public List<Client> allCliensts() {
    return this.clientRepository.findAll();
  }

  @PostMapping
  public Client saveClient(@RequestBody Client newClient) {

    return this.clientRepository.save(newClient);
  }
}
