package org.sid.sportrent.web;


import org.sid.sportrent.dao.ProductRepository;
import org.sid.sportrent.entities.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
@CrossOrigin("*")
@RestController
public class CatalogueRestController {

    private ProductRepository productRepository;
    @Autowired
    public CatalogueRestController(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }
    @GetMapping(path="/photoProduct/{id}", produces = MediaType.IMAGE_PNG_VALUE)

    //public byte[] getPhoto(@PathVariable("id") Long id) throws Exception{
       // Product p = productRepository.findById(id).get();
        //String filename="sport.png";
        //Path pathToFile = Paths.get(filename);
         //System.out.println(pathToFile.toAbsolutePath());
        //return  Files.readAllBytes(Paths.get( "/Users/macoscatalina/Desktop/ecom-web/node_modules/useragent/Ecom/products" + p.getPhotoName()));
        //return  Files.readAllBytes(Paths.get("https://drive.google.com/drive/folders/1HSLk9usprqj_4kEEaD8ZlNHGvsMICLBr?hl=fr/sport.png")); }
    @PostMapping(path="/uploadPhoto/{id}")
    public void uploadPhoto(MultipartFile file ,@PathVariable Long id ) throws Exception{
        Product p = productRepository.findById(id).get();
        p.setPhotoName(file.getOriginalFilename());
        Files.write(Paths.get("/Users/macoscatalina/Desktop/PI/ecom-web/node_modules/useragent/Ecom/products/"+p.getPhotoName()),file.getBytes());
        productRepository.save(p);
    }


}
