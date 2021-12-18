package com.MaulanaNurhendronotoJmartAK.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

import com.MaulanaNurhendronotoJmartAK.Algorithm;
import com.MaulanaNurhendronotoJmartAK.dbjson.JsonTable;
import com.MaulanaNurhendronotoJmartAK.dbjson.Serializable;

@RestController
@RequestMapping
public interface BasicGetController<T extends Serializable>
{
    public abstract JsonTable <T> getJsonTable();

    @GetMapping("/page")
    default List <T> getPage(int page, int pageSize)
    {
        final JsonTable<T> table = getJsonTable();
        return Algorithm.paginate(table,page,pageSize, o->true);
    }
  
    @GetMapping("/{id}")
    default T getById
            (
                    @PathVariable int id
            )
    {
        return Algorithm.<T>find(getJsonTable(),e->e.id == id);
    }
}
