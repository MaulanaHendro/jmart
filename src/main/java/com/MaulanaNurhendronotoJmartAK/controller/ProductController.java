package com.MaulanaNurhendronotoJmartAK.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.MaulanaNurhendronotoJmartAK.Algorithm;
import com.MaulanaNurhendronotoJmartAK.Jmart;
import com.MaulanaNurhendronotoJmartAK.Payment;
import com.MaulanaNurhendronotoJmartAK.Product;
import com.MaulanaNurhendronotoJmartAK.ProductCategory;
import com.MaulanaNurhendronotoJmartAK.dbjson.JsonAutowired;
import com.MaulanaNurhendronotoJmartAK.dbjson.JsonTable;

@RestController
@RequestMapping("/product")
public class ProductController implements BasicGetController<Product>
{
    @JsonAutowired(filepath = "C:\\Users\\USER\\Documents\\Hendro\\Java Programming BlueJ\\jmart\\product.json", value = Product.class)
    public static JsonTable<Product> productTable;

   
    @Override
    public JsonTable<Product> getJsonTable() {
        return productTable;
    }

    
    @GetMapping("/{id}/store")
    @ResponseBody
    List<Product> getProductByStore
            (
                    @RequestParam int id,
                    @RequestParam int page,
                    @RequestParam int pageSize
            )
    {
        return Algorithm.paginate(productTable, page, pageSize, pred -> pred.accountId == id);
    }

    @PostMapping("/create")
    @ResponseBody
    Product create
            (
                    @RequestParam int accountId,
                    @RequestParam String name,
                    @RequestParam int weight,
                    @RequestParam boolean conditionUsed,
                    @RequestParam double price,
                    @RequestParam double discount,
                    @RequestParam ProductCategory category,
                    @RequestParam byte shipmentPlans
            )
    {
        for (Product each : productTable)
        {
            if (each.accountId == accountId)
            {
                Product product = new Product(accountId, name, weight, conditionUsed, price, discount, category, shipmentPlans);
                productTable.add(product);
                return product;
            }
        }
        return null;
    }

    @GetMapping("/getFiltered")
    @ResponseBody
    List<Product> getProductByFilter
            (
                    @RequestParam int page,
                    @RequestParam int pageSize,
                    @RequestParam int accountId,
                    @RequestParam String search,
                    @RequestParam int minPrice,
                    @RequestParam int maxPrice,
                    @RequestParam ProductCategory category
            )
    {
        List<Product> tempProduct = null;

        for (Product each : productTable)
        {
            if (each.accountId == accountId)
                if (each.name.contains(search))
                    if (minPrice <= each.price)
                        if (maxPrice >= each.price)
                            if (each.category == category)
                                tempProduct.add(each);
        }
        return tempProduct;
    }
}
