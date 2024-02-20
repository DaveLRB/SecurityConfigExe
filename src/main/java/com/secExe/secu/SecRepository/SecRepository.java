package com.secExe.secu.SecRepository;

import com.secExe.secu.SecEntity.SecEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SecRepository extends JpaRepository<SecEntity,Long> {

}
