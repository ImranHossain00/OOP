package inheritance;


import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

class Domain {
    Long id;
    Integer version;
    LocalDateTime date_created;
    LocalDateTime date_last_updated;
}
// ===================================================================
// Type #1 - Single level inheritance
// Classes Customer and Product are inherited
// the properties of the Domain class.
class Customer extends Domain{
    static Integer versionCount = 1;
    static Long idCont = 1L;
    String fullName;
    String username;
    String password;

    Customer() {}
    public Customer(String fullName,
                    String username,
                    String password) {
        this.fullName = fullName;
        this.username = username;
        this.password = password;
        this.id = idCont++;
        this.version = versionCount++;
        this.date_created = LocalDateTime.now();
        this.date_last_updated = LocalDateTime.now();
    }

    @Override
    public String toString() {
        return "Customer{" +
                "\nfullName='" + fullName + '\'' +
                ", \nusername='" + username + '\'' +
                ", \npassword='" + password + '\'' +
                ", \nid=" + id +
                ", \nversion=" + version +
                ", \ndate_created=" + date_created +
                ", \ndate_last_updated=" + date_last_updated +
                "\n}";
    }
}

// ===================================================================
// Type #2 - Multi level inheritance
class CustomerDTO extends Customer {
    String confirmPassword;
    String firstName;
    String lastName;
}

// ===================================================================
// Type #3 - Hierarchy inheritance
// super class Domain have multiple subclasses.
class Product extends Domain{
    static Long idCount = 1L;
    static Integer versionCount = 1;

    private String name;
    private String description;
    private BigDecimal price;

    public Product(String name,
                   String description,
                   BigDecimal price) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.id = idCount++;
        this.version = versionCount++;
        this.date_created = LocalDateTime.now();
        this.date_last_updated = LocalDateTime.now();
    }

    @Override
    public String toString() {
        return "Product{" +
                "\nname='" + name + '\'' +
                ", \ndescription='" + description + '\'' +
                ", \nprice=" + price +
                ", \nid=" + id +
                ", \nversion=" + version +
                ", \ndate_created=" + date_created +
                ", \ndate_last_updated=" + date_last_updated +
                "\n}";
    }
}
class CustormerRepo {
    static List<Customer> customers = List.of(
            new Customer("Imran Hossain",
                    "imranHossin",
                    "pass1"),
            new Customer("Mihad Hossain",
                    "peripateic",
                    "pass2")
    );

    public static List<Customer> allCustomer() {
        return customers;
    }


}

class ProductRepo {
    static List<Product> PROCUTS = List.of(
            new Product(
                    "Iphone 6+",
                    "Black 1GB ram 6\" ",
                    BigDecimal.valueOf(299)
            ),
            new Product(
                    "Iphone 6+",
                    "White 12GB ram 12\" ",
                    BigDecimal.valueOf(333)
            )
    );

    public static List<Product> allProducts() {
        return PROCUTS;
    }
}

public class Example {
    public static void main(String[] args) {
        List<Customer> CUSTOMERS = CustormerRepo.allCustomer();
        System.out.println("==========================================================================");
        for (Customer custormer : CUSTOMERS) {
            System.out.println("Customer number: " + custormer.id);
            System.out.println(custormer);
            System.out.println();
        }

        List<Product> PRODUCTS = ProductRepo.allProducts();
        System.out.println("==========================================================================");
        for (Product product : PRODUCTS) {
            System.out.println("Product number: " + product.id);
            System.out.println(product);
            System.out.println();
        }
    }
}
