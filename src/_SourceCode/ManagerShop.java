package _SourceCode;

import java.util.Scanner;

public class ManagerShop {

  // Inner class Val
  public class Val {
    int ma;
    String ten;
    String trangThai;
    int size;
    String mauSac;
    String nguonGoc;
    int soLuong;
    double donGia;
    double thanhTien;

    public Val(int ma, String ten, String trangThai, int size, String mauSac, String nguonGoc, int soLuong, double donGia, double thanhTien) {
      this.ma = ma;
      this.ten = ten;
      this.trangThai = trangThai;
      this.size = size;
      this.mauSac = mauSac;
      this.nguonGoc = nguonGoc;
      this.soLuong = soLuong;
      this.donGia = donGia;
      this.thanhTien = thanhTien;
    }

    @Override
    public String toString() {
      return "Val{" +
          "ma=" + ma +
          ", ten='" + ten + '\'' +
          ", trangThai='" + trangThai + '\'' +
          ", size=" + size +
          ", mauSac='" + mauSac + '\'' +
          ", nguonGoc='" + nguonGoc + '\'' +
          ", soLuong=" + soLuong +
          ", donGia=" + donGia +
          ", thanhTien=" + thanhTien +
          '}';
    }
  }

  public class Node {

    Node next;
    Val val;

    public Node(Val val) {
      this.val = val;
    }
  }


  public void nhap(Node head){
    Scanner sc = new Scanner(System.in);
    System.out.println("Nhap ma san pham: ");
    int ma = sc.nextInt();

    System.out.println("Nhap ten san pham: ");
    String ten = sc.nextLine();

    System.out.println("Nhap trang thai: ");
    String trangThai = sc.nextLine();


    System.out.println("Nhap size: ");
    int size = sc.nextInt();
    sc.nextLine();


    System.out.println("Nhap mau sac: ");
    String mauSac = sc.nextLine();


    System.out.println("Nhap nguon goc: ");
    String nguonGoc = sc.nextLine();

    System.out.println("Nhap so luong: ");
    int soLuong = sc.nextInt();

    System.out.println("Nhap don gia: ");
    double donGia = sc.nextDouble();

    System.out.println("Nhap thanh tien: ");
    double thanhTien = sc.nextDouble();

    Val newVal = new Val(ma, ten, trangThai, size, mauSac, nguonGoc, soLuong, donGia, thanhTien);

    Node newNode = new Node(newVal);
      if(head == null){
          head = newNode;
      } else {
        Node current = head;
        while(current.next != null){
          current = current.next;
        }
        current.next = newNode;
      }
  }

  public void xuat(Node head){
    if(head == null){
      System.out.println("Danh sach lien ket trong");
      return;
    }
    Node currNode = head;
    while(currNode != null){
      System.out.println(currNode.val.toString());
      currNode = currNode.next;
    }
  }

  public int count(Node head){
    if(head == null){
      return 0;
    }
    Node currNode = head;
    int i = 0;
    while(currNode != null){
      i++;
      currNode = currNode.next;
    }
    return i;
  }

  public Node timKiemMaSanPham(Node head,int ma){
      if(head == null){
        System.out.println("Cua hang khong co san pham cung cap");
        return null;
      }
      Node currNode = head;
      while(currNode != null){
        if(currNode.val.ma == ma){
          System.out.println(currNode.val.toString());
          return currNode;
        }
      }
      return null;
  }

  public void inthongTinSanPhamCon(Node head){
    if(head == null){
      System.out.println("Cua hang khong co san pham cung cap");
      return;
    }
    Node currNode = head;
    while(currNode != null){
      if(currNode.val.trangThai.equals("Con")){
        System.out.println(currNode.val.toString());
        currNode = currNode.next;
      }
    }
  }


  public Node xoaSanPhamTrangThaiHet(Node head) {
    if (head == null) {
      System.out.println("Cua hang khong co san pham cung cap");
      return null;
    }

    while (head != null && head.val.trangThai.equals("Het")) {
      head = head.next;
    }

    Node currNode = head;

    while (currNode != null && currNode.next != null) {
      if (currNode.next.val.trangThai.equals("Het")) {
        currNode.next = currNode.next.next;
      } else {
        currNode = currNode.next;
      }
    }

    return head;
  }


  public static void main(String[] args) {
    ManagerShop managerShop = new ManagerShop();

    Val val1 = managerShop.new Val(1, "Item1", "Con", 42, "Red", "Vietnam", 10, 100.0, 1000.0);
    Val val2 = managerShop.new Val(2, "Item2", "Used", 38, "Blue", "China", 5, 50.0, 250.0);
    Val val3 = managerShop.new Val(3, "Item3", "Con", 40, "Green", "USA", 15, 200.0, 3000.0);
    Val val4 = managerShop.new Val(4, "Item4", "Refurbished", 44, "Black", "Germany", 20, 150.0, 3000.0);
    Val val5 = managerShop.new Val(5, "Item5", "New", 41, "White", "Japan", 8, 120.0, 960.0);

    Node node1 = managerShop.new Node(val1);
    Node node2 = managerShop.new Node(val2);
    Node node3 = managerShop.new Node(val3);
    Node node4 = managerShop.new Node(val4);
    Node node5 = managerShop.new Node(val5);

    node1.next = node2;
    node2.next = node3;
    node3.next = node4;
    node4.next = node5;

//    managerShop.nhap(node1);
//    managerShop.xuat(node1);
    //System.out.println("So luong quan ao co trong cua hang: " +  managerShop.count(node1));
    managerShop.timKiemMaSanPham(node1,1);
    managerShop.inthongTinSanPhamCon(node1);
  }
}
