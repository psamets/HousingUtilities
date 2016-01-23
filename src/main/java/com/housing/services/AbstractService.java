package com.housing.services;

import com.housing.entities.Item;

/**
 * User: Pavel
 * Date: 1/22/16
 */

public interface AbstractService<Item> {

    public Item create(Item element);

    public Item modify(Item element);

    public void delete(Item element);

    public void calculate(Item element);

}
