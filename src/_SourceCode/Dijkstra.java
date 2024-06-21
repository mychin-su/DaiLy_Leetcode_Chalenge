package _SourceCode;
//Buoc 1:Khoi tao khoang cach:
    /*
       - Toi dinh xuat phat: 0
       - Toi cac dinh khac: oo
     */
  //Buoc 2: Chon dinh chua duyet va dang co khoang cach nho nhat (tu dinh xuat phat) lam dinh dang xet
  //Buoc 3: Tu dinh dang xet, duyet cac Dinh Ke chua duyet: update khoang cach va dinh truoc cua cac dinh do
  //Buoc 4: Danh dau dinh dang xet thanh dinh da duyet


import java.util.HashSet;
import java.util.Set;

// Lap lai Buoc 2, 3, 4 cho den khi khong con dinh nao chua duoc duyet
public class Dijkstra {

    public static void main(String[] args) {
      int n = 5; // 0 - 4 (so dinh trong do thi)
      int[][] a = {
          {0, 6, 0, 1, 0},
          {6, 0, 5, 2, 2},
          {0, 5, 0, 0, 5},
          {1, 2, 0, 0 ,1},
          {0, 2, 5, 1, 0}
      }; // ma tran trong so
      Set<Integer> visited = new HashSet<>();
      int[] distance  = new int[n]; // distance[i]: khoang cach tu dinh dau cho den i
      int previous[] = new int[n]; // previous[i]: la dinh ngay phia truoc cua i
      int start = 0;
      int finish = 2;
      int oo  = Integer.MAX_VALUE;

      //Buoc 1: Khoi tao khoang cach
      for(int i = 0; i < n; i ++){
        distance[i] = oo;
      }
      distance[start] = 0;

      while(visited.size() < n){
        //Buoc2: Chon dinh chua duyet va dang co khoang cach nho nhat(tu dinh xuat phat)
        //lam dinh dang xet
        int dangXet = 0;
        int minDist = oo;
        for(int i = 0; i < n; i ++){
          if(visited.contains(i) == false && distance[i] < minDist){
            minDist = distance[i];
            dangXet = i;
          }
        }

        //Buoc3: Tu dinh dang xet, duyet cac Dinh Ke chua duyet:
        // update khoang cach va dinh truoc cua cac dinh do
        for(int i = 0; i< n; i ++){
          if(visited.contains(i) == false && a[dangXet][i] != 0){
               int newDistance = distance[dangXet] + a[dangXet][i];
               if(newDistance < distance[i]){
                 distance[i] = newDistance;
                 previous[i] = dangXet;
               }
          }
        }
        //Buoc4: Danh dau dinh dang xet thanh da duyet
        visited.add(dangXet);
      }

      System.out.println("Khoang cach nho nhat tu " + start + " den " + finish + ": " +distance[finish]);
      System.out.println("Duong di la: " );
      int chay = finish;
      while(chay != start){
        System.out.print(chay + " <- ");
        chay = previous[chay];
      }
      System.out.println(chay);
    }
}
