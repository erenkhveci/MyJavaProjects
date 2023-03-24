import java.util.ArrayList;
import java.util.Comparator;

public class Brands implements Comparator {

    private int id ;
    private String name;
    private String group;
    private int groupId;
    private String brand;
    private MobilePhone mobilePhone;
    private Notebook notebook;
    private String ekran;
    private int memory;
    private int ram;
    private int price;
    private static ArrayList<Brands> brandsArrayList= new ArrayList<>();
    private static ArrayList<Brands> noteBookList=new ArrayList<>();
    private static ArrayList<Brands> cepTelefonuList=new ArrayList<>();
    private int camera;
    public Brands(){
    }
    public Brands(int id, String name, String group,int productId, int unitPrice, int discountRate, int stockAmount, String productName, String brandInformation, int memory, String screenSize, int batteryPower, int ram, String color,int camera){
        this.memory=memory;
        this.id=id;
        this.ekran=screenSize;
        this.ram=ram;
        this.price=unitPrice;
        this.name=name;
        this.group=group;
        this.brand=brandInformation;
        if(group.equals("Cep Telefonu")){
            groupId=0;
            mobilePhone=new MobilePhone(productId,unitPrice,discountRate,stockAmount,productName,brandInformation,memory,screenSize,batteryPower,ram,color);
            cepTelefonuList.add(this);
        }else if(group.equals("Notebook")){
            groupId=1;
            notebook=new Notebook(productId,unitPrice,discountRate,stockAmount,productName,brandInformation,memory,screenSize,ram);
            noteBookList.add(this);
        }

    }


 @Override
    public int compare(Object o1, Object o2) {
        Brands s1  = (Brands) (o1);
        Brands s2  = (Brands) (o2);
        return s1.name.compareTo(s2.name);
    }
    public void printPhoneList(){
        getCepTelefonuList().sort(this);
        System.out.print("Cep Telefonu Listesi");
        System.out.println();
        System.out.println("-------------------");
        System.out.println("| ID | Ürün Adı          | Fiyat     | Marka     | Depolama  | Ekran     | RAM         |" );



        System.out.print("-------------------");
        System.out.println();
        for (int i=getCepTelefonuList().size()-1;i>=0;i--){
            System.out.println("| "+getCepTelefonuList().get(i).id+  " | "+getCepTelefonuList().get(i).name+"            |"+ getCepTelefonuList().get(i).price+ "TL"+ "|    "+ getCepTelefonuList().get(i).brand   +"   | "+getCepTelefonuList().get(i).memory+"      | "+getCepTelefonuList().get(i).ekran   +"           |"+ getCepTelefonuList().get(i).ram +"|" );
            System.out.println();
        }
    }
    public void printNotebookList(){
        getCepTelefonuList().sort(this);
        System.out.print("Notebook Listesi");
        System.out.println("Formatting is broke"+" String.format(\"|%-10d|\", (String) \"blabla\"));");
        System.out.println();
        System.out.println("-------------------");
        System.out.println("| ID | Ürün Adı          | Fiyat     | Marka     | Depolama  | Ekran     | RAM         |" );



        System.out.print("-------------------");
        System.out.println();
        for (int i=getNoteBookList().size()-1;i>=0;i--){
            System.out.println("| "+getNoteBookList().get(i).id+  " | "+getNoteBookList().get(i).name+"            |"+ getNoteBookList().get(i).price+ "TL"+ "|    "+ getNoteBookList().get(i).brand   +"   | "+getNoteBookList().get(i).memory+"      | "+getNoteBookList().get(i).ekran   +"           |"+ getNoteBookList().get(i).ram +"|" );
//            System.out.println(""+getNoteBookList().get(i).name);
            System.out.println();

        }
    }
    public  void printBrands(){
        System.out.print("MARKALARIMIZ");
        System.out.println();
        System.out.print("-------------------");
        System.out.println();
        for (int i=0;i<getBrandsArrayList().size();i++){
            System.out.println("-- "+getBrandsArrayList().get(i).name);
        }
    }
    public void deletePhone(String name){
        for (int i=0;i<getCepTelefonuList().size();i++){
            if(getCepTelefonuList().get(i).name.equals(name)){
                getCepTelefonuList().remove(i);
                break;
            }
        }
    }
    public void deleteNotebook(String name){
        for (int i=0;i<getNoteBookList().size();i++){
            if(getNoteBookList().get(i).name.equals(name)){
                getNoteBookList().remove(i);
                break;
            }
        }
    }
    public  void printBrands(String brand){
        ArrayList<Brands> filteredBrandArrayList=new ArrayList<>();
        System.out.print("MARKALARIMIZ");
        System.out.println();
        System.out.print("-------------------");
        System.out.println();
        for (int i=0;i<getBrandsArrayList().size();i++){
            if(getBrandsArrayList().get(i).brand.equals(brand)){
                filteredBrandArrayList.add(getBrandsArrayList().get(i));
            }
        }
        for (int i=0;i<filteredBrandArrayList.size();i++){
            System.out.println("-- "+filteredBrandArrayList.get(i).name);
        }
    }

    public ArrayList<Brands> getNoteBookList() {
        return noteBookList;
    }

    public void setNoteBookList(ArrayList<Brands> noteBookList) {
        this.noteBookList = noteBookList;
    }

    public ArrayList<Brands> getCepTelefonuList() {
        return cepTelefonuList;
    }

    public void setCepTelefonuList(ArrayList<Brands> cepTelefonuList) {
        this.cepTelefonuList = cepTelefonuList;
    }

    public MobilePhone getMobilePhone() {
        return mobilePhone;
    }

    public void setMobilePhone(MobilePhone mobilePhone) {
        this.mobilePhone = mobilePhone;
    }

    public int getCamera() {
        return camera;
    }

    public void setCamera(int camera) {
        this.camera = camera;
    }

    public ArrayList<Brands> getBrandsArrayList() {
        return brandsArrayList;
    }

    public void setBrandsArrayList(ArrayList<Brands> brandsArrayList) {
        this.brandsArrayList = brandsArrayList;
    }

    public int getGroupId() {
        return groupId;
    }

    public void setGroupId(int groupId) {
        this.groupId = groupId;
    }


    public Notebook getNotebook() {
        return notebook;
    }

    public void setNotebook(Notebook notebook) {
        this.notebook = notebook;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }
}
