package guru.springframework.sfgpetclinic.services;

import guru.springframework.sfgpetclinic.model.Owner;

import java.util.List;

public interface OwnerService extends CrudService<Owner, Long> {

    Owner findByLastName(String lastName);

    List<Owner> findAllByLastNameLike(String lastName);

    // All of these are inherited from CrudService<T, ID>
    //Owner findById(Long id);
    //Owner save(Owner owner);
    //Set<Owner> findAll();
}
