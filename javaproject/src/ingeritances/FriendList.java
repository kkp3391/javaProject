package ingeritances;

import java.util.Scanner;

public class FriendList {
   public static Scanner scn = new Scanner(System.in);
   public static Friend[] friends = new Friend[10];
    public static void main(String[] args) {
         //추가... Scanner 클래스...
         //1.친구 2.학교친구 3.회사친구 4.전체목록 5.친구이름 검색 6. 종료
         friends[0] = new Friend("임성원", "01012345678");
         friends[1] = new Comfriend("정준영", "0101110202", "총무부서");
         friends[2] = new UnivFriend("도왕락", "4564687878", "역사학과");
         
         
         for(Friend friend : friends) {
            if(friend != null ) {
               System.out.println(friend.toString());
            }
         }
         boolean run =true;
         while (run) {
            System.out.println("_________________________________________________________");
            System.out.println("1.친구 | 2.학교친구 | 3.회사친구 | 4.전체목록 | 5.친구이름 검색 | 6.종료");
            System.out
                  .println("___________________________________________________________");
            System.out.print("선택> ");
            int menu = scn.nextInt();

            if (menu == 1) {
               Friend();
             }else if(menu ==2) {
                Comfriend();
             }else if(menu ==3) {
                Univfirend();
             }else if(menu ==4) {
                list();
             }else if(menu ==5) {
                run=false;
             }
      }
      System.out.println("program end");
      }
    private static void Friend() {
       System.out.println("친구이름");
       String name = scn.next();
       System.out.println("폰번호");
       String phone = scn.next();
       Friend newfriend=new Friend(name, phone);
       for(int i=0; i<friends.length;i++) {
          if(friends[i]==null) {
             friends[i]=newfriend;
             System.out.println("등록완료");
             break;
          }
       }
    }
    public static void Comfriend() {
       System.out.println("친구이름");
       String name =scn.next();
       System.out.println("폰번호");
       String phone=scn.next();
       System.out.println("학과");
       String major = scn.next();
       Friend Comfriend =new Friend(name,phone, major);
       for(int i=0; i<friends.length;i++) {
          if(friends[i]==null) {
             friends[i]=Comfriend;
             System.out.println("등록완료");
             break;
    }
   }
    }
}