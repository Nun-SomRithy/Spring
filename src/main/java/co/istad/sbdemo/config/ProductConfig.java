package co.istad.sbdemo.config;


import co.istad.sbdemo.model.Product;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class ProductConfig {
    @Bean("iphone")
    @Primary
    public Product iphone(){

        Product product= new Product();
        product.setModel("iphone");
        return product;
    }


    @Bean("samsung")
    public Product samsung(){
        Product product=new Product();
        product.setModel("samsung");
        return product;
    }
}
