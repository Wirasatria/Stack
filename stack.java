package stack_tugas;

  import java.sql.SQLOutput;
public class stack {
  
    String data[];
    int top;

    public stack(int jmlh) {
        data = new String[jmlh];
        top = -1;
    }

    public void push(String Pakaian){
        if(top < data.length-1){
            top++;
            data[top] = Pakaian;
        } else{
            System.out.println("Lemari anda Sudah Penuh");
        }
    }

    public String pop(){
        if (top >= 0){
            String temp = data[top];
            top--;
            return temp;
        } else{
            System.out.println("Lemari anda Kosong");
        }
        return "";
    }

    public void cetak(){
        System.out.println(" Rak lemari Pakaian");
        System.out.println("=====================================");
        for (int i = data.length-1; i >= 0  ; i--) {
            System.out.println(data[i] + "");
        }
    }

    public String cari(String baju){
        System.out.println("Mencari  : " + baju);
        for (int i = data.length-1; i >= 0; i--) {
            if (data[i] == baju){
                return "ada di rak lemari ke " + (i+1);
            }
        }
        return "Belum dicuci";
    }


}


