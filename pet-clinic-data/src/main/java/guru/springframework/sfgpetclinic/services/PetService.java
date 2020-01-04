package guru.springframework.sfgpetclinic.services;

import guru.springframework.sfgpetclinic.model.Pet;

public interface PetService extends CrudService<Pet, Long> {

    // All of these are inherited from CrudService<T, ID>
    //Pet findById(Long id);
    //Pet save(Pet pet);
    //Set<Pet> findAll();
}
