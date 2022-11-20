public class Goods{
    public int count;
    public String name;
    public double price;
    public String description;

    public void print(){
        System.out.println(
            String.format(
                "%s %s %s %s",
                this.count,
                this.name,
                this.price,
                this.description
            ));
    }
}