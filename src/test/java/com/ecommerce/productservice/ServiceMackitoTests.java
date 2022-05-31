package com.ecommerce.productservice;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;

import com.ecommerce.productservice.model.Products;
import com.ecommerce.productservice.repository.ProductRepository;
import com.ecommerce.productservice.service.ProductService;
import com.ecommerce.productservice.serviceimplementation.ProductServiceImplementation;

@SpringBootTest(classes = { ServiceMackitoTests.class })
public class ServiceMackitoTests {

	@Mock
	ProductRepository productrepository;

	@InjectMocks
	ProductService productService = new ProductServiceImplementation();

	@Test
	@Order(1)
	void test_listProduct() {
		List<Products> product = new ArrayList<Products>();
		product.add(new Products("123abc", "redmi9", 12000, 3000,
		        "https://encrypted-tbn1.gstatic.com/shopping?q=tbn:ANd9GcS8fljsMS_VIN21njkrpKvyk0AMK4QLQqIugwP1UVUm1cqWGymOhiaDAPTz6Q7a&usqp=CAc",
				"ram 2gb,internal:16gb,camera:16mp", "123ase"));
		product.add(new Products("983abc", "redmi7", 11000, 2000,
				"https://encrypted-tbn1.gstatic.com/shopping?q=tbn:ANd9GcS8fljsMS_VIN21njkrpKvyk0AMK4QLQqIugwP1UVUm1cqWGymOhiaDAPTz6Q7a&usqp=CAc",
				"ram:2gb,internal:8gb,camera:16mp", "187rda"));
		when(productrepository.findAll()).thenReturn(product);// mocking
		assertEquals(2, productService.getallcategories().size());
	}

	@Test
	@Order(2)
	void test_getProductsbyproductId() {
		Products product = new Products("123abc", "redmi9", 12000, 3000,
		        "https://encrypted-tbn1.gstatic.com/shopping?q=tbn:ANd9GcS8fljsMS_VIN21njkrpKvyk0AMK4QLQqIugwP1UVUm1cqWGymOhiaDAPTz6Q7a&usqp=CAc",
				"ram 2gb,internal:16gb,camera:16mp", "123ase");
	String id="123abc";
	when(productrepository.findById(id)).thenReturn(Optional.ofNullable(product));
		assertEquals(product, productService.getProductsbyproductId(id));
	}
	@Test
	@Order(5)
	void test_getProductsbyCategoryId() {
		List<Products> product = new ArrayList<Products>();
		product.add(new Products("123abc", "redmi9pro", 12000, 3000,
		        "https://encrypted-tbn1.gstatic.com/shopping?q=tbn:ANd9GcS8fljsMS_VIN21njkrpKvyk0AMK4QLQqIugwP1UVUm1cqWGymOhiaDAPTz6Q7a&usqp=CAc",
				"ram 2gb,internal:16gb,camera:16mp", "123ase"));
		product.add(new Products("983abc", "redmi7pro", 11000, 2000,
				"https://encrypted-tbn1.gstatic.com/shopping?q=tbn:ANd9GcS8fljsMS_VIN21njkrpKvyk0AMK4QLQqIugwP1UVUm1cqWGymOhiaDAPTz6Q7a&usqp=CAc",
				"ram:2gb,internal:8gb,camera:16mp", "187rda"));
		String id="983abc";
		when(productrepository.findBycategoryId(id)).thenReturn(product);// mocking
		assertEquals(2, productService.getProductsbyCategoryId(id).size());
	}
	
	@Test
	@Order(3)
	void test_EditProductId() {
		Products product = new Products("123abc", "redmi9", 10000, 2000,
		        "https://encrypted-tbn1.gstatic.com/shopping?q=tbn:ANd9GcS8fljsMS_VIN21njkrpKvyk0AMK4QLQqIugwP1UVUm1cqWGymOhiaDAPTz6Q7a&usqp=CAc",
				"ram 2gb,internal:16gb,camera:16mp", "123ase");
	String id="123hdgf";
	when(productrepository.findById(id)).thenReturn(Optional.ofNullable(product));
	product.setProductName("redmi 10 pro");
	product.setProductdescription("ram 6gb,internal:32gb,camera:8mp");
	product.setImage("https://www.google.com/aclk?sa=L&ai=DChcSEwj1nuzttP_3AhWRMysKHVuiA6oYABAJGgJzZg&sig=AOD64_1_oBQTqQFIwgnSHdyuSCnXsdXnNg&adurl&ctype=5&ved=2ahUKEwilntrttP_3AhVsLrcAHfGgAmAQvhd6BAgBEF4");
	product.setRegularPrice(14999);
	product.setDiscountPrice(13999);
	when(productrepository.save(product)).thenReturn(product);
	assertEquals(product,productService.EditProductId(id,product));
	}

    @Test
	@Order(6)
    
    void test_createcategory() {
    Products product = new Products("123abc", "redmi9", 10000, 2000,
	        "https://encrypted-tbn1.gstatic.com/shopping?q=tbn:ANd9GcS8fljsMS_VIN21njkrpKvyk0AMK4QLQqIugwP1UVUm1cqWGymOhiaDAPTz6Q7a&usqp=CAc",
			"ram 2gb,internal:16gb,camera:16mp", "123ase");
	when(productrepository.save(product)).thenReturn(product);
	assertEquals(product,productService.createcategory(product));
}

	@Test
	@Order(4)
	public void deleteProductData() {
	String id = "983abc" ;

	productService.deleteProductData(id);
	verify(productrepository, times(1)).deleteById(id);
	}
	
	
	}



