public class TeacherCreditManager extends BaseCreditManager implements  ICreditManager{
    @Override
    public void calculate() {
        System.out.println("Öğretmen kredisi hesaplandı.");
    }
    @Override
    public void save(){
        System.out.println("Öğretmen Kredisi Kaydedildi.");
    }
}
