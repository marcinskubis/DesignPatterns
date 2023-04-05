public class TreasureChestItemIterator implements Iterator<Item> {
    public TreasureChest tc;
    public ItemType type;
    public int index;
    public TreasureChestItemIterator(TreasureChest tc,ItemType type){
        this.tc=tc;
        this.type=type;
    }

    @Override
    public boolean hasNext() {
        while(index<tc.getItems().size()){
            Item x = tc.getItems().get(index);
            if(x.getType().equals(type) || type.equals(ItemType.ANY)){
                return true;
            }else{
                index++;
            }
        }
        return false;
    }

    @Override
    public Item next() {
        Item x = tc.getItems().get(index);
        index++;
        return x;
    }
}
