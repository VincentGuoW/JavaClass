package May2024.Class12;

public class ProductInfo {
    private int id;
    private String name;
    private int price;
    private int stock;

    public ProductInfo(){
    }
    public ProductInfo(int id,String name,int price,int stock){
        setId(id);
        setName(name);
        setPrice(price);
        setStock(stock);
    }
    public void setId(int id){this.id=id;}
    public int getId(){return this.id;}

    public void setName(String name){this.name=name;}
    public String getName(){return this.name;}

    public void setPrice(int price){this.price=price;}
    public int getPrice(){return this.price;}

    public void setStock(int stock){this.stock=stock;}
    public int getStock(){return this.stock;}

}
