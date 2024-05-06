package _SourceCode;

public class Compare_Version_Numbers_165 {
  public static int compareVersion(String version1, String version2) {
      String[] a = version1.split("\\."); // tach chuoi thanh mang string bang cac dau cham ngan cach
      String[] b = version2.split("\\.");// tach chuoi thanh mang string bang cac dau cham ngan cach
      boolean changed = false;
      if(a.length < b.length){ // Hoan doi chuoi sao cho chuoi a dai nhat
        String[] temp =  a;
        a = b;
        b = temp;
        changed = true;
      }

      //Changed = true khi a = version2, b = version1
      // Chnaged = false lhi a = verssion 1, b = version2
      // Do dai a > b

      for(int i = 0 ; i < a.length; i ++){
        String one = removeLeadingZeros(a[i]);
        String two = i >= b.length ? "0" : removeLeadingZeros(b[i]); // a dai hon b
        if(one.length() > two.length()) {
          return changed ? -1 : 1;
        } else if(one.length() < two.length()){
          return changed ? 1 : -1;
        }
        else { // Truong hop loai bo so 0 nhung 2 chuoi van co do dai bang nhau
          for(int j = 0; j < one.length(); j ++){
            if(one.charAt(j) > two.charAt(j)){
              return changed ? -1 : 1;
            } else if(one.charAt(j) < two.charAt(j)){
              return changed ? 1 : -1;
            }
          }
        }
      }
    return 0;
  }

  private static String removeLeadingZeros(String s){
    for(int i = 0; i < s.length(); i ++){
      if(s.charAt(i) != '0'){
        return s.substring(i);
      }
    }
    return "0";
  }
  public static void main(String[] args) {
    String version1 = "1.01";
    String version2 = "1.001";
    System.out.println(compareVersion(version1, version2));
  }
}
