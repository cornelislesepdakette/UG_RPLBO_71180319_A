public class TabunganKonvensional {
        private String pemilik;
        private double saldo;
        public void getSaldo(){
                System.out.println("saldo K_71180319" +saldo);
                System.out.println("saldo I_71180319" +saldo);
        }
        public void penarikan(double saldo){
                System.out.println("------Tabungan Konvensional-----" +saldo);
                System.out.println("Penyetoran Rp. " +saldo);
        }
        public void penyetoran(double saldo){
                System.out.println("-----tabungan Konvensional-----" +saldo);
                System.out.println("penarikan Rp." +saldo);

        }
}