import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class PatikaStore {
    private static ArrayList<Brands> brandsArrayList= new ArrayList<>();
    private static Brands mainBrands= new Brands();
    private static Scanner sc = new Scanner (System.in);
    public static void main(String[] args) {
        createProduct();
        mainBrands.setBrandsArrayList(brandsArrayList);
        transactions();
    }
    private static void createProduct(){
        Random random = new Random();
        int id=random.nextInt(1000);
        Brands huaweiMatebook14 = new Brands(id,"huaweiMatebook14","Notebook",id,7000,20,50,"huaweiMatebook14","Huawei",512,"14.0",9999,16,"Pempe",15);
//        huaweiMatebook14.getNoteBookList().add(huaweiMatebook14);
        id=random.nextInt(1000);
        Brands LENOVOV14IGL= new Brands(id,"LENOVOV14IGL","Notebook",id,3699,20,50,"LENOVOV14IGL","Lenovo",1024,"14.0",9999,8,"Ateş Sarısı",15);
        id=random.nextInt(1000);
        Brands ASUSTufGaming = new Brands(id,"ASUSTufGaming","Notebook",id,8199,40,100,"ASUSTufGaming","Asus",2048,"15.6",9999,32,"Ateş Sarısı",16);
        id=random.nextInt(1000);
        Brands SAMSUNGGALAXYA51 = new Brands(id,"SAMSUNGGALAXYA51","Cep Telefonu",id,3199,40,100,"SAMSUNGGALAXYA51","Samsung",128,"6.5",4000,6,"Siyah",35);
        id=random.nextInt(1000);
        Brands iPhone11 = new Brands(id,"iPhone11","Cep Telefonu",id,7379,40,100,"iPhone11","Apple",64,"6.1",3046,6,"Mavi",5);

        id=random.nextInt(1000);
        Brands RedmiNote10Pro = new Brands(id,"RedmiNote10Pro","Cep Telefonu",id,4012 ,40,100,"SAMSUNGGALAXYA51","Xiaomi",128,"6.5",4000,12,"Beyaz",35);
        brandsArrayList.add(huaweiMatebook14);
        brandsArrayList.add(LENOVOV14IGL);
        brandsArrayList.add(ASUSTufGaming);
        brandsArrayList.add(SAMSUNGGALAXYA51);
        brandsArrayList.add(iPhone11);
        brandsArrayList.add(RedmiNote10Pro);

    }
    private static void transactions(){
        boolean devam=true;
        while(devam){
            System.out.println("PatikaStore Ürün Yönetim Paneli !");
            System.out.println("1 - NoteBook İşlemleri");
            System.out.println("2 - Cep Telefonu İşlemleri");
            System.out.println("3 - Markaları Görüntüle");
            System.out.println("4 - Ürün Ekle");
            System.out.println("0 - Çıkış Yap");
            System.out.println();

            switch (sc.nextInt()){
                case 1:
                    System.out.println("--- NoteBook işlemleri ---");
                    System.out.println("1 - Ürünleri Listele");

                    System.out.println("2 - Ürün Sil");
                    System.out.println("0 - Çıkış Yap");
                    System.out.println();
                    switch (sc.nextInt()){
                        case 1:mainBrands.printNotebookList();break;

                        case 2:  System.out.print("Silinecek Notebook'un İsmini giriniz : ");
                            String delete=sc.next();
                            mainBrands.deleteNotebook(delete);break;
                        case 0:break;

                    }
                    break;
                case 2:   System.out.println("--- Cep Telefonu işlemleri ---");
                    System.out.println("1 - Ürünleri Listele");

                    System.out.println("2 - Ürün Sil");
                    System.out.println("0 - Çıkış Yap");
                    System.out.println();

                    switch (sc.nextInt()){
                        case 1:mainBrands.printPhoneList();break;

                        case 2:
                            System.out.print("Silinecek Telefonun'un İsmini giriniz : ");
                            String delete=sc.next();
                            mainBrands.deletePhone(delete);break;
                        case 0:break;

                    }

                    break;
                case 3:
                    System.out.println("1-Tüm Markaları görüntüle");
                    System.out.println("2-Spesifik bir marka liste :");
                    switch (sc.nextInt()){
                        case 1:mainBrands.printBrands();break;
                        case 2:
                            System.out.print("Lütfen Markanın ismini yazınız : ");
                            String marka=sc.next();
                            mainBrands.printBrands(marka);
                    }

                System.out.println();
                System.out.println();break;
                case 4:
                    System.out.println("Eklenecek ürün Türü :");
                    System.out.println("1 - Notebook");
                    System.out.println("1 - Cep Telefonu");
                    int choice = sc.nextInt();
                    if(choice==1){
                        System.out.print("Eklenecek Ürünün adı :");
                       String name=sc.next();
                        System.out.println();
                        System.out.print("Eklenecek Ürünün Birim Fiyatı :");
                        System.out.println();
                        int fiyat = sc.nextInt();
                        System.out.print("Eklenecek Ürünün Markası  :");
                        String marka=sc.next();
                        System.out.println();

                        System.out.print("Eklenecek Ürünün Hafızası :");
                        int memory =sc.nextInt();
                        System.out.println();

                        System.out.print("Eklenecek Ürünün Rami :");
                        int ram =sc.nextInt();
                        System.out.println();

                        System.out.print("Eklenecek Ürünün Ekran boyutu :");
                        String ekran=sc.next();
                        Random r =new Random();
                        int id=r.nextInt();
                        mainBrands.getCepTelefonuList().add(new Brands(id,name,"Notebook",id,fiyat,10,50,name,marka,memory,ekran,9999,ram,"Balçık",80));
                    }else if(choice==2){

                        System.out.print("Eklenecek Ürünün adı :");
                        String name=sc.next();
                        System.out.println();
                        System.out.print("Eklenecek Ürünün Birim Fiyatı :");
                        System.out.println();
                        int fiyat = sc.nextInt();
                        System.out.print("Eklenecek Ürünün Markası  :");
                        String marka=sc.next();
                        System.out.println();

                        System.out.print("Eklenecek Ürünün Hafızası :");
                        int memory =sc.nextInt();
                        System.out.println();

                        System.out.print("Eklenecek Ürünün Rami :");
                        int ram =sc.nextInt();
                        System.out.println();

                        System.out.print("Eklenecek Ürünün Ekran boyutu :");
                        String ekran=sc.next();

                        System.out.print("Eklenecek Ürünün Camera Pikseli :");
                        int camera=sc.nextInt();

                        System.out.print("Eklenecek Ürünün Pil kapasitesi :");
                        int battary=sc.nextInt();
                        Random r =new Random();

                        int id=r.nextInt();
                        mainBrands.getCepTelefonuList().add(new Brands(id,name,"Cep Telefonu",id,fiyat,10,50,name,marka,memory,ekran,battary,ram,"Balçık",camera));
                    }
                    System.out.println("Ürününüz Başarıyla Eklenmiştir.");
                    break;
                case 0:
                    System.out.println("Tekrar Uğrayın :)");
                    devam=false;break;
            }

        }

    }
}
