
public interface ITradeGoods{

  String getType();

}

  class Thing implements ITradeGoods{

    private String name;
    private String type;

    public Thing(String name, String type){
        if(name.equals(null) && type.equals(null))
            throw new IllegalArgumentException("Значения не могут быть null");

        this.name = name;
        this.type = type;
    }

    @Override
    public String getType(){

        Thing th = new Thing(name,type);

        return th.type;
    }

  }
  class TradeGoodsService{
    static Integer
  }