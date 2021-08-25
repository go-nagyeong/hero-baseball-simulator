package main;

import java.util.ArrayList;
import java.util.Scanner;

import ability.Body;
import ability.Fly;
import ability.Psycho;
import ability.SuperPower;
import ability.Weapon;

public class Simulator {
   public static void main(String[] args) {
   
      Scanner sc = new Scanner(System.in);
      
      // 각 히어로의 능력을 저장하는 Arraylist 변수 생성
      ArrayList<SuperPower> ironManPowers = new ArrayList<SuperPower>();
      ArrayList<SuperPower> captainPowers = new ArrayList<SuperPower>();
      ArrayList<SuperPower> spiderPowers  = new ArrayList<SuperPower>();
      ArrayList<SuperPower> hulkPowers    = new ArrayList<SuperPower>();
      ArrayList<SuperPower> pantherPowers = new ArrayList<SuperPower>();
      ArrayList<SuperPower> widowPowers   = new ArrayList<SuperPower>();
      ArrayList<SuperPower> scarletPowers = new ArrayList<SuperPower>();
      ArrayList<SuperPower> thorPowers    = new ArrayList<SuperPower>();
      ArrayList<SuperPower> strangePowers = new ArrayList<SuperPower>();
      
      // 각 히어로의 특수 능력을 담는 배열 변수에 능력(객체) 추가
      ironManPowers.add(new Fly());
      ironManPowers.add(new Weapon());
      captainPowers.add(new Body());
      captainPowers.add(new Weapon());
      spiderPowers .add(new Body());
      hulkPowers   .add(new Body());
      pantherPowers.add(new Weapon());
      widowPowers  .add(new Body());
      scarletPowers.add(new Psycho());
      thorPowers   .add(new Body());
      thorPowers   .add(new Weapon());
      strangePowers.add(new Psycho());
      strangePowers.add(new Fly());
      
      // 히어로 개인의 정보가 담긴 히어로 객체 생성 (파라미터 사용)
      Hero ironMan        = new Hero("아이언맨",     (int)(Math.random()*10)+1,  "이 슈트를 입고 ",          ironManPowers);
      Hero captainAmerica = new Hero("캡틴 아메리카",  (int)(Math.random()*10)+1,  "가 방패를 들고 ",          captainPowers);
      Hero spiderMan      = new Hero("스파이더맨",    (int)(Math.random()*10)+1,  "이 거미줄을 타고 ",         spiderPowers);
      Hero hulk           = new Hero("헐크",        (int)(Math.random()*10)+1,  "가 흥분한 채로 ",          hulkPowers);
      Hero blackPanther   = new Hero("블랙 팬서",     (int)(Math.random()*10)+1,  "가 '와칸다 포에버'를 외치며 ", pantherPowers);
      Hero blackWidow     = new Hero("블랙 위도우",    (int)(Math.random()*10)+1,  "가 덤블링을 하며 ",         widowPowers);
      Hero scarletWitch   = new Hero("스칼렛 위치",    (int)(Math.random()*10)+1,  "가 붉은 아우라를 내뿜으며 ",   scarletPowers);
      Hero thor           = new Hero("토르",        (int)(Math.random()*10)+1,  "가 묠니르를 돌리며 ",        thorPowers);
      Hero doctorStrange  = new Hero("닥터 스트레인지", (int)(Math.random()*10)+1,  "가 타임스톤을 지니며 ",      strangePowers);
      
      
      // 야구 출전 선수를 저장하기 위한 변수 선언 및 초기화
      Hero heroSelect1 = null; 
      Hero heroSelect2 = null;
      
      System.out.println("============================================");  // 진행 상황 구분을 위한 선
      
      // 사용자가 타자 선수를 선택
      int input1;
      while(true) {
         System.out.println("1.아이언맨  2.캡틴 아메리카  3.스파이더맨  4.헐크  5.블랙 팬서");
         System.out.println("6.블랙 위도우  7.스칼렛 위치  8.토르  9.닥터 스트레인지");
         System.out.println("선수를 선택하세요. (숫자 입력)");
         input1 = sc.nextInt(); 
         // 범위 외의 선택을 할 경우 처리
         if (input1 >= 1 && input1 <= 9) {
            break;
         } else {
            System.out.println("선수 명단 내에서 선택해주세요.");
            pause(1300);  // 지정한 시간만큼 실행 정지
         }
         System.out.println();
      }
      
      // 선수 리스트 변수를 만들어 사용자 선택과 비교하여 해당하는 히어로의 정보를 출력
      Hero[] listHitter = {ironMan, captainAmerica, spiderMan, hulk, blackPanther, blackWidow, scarletWitch, thor, doctorStrange};
      for (int i=0; i<listHitter.length; i++) {
         if(input1 == i+1) {
            heroSelect1 = listHitter[i];
            System.out.println("타자 선수 : " + heroSelect1.getName() + " 선택");
            System.out.println();
            pause(1300);
            // 선택된 히어로의 능력 출력
            System.out.println("--보유 능력--");
            heroSelect1.mySuperPowers();
            System.out.println("----------");
            break;
         }
      }
      System.out.println("============================================");
      pause(1300);
      
      
      
      // 상대(투수) 선수를 랜덤 설정하기 위한 난수 변수 선언
      int randomNumber = (int)(Math.random()*9+1);
      
      // 선수 리스트 변수를 만들어 랜덤 값과 비교하여 해당하는 히어로의 정보를 출력
      Hero[] listPitcher = {ironMan, captainAmerica, spiderMan, hulk, blackPanther, blackWidow, scarletWitch, thor, doctorStrange};
      for (int i=0; i<listPitcher.length; i++) {
         if(randomNumber == i+1) {
            heroSelect2 = listPitcher[i];
            System.out.println("두구두구...");
            pause(1500);
            System.out.println("상대 투수 : " + heroSelect2.getName() + " 출전!!");
            System.out.println();
            pause(1300);
            System.out.println("--보유 능력--");
            // 히어로의 능력 출력
            heroSelect2.mySuperPowers();
            System.out.println("----------");
            break;
         }
      }
      System.out.println("============================================");
      pause(1300);
      
      
      // 선수들의 경기장 입장 장면
      System.out.println(heroSelect1.getName() + heroSelect1.getFeature() +  heroSelect1.getHitterDisplay());
      pause(1300);
      System.out.println(heroSelect2.getName() + heroSelect2.getFeature() +  heroSelect2.getPitcherDisplay());
      System.out.println("============================================");
      pause(1300);
      
      
      // 야구 경기 시작
      System.out.println("경기를 시작합니다.");
      System.out.println();
      
      pause(1300);
      // 경기 진행 장면
      System.out.println(heroSelect2.getName() + " 선수가 공을 던집니다!");
      pause(1300);
      System.out.println(heroSelect1.getName() + " 선수가 공을 쳤습니다!");
      System.out.println();
      pause(700);
      System.out.print(".");
      pause(700);
      System.out.print(".");
      pause(700);
      System.out.println(".");
      System.out.println();
      pause(700);
      
      // 타자 - 투수 간 경기의 결과 출력
      if (heroSelect1.getStat() > heroSelect2.getStat()) {
         System.out.println("홈런~~~!");
      } else if (heroSelect1.getStat() == heroSelect2.getStat()) {
         System.out.println("안타...한번 더?");
      } else {
         System.out.println("아웃ㅠㅠ");
      }
      
      sc.close();
   }
   
   // 프로그램을 지정한 시간동안 정지시키는 메소드 생성
   public static void pause(int time) {
      try {
         Thread.sleep(time);
      } catch (InterruptedException e) {}
   }
}