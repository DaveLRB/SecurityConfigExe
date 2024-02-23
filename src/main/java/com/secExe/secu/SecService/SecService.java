package com.secExe.secu.SecService;

import com.secExe.secu.SecEntity.SecEntity;
import com.secExe.secu.SecRepository.SecRepository;
import com.secExe.secu.SecRole.SecRole;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@AllArgsConstructor
@Service
public class SecService {

    @Autowired
    private final SecRepository repository;

    public List<SecEntity> getAll(){
        return repository.findAll();
    }

    public SecEntity create(SecEntity ent){
        SecEntity entity = new SecEntity(ent.getUsername(),ent.getPassword(), SecRole.USER);
        repository.save(entity);
        return entity;
    }
}
