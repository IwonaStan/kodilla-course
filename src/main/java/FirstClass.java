public class FirstClass {
    public static void main(String[] args) {

        Notebook notebook = new Notebook(600, 500, 1989);
        System.out.println (notebook.weight+"g"+ " price:"+notebook.price +" year:"+ notebook.year);
        notebook.checkPrice();
        notebook.checkWeight();
        notebook.checkPurchase();
        System.out.println();

        Notebook havynotebook = new Notebook(1200, 800, 1995);
        System.out.println (havynotebook.weight+"g"+ " price:"+havynotebook.price +" year:"+ havynotebook.year);
        havynotebook.checkPrice();
        havynotebook.checkWeight();
        havynotebook.checkPurchase();
        System.out.println();

        Notebook oldnotebook = new Notebook(1800,1100,2001);
        System.out.println(oldnotebook.weight+"g"+ " price:"+oldnotebook.price +" year:"+ oldnotebook.year);
        oldnotebook.checkPrice();
        oldnotebook.checkWeight();
        oldnotebook.checkPurchase();
    }

}

