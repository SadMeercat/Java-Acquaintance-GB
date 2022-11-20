public class Main {
    public static void main(String[] args) {
        CreateGoods tmpGood = new CreateGoods();

        tmpGood.setCount(10);
        tmpGood.setName("MyGood");
        tmpGood.setPrice(10000.99);
        tmpGood.setDescription("It's my the first desc");

        Goods myGood = tmpGood.Create();
        myGood.print();
    }
}
