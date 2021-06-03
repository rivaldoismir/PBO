package pratikum11.kendaraan;

public class Sepeda extends Kendaraan{
    private boolean isAuto;

    @Override
    public void nyalakan() {
        System.out.println("Sepeda disiapkan");
    }

    public Sepeda(boolean isAuto) {
        this.isAuto = isAuto;
    }
    public void jenis() {
        System.out.println(isAuto == true ? "Sepeda Otomatis" : "Sepeda Kayuh");
    }
}
