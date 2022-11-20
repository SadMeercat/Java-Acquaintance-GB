public class CreateGoods {
    Goods temp;

    public CreateGoods(){
        temp = new Goods();
        temp.count = -1;
        temp.name = "--";
        temp.price = -1;
        temp.description = "--";
    }

    //#region
    
    public CreateGoods setCount(int count){
        temp.count = count;
        return this;
    }

    public CreateGoods setName(String name){
        temp.name = name;
        return this;
    }

    public CreateGoods setPrice(double price){
        temp.price = price;
        return this;
    }

    public CreateGoods setDescription(String desc){
        temp.description = desc;
        return this;
    }

    //#endregion

    public Goods Create(){
        return temp;
    }
}
