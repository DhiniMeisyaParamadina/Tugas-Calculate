package LATIHAN;

public class Tugas {
    public static void main(String[] args) {
        //TODO
           Calculate p = new Calculate();
           p.setAngka1(8);
           p.setAngka2(9);
           p.addAllNumber();
           p.multiplyNumber();
        }
        public static class Calculate{
        private int angka1;
        private int angka2;

        public void setAngka1(int angka1){
            this.angka1 = angka1;
        }
        public void setAngka2(int angka2){
            this.angka2= angka2;
        }
        public void addAllNumber(){
            int sum= angka1 + angka2;
            System.out.println("Jumlah:" +sum);
        }
        public void multiplyNumber(){
            int product = angka1* angka2;
            System.out.println("Hasil kali:" +product);
        }
        }

    }

