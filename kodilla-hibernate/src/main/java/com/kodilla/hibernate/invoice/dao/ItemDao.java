package com.kodilla.hibernate.manytomany.dao;

import com.kodilla.hibernate.invoice.dao.Item;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Transactional
@Repository
public interface ItemDao extends CrudRepository<Item, Integer> {
}
