package OOPS.inheritence;

public class BoxPrice extends BoxWeight{
    int price;
    public BoxPrice(){
        this.price = -1;
    }

    public BoxPrice(double l, double h, double w, double weight, int price){
        super(l,h,w,weight);
    }


}
