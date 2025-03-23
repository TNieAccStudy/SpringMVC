/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tnieyu.repositories.impls;

import com.tnieyu.pojo.Category;
import com.tnieyu.repositories.CategoryRepository;
import jakarta.data.repository.Repository;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;

/**
 *
 * @author admin
 */
@Repository
public class CategoryRepositoryImpl implements CategoryRepository{
    
    @Autowired
    private LocalSessionFactoryBean sFactory;

    @Override
    public List<Category> getCates() {
        Session s = sFactory.getObject().getCurrentSession();
        
        Query<Category> q = s.createQuery("SELECT * FROM Category", Category.class);
        return q.getResultList();
    }
    
}
