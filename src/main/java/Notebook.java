public class Notebook {
    int weight;
    int price;
    int year;

    public Notebook(int weight, int price, int year) {
        this.weight = weight;
        this.price = price;
        this.year = year;
    }

    public void checkPrice() {
        if (this.price<=600) {System.out.println("This notebook is very cheap");}
        else if (this.price>600 && this.price<=1000) {System.out.println("The price is good");}
        else {System.out.println("This notebook is expensive"); }
    }

    public void checkWeight() {
        if (this.weight<=700) {System.out.println("This notebook is light");}
        else if (this.weight>700 && this.weight<=1400) {System.out.println("The notebook is not very heavy");}
        else {System.out.println("This notebook is heavy"); }
    }

    public void checkPurchase() {
        if (this.price<=600 && this.year<=1990) {System.out.println("This notebook is cheap but old");}
        else if (this.price>600 && this.year>1990 && this.price<=1000 && this.year<=2000)
        {System.out.println("Economical choice");}
        else {System.out.println("This notebook is expensive but new"); }
    }
}