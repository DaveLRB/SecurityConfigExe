package com.secExe.secu.SecService;

import com.secExe.secu.SecRepository.SecRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class SecService {

    private final SecRepository repository;

}
