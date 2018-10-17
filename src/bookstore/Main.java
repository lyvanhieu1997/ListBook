package bookstore;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author hieu
 */
public class Main {
        ArrayList<Book> listBook = new ArrayList<>();   
    public void input(){
        System.out.println("Nhap thong tin sach");
        Book pr;
        Scanner ip = new Scanner(System.in);
        while(true){
            pr = new Book();
            pr.nhap();
            listBook.add(pr);
            System.out.println("Nhap them y/n");
            if(ip.nextLine().equalsIgnoreCase("n")){
                break;
            }          
        }
        
    }
    public void output(){
        System.out.printf("%-20s %-20s %-20s \n","ID","TEN sach", "GIA");
        for(Book pr : listBook)
            pr.showInfo();
    }
    public void delete(){
        System.out.println("Nhap ten san pham can xoa");
        Scanner ip = new Scanner(System.in);
        String s = ip.nextLine();
        for (Book pr : listBook){
            if (s.equalsIgnoreCase(pr.getName())){
                listBook.remove(pr);
            }
        }
        this.output();
    }
     public void  menu(){
        System.out.println("==============BOOK MANAGER==============");
        Scanner sc=new Scanner(System.in);
        int n=1; 
        do{
        System.out.println("1.Add Book");
        System.out.println("2.Edit Book");
        System.out.println("3.Info Book");
        System.out.println("4.xoa");
        System.out.println("5.Tim kiem sach");
        System.out.println("6.Exit");
        System.out.println("You choise [1-4]: ");
        n = Integer.parseInt(sc.nextLine());
        switch(n){
            case 1 : this.input();
            break;
            case 2: this.edit();
            break;
            case 3: this.output();
            break;
            case 4: this.delete();
            break;
             case 5: this.findName();
            break;
            case 6:System.out.println("CHUONG TRINH KET THUC");
                    System.exit(0);
        }
    }while(n != 6);
        
    } 
     public void edit()
    {
        Scanner input = new Scanner(System.in);
        boolean isExist = false;
        System.out.print("Nhap ten can sua: ");
        String name = input.nextLine();
        
        System.out.printf("%-30s %-30s","ten sach", "gia");
        for(Book w:listBook)
        {
            if(w.getName().equals(name))
            {
                System.out.printf("\n%-20s %-20s",w.getName(), w.getPrice());
                
                System.out.print("\nNhap ten moi: ");
                w.setName(input.nextLine());
                System.out.print("\nNhap gia tien moi: ");
                w.setPrice(input.nextDouble());
                System.out.println("\nHOAN THANH!");
                isExist = true;
            }
        }
        if(isExist == false)
        {
            System.out.println("\nKHONG TIM THAY TEN SACH NAY TRONG danh sach!!!");
        }   
    }
     public void findName()
    {
        Scanner input = new Scanner(System.in);
        boolean isExist = false;
        System.out.print("Nhap tu can kiem: ");
        String name = input.nextLine();
        System.out.printf("%-30s %-30s %-30s","id","ten sach","gia \n");
        for(Book w:listBook)
        {
            if(w.getName().equals(name))
            {
                System.out.printf("\n%-30s %-30s %-30s",w.getID(),w.getName(), w.getPrice());
                isExist = true;
            }
        }
        
        if(isExist == false)
        {
            System.out.println("\nKHONG TIM THAY TU NAY TRONG TU DIEN!!!");
        }
    }
    
    public static void main(String[] args) {
        Main pr = new Main();
        pr.menu();
                                                                    
    }
}

    
    
    
    

