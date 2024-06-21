package com.spring.product.Controller;


import com.spring.product.Entity.Product;
import com.spring.product.Service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping("/indexx")
    public String start(){
        return "indexx";}

    @GetMapping("/addProduct")
    public String addProductSheet(Model model){
        model.addAttribute("product",new Product());
        return "addProduct";
    }
    @PostMapping("addProduct")
    public String addProduct(@ModelAttribute Product product){
        productService.saveProduct(product);
        return "redirect:/";
    }

    @GetMapping("/display-products")
    public String displayProducts(Model model, @RequestParam(required = false) String category) {
        List<Product> products;
        if (category != null && !category.isEmpty()) {
            products = productService.getProductByCategory(category);
        } else {
            products = productService.getAll();
        }
        model.addAttribute("products", products);
        return "display-products";
    }


}
