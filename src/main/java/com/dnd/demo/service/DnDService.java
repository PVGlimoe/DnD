package com.dnd.demo.service;

import com.dnd.demo.data.repository.DnDDAO;
import org.springframework.stereotype.Service;

@Service
public class DnDService {

    private final DnDDAO dnDDAO;

    public DnDService(DnDDAO dnDDAO) {
        this.dnDDAO = dnDDAO;
    }
}
