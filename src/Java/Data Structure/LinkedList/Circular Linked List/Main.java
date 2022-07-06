public class Main {
    public static void main(String [] args){
  // CLL
        CLL listCLL = new CLL();
        listCLL.addCLL(1);
        listCLL.addCLL(2);
        listCLL.addCLL(3);
        listCLL.addCLL(4);
        listCLL.display();
        System.out.println();
        listCLL.deleteCLL(2);
        listCLL.display();

}
}