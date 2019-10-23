package stack_tugas;


public class run_stack {
  
    public static void main(String[] args) {
        stack x = new stack(7);

        x.push("Kemeja");
        x.push("Kaos");
        x.push("Koko");
        x.push("Jubah");
        x.push("Jaket");
        x.push("Singlet");
        x.push("Sweater");

        x.cetak();

        System.out.println("========================================");
        System.out.println(x.cari("Jaket"));
    }
}


