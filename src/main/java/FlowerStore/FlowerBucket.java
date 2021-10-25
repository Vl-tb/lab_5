package FlowerStore;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@ToString
public class FlowerBucket {
    private List<FlowerPack> flowerPackList = new ArrayList<FlowerPack>();

    public FlowerBucket(){
    }

    public void addFlowerPack(FlowerPack flowerPack){
        flowerPackList.add(flowerPack);
    }

    public double getPrice() {
        double price = 0.0;
        for (int i=0; i<flowerPackList.size(); i++){
            price += flowerPackList.get(i).getPrice();
        }
        return price;
    }
}
