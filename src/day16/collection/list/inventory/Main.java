package day16.collection.list.inventory;

import java.io.*;
import java.util.Scanner;

public class Main {

    private static Inventory inventory = new Inventory();
    public static Scanner sc = new Scanner(System.in);

    //테스트 데이터 삽입
    private static void testInsert() {
        Product t1 = new Product("a001", "냉장고", 400000, 4);
        Product t2 = new Product("a002", "에어컨", 500000, 8);
        Product t3 = new Product("a003", "선풍기", 120000, 9);
        inventory.insert(t1);
        inventory.insert(t2);
        inventory.insert(t3);
    }


    //제품 기능 등록 처리
    private static void addProduct() {
        Product newProduct = new Product();
        inventory.insert(newProduct);
        System.out.printf("제품(%s) 등록이 완료되었습니다.\n"
                            , newProduct.getProductName());
//        System.out.println(inventory);
        saveData();
    }


    //제품 정보 전체 조회 기능
    private static void showAllProducts() {
        System.out.println("############  전체 제품 정보 ############");
        inventory.selectAll();
        System.out.println();
    }

    //제품 개별 검색 기능
    private static void searchProduct() {
        System.out.println("\n# 조회하실 제품의 바코드 번호를 입력하세요.");
        System.out.print("> ");
        String barcode = sc.next();

        Product product = inventory.getProduct(barcode);

        if (product != null) {
            System.out.println("\n# 조회 결과");
            System.out.println("- 제품명: " + product.getProductName());
            System.out.println("- 가격: " + product.getPrice() + "원");
            System.out.println("- 수량: " + product.getAmount() + "개");
            System.out.println("- 총액: " + product.getTotalPrice() + "원");
        } else {
            System.out.println("해당 제품은 존재하지 않습니다.");
        }
    }

    //제품 수정 처리 메서드
    private  static void modifyProduct() {
        System.out.println("\n# 수정하실 제품의 바코드 번호를 입력하세요.");
        System.out.print("> ");
        String barcode = sc.next();

        Product product = inventory.getProduct(barcode);

        if(product != null){
            System.out.printf("\n# [%s]%s 제품의 수정을 시작합니다.\n",barcode,product.getProductName());
            System.out.println("[1. 가격 수정 | 2. 수량 수정 | 3. 수정 취소 ]");
            System.out.print("> ");
            try {
                int selection = sc.nextInt();
                if(selection == 1) {
                    System.out.println("# 수정하실 가격을 입력하세요.");
                    System.out.print("> ");
                    int newPrice = sc.nextInt();
                    inventory.updatePrice(product, newPrice);
                }
            } catch (Exception e) {
                System.out.println("\n# 숫자만 입력하세요. 수정을 취소합니다.");
            }
        }else{
            System.out.println("\n# 해당 제품은 존재하지 않습니다.");
        }
        saveData();
    }

    private static void deleteProduct(){
        System.out.println("\n# 삭제하실 제품의 바코드 번호를 입력하세요.");
        System.out.print("> ");
        String barcode = sc.next();

        Product product = inventory.getProduct(barcode);

        if(product != null){
            inventory.removeProduct(product);
            System.out.println("삭제가 정상처리 되었습니다.");
        }else {
            System.out.println("\n# 해당 제품은 존재하지 않습니다.");
        }
        saveData();
    }

    //입력된 제품데이터를 저장하는 메서드
    private static void saveData() {

        String fileName = "D:\\product\\product.sav";
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;

        try {
            fos = new FileOutputStream(fileName);
            oos = new ObjectOutputStream(fos);

            oos.writeObject(inventory);

        } catch (FileNotFoundException e) {
            System.out.println("해당 경로가 존재하지 않습니다.");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }finally {
            if(oos != null)
            try {
                oos.close();
            } catch (IOException e) {
            }
        }
    }

    //파일의 저장된 정보를 불러오는 메서드
    private static void loadData() {
        String fileName = "D:\\product\\product.sav";

        FileInputStream fis = null;
        ObjectInputStream ois = null;

        try {
            fis = new FileInputStream(fileName);
            ois = new ObjectInputStream(fis);

            inventory = (Inventory) ois.readObject();

        } catch (FileNotFoundException e) {
        } catch (IOException e) {
        } catch (ClassNotFoundException e) {
        } finally {
            if(ois != null)
            try {
                ois.close();
            } catch (IOException e) {
            }
        }
    }

    public static void main(String[] args) {

//        testInsert();
        File f = new File("D:\\product");
        if(!f.exists()){
            f.mkdirs();
        }

        loadData();
        while (true) {
            System.out.println("\n*** 재고 관리 프로그램 ***");
            System.out.println("# 1. 제품 정보 등록");
            System.out.println("# 2. 제품 정보 전체조회");
            System.out.println("# 3. 제품 정보 개별조회");
            System.out.println("# 4. 제품 정보 수정");
            System.out.println("# 5. 제품 정보 삭제");
            System.out.println("# 6. 프로그램 종료");
            System.out.print("- 메뉴 입력: ");
            int menu = 0;
            try {
                menu = sc.nextInt();
            } catch (Exception e) {
                System.out.println("메뉴는 숫자로만 입력하세요.");
                sc.nextLine();
                continue;
            }

            switch (menu) {
                case 1:
                    addProduct();
                    break;
                case 2:
                    showAllProducts();
                    break;
                case 3:
                    searchProduct();
                    break;
                case 4:
                    modifyProduct();
                    break;
                case 5:
                    deleteProduct();
                    break;
                case 6:
                    System.out.println("프로그램을 종료합니다.");
                    sc.close();
                    System.exit(0); //프로그램 강제종료
                    break;
                default:
                    System.out.println("해당 메뉴는 없는 메뉴입니다.");
            }
        }

    }
}
