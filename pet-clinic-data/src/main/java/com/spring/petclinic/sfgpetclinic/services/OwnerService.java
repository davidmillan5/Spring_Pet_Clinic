package com.spring.petclinic.sfgpetclinic.services;

import com.spring.petclinic.sfgpetclinic.model.Owner;

public interface OwnerService extends CrudService<Owner,Long> {

    Owner findByLastName(String lastName);


}
