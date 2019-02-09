package com.practice.ecommerce;

import com.practice.ecommerce.model.Product;
import com.practice.ecommerce.service.ProductService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class EcommerceApplication {

    public static void main(String[] args) {
        SpringApplication.run(EcommerceApplication.class, args);
    }

    @Bean
    CommandLineRunner runner(ProductService productService) {
        return args -> {
            productService.save(new Product(1L, "TV Set", 300.00, "http://pluspng.com/img-png/tv-hd-png-led-3214-specifications-621.png"));
            productService.save(new Product(2L, "Game Console", 200.00, "https://stmed.net/sites/default/files/xbox-hd-wallpapers-33922-8374148.jpg"));
            productService.save(new Product(3L, "Sofa", 100.00, "https://images-na.ssl-images-amazon.com/images/I/616NKn58urL._SX355_.jpg"));
            productService.save(new Product(4L, "Icecream", 5.00, "https://images7.alphacoders.com/391/391001.jpg"));
            productService.save(new Product(5L, "Beer", 3.00, "https://i.pinimg.com/originals/4f/91/28/4f9128668e0371f8df8312d21083ae41.jpg"));
            productService.save(new Product(6L, "Phone", 500.00, "http://www.pngmart.com/files/7/Mobile-Phone-PNG-Transparent-HD-Photo.png"));
            productService.save(new Product(7L, "Watch", 30.00, "http://hdwallpaperszone.net/thumbs/breitling-watches-t2.jpg"));
        };
    }
}
