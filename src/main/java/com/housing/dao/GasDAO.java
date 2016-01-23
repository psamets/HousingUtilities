package com.housing.dao;

import com.housing.entities.Gas;

import java.util.List;

/**
 * User: Pavel
 * Date: 1/22/16
 */
public interface GasDAO {

    Gas save(Gas element);

    void delete(Gas element);

    Gas getGasById(final long id);

}
