import java.util.ArrayList;

public class Hewan {
    public static void main(String[] args) {
        ArrayList hewan = new ArrayList();

        hewan.add("Sapi");
        hewan.add("Kelinci");
        hewan.add("Kambing");
        hewan.add("Unta");
        hewan.add("Domba");
        System.out.println(hewan);

        hewan.remove("Kelinci");
        hewan.remove("Kambing");
        hewan.remove("Unta");

        ArrayList<String> hewan2 = new ArrayList<>();
        hewan2.add("Kelinci");
        hewan2.add("Kambing");
        hewan2.add("Unta");
        System.out.println("Hewan yang dihapus : \n" + hewan2);


        System.out.println("output hewan : ");
        System.out.println(hewan);



    }



}
