public class SLLMain01 {
     public static void main(String[] args) {
        Mahasiswa01 mhs1 = new Mahasiswa01("6345", "Dirga", "1E", 3.6);
        Mahasiswa01 mhs2 = new Mahasiswa01("3465", "Noli", "4D", 3.6);
        Mahasiswa01 mhs3 = new Mahasiswa01("9821", "Tony", "3A", 3.6);
        Mahasiswa01 mhs4 = new Mahasiswa01("8745", "Sinti", "3S", 3.6);
        SingleLinkedList01 sll = new SingleLinkedList01();
        sll.print();
        sll.addfirst(mhs4);
        sll.print();
        sll.addlast(mhs1);
        sll.print();
        sll.insertAfter(sll.head.data.nama, mhs3);
        sll.insertAt(2, mhs2);
        sll.print();
        System.out.println("data index 1 : ");
        sll.getData(1);
        System.out.println("Data mahasiswa an Tony berada pada index: "+sll.indexOf("Tony"));
        System.out.println();
        sll.removeFirst();
        sll.removeLast();
        sll.print();
        sll.removeAt(0);
        sll.print();

     }
}