package guru.springframework.sfgpetclinic.services;

import guru.springframework.sfgpetclinic.model.Vet;

public interface VetService extends CrudService<Vet, Long>{

    // All of these are inherited from CrudService<T, ID>
    //Vet findById(Long id);
    //Vet save(Vet vet);
    //Set<Vet> findAll();
}
