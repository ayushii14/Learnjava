package Classes;

class Product {
    private String itemNo;
    private String name;
    private double price;
    private int qty;

    public Product(String itemno) {
        itemNo = itemno;
    }

    public Product(String itemno, String name) {
        itemNo = itemno;
        this.name = name;
    }

    public Product(String itemno, String name, double price, int qty) {
        itemNo = itemno;
        this.name = name;
        setPrice(price);
        setQuantity(qty);
    }

    public String getItemNo() {
        return itemNo;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return qty;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setQuantity(int qty) {
        if (qty >= 0) {
            this.qty = qty;
        } else
            this.qty = 0;
    }
}

class Customer {
    private String custId;
    private String name;
    private String address;
    private String phno;

    public Customer(String custId, String name) {
        this.custId = custId;
        this.name = name;
    }

    public Customer(String custId, String name, String address, String phno) {
        this.custId = custId;
        this.name = name;
        setAddress(address);
        setPhno(phno);
    }

    public String getCustId() {
        return custId;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getPhno() {
        return phno;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setPhno(String phno) {
        this.phno = phno;
    }
}

public class Constructors {
    public static void main(String[] args) {
        Product p = new Product("A2P4", "ayushi");
        p.setPrice(18);
        p.setQuantity(1);
        System.out.println("Details of the Product: ");
        System.out.println("Number: " + p.getItemNo());
        System.out.println("Name: " + p.getName());
        System.out.println("Price: " + p.getPrice());
        System.out.println("Quantity: " + p.getQuantity());

        System.out.println(" ");
        System.out.println();
        Customer c = new Customer("A2C4", "rommy");
        c.setAddress("Silicon city");
        c.setPhno("+91 9893733022");
        System.out.println("customer id: " + c.getCustId());
        System.out.println("Name: " + c.getName());
        System.out.println("Addrress: " + c.getAddress());
        System.out.println("Phone no.: " + c.getPhno());

    }
}
