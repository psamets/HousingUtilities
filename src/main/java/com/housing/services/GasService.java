package com.housing.services;

import com.housing.dao.GasDAO;
import com.housing.entities.Gas;
import com.housing.entities.Item;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * User: Pavel
 * Date: 1/22/16
 */

@Service
public class GasService implements AbstractService<Gas> {

    @Autowired
    private GasDAO gasDAO;


    @Override
    public Gas create(Gas element) {
        calculate(element);
        return gasDAO.save(element);
    }

    @Override
    public Gas modify(Gas element) {
        return create(element);
    }

    @Override
    public void delete(Gas element) {
        gasDAO.delete(element);
    }

    @Override
    public void calculate(Gas element) {

    }
}
