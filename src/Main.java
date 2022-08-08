public class Main {
    public static void main(String[] args) {
      Balyk balyk =  new Balyk("Balyktun ",250000);
      String suu = balyk.getSuu();
      int jyl = balyk.getJyl();
      balyk.fish("Balykchy bugun",20);
        System.out.println(suu+jyl+" turloru bar!");

      Myshyk myshyk = new Myshyk("Myshyktyn Porodasy: ", (byte) 5);
      String cat = myshyk.getProda();
      byte let = myshyk.getJashy();
      myshyk.Koshka("Chychkan", (byte) 2);
        System.out.println(cat+"Americanskiy Kerl. \njashy: "+let);


      It it = new It("Itin at: ",7);
      String sobaka = it.getName();
      int jashy = it.getAge();
      it.dog("DOK",3);
      System.out.println(sobaka+"Sharik\njahy: "+jashy);

    }
}